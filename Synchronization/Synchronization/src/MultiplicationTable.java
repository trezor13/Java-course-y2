public class MultiplicationTable {

    public synchronized void multipy(int n) throws InterruptedException {
        for(int i=1; i<=12; i++){
            System.out.println(i+"*"+n+" ="+i*n);
            Thread.sleep(100);
        }
    }
}
