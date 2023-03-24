package multithreading;

class Table {
    synchronized static void printTable(int n) {

        for (int i = 1; i < 6; i++) {

            System.out.println(n * i);

            try {
                Thread.sleep(200);
            } catch (InterruptedException ie) {
                System.out.println("exception caught");
            }
        }


    }

    static void printTable2(int n) {

        for (int i = 1; i < 6; i++) {

            System.out.println(n * i);

            try {
                Thread.sleep(200);
            } catch (InterruptedException ie) {
                System.out.println("exception caught");
            }
        }


    }


}


    public class StaticSynchronization {

        public static void main(String[] args) {

            //calls static sync method
            Thread t1 = new Thread() {
                @Override
                public void run() {
                    Table.printTable(2);
                }
            };

            //calls static method
            Thread t2 = new Thread() {
                @Override
                public void run() {
                    Table.printTable2(2);
                }
            };

            //calls static sync method
            Thread t3 = new Thread(){
                public void run() {
                    Table.printTable(2);
                }
            };

            //when only synchronised method is called only object level lock is applied hence t1 and  t2 runs simultaneously
            t1.start();

            //when static synchronised method is called the class gets locked and hence it runs fully in synchronised manner
            t3.start();

            t2.start();


        }
    }

