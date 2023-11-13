package org.example;


//import org.example.SchoolProject.staffServiceImp.StaffServiceImp;


//import org.example.SchoolProject.utils.StudentUtil;

import org.example.SchoolProject.Enum.Genre;
import org.example.SchoolProject.entity.Applicant;
import org.example.SchoolProject.entity.Book;
import org.example.SchoolProject.entity.Student;
import org.example.SchoolProject.staffServiceImp.StaffServiceImp;
import org.example.SchoolProject.staffServices.FunctionInterface;
//import org.example.SchoolProject.utils.TeacherUtil;

import static org.example.SchoolProject.staffServiceImp.LibraryServiceImp.listOfOrderedBooks;

public class Main {
        public static void main(String[] args) {
//             System.out.println(StudentUtil.readStudentCSV("/Users/mac/Documents/GitHub/week-1-IsamaDes/src/Student.csv"));
//            System.out.println(TeacherUtil.readTeacherCSV("src/Teacher.csv"));






            FunctionInterface<Book> addBookImpl = (book)->{
                System.out.println("Adding book to shelf");
                        listOfOrderedBooks.add(book);
                return listOfOrderedBooks;
            };


            Book book = Book.builder()
                    .bookCategory(Genre.Hamlet)
                    .title("Hamlet")
                    .Arthur("Charles Dickens")
                    .isbn("545rtfgh654")
                    .build();
            System.out.println(addBookImpl.addBook(book));
            StaffServiceImp staffServiceImp = new StaffServiceImp();
            staffServiceImp.recognise.function(new Student());
            staffServiceImp.expelOffence.function(new Student());
            staffServiceImp.admitAge.function(new Applicant());
        }




}

//
//    public static void main(String[] args) {
//        String file = "/Users/mac/Documents/GitHub/week-1-IsamaDes/src/Student.csv";
//        BufferedReader reader = null;
//        String line = "";
//
//        try {
//            reader = new BufferedReader(new FileReader(file));
//            while ((line = reader.readLine()) != null) {
//                String[] row = line.split(",", -1);
//                for (String index : row) {
//                    if (index.isEmpty()){
//                        index = null;
//                    }
//
//                    System.out.printf("%-40s", index);
//                }
//                System.out.println();
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                reader.close();
//            } catch (IOException e) {
//
//                e.printStackTrace();
//            }
//        }
//    }
//}
//
