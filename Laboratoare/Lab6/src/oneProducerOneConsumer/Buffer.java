package oneProducerOneConsumer;
import java.util.concurrent.Semaphore;

/**
 * @author cristian.chilipirea
 *
 */
class Buffer {
    private int a;
    private Semaphore empty;
    private Semaphore full;

    Buffer() {
        a 		= -1;
        empty 	= new Semaphore(1);
        full 	= new Semaphore(0);
    }

    void put(int value) {
        try {
            empty.acquire();
        } catch(InterruptedException e) {
            e.printStackTrace();
        }

        a = value;

        full.release();
    }

    int get() {
        try {
            full.acquire();
        } catch(InterruptedException e) {
            e.printStackTrace();
        }

        int copyA = a;

        empty.release();

        return copyA;
    }
}
