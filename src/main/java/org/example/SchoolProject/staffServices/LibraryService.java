package org.example.SchoolProject.staffServices;

import java.util.List;

public interface LibraryService<L, B, D> {
    D addLibraryUserToQueue (L libraryUser, D libraryUserDTO);
    D addLibraryUserToQueueWithoutPriority (L libraryUser, D libraryUserDTO);
    List<B> addBook (B book);
    void serveLibraryUserOrder();
    void serveLibraryUserOrderwithoutPriority();
}

