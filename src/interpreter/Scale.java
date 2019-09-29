package interpreter;

/**
 * @author CarterChou at 2019/5/15 12:40
 * @description 音高
 */
public class Scale extends Expression{
    @Override
    protected void execute(String playKey, String playValue) {
        switch (playValue) {
            case "1" :
                System.out.println("低音");
                break;
            case "2" :
                System.out.println("中音");
                break;
            case "3" :
                System.out.println("高音");
                break;
                default:
                    break;
        }
    }
}
