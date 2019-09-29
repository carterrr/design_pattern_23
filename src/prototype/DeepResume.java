package prototype;

/**
 * 只有基本类型属性的对象那一级super.clone()  往上 clone() 方法里全部要写上对对象的复制
 * @author CarterChou at 2019/2/26 14:06
 * @description  deep copy resume class
 */
public class DeepResume implements Cloneable{
    private String name;
    private String sex;
    private String age;
    private WorkExperience workExperience;

    public DeepResume(String name) {
        this.name = name;
        workExperience = new WorkExperience();
    }

    public void setPersonalInfo(String sex, String age) {
        this.sex = sex;
        this.age = age;
    }

    public void setWorkExperince(String timeArea, String company) {
        workExperience.setTimeArea(timeArea);
        workExperience.setCompany(company);
    }

    public void display(){
        System.out.println(name + sex + age +workExperience.toString());
    }

    @Override
    public DeepResume clone() throws CloneNotSupportedException {
        DeepResume deepResume = (DeepResume)super.clone();
        // 对象的浅复制  由于对象只有普通属性 将所有普通属性再拷贝一份生成一个新对象
        deepResume.workExperience = this.workExperience.clone();
        return deepResume;
    }
}
