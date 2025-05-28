package ejerciciostema04;

public class Main {

    public static void main(String[] args) {
        IntegerStaticQueue queue = new IntegerStaticQueue(4);
        queue.enqueue(1);
        System.out.println(queue);

        queue.enqueue(2);
        System.out.println(queue);

        queue.enqueue(3);
        System.out.println(queue);

        queue.enqueue(4);
        System.out.println(queue);

        queue.enqueue(5);
        System.out.println(queue);

        System.out.println("Desencolando valor: " + queue.dequeue());
        System.out.println(queue);

//        System.out.println("Primer elemento: " + queue.first());
//        System.out.println("Primer elemento: " + queue.first());

        System.out.println("Desencolando valor: " + queue.dequeue());
        System.out.println(queue);

        System.out.println("Desencolando valor: " + queue.dequeue());
        System.out.println(queue);

        System.out.println("Desencolando valor: " + queue.dequeue());
        System.out.println(queue);

        System.out.println("Desencolando valor: " + queue.dequeue());
        System.out.println(queue);

        System.out.println("Desencolando valor: " + queue.dequeue());
        System.out.println(queue);
    }
}
