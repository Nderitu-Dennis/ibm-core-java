package wrapper_classes;
/*
* wrapper classes provide a way to treat primitive data as objects which is necessary
* for certain Java features such as using them with collections such as ArrayList and Hashmaps
 */
public class Main {
    public static void main(String[] args) {
        String number = "123";
        int x = Integer.parseInt(number);
        System.out.println(x+20);

    }

}
