package templateMethod;

/**
 * @author CarterChou at 2019/3/25 13:34
 * @description
 */
public abstract class AbstractClass {
    public void templateMathod(){
        primitiveOperation1();
        primitiveOperation2();
    }

    abstract void primitiveOperation1();
    abstract void primitiveOperation2();
}
