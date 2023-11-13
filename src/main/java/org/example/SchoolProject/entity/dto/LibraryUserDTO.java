package org.example.SchoolProject.entity.dto;
import lombok.Data;
import org.example.SchoolProject.entity.Book;
import org.example.SchoolProject.entity.LibraryUser;

@Data
public class LibraryUserDTO {
    private Long libraryUserID;
    private Book bookOrdered;

    public LibraryUserDTO(LibraryUser libraryUser, Book book){
        this.libraryUserID = libraryUser.getLibraryUserID();
        this.bookOrdered = book;
    }
}

