package STACK;

public class main package Stack;

public class Main {
    public static void main(String[] args) {

        ArrayStack<Integer> aStack =new ArrayStack<Integer>(3);

        //LinkdStack<Integer> aStack =new LinkdStack<Integer>();
        aStack.push(10);
        aStack.push(20);
        aStack.push(30);
        aStack.push(50);
        System.out.println("the top is "+aStack.top());
        while (!aStack.isEmpty()){
            System.out.println("element removed="+aStack.pop());
        }

        //aStack.display();





    }
}{
}
