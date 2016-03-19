public class EmptyQueueException extends RuntimeException{
    
    public EmptyQueueException(){
        super("Queue is Empty");
    }
}