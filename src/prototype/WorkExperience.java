package prototype;

/**
 * @author CarterChou at 2019/3/11 13:35
 * @description
 */
public class WorkExperience implements Cloneable{
    private String  timeArea;

    private String company;

    public String getTimeArea() {
        return timeArea;
    }

    public void setTimeArea(String timeArea) {
        this.timeArea = timeArea;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return
                "timeArea='" + timeArea + '\'' +
                ", company='" + company + '\''
                ;
    }
    @Override
    public WorkExperience clone() throws CloneNotSupportedException {
       return (WorkExperience)super.clone();
    }
}
