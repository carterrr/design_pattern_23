package builder;

/**
 * @author CarterChou at 2019/4/8 12:57
 * @description
 */
public class ConcreteBuilder_2 implements Builder {

    Product product = new Product();

    @Override
    public void buildPartA() {
        product.Add("cup_white");
    }

    @Override
    public void buildPartB() {
        product.Add("covery_white");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
