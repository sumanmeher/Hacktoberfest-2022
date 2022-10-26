public class largest_sum_contiguous_array {
    public static void main(String[] args) {
        int[] a={1,-2,3,4,-4,6,-4,3,2};
        int a1=sum_array(a);
        System.out.println(a1);

    }
    static int sum_array(int[] a)
    {
        int max_ending_so_far=0,max_ending=0;
        for(int i=0; i<a.length; i++)
        {
            max_ending=max_ending+a[i];
            if(max_ending<0)
            {
                max_ending=0;
            }
            if(max_ending_so_far<max_ending)
            {
                max_ending_so_far=max_ending;
            }
            
        }
        return max_ending_so_far;
    }
}
