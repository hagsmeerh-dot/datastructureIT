package STACK;

public class dlinkedstack {package Stack;

import DoublyLinkedList.DoublyLinkedList;

    public class DLinkdStack<E> implements Stack<E> {
        DoublyLinkedList<E> dlist=new DoublyLinkedList<E>();
        @Override
        public boolean isEmpty() {
            return dlist.isEmpty();
        }

        @Override
        public int size() {
            return dlist.size();
        }

        @Override
        public void push(E data) {
            dlist.addFirst(data);
        }

        @Override
        public E top() {
            return dlist.getFirst();
        }

        @Override
        public E pop() {
            return dlist.removeFirst();
        }





        //public void display(){
        // dlist.display2();
//}
    }
}
