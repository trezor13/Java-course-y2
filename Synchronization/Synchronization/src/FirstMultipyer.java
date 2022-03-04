public class FirstMultipyer extends Thread {
    String name;
    int number;
    Thread t;
    MultiplicationTable table;

    public FirstMultipyer(String name, int number, MultiplicationTable table) {
        this.name = name;
        this.number = number;
        this.table = table;
    }

    @Override

    public void run() {
        synchronized (this.table) {
            System.out.println("task " + name + " started");
            try {
                this.table.multipy(number);
                System.out.println("task " + name + " ended");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void start() {
        if (t == null) {
            t = new Thread(this);
            t.start();
        }
    }

}
