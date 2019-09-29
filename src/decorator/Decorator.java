package decorator;

/**
 * @author CarterChou at 2019/2/18 17:37
 * @description  装饰器decorator
 */
public abstract class Decorator implements Componet{

    private Componet componet;

    public void decode(Componet componet){
        this.componet = componet;
    }

    @Override
    public void operation() {
        if(componet != null) {
            componet.operation();
        }
    }
}
