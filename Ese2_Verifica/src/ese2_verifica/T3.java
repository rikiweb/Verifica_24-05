package ese2_verifica;
/**
 *
 * @author lambrugo_riccardo
 */


public class T3 extends Thread {
    int num;
    Shared shared;
    int buffer;

    public T3(Shared shared, int buffer) {
        this.shared = shared;
        this.buffer = buffer;
    }
    
    public T3(Shared shared) {
        this.shared = shared;
        this.buffer = shared.getNum();
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
        for(int i = 0; i < num; i++){
            shared.waitsem1();
            buffer=shared.getBuffer();
            if(buffer )
                shared.incLettoPari();
            shared.signalsem2();
        }
        System.out.println("Letti numeri pari.");
    }
}
