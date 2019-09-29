package visitor;

/**
 * @author CarterChou at 2019/5/20 18:53
 * @description
 */
public abstract class Person {
    public abstract void Accept(Action visitor);
}
