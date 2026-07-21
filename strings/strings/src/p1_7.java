import java.util.ArrayList;
import java.util.HashSet;

public class p1_7 {
    public static void main(String[] args) {
        int count=0;
        String s ="I love Java programming";
        String[] words =s.split(" ");
        ArrayList<String>list=new ArrayList<>();
        for(String word:words)
        {
            list.add(word);
        }
        for(String word:words)
        {
            if(list.contains(word))
            {
                count++;
                list.remove(word);
            }
        }
        System.out.println(count);

    }
}

//Input:"I love Java programming"
//Output:4