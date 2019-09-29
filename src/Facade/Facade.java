package Facade;

/**
 * @author CarterChou at 2019/3/26 16:33
 * @description 已有的功能的聚集和组装
 */
public class Facade {
    SubSystemOne subSystemOne;
    SubSystemTwo subSystemTwo;
    SubSystemThree subSystemThree;
    SubSystemFour subSystemFour;

    public Facade(){
        subSystemOne = new SubSystemOne();
        subSystemTwo = new SubSystemTwo();
        subSystemThree = new SubSystemThree();
        subSystemFour = new SubSystemFour();
    }


    public void MethodA() {
        System.out.println("外观类方法A");
        subSystemOne.MethodOne();
        subSystemTwo.MethodTwo();
        subSystemFour.MethodFour();
    }


    public void MethodB() {
        System.out.println("外观类方法B");
        subSystemThree.MethodThree();
        subSystemFour.MethodFour();
    }
}
