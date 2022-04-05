import java.util.ArrayList;

public class Q7IsEmptyOrNot {
    public static void main(String[] args) {

        //Arraylist for storing number
        ArrayList<String>underGround=new ArrayList<>();
        underGround.add("Bakerloo");
        underGround.add("Central");
        underGround.add("Jubliee");

        System.out.println(underGround.isEmpty());// false

            //condition to be true to get in to loop to print statement
        if(!underGround.isEmpty()){
            System.out.println("Arraylist is not Empty");
        }

    }
}
