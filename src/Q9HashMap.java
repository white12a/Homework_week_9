import java.util.HashMap;
import java.util.Map;

public class Q9HashMap {
    public static void main(String[] args) {
        //HashMap to store element
        Map<String,Integer>people=new HashMap<>();
        people.put("Bhavesh",1);
        people.put("Mitesh",2);
        people.put("Vimal",3);
        people.put("Pinakin",4);
        people.put("Nidhi",5);
        people.put("Bhavesh",1);// dont take duplicate

       for (Integer num:people.values()){
           System.out.println(num);
       }

    }
}
