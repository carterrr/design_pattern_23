package order;

/**
 * @author CarterChou at 2019/4/24 12:25
 * @description  命令模式
 *                 用于大量业务请求的批处理  批处理前有可能取消请求
 *                  实现了请求队列 方便将命令记录入日志
 *
 */
public class OrderClient {
    public static void main(String[] args) {
        // 准备营业

        // 厨师准备  receiver
        Barbecuer boy = new Barbecuer();

        // 菜单准备  command
        Command bakeMutton1 = new BakeMuttonCommand(boy);
        Command bakeMutton2 = new BakeMuttonCommand(boy);

        Command bakeChickenWing = new BakeChickenWingCommand(boy);

        // 服务员准备  invoker
        Waiter girl = new Waiter();

        // 开始营业

        // 点菜
        girl.setOrder(bakeChickenWing);
        girl.setOrder(bakeMutton1);
        girl.setOrder(bakeMutton2);

        // 取消
        girl.cancelOrder(bakeMutton1);

        //通知厨房做菜
        girl.notifyExecute();



    }
}
