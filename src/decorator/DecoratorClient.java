package decorator;

/**
 * @author CarterChou at 2019/2/18 17:53
 * @description   测试装饰器 在装饰对象前后加逻辑  同proxy 都可以是在原有的功能上面进行增加新的功能 但是装饰模式更强大
 */
public class DecoratorClient {
    public static void main(String[] args) {
        ConcreteComponent1 concreteComponent1 = new ConcreteComponent1();
        ConcreteComponent2 concreteComponent2 = new ConcreteComponent2();
        ConcreteDecoderA concreteDecoderA = new ConcreteDecoderA();
        ConcreteDecoderB concreteDecoderB = new ConcreteDecoderB();
        ConcreteDecoderC concreteDecoderC = new ConcreteDecoderC();
        concreteDecoderA.decode(concreteComponent1);
        concreteDecoderB.decode(concreteDecoderA);
        concreteDecoderC.decode(concreteDecoderB);
        concreteDecoderC.operation();
    }
}
