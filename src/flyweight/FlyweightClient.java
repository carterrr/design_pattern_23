package flyweight;

/**
 * @author CarterChou at 2019/5/9 12:26
 * @description 享元模式  共享已有的类（多个）  与单例模式区分开
 */
public class FlyweightClient {
    public static void main(String[] args) {
        WebsiteFactory websiteFactory = new WebsiteFactory();

        //通过key获取共享类   最后统计只有两个类
        // 通过set传入外部状态  使得同一个共享类有不同参数
        WebSite fx = websiteFactory.getWebSiteCategory("产品展示");
        fx.use(new User("小菜"));

        WebSite fy = websiteFactory.getWebSiteCategory("产品展示");
        fy.use(new User("大鸟"));

        WebSite fz = websiteFactory.getWebSiteCategory("产品展示");
        fz.use(new User("carter"));

        WebSite fl = websiteFactory.getWebSiteCategory("博客");
        fl.use(new User("lilith"));


        WebSite fm = websiteFactory.getWebSiteCategory("博客");
        fm.use(new User("lioth"));

        WebSite fn = websiteFactory.getWebSiteCategory("博客");
        fn.use(new User("peter"));


        System.out.println("总网站数：" + websiteFactory.getWebSiteCount());
    }
}
