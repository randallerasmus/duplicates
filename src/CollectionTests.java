import java.util.*;

public class CollectionTests {

    public static <T> void doStuffWithCollections() {
//        1 - Add values to List
        List<String> studentList = new ArrayList<>();
        studentList.add("Randall");
        studentList.add("Josh");
        studentList.add("Josh");
        studentList.add("Reagan");
        studentList.add("Randall");

        System.out.println("List that has duplicate students :\n" + studentList + "\n");

//        2 - create new list
        List<String> newStudentList = new ArrayList<>();
//        3 - loop through old list
        for (String oldStudent : studentList) {
//        4 - check if newlist does not contain old list values
            if (!newStudentList.contains(oldStudent)) {
//        5 - insert old values into new list
                newStudentList.add(oldStudent);
            } else {
//        6 - print/ reveal duplicate value

                System.out.println("Here is the duplicate Student in the List :" + oldStudent);
            }
        }
        System.out.println("\n**************UPDATED STUDENT LIST***********************\n");
        for (String updatedStudentList : newStudentList) {
            System.out.println(updatedStudentList);
        }

    }
}

