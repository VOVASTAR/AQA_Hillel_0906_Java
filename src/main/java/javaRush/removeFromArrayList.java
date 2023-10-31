package javaRush;

import java.util.ArrayList;
import java.util.List;

public class removeFromArrayList {

    public List<String> students;

    public removeFromArrayList() {
        students = new ArrayList<>();
        students.add("Сергей Фрединский");
        students.add("Виталий Правдивый");
        students.add("Максим Козыменко");
        students.add("Наталия Андрющенко");
        students.add("Ира Величенко");
        students.add("Николай Соболев");
        students.add("Снежана Слободенюк");
    }

    public void exclude(String excludedStudent) {
//     1й вариант создав копию массива и по нему идти и удалять в первом массиве

//        List<String> copyOfGroup = new ArrayList<>(students);
//        for (String student : copyOfGroup) {
//            if (student.equals(excludedStudent)) {
//                students.remove(student);
//            }
//        }

        students.removeIf(x -> x.equals(excludedStudent));
    }

    public static void main(String[] args) {
        removeFromArrayList universityGroup = new removeFromArrayList();
        universityGroup.exclude("Виталий Правдивый");
        universityGroup.students.forEach(System.out::println);
    }
}
