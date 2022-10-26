import java.util.*;


/**
 * print_all_subsequence
 */
public class print_all_subsequence {
   static  List<String>ob1= new ArrayList<>();

    public static void main(String[] args) {
        String s="abcd";
       
        backtrack(s,"");
        System.out.println(ob1);
    }
    static void backtrack(String s, String out)
    {
        if(s.length()==0)
        {
            ob1.add(out);
            return;
        }
        backtrack(s.substring(1 ), out+s.charAt(0));
        backtrack(s.substring(1), out);
    }
}