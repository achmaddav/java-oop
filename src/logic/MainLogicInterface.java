package logic;

import logic.logicInterface.LogicInterface;
import logic.logicInterface.logic01Impl.*;

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

        System.out.println("\n\nSample Logic 01 Soal 04");
        LogicInterface logic01Soal04 = new Logic01Soal04Impl(new BasicLogic(9));
        logic01Soal04.cetakArray();

        System.out.println("\n\nSample Logic 01 Soal 05");
        LogicInterface logic01Soal05 = new Logic01Soal05Impl(new BasicLogic(9));
        logic01Soal05.cetakArray();
    }
}
