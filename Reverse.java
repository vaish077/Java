import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str_one = sc.next();
        StringBuffer sb = new StringBuffer(str_one);
        sb = sb.reverse();
        System.out.println("Reverse String: "+sb);
        sb.replace(4 , 9  , "");
        System.out.println("Replaced String: "+sb);
    }
}
