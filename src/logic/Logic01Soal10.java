package logic;

public class Logic01Soal10 extends BasicLogic{
    public Logic01Soal10(int n) {
        super(n);
    }

    public void isiArray(){
        for (int i = 0; i < this.n; i++) {
            int angka = (int)Math.pow(i, 3);
            this.array[0][i]= String.valueOf(angka);
        }
    }

    public void cetakArray(){
        this.isiArray();
        this.printSingle();
    }
}

