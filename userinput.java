import java.util.Scanner;

public class userinput {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("What is your name :");
        String name=scanner.nextLine();
        System.out.println("Mention your age:");
        Integer age=scanner.nextInt();
        System.out.printf("Thanks for your information %s  " ,name);
        String info=scanner.nextLine();
        scanner.close();
    }
}