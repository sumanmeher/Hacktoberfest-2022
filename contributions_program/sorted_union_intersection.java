import java.util.ArrayList;

/**
 * sorted_union_intersection
 */
public class sorted_union_intersection {

    public static void main(String[] args) {
        int[] a1={1,2,3,4,5,6,7};
        int[] a2={1,2,5,7,9,10};
        ArrayList<Integer>ob2=intersection(a1, a2);
        ArrayList<Integer> union1=union(a1, a2);
     //   for(int i=0; i<ob2.size();i++)
    //    {
     //       System.out.println(ob2.get(i));
   //     }
        for(int i=0; i<union1.size();i++)
        {
            System.out.println(union1.get(i));
        }

     
    }
    public static ArrayList<Integer> intersection(int[] a1, int[] a2)
    {
       ArrayList<Integer>ob1= new ArrayList<>();
        for(int i=0, j=0; i<a1.length; )
        {
            if(a1[i]==a2[j])
            {
                ob1.add(a1[i]);
                i++;
                j++;
            }
            else{
                i++;
            }
        }
        return ob1;

    }

    public static ArrayList union(int[] a1, int[] a2)
    {
        ArrayList<Integer> union= new ArrayList<>();
        int k=0;
        int i=0,j=0;
        for(; i<a1.length; )
        {
            if(a1[i]<a2[j])
            {
               union.add(a1[i]);
               i++;
               
            }
            else if(a1[i]==a2[j]){
               union.add(a1[i]);
                i++;
                j++;

            }
            else if(a2[j]>a1[i]) 
            {
                union.add(a2[j]);
                j++;
            }

        }
        for(int l=j; l<a2.length; l++)
        {
           union.add(a2[l]);
        }
        return union;
    }
}