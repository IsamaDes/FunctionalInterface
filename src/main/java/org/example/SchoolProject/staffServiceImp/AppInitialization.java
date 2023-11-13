package org.example.SchoolProject.staffServiceImp;

import org.example.SchoolProject.Enum.Gender;
import org.example.SchoolProject.Enum.Genre;
import org.example.SchoolProject.Enum.Role;
import org.example.SchoolProject.entity.Book;
import org.example.SchoolProject.entity.LibraryUser;
import org.example.SchoolProject.entity.dto.LibraryUserDTO;

public class AppInitialization {

        public static void main(String[] args) {
            LibraryUser libraryUser = LibraryUser.builder().
                    libraryUserID(1l)
                    .name("Vea")
                    .gender(Gender.Male)
                    .bookOrdered(Genre.Hamlet)
                    .role(Role.seniorStudent)
                    .build();
            LibraryUser libraryUserTwo = LibraryUser.builder().
                    libraryUserID(2l)
                    .name("Phineas")
                    .gender(Gender.Female)
                    // .timeOfOrder(LocalDateTime.now())
                    .bookOrdered(Genre.HalfMoon)
                    .role(Role.juniorStudent)
                    .build();
            LibraryUser libraryUserThree = LibraryUser.builder().
                    libraryUserID(3l)
                    .name("Garfield")
                    .gender(Gender.Male)
                    // .timeOfOrder(LocalDateTime.now())
                    .bookOrdered(Genre.AmazonWomen)
                    .role(Role.teacher)
                    .build();
            LibraryUser libraryUserFour = LibraryUser.builder().
                    libraryUserID(4l)
                    .name("Martins")
                    .gender(Gender.Male)
                    // .timeOfOrder(LocalDateTime.now())
                    .bookOrdered(Genre.Hamlet)
                    .role(Role.juniorStudent)
                    .build();

            Book History = Book.builder()
                    .bookCategory(Genre.NigeriaCivilWar)
                    .title("ThingsFallApart")
                    .build();

            Book Science = Book.builder()
                    .bookCategory(Genre.MathematicsTextBook)
                    .title("AdvancedAlgebra")
                    .build();

            Book Humanities = Book.builder()
                    .bookCategory(Genre.Psychology)
                    .title("PsychologyForBeginners")
                    .build();

            LibraryUserDTO libraryUserDTO = new LibraryUserDTO(libraryUser, Humanities);
            LibraryUserDTO libraryUserDTO2 = new LibraryUserDTO(libraryUserTwo, Science);
            LibraryUserDTO libraryUserDTO3 = new LibraryUserDTO(libraryUserThree, History);
            //LibraryUserDTO libraryUserDTO4 = new LibraryUserDTO(libraryUserFour, Humanities);

//Adding Books ---------------------------------------------------------
            LibraryServiceImp libraryService = new LibraryServiceImp();
            libraryService.addBook(Humanities);
            libraryService.addBook(Science);
            libraryService.addBook(History);


//            libraryService.addLibraryUserToQueue(libraryUserThree, libraryUserDTO3);
//            libraryService.addLibraryUserToQueue(libraryUser, libraryUserDTO);
//            libraryService.addLibraryUserToQueue(libraryUserTwo, libraryUserDTO2);

       //     libraryService.addLibraryUserToQueue(libraryUserFour, libraryUserDTO4);

            libraryService.serveLibraryUserOrder();
            System.out.println();
            System.out.println();

            libraryService.addLibraryUserToQueueWithoutPriority(libraryUser, libraryUserDTO);
            libraryService.addLibraryUserToQueueWithoutPriority(libraryUserTwo, libraryUserDTO2);
            libraryService.addLibraryUserToQueueWithoutPriority(libraryUserThree, libraryUserDTO3);
            libraryService.serveLibraryUserOrderwithoutPriority();

        }}
