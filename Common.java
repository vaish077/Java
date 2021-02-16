public class Common{
    public static void main(String[] args){
        int[] array = {1 , 2 , 3 , 5 };
        int[] array1 = {2 , 7 , 9 , 5 };
        for(int i = 0 ; i < array.length ; i++)
        {
            for(int j = 0; j < array1.length ; j++)
            {
                if(array[i] == (array1[j]))
                {
                 System.out.println("Common element is : "+(array[i]));
                }
            }
        }
    }
}


