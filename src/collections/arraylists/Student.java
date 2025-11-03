package collections.arraylists;/* HashMaps- same as dictionary in python. Stores data in key-value pairs and keys must be unique, no duplicate keys. used whenever fast lookup is needed  cz u just search using the key. */

import java.util.HashMap;

public class Student {
    public static void main(String[] args) {
        HashMap<String, Integer> studentMarks = new HashMap<>();

        studentMarks.put("Dennis the legend",40);
        studentMarks.put("Allan Njogothe",92);
        studentMarks.put("Kelvin the lover boy",76);
        studentMarks.put("Sunil mohammed",48);
        studentMarks.put("Greyson marcus",10);

//        printing the marks
        System.out.println(studentMarks);

        //    getting the size
        System.out.println("no. of students: " + studentMarks.size());

//        remove
        studentMarks.remove("Sunil mohammed");
        System.out.println(studentMarks);
        System.out.println("no. of students: " + studentMarks.size());

//        Given a student’s name, print their mark.
        System.out.println("marks for Greyson: " + studentMarks.get("Greyson marcus"));

        studentMarks.put("Nicodemus",90);

//        Find and print the student with the highest mark.
        System.out.println("\nFind and print the student with the highest mark");
        int max = 0;
        for(String studentMark : studentMarks.keySet()){
            System.out.println(studentMark + ": " + studentMarks.get(studentMark));
            if(studentMarks.get(studentMark)>max){
                max=studentMarks.get(studentMark);
            }

        }
        System.out.println("HIGHEST MARK: " + max);

//        Count how many students scored above 50.
        System.out.println("\nCount how many students scored above 50.");
        int counter = 0;
        for(String studentName : studentMarks.keySet()){
            if(studentMarks.get(studentName) > 50){
                counter++;
                System.out.println(studentName + ": " + studentMarks.get(studentName));
            }

        }

        System.out.println("students with marks greater than 50: " + counter);



    }



}
