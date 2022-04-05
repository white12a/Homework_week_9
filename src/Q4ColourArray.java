import java.util.ArrayList;

public class Q4ColourArray {
    public static void main(String[] args) {
        //Arraylist for storing the element
        ArrayList<String> colours = new ArrayList<>();
        colours.add("Blue");
        colours.add("White");
        colours.add("Pink");
        colours.add("Yellow");
        colours.add("Black");
        colours.add("Brown");
        colours.add("Green");
        // for loop to iterate the value of colors
        for (String rainbow : colours) {
            System.out.println(rainbow);// printing all the element from array list

            System.out.println("-----------------------------------");

            if (rainbow.equalsIgnoreCase("pink")) {
                System.out.println(rainbow);// printing only one element which matches
            }

        }
    }


}
