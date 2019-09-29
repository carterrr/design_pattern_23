package state;

/**
 * @author CarterChou at 2019/4/10 13:39
 * @description 状态模式   策略模式的孪生兄弟    用于拆解超长复杂的if else 语句 每个状态子类含有跳转逻辑
 *               在work.changeState() 中传work对象及hour 给state子类
 *               在 state子类中将下一个子类传给work对象
 *
 *
 *               本例中只能sethour 递增  没有跳转回来的逻辑 因为状态模式就是一次if else判断   无需写会跳逻辑   x >12 了之后不可能有x < 9
 */
public class StateClient {
    public static void main(String[] args) {
        Work work1 = new Work();

        work1.setHour(8);
        work1.changeState();

        work1.setHour(17);
        work1.changeState();

        work1.setHour(20);
        work1.changeState();

        // 没有回跳逻辑
        work1.setHour(9);
        work1.changeState();

        // 当前时间8上午工作 精神百倍
        // 当前时间17下午工作 继续努力
        // 当前时间20晚上加班  有点困了
        // 当前时间9晚上加班  有点困了
    }
}
