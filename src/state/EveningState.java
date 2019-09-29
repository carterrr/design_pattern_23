package state;

/**
 * @author CarterChou at 2019/4/11 12:43
 * @description
 */
public class EveningState implements State {
    @Override
    public void stateDeal(Work work) {
        System.out.println("当前时间" + work.getHour() + "晚上加班  有点困了");
    }
}
