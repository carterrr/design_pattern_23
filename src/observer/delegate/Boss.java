package observer.delegate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * @author CarterChou at 2019/4/9 19:51
 * @description
 */
public class Boss extends Notifyer {


    // c# 属性可以被继承  这个问题有待解决

    private String  action;

    public List <Consumer>  consumers = new ArrayList <>();


    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }


    // 为了实现方法引用  consumer传入null  java11有待改进

    @Override
    void notifys() {
        for (Consumer consumer : consumers) {
            consumer.accept(null);
        }
    }
}
