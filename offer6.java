/**
*从尾到头打印链表
*/


class Node
{
    public int ele;
    public Node next;

    public Node(int ele){
        this.ele=ele;
        next=null;
    }
}


void printLinkedList(Node head)
{
    LinkedList<Node> list = new LinkedList<>();
    for(Node p=head;p!=null;p=p.next)
        list.push(p);
    while (!list.isEmpty())
        System.out.println(list.pop().ele);
}