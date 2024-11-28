class DisplayMessage1 extends Thread {
    public void run() {
        for(int i=0;i<5;i++) {
            try {
                System.out.println("BMS College of Engineering");
                Thread.sleep(10000); 
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class DisplayMessage2 extends Thread {
    public void run() {
       for(int i=0;i<5;i++) {
            try {
                System.out.println("CSE");
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class multithread{
    public static void main(String[] args) {
        DisplayMessage1 thread1 = new DisplayMessage1();
        DisplayMessage2 thread2 = new DisplayMessage2();

        thread1.start(); 
        thread2.start(); 
	System.out.println("Name: K.Keerthi Reddy");
        System.out.println("USN: 1BM23CS137");
    }
}
