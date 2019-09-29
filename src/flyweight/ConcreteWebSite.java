package flyweight;

import order.Waiter;

/**
 * @author CarterChou at 2019/5/9 12:28
 * @description
 */
public class ConcreteWebSite implements WebSite {
    private String name;

    public ConcreteWebSite(String name) {
        this.name = name;
    }

    @Override
    public void use(User user) {
        System.out.println("网站分类 ：" + name + "用户 ： " + user.getName());
    }
}
