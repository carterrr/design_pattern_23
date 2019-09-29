package mediator;

/**
 * @author CarterChou at 2019/4/29 12:48
 * @description 中介者模式   对象之间的通信通过中介者来完成  避免了对象之间的耦合   由直接交互变成了间接交互
 *
 *               一般来说，只有对于那种同事类之间是网状结构的关系，才会考虑使用中介者模式。可以将网状结构变为星状结构，使同事类之间的关系变的清晰一些。
 *
 *                  中介者模式是一种比较常用的模式，也是一种比较容易被滥用的模式。
 *                   对于大多数的情况，同事类之间的关系不会复杂到混乱不堪的网状结构，
 *                      因此，大多数情况下，将对象间的依赖关系封装的同事类内部就可以的，没有必要非引入中介者模式。
 *                          滥用中介者模式，只会让事情变的更复杂。
 */
public class MediatorClient {
    public static void main(String[] args) {



        Colleague c1 = new ConcreteColleague1();
        Colleague c2 = new ConcreteColleague2();

        Meditor m = new ConcreteMeditor(c1, c2);

        c1.send("hello c2", m);
        c2.send("hi c1", m);
    }
}
