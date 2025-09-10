import java.util.ArrayDeque;

public class arrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();

        // 🔹 Adding elements
        deque.add(10);              // add at tail (like queue)
        deque.addFirst(5);          // add at head
        deque.addLast(20);          // add at tail
        deque.offer(30);            // add at tail (like add(), but no exception)
        deque.offerFirst(2);        // add at head
        deque.offerLast(40);        // add at tail
        // deque = [2, 5, 10, 20, 30, 40]

        // 🔹 Access elements
        System.out.println("First element: " + deque.getFirst()); // 2
        System.out.println("Last element: " + deque.getLast());   // 40
        System.out.println("Peek head: " + deque.peek());         // 2 (peek = head)
        System.out.println("Peek last: " + deque.peekLast());     // 40

        // 🔹 Removing elements
        deque.remove();              // removes head -> removes 2
        deque.removeFirst();         // removes 5
        deque.removeLast();          // removes 40
        deque.poll();                // removes head -> removes 10
        deque.pollFirst();           // removes 20
        deque.pollLast();            // removes 30
        // Now deque = []

        // 🔹 Add again to test stack behavior
        deque.push(100);  // push() -> addFirst()
        deque.push(200);
        deque.push(300);  
        // deque = [300, 200, 100]

        System.out.println("Popped element: " + deque.pop()); // removes 300

        // 🔹 Iterate through deque
        deque.addAll(java.util.Arrays.asList(400, 500, 600));
        for (Integer i : deque) {
            System.out.println(i);
        }
    }
}
