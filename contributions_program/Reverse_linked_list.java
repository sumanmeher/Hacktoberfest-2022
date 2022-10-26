class Node{
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;

    }
}


public class Reverse_linked_list {
    Node head;
    public void add(int data)
    {
        Node new_node=new Node(data);
        if(head==null){
            head=new_node;
            new_node.next=null;
        }
        else{
            Node temp=head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=new_node;

        }
        
        
    
    }
    public void display()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data);
            temp=temp.next;
        }
    }
    public void reverse1()
    {
        reverse(head);
    }

    public Node reverse(Node temp)
    {
        if (head == null || head.next == null)
        return head;

  
    Node rest = reverse(head.next);
    head.next.next = head;

    head.next = null;

    return rest;
    }
    public static void main(String[] args) {
        Reverse_linked_list ob1= new Reverse_linked_list();
        ob1.add(10);
        ob1.add(20);
        ob1.add(30);
        ob1.display();
        ob1.reverse1();
        System.out.println();
        ob1.display();
    }

    
}