package superKeyword;

public class Rectangle extends Shape{
    int getCornet(){
        return 4;
    }

    int getParentCorner(){
        return super.getCorner();
    }

    boolean isValid(){
        return false;
    }

    String getName(){
        return "Ahmad Roni";
    }

    void sayHello(){

    }
}
