package mediator;

import java.util.Collections;

/**
 * @author CarterChou at 2019/4/29 12:53
 * @description  具体中介者
 */
public class ConcreteMeditor extends Meditor {

    public ConcreteMeditor(Colleague c1, Colleague c2) {
        super(c1, c2);
    }

    @Override
    public void send(String message, Colleague colleague) {
        if (colleague == c1) {
            c2.nootiify(message);
        } else {
            c1.nootiify(message);
        }
    }
}
