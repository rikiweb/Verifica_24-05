package ese2_verifica;

import java.util.Random;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lambrugo_riccardo
 */


public class Shared {
    private int buffer;
    private int [] numeri;
    private int num;
    private Semaphore sem1;
    private Semaphore sem2;
    private Semaphore sem3;
    private Semaphore sem4;
    private int insDispari;
    private int insPari;
    private int lettoDispari;
    private int lettoPari;
    private int zeri;

    public Shared(int buffer, int[] numeri, int num, Semaphore sem1, Semaphore sem2, Semaphore sem3, Semaphore sem4, int insDispari, int insPari, int lettoDispari, int lettoPari, int zeri) {
        this.buffer = buffer;
        this.numeri = numeri;
        this.num = num;
        this.sem1 = new Semaphore(0);
        this.sem2 = new Semaphore(0);
        this.sem3 = new Semaphore(0);
        this.sem4 = new Semaphore(1);
        this.insDispari = insDispari;
        this.insPari = insPari;
        this.lettoDispari = lettoDispari;
        this.lettoPari = lettoPari;
        this.zeri = zeri;
    }

    public Shared(int num) {
        this.num = num;
        this.sem1 = new Semaphore(0);
        this.sem2 = new Semaphore(0);
        this.sem3 = new Semaphore(0);
        this.sem4 = new Semaphore(1);
    }

    public int getBuffer() {
        return buffer;
    }

    public int getNum() {
        return num;
    }

    public Semaphore getsem1() {
        return sem1;
    }

    public Semaphore getsem2() {
        return sem2;
    }

    public Semaphore getsem3() {
        return sem3;
    }

    public Semaphore getsem4() {
        return sem4;
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

    public int getZeri() {
        return zeri;
    }

    public void setBuffer(int buffer) {
        this.buffer = buffer;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setsem1(Semaphore sem1) {
        this.sem1 = sem1;
    }

    public void setsem2(Semaphore sem2) {
        this.sem2 = sem2;
    }

    public void setsem3(Semaphore sem3) {
        this.sem3 = sem3;
    }

    public void setsem4(Semaphore sem4) {
        this.sem4 = sem4;
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

    public void setZeri(int zeri) {
        this.zeri = zeri;
    }

    public int[] getNumeri() {
        return numeri;
    }

    public void setNumeri(int[] numeri) {
        this.numeri = numeri;
    }
    
    public void incInsDispari(){
        this.insDispari++;
    }
    
    public void incInsPari(){
        this.insPari++;
    }

    public void incLettoDispari(){
        this.lettoDispari++;
    }
    
    public void incLettoPari(){
        this.lettoPari++;
    }
    
    public void incZeri(){
        this.zeri++;
    }
    
    public void waitsem1(){
        try {
            sem1.acquire();
        } catch (InterruptedException ex) {
            Logger.getLogger(Shared.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void waitsem2(){
        try {
            sem2.acquire();
        } catch (InterruptedException ex) {
            Logger.getLogger(Shared.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void waitsem3(){
        try {
            sem3.acquire();
        } catch (InterruptedException ex) {
            Logger.getLogger(Shared.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void waitsem4(){
        try {
            sem4.acquire();
        } catch (InterruptedException ex) {
            Logger.getLogger(Shared.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void signalsem1(){
        sem1.release();
    }
    
    public void signalsem2(){
        sem2.release();
    }
    
    public void signalsem3(){
        sem3.release();
    }
    
    public void signalsem4(){
        sem4.release();
    }
}
