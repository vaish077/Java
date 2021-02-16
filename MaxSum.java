class Sum{ 
    static int Single(int ar[], int ar_one) 
    { 
        int a = ar[0]; 
        for (int i = 1; i < ar_one; i++) 
            a = a ^ ar[i]; 
      
        return a; 
    } 
   
    public static void main (String[] args) 
    { 
        int ar[] = {2, 2, 5, 5, 3, 3, 4}; 
        int n = ar.length; 
        System.out.println("Element occurring once is " +Single(ar, n) + " "); 
    } 
} 
