package wrapper_classes;

import java.util.ArrayList;

/*
* wrapper classes provide a way to treat primitive data as objects which is necessary
* for certain Java features such as using them with collections such as ArrayList and Hashmaps
 */
public class Main {
    public static void main(String[] args) {
        String number = "123";
        int x = Integer.parseInt(number);
        System.out.println(x+20);

        ArrayList<String> studentNames = new ArrayList<>();
        studentNames.add("dennis nderitu");
        studentNames.add("mazindere oluoch");
        studentNames.add("otorongo jogothe");
        studentNames.add("ng'oe wairimu");

        System.out.println(studentNames);

      //  studentNames.remove(1);
        System.out.println(studentNames);
        System.out.println("size of the ArrayList: " + studentNames.size());
        System.out.println("at index 0: " + studentNames.get(0));



    }

}
