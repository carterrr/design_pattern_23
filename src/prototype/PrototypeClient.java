package prototype;

/**
 * @author CarterChou at 2019/3/11 12:48
 * @description
 */
public class PrototypeClient {
    public static void main(String[] args) throws CloneNotSupportedException {
        /*ShallowResume daniao = new ShallowResume("大鸟");
        daniao.setPersonalInfo("男","26");
        daniao.setWorkExperince("2017-2018","thoughtworks");


        ShallowResume xiaocai = daniao.Clone();
        xiaocai.setWorkExperince("2018-2019","fmbank");


        ShallowResume xiaoxiaocai = daniao.Clone();
        xiaoxiaocai.setWorkExperince("2019-2020","?");

        daniao.display();
        xiaocai.display();
        xiaoxiaocai.display();*/

        DeepResume daniaoD = new DeepResume("大鸟");
        daniaoD.setPersonalInfo("男","26");
        daniaoD.setWorkExperince("2017-2018","thoughtworks");


        DeepResume xiaocaiD = daniaoD.clone();
        xiaocaiD.setWorkExperince("2018-2019","fmbank");


        DeepResume xiaoxiaocaiD = daniaoD.clone();
        xiaoxiaocaiD.setWorkExperince("2019-2020","?");

        daniaoD.display();
        xiaocaiD.display();
        xiaoxiaocaiD.display();

    }
}
