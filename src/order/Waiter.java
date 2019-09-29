package order;

import java.util.ArrayList;
import java.util.List;

/**
 * @author CarterChou at 2019/4/25 12:37
 * @description
 */
public class Waiter {

    // 维护一个指令序列

    private List <Command> orders = new ArrayList <>();

    public void setOrder(Command command) {
        if (command.getClass() == BakeChickenWingCommand.class) {
            System.out.println("服务员：没鸡翅了，不好意思");
        } else {
            orders.add(command);
            System.out.println("新增 订单：" + command.toString() );
        }
    }

    public void cancelOrder(Command command) {
        orders.remove(command);
        System.out.println("取消 订单：" +  command.toString());
    }

    public void notifyExecute() {
        for (Command command : orders) {
            command.ExcuteCommand();
        }
    }
}
