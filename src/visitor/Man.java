package visitor;

/**
 * @author CarterChou at 2019/5/20 18:54
 * @description
 */
public class Man extends Person {
    @Override
    public void Accept(Action visitor) {
        visitor.getManConclusion(this);
    }
}
