package decorator;

/**
 * @author CarterChou at 2019/2/18 17:35
 * @description 基本被装饰对象
 */
public class ConcreteComponent2 implements Componet{
    @Override
    public void operation() {
        System.out.println("具体操作2");
    }
}
