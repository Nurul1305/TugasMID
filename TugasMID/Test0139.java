//Nama  : Nurul faisah
//Nim   : 13020210139

public class Test0139 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        //buat instansi objek bernama balok1 dari class Balok() ->default const.
        Balok balok1 = new Balok();

        //buat instansi objek bernama balok2 dari class Balok(20,35,15)->param const.
        Balok balok2 = new Balok(20, 35, 15);

        //setter → set nilai l = 5 dari konstruktor Balok()
        Balok balok3 = new Balok();
        balok3.setL(5);

        //setter → set nilai p = 25 dari konstruktor Balok()
        Balok balok4 = new Balok();
        balok4.setP(25);

        //setter → set nilai t = 10 dari konstruktor Balok(20,35, 15)
        Balok balok5 = new Balok(20, 35, 15);
        balok5.setT(10);

        //panggil method info dari konstruktor Balok ()
        Balok balok6 = new Balok();
        balok6.info();

        //panggil method info dari konstruktor Balok(20,35, 15)
        Balok balok7 = new Balok(20, 35, 15);
        balok7.info();
    }
}

//class Balok
class Balok extends PersegiPanjang {
    int t;

    public Balok() {
        //berisi nilai anjang & lebar yang diperoleh dari konstruktor superclass persegi panjang serta tinggi=15
        super();
        this.t = 15;
    }

    public Balok(int p, int l, int t) {
        //berisi nilai pada saat runtime p ← p, l ← l dari konstruktor superclass persegi panjang t ← t;
        super(p, l);
        this.t = t;
    }

     // buat getter setter class balok
    public int getT() {
        return t;
    }

    public void setT(int t) {
        this.t = t;
    }

    public int volume() {
        //fungsi untuk menghitung volume balok : p x l x t
        return this.getP() * this.getL() * this.getT();
    }

    public void info() {

        //fungsi untuk tampil nilai panjang, lebar, tinggi,Luas, dan volume balok 
        System.out.println("Panjang: " + this.getP());
        System.out.println("Lebar: " + this.getL());
        System.out.println("Tinggi: " + this.getT());
        System.out.println("Luas: " + this.luas());
        System.out.println("Volume: " + this.volume());
    }
}

class PersegiPanjang {
    int p, l;

    public PersegiPanjang() {
        this.p = 30;
        this.l = 20;
    }

    public PersegiPanjang(int p, int l) {
        this.p = p;
        this.l = l;
    }

    public int getP() {
        return p;
    }

    public void setP(int p) {
        this.p = p;
    }

    public int getL() {
        return l;
    }

    public void setL(int l) {
        this.l = l;
    }

    public int luas() {
        return p * l;
    }

    public int keliling() {
        return 2 * (p + l);
    }
}
