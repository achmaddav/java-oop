package logic;

public class Logic01Soal06 extends BasicLogic {
    public Logic01Soal06(int n) {
        super(n);
    }
    int bil;
    public void isiArray() {
        int awal = 1;
        int akhir =10;
        int bil, batas = 0;
        for (int i=awal; i<=akhir; i++){
            bil=0;
            for (int j=1;j<=i;j++){
                if (i%j==0){
                    bil=bil+1;
                }
            }
            if (bil==2){
                this.array[0][batas] = String.valueOf(i);
                if (batas == n-1) break;
                else {
                    batas++;
                    akhir = (int)(Math.pow(akhir, i));
                }
            }
        }
    }

    public void cetakArray() {
        this.isiArray();
        this.printSingle();
    }
}
