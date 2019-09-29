package templateMethod;

/**
 * @author CarterChou at 2019/3/25 18:55
 * @description
 */
public class ConcreteClassB extends AbstractClass{
    @Override
    void primitiveOperation1() {
        System.out.println("B invoke operation1");
    }

    @Override
    void primitiveOperation2() {
        System.out.println("B invoke operation2");
    }
}
