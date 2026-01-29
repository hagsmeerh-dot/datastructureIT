package singlylinkedlist;

public class MAIN {package SinglyLinkedList;

    public class Main {
        public static void main(String[] args) {
            SinglyLinkedList<Integer> list=new SinglyLinkedList<Integer>();
            SinglyLinkedList<String> list2=new SinglyLinkedList<String>();
            list.addFirst(10);
            list.addFirst(20);
            list.addLast(40);
            list.addFirst(30);
            list.removeFirst();
            list.removeLast();
            list.display();



        }
    }
}
