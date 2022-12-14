
package logic.logicInterface.logic01Impl;

import logic.BasicLogic;
import logic.logicInterface.LogicInterface;

public class Logic01Soal10Impl implements LogicInterface {

    private final BasicLogic logic;

    public Logic01Soal10Impl(BasicLogic logic) {
        this.logic = logic;
    }

    public void isiArray() {
        for (int i = 0; i < this.logic.n; i++) {
            int angka = (int)Math.pow(i, 3);
            this.logic.array[0][i]= String.valueOf(angka);
        }
    }

    @Override
    public void cetakArray() {
        this.isiArray();
        this.logic.printSingle();
    }
}
