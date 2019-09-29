package interpreter;

/**
 * @author CarterChou at 2019/5/15 12:29
 * @description  表达式类
 */
public abstract class Expression {

    /**
     * 解释器类
     * @param playContext
     */
    public void interpret(PlayContext playContext) {
        if (playContext.getText().length() > 0) {
            String playKey = playContext.getText().substring(0,1);
            playContext.setText(playContext.getText().substring(1));
            String playValue = null;
            if (playContext.getText().indexOf(" ") != -1) {
                playValue =playContext.getText().substring(0,playContext.getText().indexOf(" "));
                playContext.setText(playContext.getText().substring(playContext.getText().indexOf(" ") + 1));
            } else {
                playValue =playContext.getText();
                playContext.setText("");
            }
            execute(playKey, playValue);
        }
    }

    protected abstract void execute(String playKey, String playValue);
}
