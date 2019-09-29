package state;

/**
 * @author CarterChou at 2019/4/11 12:41
 * @description
 */
public class AfternoonState implements State{
    @Override
    public void stateDeal(Work work) {
        if (work.getHour() < 18) {
            System.out.println("当前时间" + work.getHour() + "下午工作 继续努力");
        } else {
            work.setCurrentState(new EveningState());
            work.changeState();
        }
    }
}
