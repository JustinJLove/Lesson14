
public class ERTester {

    public static void main(String[] args) {
        LinkedPriorityQueue ER = new LinkedPriorityQueue(3);
        //Add 2 serious - One critical and one fair
        ER.enqueue("Sam",2);
        ER.enqueue("Bob",2);
        ER.enqueue("Joe",2);
        ER.enqueue("Amy",2);
        
        System.out.println("Treating patient " + ER.dequeue);
        
    }
    
}
