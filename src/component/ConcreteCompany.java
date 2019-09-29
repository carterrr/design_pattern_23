package component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author CarterChou at 2019/4/20 21:18
 * @description 具体公司类  树枝节点
 */
public class ConcreteCompany extends BaseCompany{

    private List<BaseCompany> companyList = new ArrayList <>();

    public ConcreteCompany(String name) {
        super(name);
    }

    @Override
    public void add(BaseCompany c) {
        companyList.add(c);
    }

    @Override
    public void remove(BaseCompany c) {
        companyList.remove(c);
    }

    /**
     * 重复n次 -
     * @param depth
     */
    @Override
    public void display(int depth) {
        System.out.println(String.join(" ", Collections.nCopies(depth,"-")) + name);
        for(BaseCompany company : companyList) {
            company.display(depth + 2);
        }
    }

    @Override
    public void lineOfDuty() {
        for (BaseCompany company : companyList) {
            company.lineOfDuty();
        }
    }
}
