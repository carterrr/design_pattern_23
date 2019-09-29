package builder;

/**
 * @author CarterChou at 2019/4/8 12:57
 * @description
 */
public class ConcreteBuilder_1 implements Builder {

    Product product = new Product();

    @Override
    public void buildPartA() {
        product.Add("cup_blue");
    }

    @Override
    public void buildPartB() {
        product.Add("cover_blue");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
