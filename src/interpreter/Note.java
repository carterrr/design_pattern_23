package interpreter;

/**
 * @author CarterChou at 2019/5/15 12:37
 * @description
 */
public class Note extends Expression {
    @Override
    protected void execute(String playKey, String playValue) {
        switch (playKey) {
            case "C" :
                System.out.println("1");
                break;
            case "D" :
                System.out.println("2");
                break;
            case "E" :
                System.out.println("3");
                break;
            case "F" :
                System.out.println("4");
                break;
            case "G" :
                System.out.println("5");
                break;
            case "A" :
                System.out.println("6");
                break;
            case "B" :
                System.out.println("7");
                break;
                default:
                    break;
        }
    }
}
