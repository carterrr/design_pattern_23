package visitor;

/**
 * @author CarterChou at 2019/5/20 18:55
 * @description
 */
public class Woman extends Person {
    @Override
    public void Accept(Action visitor) {
        visitor.getWomanConclusion(this);
    }
}
