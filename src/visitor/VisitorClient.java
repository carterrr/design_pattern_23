package visitor;

/**
 * @author CarterChou at 2019/5/20 18:27
 * @description  扩展稳定的几个数据结构或几个操作上  的操作  后者可以很方便的扩展
 *
 *                  双分派 传入自身进入success对象的accept方法
 *                  accept方法中又调用自身的方法再把success当this传入
 *                  决定整个操作的有两处  accept方法中
 *                                      自身方法中
 *
 *                                      Action类子类可以很方便的扩展
 *                                      Person的子类很难扩展
 *
 */
public class VisitorClient {
    public static void main(String[] args) {
        Success s = new Success();
        Person man = new Man();
        man.Accept(s);
    }
}

