package Facade;

/**
 * @author CarterChou at 2019/3/26 16:44
 * @description 外观模式
 */
public class FacadeClient {
    public static void main(String[] args) {

        Facade facade = new Facade();

        facade.MethodA();
        facade.MethodB();

    }
}
