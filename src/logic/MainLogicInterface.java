package logic;

import logic.logicInterface.LogicInterface;
import logic.logicInterface.logic01Impl.Logic01Soal01Impl;

public class MainLogicInterface {
    public static void main(String[] args) {

        System.out.println("Sample Logic 01 Soal 01");
        LogicInterface logic01Soal01 = new Logic01Soal01Impl(new BasicLogic(9));
        logic01Soal01.cetakArray();
    }
}
