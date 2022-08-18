import java.util.*;

public class guess_number{
    public static void main(String[] args){
    
        
        Scanner sc = new Scanner(System.in);
        int myNumber = (int)(Math.random()*100);
        System.out.println("Guess the Number: ");
        int yourNumber =sc.nextInt();
        do{
            
            if(yourNumber > myNumber){
               System.out.println("Your Number is too large.");
               
            }
            else if(yourNumber == myNumber){
                System.out.println("Your Number is correct.");
                break;
            } 
            else{
                System.out.println("Your Number is small.");
                break;
            }

        }while(yourNumber<=0);

        System.out.print("My Number is :");
        System.out.print(myNumber);


    }
}