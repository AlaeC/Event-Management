package com.project.Util.Service;

import com.project.Util.Model.FileData;
import com.project.Util.Repo.FileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.*;

@Service
public class FileService {

    @Value("${file.upload-dir}")
    private String uploadDir;

    @Autowired
    private FileRepository fileRepository;



    public FileData uploadFile(MultipartFile file) throws IOException {
        // Create directory if not exists
        Files.createDirectories(Paths.get(uploadDir));

        // Generate unique file name
        String fileName = System.currentTimeMillis() + "_" + file.getOriginalFilename();
        Path filePath = Paths.get(uploadDir, fileName);

        // Save file to folder
        Files.write(filePath, file.getBytes());

        // Save file info in DB
        FileData fileData = new FileData();
        fileData.setName(file.getOriginalFilename());
        fileData.setType(file.getContentType());
        fileData.setUrl("/files/" + fileName);

        return fileRepository.save(fileData);
    }
}
