package tp3.ex1;

public class Main {




    public static void main(String[] args throws InterruptedException {
        class exr1 extends Thread{
            @Override
            public void run()
            {
            System.out.println("my thread is running");}
        }
        class exrc1 implements Runnable{
            @Override
                public void run()
            {
                System.out.println("my thread is running");}
            }
        }

        Thread t=new exr1();
        t.start();
        t.join();
        exrc1 e=new exrc1();
        Thread a=new Thread(e);
        a.start();
        a.join();
        System.out.println("its over");



        }
    }
