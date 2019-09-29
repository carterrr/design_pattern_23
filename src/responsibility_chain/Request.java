package responsibility_chain;

/**
 * @author CarterChou at 2019/4/26 00:22
 * @description
 */
public class Request {

    private String requestType;

    private String requestContest;

    /**
     * 申请数量
     */
    private Integer num;

    public String getRequestType() {
        return requestType;
    }

    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }

    public String getRequestContest() {
        return requestContest;
    }

    public void setRequestContest(String requestContest) {
        this.requestContest = requestContest;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }
}
