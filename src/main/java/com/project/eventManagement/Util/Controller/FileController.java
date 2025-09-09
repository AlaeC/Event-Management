package com.project.eventManagement.Util.Controller;

import com.project.eventManagement.Util.Model.FileData;
import com.project.eventManagement.Util.Service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/files")
public class FileController {

    @Autowired
    private FileService fileService;



    @PostMapping("/upload")
    public ResponseEntity<String> uploadFile(@RequestParam("file") MultipartFile file) {
        try {
            FileData savedFile = fileService.uploadFile(file);
            return ResponseEntity.ok("File uploaded successfully: " + savedFile.getUrl());
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body("Error uploading file: " + e.getMessage());
        }
    }
}
