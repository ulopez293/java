package Thread;

//Thread implementa la interface Runnable, de quien hereda el metodo run
//por lo que puede ser tambien implements Runnable

public class DemoThread implements Runnable {
    private String nombre;
    public DemoThread(String nombre){
        this.nombre = nombre;
    }
    @Override
    public void run(){
        try{
            int x = (int) (Math.random()*5000);
            Thread.sleep(x);
            System.out.println("Soy: "+nombre+" ("+x+")");
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
    public static void main(String args[])throws Exception {
        Thread t1 = new Thread(new DemoThread("Pedro"));
        Thread t2 = new Thread(new DemoThread("Pablo"));
        Thread t3 = new Thread(new DemoThread("Juan"));
        //se ejecuta su metodo run simultaneamente
        t1.start();
        t2.start();
        t3.start();
        //esperamos por la finalizacion de los tres hilos
        t1.join();
        t2.join();
        t3.join();
        System.out.println("Final del programa!");
    }
}


/*
public class DemoThread extends Thread {
    private String nombre;
    public DemoThread(String nombre){
        this.nombre = nombre;
    }
    @Override
    public void run(){
        try{
            int x = (int) (Math.random()*5000);
            Thread.sleep(x);
            System.out.println("Soy: "+nombre+" ("+x+")");
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
    public static void main(String args[]){
        DemoThread t1 = new DemoThread("Pedro");
        DemoThread t2 = new DemoThread("Pablo");
        DemoThread t3 = new DemoThread("Juan");
        t1.start();
        t2.start();
        t3.start();
    }
}
*/
