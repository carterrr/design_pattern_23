package templateMethod;

/**
 * @author CarterChou at 2019/3/25 18:57
 * @description 模板方法模式  new 子类赋值给模板类  并执行模板方法即可
 */
public class TemplateMethodClient {
    public static void main(String[] args) {
        AbstractClass a;
        a = new ConcreteClassA();
        a.templateMathod();

        a = new ConcreteClassB();
        a.templateMathod();
    }
}
