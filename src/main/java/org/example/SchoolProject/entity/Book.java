package org.example.SchoolProject.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.SchoolProject.Enum.Genre;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    private String title;
    private Genre bookCategory;
    private String isbn;
    private String Arthur;

}
