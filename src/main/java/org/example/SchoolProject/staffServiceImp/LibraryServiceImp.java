package org.example.SchoolProject.staffServiceImp;

import org.example.SchoolProject.Enum.Genre;
import org.example.SchoolProject.Enum.Role;
import org.example.SchoolProject.entity.Book;
import org.example.SchoolProject.entity.LibraryUser;
import org.example.SchoolProject.entity.dto.LibraryUserDTO;
import org.example.SchoolProject.staffServices.LibraryService;

import java.util.*;

public class LibraryServiceImp  implements LibraryService <LibraryUser, Book, LibraryUserDTO> {
    public static List<Book> listOfOrderedBooks = new ArrayList<>();
    private static List<LibraryUserDTO> libraryUserDTOs = new ArrayList<>();
    public static PriorityQueue<LibraryUser> orderingQueue = new PriorityQueue<>();    //comparable
    private static Queue<LibraryUser> userWithoutPriorityQueue  = new LinkedList<>();


    //adding libraryUser to queue by priority = roles
    //adding to queue of bookborrowers
    //add object of library user
    //add object of dto
    //dto is data transfer object for transfering holds between 2processes;
    //dto hold l.User Id && Bookordered


    @Override
    public LibraryUserDTO addLibraryUserToQueue(LibraryUser libraryUser, LibraryUserDTO libraryUserDTO) {
        System.out.println("Adding LibraryUser to Queue..");
        orderingQueue.add(libraryUser);
        libraryUserDTOs.add(libraryUserDTO);
        System.out.println(orderingQueue);
        return libraryUserDTO;

    }

    public LibraryUserDTO addLibraryUserToQueueWithoutPriority(LibraryUser libraryUser, LibraryUserDTO libraryUserDTO) {
        System.out.println("Adding LibraryUser to queue....");
        userWithoutPriorityQueue.add(libraryUser);
        libraryUserDTOs.add(libraryUserDTO);
        System.out.println(userWithoutPriorityQueue);
        return libraryUserDTO;
    }

    @Override
    public List<Book> addBook(Book book) {
        System.out.println("Adding book to menu...");
        listOfOrderedBooks.add(book);
        System.out.println(listOfOrderedBooks);

        return listOfOrderedBooks;
    }

    //.poll removes front element and assigns value to libraryUser
    //use stream to filter libraryUserDTO
    //// checks if Userid of the library user == userid on the DTO
    @Override
    public void serveLibraryUserOrder() {
        while (!orderingQueue.isEmpty()) {

            LibraryUser libraryUser = orderingQueue.poll();
            LibraryUserDTO libraryUserDto = libraryUserDTOs.stream()
                    .filter(libraryUserDTO1 -> libraryUserDTO1.getLibraryUserID()
                            .equals(libraryUser.getLibraryUserID()))
                    .toList().get(0);
            System.out.println("Get LibraryUser order...");
            if (!listOfOrderedBooks.contains(libraryUserDto.getBookOrdered())) {
                System.out.println("LibraryUser with LibraryUserID: " +
                        "" + libraryUser.getLibraryUserID() + "could not get the"
                        + libraryUser.getBookOrdered()
                        + "Book! Due to book shortage for " + libraryUserDto.getBookOrdered());
            } else {
                System.out.println("Library User with ID: " +
                        "" + libraryUser.getLibraryUserID() + " "+ libraryUser.getRole()+"  just received a "
                        + libraryUser.getBookOrdered() + "book!");
                listOfOrderedBooks.remove(libraryUserDto.getBookOrdered());
            }
            libraryUserDTOs.remove(libraryUserDto);

        }

    }

    @Override
    public void serveLibraryUserOrderwithoutPriority() {
        while (!userWithoutPriorityQueue.isEmpty()) {

            LibraryUser libraryUser = userWithoutPriorityQueue.poll();
            LibraryUserDTO libraryUserDto = libraryUserDTOs.stream()
                    .filter(libraryUserDTO1 -> libraryUserDTO1.getLibraryUserID()
                            .equals(libraryUser.getLibraryUserID()))
                    .toList().get(0);
            System.out.println("Get LibraryUser order...");
            if (!listOfOrderedBooks.contains(libraryUserDto.getBookOrdered())) {
                System.out.println("LibraryUser with LibraryUserID: " +
                        "" + libraryUser.getLibraryUserID() + "could not get the"
                        + libraryUser.getBookOrdered()
                        + "Book! Due to book shortage for " + libraryUserDto.getBookOrdered());
            } else {
                System.out.println("Library User with ID: " +
                        "" + libraryUser.getLibraryUserID() + " " + libraryUser.getRole() + "  just received a "
                        + libraryUser.getBookOrdered() + "book!");
                listOfOrderedBooks.remove(libraryUserDto.getBookOrdered());
            }
            libraryUserDTOs.remove(libraryUserDto);
        }
    }
}