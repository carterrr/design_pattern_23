package state;

/**
 * @author CarterChou at 2019/4/11 12:36
 * @description
 */
public class ForenonState implements State {
    @Override
    public void stateDeal(Work work) {
        if (work.getHour() < 12) {
            System.out.println("当前时间" + work.getHour() + "上午工作 精神百倍");
        } else {
            work.setCurrentState(new AfternoonState());
            // 记得切换引用
            work.changeState();
        }
    }
}
