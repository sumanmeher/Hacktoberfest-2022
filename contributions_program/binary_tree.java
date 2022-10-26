/**
 * binary_tree
 */
import java.util.*;
class Node{
    int data;
    Node lchild;
    Node rchild;
    public Node(int data)
    {
        this.data=data;
        lchild=null;
        rchild=null;


    }
}
public class binary_tree {
    Node root;
    public void add_node(int[] a)
    {
        
        root=add_node1( a, 0);
        
    }
    public Node add_node1(int[] a, int start)
    {
        Node newnode= new Node(a[start]);
        int left=(2*start)+1;
        int right=(2*start)+2;
        if(left<a.length)
        {
            newnode.lchild= add_node1(a, left);
        }
        if(right<a.length)
        {
            newnode.rchild= add_node1(a, right);
        }
        return newnode;
    }

     void print_level_order()
    {
        ArrayDeque<Node> que = new ArrayDeque<Node>();
        Node temp;
        if (root != null)
        {
            que.add(root);
        }
       
          while (que.isEmpty() == false) {
                 temp = que.remove();
                 System.out.println(temp.data);
                 if (temp.lchild != null)
                      que.add(temp.lchild);
                 if (temp.rchild != null)
                      que.add(temp.rchild);
    }
}
    public static void main(String[] args) {
        int[] a={10,2,1,3,4,1,8,19,12};
        binary_tree ob1= new binary_tree();
        ob1.add_node(a);
        ob1.print_level_order();
    }

    
}