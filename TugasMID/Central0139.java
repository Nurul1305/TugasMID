//Nama  : Nurul faisah
//Nim   : 13020210139

interface A{
    void aaa();
}

interface B extends A{
    void bbb();
}

class Central0139 implements B{
    public void aaa() {
        System.out.println("aaa");
    }

    public void bbb() {
        System.out.println("bbb");
    }
    public static void main(String[] args) {
        Central0139 obj = new Central0139();
        obj.aaa();
        obj.bbb();
    }
}