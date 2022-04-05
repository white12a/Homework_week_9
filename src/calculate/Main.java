package calculate;

import java.util.Scanner;

public class Main   {
    public static void main(String[] args) {
        Calculator cal=new Calculator();
        char ch;
        do {
            //scanner class for user input
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter first number  ");
            int a = scan.nextInt();//storing first number
            System.out.print("Enter second number  ");
            int b = scan.nextInt();//second number
            System.out.print("Enter the one of the symbol +,-,*,/ : ");
            char c = scan.next().charAt(0); //chacter at first index
            cal.calculateResult(a,b,c);// calling method from parent class
            Scanner input =new Scanner(System.in);
            System.out.print("Would you like to do more calculation please enter \"y\" or \"N\" : ");
            String x = input.nextLine();
            ch = x.charAt(0);



        } while (ch == 'y' || ch == 'Y');//while loop and condition to continious loop

        System.out.println("Thanks for using Calculator Arvindbhai from Team scrum");

    }
}
