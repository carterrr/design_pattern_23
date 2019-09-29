package component;

import java.util.Collections;

/**
 * @author CarterChou at 2019/4/20 21:33
 * @description  叶子节点  add move无需实现  透明模式  定死了
 */
public class HRDepartment extends BaseCompany {

    HRDepartment(String name) {
        super(name);
    }
    @Override
    public void add(BaseCompany c) {

    }

    @Override
    public void remove(BaseCompany c) {

    }

    @Override
    public void display(int depth) {
        System.out.println(String.join("", Collections.nCopies(depth,"-")) + name);
    }

    @Override
    public void lineOfDuty() {
        System.out.println(name + "员工招聘 培训 管理");
    }
}
