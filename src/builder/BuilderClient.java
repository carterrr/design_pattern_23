package builder;

/**
 * @author CarterChou at 2019/4/8 13:02
 * @description  构造者模式 用于创建复杂对象  复杂对象的构造顺序确定 但是具体细节的构造不同
 *              指挥和构造相分离  指挥固定流程  构造用具体流程实现
 *                 可以有多个Director 从而可以来多种构造流程
 *                   通过将Builder传给其他类Director来实行Builder的构造
 *
 *                   ~_~   核心思想
 *                    具体构造的每一步都写在具体构造器Builder里
 *                      由外部控制器Director来实现整个构造过程
 */
public class BuilderClient {
    public static void main(String[] args) {
        Director director = new Director();
        Builder b1 = new ConcreteBuilder_1();
        Builder b2 = new ConcreteBuilder_2();

        director.Construct(b1);
        Product p1 = b1.getResult();
        p1.show();

        director.Construct(b2);
        Product p2 = b1.getResult();
        p2.show();



    }
}
