import java.util.ArrayList;
import java.util.Iterator;

public class Q5ArrayIterator {
    public static void main(String[] args) {

        //Arraylist
        ArrayList<String>names=new ArrayList<>();
        names.add("Bhavesh");
        names.add("Vimal");
        names.add("Mitesh");
        names.add("Pinakin");
        names.add("Nidhi");

        //Iterator to print
        Iterator itr=names.iterator();

        //while loop to iterate the names
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
