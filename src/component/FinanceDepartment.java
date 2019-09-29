package component;

import java.util.Collections;

/**
 * @author CarterChou at 2019/4/20 21:37
 * @description 财务部树叶节点  add move 没有子部门 则 无须实现
 */
public class FinanceDepartment extends BaseCompany {

    public FinanceDepartment(String name) {
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
        System.out.println(String.join(" ", Collections.nCopies(depth,"-")) + name);
    }

    @Override
    public void lineOfDuty() {
        System.out.println(name + "公司财务收支管理");
    }
}
