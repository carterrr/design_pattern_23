package flyweight;

import java.util.Hashtable;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author CarterChou at 2019/5/9 12:30
 * @description  终点 ：
 *                      维护一个可能会被重复使用对象的列表
 *                      如果需要使用的对象在里边直接返回
 *                      不在才创建  并加进列表
 *                      避免反复创建的内存开销
 */
public class WebsiteFactory {
    private ConcurrentHashMap<String, WebSite> hashMap = new ConcurrentHashMap <>();

    public WebSite getWebSiteCategory(String key) {
        if (!hashMap.contains(key)) {
            hashMap.put(key, new ConcreteWebSite(key));
        }
        return hashMap.get(key);
    }

    public int getWebSiteCount() {
        return hashMap.size();
    }
}
