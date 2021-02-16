import java.util.Scanner;
public class Main4 {

    private int charOccurance(String s,char char_to_find,int count){
        if(s.length()==0)
            return count;
        else
        {
            if(s.charAt(0)==char_to_find){
                count++;
                return charOccurance(s.substring(1),char_to_find,count);
            }
            else
                return charOccurance(s.substring(1),char_to_find,count);
        }
    }
    public static void main(String[] args) {
        Main4 ob = new Main4();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String s=sc.nextLine();
        System.out.println("Enter the character that you want to check occurence");
        char ch = sc.next().charAt(0);
        System.out.println(ob.charOccurance(s,ch,0));
    }
}