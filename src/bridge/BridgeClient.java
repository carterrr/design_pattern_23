package bridge;

/**
 * @author CarterChou at 2019/4/23 15:17
 * @description  桥接模式  多个角度可以在每个角度有多种替换时
 *                          将高层抽象之间聚合   使得其实现类可以替换这种框架
 *                          高层之间的聚合见  MobileBrand 类
 */
public class BridgeClient {
    public static void main(String[] args) {
        MobileBrand nokia = new Nokia();
        nokia.setSoft(new MobileGame());
        nokia.run();


        nokia.setSoft(new MobileContacts());
        nokia.run();

        // brand  和 soft  随时可以替换成具体子类
        MobileBrand motorola = new Motorola();
        motorola.setSoft(new MobileGame());
        motorola.run();


        motorola.setSoft(new MobileContacts());
        motorola.run();

    }
}
