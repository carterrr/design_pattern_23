package strategy;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author CarterChou at 2019/2/18 10:28
 * @description 客户端代码
 */
public class StrategyClient {
    private static double sum = 0.0d;
    private double getSum(String cbxType ,double money) {
        CashContext cashContext = new CashContext(cbxType);
        return cashContext.getResult(money);
    }

    public static void main(String[] args) {
        Map<String ,Double > clientMap= new HashMap<>();
        StrategyClient strategyClient = new StrategyClient();
        clientMap.put("正常收费",500d);
        clientMap.put("打8折收费",500d);
        clientMap.put("满300减100",500d);
        for( String cbxType : clientMap.keySet()){
            sum = sum+strategyClient.getSum(cbxType,clientMap.get(cbxType));
        }
        System.out.println(sum);
    }
}
