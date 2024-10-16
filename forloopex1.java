import java.util.Scanner;
public class forloopex1 {
    public static void main(String [] args)
    {
     Scanner forloopex1=new Scanner(System.in);
     System.out.println("Enter a number");
     Integer number=forloopex1.nextInt();
     for (int i = 1; i <= 10; i++) 
     {
     System.out.println(number + " x " + i + " = " + (number * i));
     forloopex1.close();
    }
    }
    
}
