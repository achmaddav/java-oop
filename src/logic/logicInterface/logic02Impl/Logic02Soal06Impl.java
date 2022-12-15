package logic.logicInterface.logic02Impl;

import logic.BasicLogic;
import logic.logicInterface.LogicInterface;

public class Logic02Soal06Impl implements LogicInterface {

    private final BasicLogic logic;

    public Logic02Soal06Impl(BasicLogic logic) {
        this.logic = logic;
    }

    public void isiArray(){
        int tempArray[] = new int[this.logic.n];
        for (int i = 0; i < this.logic.n; i++) {
            for (int j = 0; j < this.logic.n; j++) {
                if (j <= 1) tempArray[j] = 1;
                else tempArray[j] = tempArray[j - 1] + tempArray[j - 2];

                if (j >= i && j <= this.logic.n - i - 1
                        || j <= i && j >= this.logic.n - i - 1) {
                    this.logic.array[i][j] = String.valueOf(tempArray[i]);
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
