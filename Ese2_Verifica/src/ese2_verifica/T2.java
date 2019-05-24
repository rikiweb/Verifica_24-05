package ese2_verifica;
/**
 *
 * @author lambrugo_riccardo
 */


public class T2 extends Thread {
    int num;
    Shared shared;
    int buffer;
    
    public T2(Shared shared, int buffer) {
        this.shared = shared;
        this.buffer = buffer;
    }

    public T2(Shared shared) {
        this.shared = shared;
        this.num = shared.getNum();
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
    
    public void run(){
        for(int i = 0; i < num; i++){
            shared.waitsem2();
            buffer=shared.getBuffer();
            if(buffer )
                shared.incLettoDispari();
            shared.signalsem3();
        }
        System.out.println("Letti numeri dispari.");
    }
}
