package com.project.eventManagement.Util.Repo;

import com.project.eventManagement.Util.Model.FileData;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author LENOVO
 **/
public interface FileRepository extends JpaRepository<FileData, Long> {
}
