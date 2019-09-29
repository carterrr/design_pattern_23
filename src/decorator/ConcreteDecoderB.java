package decorator;

/**
 * @author CarterChou at 2019/2/18 17:44
 * @description
 */
public class ConcreteDecoderB extends Decorator{

    @Override
    public void operation() {

        doSomething("before");
        super.operation();
        doSomething("after");
    }

    private void doSomething(String postfix){
        System.out.println("ConcreteDecoderB do something" + postfix);
    }
}
