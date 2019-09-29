package builder;

/**
 * @author CarterChou at 2019/4/8 12:55
 * @description
 */
public interface Builder {

    void buildPartA();

    void buildPartB();

    Product getResult();
}
