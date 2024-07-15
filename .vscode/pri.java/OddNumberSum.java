public class OddNumberSum  
{ 
    public static void main(String[] args)  
{ 
        int limit = 10; // Change this to the desired limit 
        int sum = 0; 
         
        for(int i = 1; i <= limit; i += 2)  
       { 
            sum += i; 
        } 
  
 
         
        System.out.println("Sum of odd numbers from 1 to " + limit + ": " + sum); 
 } 
}