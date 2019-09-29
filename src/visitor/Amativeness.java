package visitor;

/**
 * @author CarterChou at 2019/5/20 18:59
 * @description
 */
public class Amativeness extends Action {
    @Override
    public void getManConclusion(Man concreteElementA) {
        System.out.println(concreteElementA.getClass().getName() + this.getClass().getName() + "时， 背后多半有一个伟大的女人");
    }

    @Override
    public void getWomanConclusion(Woman concreteElementB) {
        System.out.println(concreteElementB.getClass().getName() + this.getClass().getName() + "时， 背后多半有一个伟大的女人");
    }
}
