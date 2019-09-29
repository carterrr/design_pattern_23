package state;

/**
 * @author CarterChou at 2019/4/11 12:36
 * @description
 */
public class Work {
    private State currentState;
    private int hour;

    /**
     *  初始化成第一个if判断   自动跳转
     */
    public Work() {
        this.currentState = new ForenonState();
    }

    //状态切换
    public void changeState() {
        currentState.stateDeal(this);
    }


    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }


}
