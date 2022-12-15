package logic.logicInterface.logic02Impl;

import logic.BasicLogic;
import logic.logicInterface.LogicInterface;

public class Logic02Soal07Impl implements LogicInterface {

    private final BasicLogic logic;

    public Logic02Soal07Impl(BasicLogic logic) {
        this.logic = logic;
    }

    public void isiArray(){
        int[][] deret = new int[this.logic.n][this.logic.n];
        for (int i = 0; i < this.logic.n; i++) {
            for (int j = 0; j < this.logic.n; j++) {
                if (j <= 1 || i <= 1 || i >= this.logic.n - 2 || j >= this.logic.n - 2) deret[i][j] = 1;
                else if (j >= i && j < this.logic.n - i) deret[i][j] = deret[i - 1][this.logic.n / 2] + deret[i - 2][this.logic.n / 2];
                else if (j >= this.logic.n - i - 1 && j <= i) deret[i][j] = deret[this.logic.n - i - 2][this.logic.n / 2] + deret[this.logic.n - i - 3][this.logic.n / 2];
                else if (j <= this.logic.n / 2) deret[i][j] = deret[i][j - 1] + deret[i][j - 2];
                else if (j >= this.logic.n / 2) deret[i][j] = deret[this.logic.n / 2][this.logic.n - j - 2] + deret[this.logic.n / 2][this.logic.n - j - 3];
            }
        }

        for (int i = 0; i < this.logic.n; i++) {
            for (int j = 0; j < this.logic.n; j++) {
                if (j >= i && j >= this.logic.n - i - 1 && this.logic.n / 2 <= i
                        || j <= i && j <= this.logic.n - i - 1 && this.logic.n / 2 >= i
                        || j >= this.logic.n / 2 && j <= this.logic.n - i - 1
                        || j <= this.logic.n / 2 && j >= this.logic.n - i - 1) {
                    this.logic.array[i][j] = String.valueOf(deret[i][j]);
                }
            }
        }
    }

    @Override
    public void cetakArray() {
        this.isiArray();
        this.logic.print();
    }
}
