package ese2_verifica;
/**
 *
 * @author lambrugo_riccardo
 */


public class T4 extends Thread {
    int num;
    Shared shared;
    int buffer;
    int insDispari;
    int insPari;
    int lettoDispari;
    int lettoPari;

    public T4(Shared shared, int buffer, int insDispari, int insPari, int lettoDispari, int lettoPari) {
        this.shared = shared;
        this.buffer = buffer;
        this.insDispari = insDispari;
        this.insPari = insPari;
        this.lettoDispari = lettoDispari;
        this.lettoPari = lettoPari;
    }

    public T4(Shared shared) {
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

    public int getInsDispari() {
        return insDispari;
    }

    public int getInsPari() {
        return insPari;
    }

    public int getLettoDispari() {
        return lettoDispari;
    }

    public int getLettoPari() {
        return lettoPari;
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

    public void setInsDispari(int insDispari) {
        this.insDispari = insDispari;
    }

    public void setInsPari(int insPari) {
        this.insPari = insPari;
    }

    public void setLettoDispari(int lettoDispari) {
        this.lettoDispari = lettoDispari;
    }

    public void setLettoPari(int lettoPari) {
        this.lettoPari = lettoPari;
    }
    
    public void run() {
        for(int i = 0; i < num; i++){
            shared.waitsem3();
            buffer = shared.getBuffer();
            insDispari = getInsDispari();
            insPari = getInsDispari();
            lettoDispari = getLettoDispari();
            lettoPari = getLettoPari();
            System.out.println("Numero Generato: " + buffer);
            System.out.println("Dispari Letti: " + lettoDispari);
            System.out.println("Dispari Inseriti: " + insDispari);
            System.out.println("Pari Letti: " + lettoPari);
            System.out.println("Pari Inseriti: " + insPari);
            shared.signalsem4();
        }
        System.out.println("Fine Scrittura");
    }
}
