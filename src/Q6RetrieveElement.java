import java.util.ArrayList;
import java.util.Scanner;

public class Q6RetrieveElement {
    public static void main(String[] args) {

        //ArrayList to store element
        ArrayList<String>names=new ArrayList<>();
        names.add("Bhavesh");
        names.add("Vimal");
        names.add("Nidhi");
        names.add("Mitesh");
        names.add("Pinakin");
        Scanner scan=new Scanner(System.in);// scanner class
        System.out.println("Enter number between 0 to 4");
        int index=scan.nextInt();// storing user input

        //printing element when its match the index number
        if(index==0){
            System.out.println("Bhavesh");
        }else if(index==1){
            System.out.println("Vimal");
        }else if(index==2){
            System.out.println("Nidhi");
        }else if(index==3){
            System.out.println("Mitesh");
        }else if(index==4){
            System.out.println("Pinakin");
        }else{
            System.out.println("Out of Index Error");
        }
    }
}