package interpreter;

/**
 * @author CarterChou at 2019/5/15 12:26
 * @description  解释器模式   音乐简谱解释器
 *                  多种解释器子类  针对不同情况实例化不同解释器来进行解释
 *                  重点是多态的解释器
 */
public class InterpreterClient {
    public static void main(String[] args) {

        PlayContext playContext = new PlayContext();

        System.out.println(" ------ 下面将演奏上海滩 ------");
        System.out.println("\n");
        playContext.setText("O2 E0.5 G0.5 A3 E0.5");
        // 实例化时依据实际情况实例化为不同对象
        Expression expression = null;

        while (playContext.getText().length() > 0) {
            String  firstNote = playContext.getText().substring(0,1);

            //首字母为O代表音阶 其他是音符 1-7
            switch (firstNote) {
                case "O":
                    expression = new Scale();
                    break;
                case "C":
                case "D":
                case "E":
                case "F":
                case "G":
                case "A":
                case "B":
                    expression = new Note();
                    break;
                    default:
                        break;
            }
            expression.interpret(playContext);
        }
    }
}
