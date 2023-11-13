package org.example.SchoolProject.staffServiceImp;

import org.example.SchoolProject.Enum.Gender;
import org.example.SchoolProject.Enum.Genre;
import org.example.SchoolProject.entity.Book;
import org.example.SchoolProject.entity.LibraryUser;
import org.example.SchoolProject.entity.dto.LibraryUserDTO;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.PriorityQueue;

import static org.example.SchoolProject.staffServiceImp.LibraryServiceImp.orderingQueue;
import static org.junit.jupiter.api.Assertions.*;

class LibraryServiceImpTest {
    LibraryServiceImp libraryServiceImp = new LibraryServiceImp();
    Book Humanities = Book.builder()
            .bookCategory(Genre.Psychology)
            .title("PsychologyForBeginners")
            .build();
    LibraryUser libraryUser = LibraryUser.builder().
            libraryUserID(1l)
            .name("Vea")
            .gender(Gender.Male)
            .bookOrdered(Genre.Hamlet)
            .build();


    @Test
    void addLibraryUserToQueue() {

        LibraryUserDTO libraryUserDTO = new LibraryUserDTO(libraryUser, Humanities);
        libraryServiceImp.addLibraryUserToQueue(libraryUser,libraryUserDTO);
        assertTrue(orderingQueue.contains(libraryUser));

    }

    @Test
    void addCustomerToComparatorQueue() {
    }

    @Test
    void borrowBook() {

    }

    @Test
    void serveLibraryUserOrder() {
    }
}