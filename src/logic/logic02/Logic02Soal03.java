package logic.logic02;

import logic.BasicLogic;

public class Logic02Soal03 extends BasicLogic {
    public Logic02Soal03(int n) {
        super(n);
    }

    public void isiArray(){
        for (int i = 0; i < n; i++) {
            int angka = 0;
            for (int j = 0; j < n; j++) {
                if(j == 0 || i == 0
                        || j == n - 1 || i == n - 1
                        || j == i || j == n - i - 1){
                    this.array[i][j] = String.valueOf(angka);
                }
                angka += 2;
            }
        }
    }

    public void cetakArray(){
        this.isiArray();
        this.print();
    }

}
