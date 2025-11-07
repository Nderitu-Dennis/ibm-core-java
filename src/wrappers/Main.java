package wrappers;

public class Main {
    public static void main(String[] args) {

        try {
            Integer num = Integer.valueOf("good boy");
            System.out.println(num + 6);

        } catch (NumberFormatException e) {
            System.out.println("error occurred: " + e.getMessage());
        }


        Float f = Float.valueOf("5");
        System.out.println("float: " + f);

        //string to wrapper->valueOf
        String age="90";
        Integer str_age = Integer.valueOf(age);
        System.out.println(age + " as " + str_age);



//        wrapper to string-toString()
        Integer str = Integer.valueOf("70");
        String yrs = str.toString(str);
        System.out.println(str + " as string: " + yrs + "hey");

        Integer four = Integer.valueOf("100",2);
        System.out.println(four);

        Integer b =10;
        System.out.println(Integer.toBinaryString(b));
        System.out.println(Integer.toHexString(b).toUpperCase());



    }
}
