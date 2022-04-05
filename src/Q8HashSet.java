import java.util.HashSet;
import java.util.Set;


public class Q8HashSet {
    public static void main(String[] args) {

        //Hashset to store elements
        Set<Integer>number=new HashSet<>();
        number.add(4);
        number.add(7);
        number.add(8);

        //for loop to iterate the elements
        for(int i=1; i<11; i++){
            if(number.contains(i)){
                System.out.println(i+ " found in set");
            }else{
                System.out.println(i+" not found in set");
            }

        }

    }
}
