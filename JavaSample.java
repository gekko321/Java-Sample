import java.util.Scanner;


//Importing Package

public class SampleFile{
    public static void main (String[] args)
    {
        //The Caller
        MethodMath obj = new MethodMath();
        Scanner scanner = new Scanner(System.in);
        //Variables  
        int number1 = 10;
        int number2 = 20;
        
        
        //Method
        int result = number1 + number2;
        System.out.print("Calculator");
        System.out.println("");
        System.out.println("Result :" + result + "!");
        obj.message();
        scanner.close();
    }

}

class MethodMath{
    public void message(){
        System.out.println("Sample");
    }
    
}