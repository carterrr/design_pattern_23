package responsibility_chain;

/**
 * @author CarterChou at 2019/4/26 00:25
 * @description  经理
 */
public class CommonManager extends AbstractManager {

    public CommonManager(String name) {
        super(name);
    }

    @Override
    void requsetApplications(Request request) {
        if (request.getRequestType() == "请假" && request.getNum() < 2) {
            System.out.println(name + ": 请假" + request.getNum() + "天被批准");
        } else {
            superior.requsetApplications(request);
        }
    }
}
