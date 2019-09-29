package responsibility_chain;

/**
 * @author CarterChou at 2019/4/26 00:25
 * @description  总经理
 */
public class GeneralManager extends AbstractManager {

    public GeneralManager(String name) {
        super(name);
    }

    @Override
    void requsetApplications(Request request) {
        if (request.getRequestType() == "请假" && request.getNum() <= 5) {
            System.out.println(name +"： 请假" + request.getNum() + "天被批准");
        } else if (request.getRequestType() == "加薪" && request.getNum() <= 500){
            System.out.println(name +"： 加薪" + request.getNum() + "元被批准");
        } else if (request.getRequestType() == "加薪" && request.getNum() > 500) {
            System.out.println(name +"： 加薪" + request.getNum() + "元不同意");

        }
    }
}
