package responsibility_chain;

/**
 * @author CarterChou at 2019/4/26 00:25
 * @description  总监
 */
public class Majordomo extends AbstractManager {

    public Majordomo(String name) {
        super(name);
    }

    @Override
    void requsetApplications(Request request) {
        if (request.getRequestType() == "请假" && request.getNum() <= 5) {
            System.out.println(name +"： 请假" + request.getNum() + "天被批准");
        } else {
            if (superior != null ) {
                superior.requsetApplications(request);

            }
        }
    }


}
