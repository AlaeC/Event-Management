package com.project.Util.Repo;

import com.project.Util.Model.FileData;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author LENOVO
 **/
public interface FileRepository extends JpaRepository<FileData, Long> {
}
