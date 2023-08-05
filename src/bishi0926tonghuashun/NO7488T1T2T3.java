package bishi0926tonghuashun;

/**
 * @author: wwx
 * @date: 2022/9/26 15:53
 * @describe:
 */
public class NO7488T1T2T3 {
    public static void main(String[] args){

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("this is t1");
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    t1.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("this is t2");
            }
        });

        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    t2.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("this is t3");
            }
        });

        t1.start();
        t2.start();
        t3.start();
    }
}
