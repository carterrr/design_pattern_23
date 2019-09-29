package order;

/**
 * @author CarterChou at 2019/4/25 12:31
 * @description  命令模式中的执行者 可以抽象出来执行者接口  有不同执行者去执行
 */
public class Barbecuer {
    public void BakeMutton () {
        System.out.println("收到烤羊肉串指令，开始制作");
    }

    public void BakeChickenWing () {
        System.out.println("收到烤鸡翅指令，开始制作");
    }

}
