import  java.util.* ;

public class a{

    //Method/ function
    public static void Func(String name1){
           System.out.println(name1);
    }

    public static void printsum(int a1,int a2){
        int sum = a1 + a2;
        System.out.println(sum);
 }

    public static void main(String args[]){

        //print output
        System.out.println("hello world");

        //Take Input
        Scanner sc= new Scanner(System.in);
        String name = sc.next();
        System.out.println(name);
        System.out.println(" Hello ");
        
        String Agent = "Ethan";
        int age = 8;
        String friend = Agent;
        String Hacker = "Benji";
        System.out.println(Agent.length());
        System.out.println(Agent.charAt(0));
        System.out.println(Agent.replace("a","y"));
        // or
        String new1 = Agent;
        System.out.println(Agent+friend);
        System.out.println(Hacker.substring(0,3));

        //Array
        int[] marks = new int[2]; /*or */ int[] mark={23,45,67};
        marks[0] = 94;
        marks[1] = 43;
        System.out.println(marks[0]);
        System.out.println(marks.length);
        
        //sort
        System.out.println(marks[0]);
        Arrays.sort(marks);
        System.out.println(marks[0]);
        int[][] student_marks={{1,2,3},{4,5,6}};
        System.out.println(student_marks[0][0]);

        //Casting
        int a= 9;
        int b= a+ (int)9.9;
        System.out.println(b);

        //constants
        float f= 23f;
        long v=1280L;
        final float PI = 3.14F; 
        
        //operators
        // +,-, /, *,%,=

        //unary
        System.out.println(++a); //first increment value then display same value.
        System.out.println(a);
        System.out.println(a++); //same value then increment value.
        System.out.println(a);
        
        //Math functions
        System.out.println(Math.max(5,6));
        System.out.println(Math.min(5,6));  
        System.out.println((int)(Math.random()*100));

        //Take Input
        Scanner Input= new Scanner(System.in);
        System.out.println("Enter Input:  ");
        int number = Input.nextInt();
        System.out.println(number);

        //for One Word Input
        Scanner Input1= new Scanner(System.in);
        System.out.println("Enter Input1: ");
        String Employee_name = Input1.next();
        System.out.println(Employee_name);

        //For Whole string as Input
        //for One Word Input
         Scanner Inp = new Scanner(System.in);
         System.out.println("Enter employee name: ");
         String Emp_name =  Inp.nextLine();
         System.out.println(Emp_name);
        
        Boolean SunUp = true;
        if (SunUp == true)
            System.out.println("Day");
        else
            System.out.println("Night"); 

        //if checks for true.
        if (SunUp)
        System.out.println("true");

        //if checks for false 
        else if(!SunUp)
        System.out.println("False");
         
        else
        System.out.println("none");

        Scanner In = new Scanner(System.in);
        System.out.println("Enter Day: ");
        int day = In.nextInt();
        
        //Switch case
        switch(day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Sunday");
        } 

        //for loop(display 1 to 100)
        for(int i = 1; i<100; i++){
            System.out.println(i);
        }
        
        //while loop(display 1 to 100)
        int j=1;
        while(j<101){
            System.out.println(j);
            j++;
        }
       
        //do-while loop(display 1 to 100)
        int k = 1;
        do {
            System.out.println(k);
            k++;
        }
        while(k<101);

        //continue(to skip the rest code.)
        if(a<b)
        {
            continue;
            if(a==9)
            {
                System.out.println("Good");
                break;
            }
        }
        
        //Exception Handling
        try  
        {  
        int data=50/0; //may throw exception   
        }  
            //handling the exception  
        catch(ArithmeticException e)  
        {  
            System.out.println(e);  
        }  
        System.out.println("rest of the code");  

        //Methods/Functions
        Func("Ashoka");
        Func("Sam");

        printsum(9,17);
        printsum(10,78);

    }
}
