public class Main {
    static String firstname="Vaishali";
    static String lastname="Kaushik";
    static int age=21;
    static{
        System.out.println("First Name: "+firstname);
    }
    static void fun(){
        System.out.println("Last Name: "+lastname);
    }

    public static void main(String...args){
        Main.fun();
        System.out.println("Age: "+age);
    }
}