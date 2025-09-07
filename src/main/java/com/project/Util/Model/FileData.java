package com.project.Util.Model;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FileData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;   // original filename
    private String type;   // MIME type (application/pdf, application/msword, etc.)
    private String url;    // path or URL to access the file


}
