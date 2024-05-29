import java.util.ArrayList;
import java.util.List;

public class listInterface {
    public static void main(String[] args) {
        List<Integer> li = new ArrayList<>();
        li.add(1);
        li.add(2);
        li.add(3);
        li.add(4);
        li.add(5);
        li.add(6);
        li.add(7);
        li.add(8);
        System.out.println("The list before removing 2nd element: " +li);
        for(int i =1; i< li.size(); i++){
            li.remove(i);
        }
        System.out.println("The list after removing every 2nd element: " +li);
    }
}

