package builder;

/**
 * @author CarterChou at 2019/4/8 13:00
 * @description   用于规范构造流程  必须有  A  B 两个部分
 *                 可以有多个Director 从而可以来多种构造流程
 *                  通过将Builder传给其他类Director来实行Builder的构造
 */
public class Director {
    public void Construct(Builder builder) {
        builder.buildPartA();
        builder.buildPartB();
    }
}
