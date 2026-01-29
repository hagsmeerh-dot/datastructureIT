package queue;

public class main {package Queue;

    public class Main {
        public static void main(String[] args) {
            LinkedQueue<String> lQueue=new LinkedQueue<String>();
            lQueue.enqueue("ali");
            lQueue.enqueue("mohmmmed");
            lQueue.enqueue("saleh");
            System.out.println(lQueue.front());
            while (!lQueue.isEmpty()){
                System.out.println("element removed="+lQueue.dequeue());
            }

        }
    }
}
