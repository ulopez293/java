package Thread;

public class DemoThread3 {
    public static void main(String args[]){
        MiThread t1 = new MiThread("Pablo");
        MiThread t2 = new MiThread("Pedro");
        t2.setPriority(Thread.MAX_PRIORITY);
        System.out.println(Thread.MAX_PRIORITY);
        System.out.println(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
    }

    static class MiThread extends Thread {
        String nom;
        public MiThread(String nom) {
            this.nom = nom;
        }
        @Override
        public void run(){
            for (int i = 0; i < 5; i++) {
                System.out.println(nom +" - "+i);
                yield();
            }
        }
    }
}
