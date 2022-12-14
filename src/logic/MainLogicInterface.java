package logic;

import logic.logicInterface.LogicInterface;
import logic.logicInterface.logic01Impl.Logic01Soal01Impl;
import logic.logicInterface.logic01Impl.Logic01Soal02Impl;
import logic.logicInterface.logic01Impl.Logic01Soal03Impl;

public class MainLogicInterface {
    public static void main(String[] args) {

        System.out.println("Sample Logic 01 Soal 01");
        LogicInterface logic01Soal01 = new Logic01Soal01Impl(new BasicLogic(9));
        logic01Soal01.cetakArray();

        System.out.println("\n\nSample Logic 01 Soal 02");
        LogicInterface logic01Soal02 = new Logic01Soal02Impl(new BasicLogic(9));
        logic01Soal02.cetakArray();

        System.out.println("\n\nSample Logic 01 Soal 03");
        LogicInterface logic01Soal03 = new Logic01Soal03Impl(new BasicLogic(9));
        logic01Soal03.cetakArray();
    }
}
