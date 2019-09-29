package templateMethod;

/**
 * @author CarterChou at 2019/3/25 13:43
 * @description
 */
public class ConcreteClassA extends AbstractClass{
    @Override
    void primitiveOperation1() {
        System.out.println("A invoke operation1");
    }

    @Override
    void primitiveOperation2() {
        System.out.println("A invoke operation2");
    }
}
