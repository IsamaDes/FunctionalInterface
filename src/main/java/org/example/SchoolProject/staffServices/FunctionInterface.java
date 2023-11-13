package org.example.SchoolProject.staffServices;

import java.util.List;

@FunctionalInterface
public interface FunctionInterface<B> {
    List<B> addBook (B book);
    default void application (B book){
        System.out.println("This is a book");
    };

}
