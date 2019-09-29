package prototype;

/**
 * @author CarterChou at 2019/2/25 15:04
 * @description  shallow copy resume class
 */
public class ShallowResume implements Cloneable{
    private String name;
    private String sex;
    private String age;
    private String timearea;
    private String company;

    public ShallowResume(String name) {
        this.name = name;
    }

    public void setPersonalInfo(String sex, String age) {
        this.sex = sex;
        this.age = age;
    }

    public void setWorkExperince(String timearea, String company) {
        this.timearea = timearea;
        this.company = company;
    }

    public void display(){
        System.out.println(name + sex + age + timearea +company);
    }


    @Override
    public ShallowResume clone() throws CloneNotSupportedException {
        return (ShallowResume)this.clone();
    }
}
