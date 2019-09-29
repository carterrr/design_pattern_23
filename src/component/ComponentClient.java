package component;

/**
 * @author CarterChou at 2019/4/20 21:12
 * @description  组合模式
 *                  使得所有对象均可以被组合
 *                      涉及部分与整体需要一致对待的情况
 *                          让所有对象可以一致对待  甚至可以整体的递归的执行如 display() 方法
 */
public class ComponentClient {
    public static void main(String[] args) {
        BaseCompany root = new ConcreteCompany("富民银行重庆总公司");
        root.add(new HRDepartment("富民银行总公司人力资源部"));
        root.add(new FinanceDepartment("富民银行总公司财务部"));

        BaseCompany beijing = new ConcreteCompany("富民银行北京分公司");
        beijing.add(new HRDepartment("富民银行北京分公司人力资源部"));
        beijing.add(new FinanceDepartment("富民银行北京分公司财务部"));
        root.add(beijing);

        BaseCompany shanghai = new ConcreteCompany("富民银行上海分公司");
        shanghai.add(new HRDepartment("富民银行上海分公司人力资源部"));
        shanghai.add(new FinanceDepartment("富民银行上海分公司财务部"));
        root.add(shanghai);

        root.display(1);

        root.lineOfDuty();
    }

}
