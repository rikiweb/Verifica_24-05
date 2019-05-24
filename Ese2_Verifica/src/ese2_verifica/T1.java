package ese2_verifica;

import java.util.Random;

/**
 *
 * @author lambrugo_riccardo
 */


public class T1 extends Thread {
    int num;
    Shared shared;
    int buffer;

    public T1(Shared shared, int num, int buffer) {
        this.shared = shared;
        this.buffer = buffer;
    }
    
    public T1(Shared shared) {
        this.shared = shared;
        this.num =shared.getNum();
    }

    public int getNum() {
        return num;
    }

    public Shared getShared() {
        return shared;
    }

    public int getBuffer() {
        return buffer;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setShared(Shared shared) {
        this.shared = shared;
    }

    public void setBuffer(int buffer) {
        this.buffer = buffer;
    }
    
    public void run() {
        Random rand = new Random();
        for(int i = 0; i < num; i++){
            shared.waitsem4();
            int num = rand.nextInt(36);
            buffer = 
            if(buffer % 2==0){
                shared.incInsPari();
            } else {
                shared.incInsDispari();
            }
            shared.setBuffer(buffer);
            shared.signalsem1();
        }
        System.out.println("Generazione numeri completata.");
    }
}
