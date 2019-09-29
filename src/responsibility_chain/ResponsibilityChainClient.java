package responsibility_chain;

/**
 * @author CarterChou at 2019/4/26 05:48
 * @description
 */
public class ResponsibilityChainClient {

    public static void main(String[] args) {
        CommonManager c = new CommonManager("c");
        Majordomo m = new Majordomo("m");
        GeneralManager g = new GeneralManager("g");

        // 状态模式在内部封装好了跳转  责任链更加灵活  跳转都自己定义
        // 适用于多次改变判断逻辑的情况
        c.setSuperior(m);
        m.setSuperior(g);

        Request qingjia = new Request();
        qingjia.setRequestType("请假");
        qingjia.setRequestContest("小菜 要请假");
        qingjia.setNum(5);
        c.requsetApplications(qingjia);

        Request jiaxin1 = new Request();
        jiaxin1.setNum(499);
        jiaxin1.setRequestType("加薪");
        jiaxin1.setRequestContest("小菜要加薪");
        c.requsetApplications(jiaxin1);

        Request jiaxin2 = new Request();
        jiaxin2.setNum(501);
        jiaxin2.setRequestType("加薪");
        jiaxin2.setRequestContest("小菜要加薪");
        c.requsetApplications(jiaxin2);

        // 都由经理发起请求  链式向上传递
    }
}
