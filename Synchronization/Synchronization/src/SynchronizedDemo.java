import java.io.IOException;

public class SynchronizedDemo {
    public static void main(String[] args) throws IOException {
        Task task = new Task();
        Executor executor1=new Executor("Multiply by "+2,2,task);
        Executor executor2=new Executor("Multiply by "+3, 3,task);
        executor1.start();
        executor2.start();
    }
}
