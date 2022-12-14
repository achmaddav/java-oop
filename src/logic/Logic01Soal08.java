package logic;

public class Logic01Soal08 extends BasicLogic {

    public Logic01Soal08(int n) {
        super(n);
    }

    public void isiArray(){
        char huruf = 'A';
        int angka = 2;
        // isi array
        for (int i = 0; i < n; i++) {
            // genap dulu
            if(i % 2 == 0){
                this.array[0][i] = String.valueOf(huruf);
            }else {
                this.array[0][i] = String.valueOf(angka);
                angka+=2;
            }
            huruf++;
        }
    }

    public void cetakArray(){
        this.isiArray();
        this.printSingle();
    }
}
