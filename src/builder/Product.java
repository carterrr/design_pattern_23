package builder;

import java.util.ArrayList;
import java.util.List;

/**
 * @author CarterChou at 2019/4/8 12:35
 * @description 建造者模式  产品类有多个部件
 */
public class Product {

    List <String> parts = new ArrayList <String>();

    public void Add(String part) {
        parts.add(part);
    }

    public void show() {
        System.out.println("\n 产品 创建 ------");
        for(String part : parts) {
            System.out.println(part);
        }
    }
}
