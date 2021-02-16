public class Duplicate{  
    public static void main(String[] args) {  
        String string = "Bla bla back sheep hit at back";  
        int count;  
        
        string = string.toLowerCase();  
          
        String words[] = string.split(" ");  
          
        System.out.println("Duplicate words in string : ");   
        for(int i = 0; i < words.length; i++) {  
            count = 1;  
            for(int k = i+1; k < words.length; k++) {  
                if(words[i].equals(words[k])) {  
                    count++;  
                    words[k] = "0";  
                }  
            }  
            
            if(count > 1 && words[i] != "0")  
                System.out.println(words[i]);  
        }  
    }  
}  