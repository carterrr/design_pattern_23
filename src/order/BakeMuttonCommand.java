package order;

import javax.activation.CommandObject;

/**
 * @author CarterChou at 2019/4/25 12:36
 * @description
 */
public class BakeMuttonCommand extends Command {

    public BakeMuttonCommand(Barbecuer receiver) {
        super(receiver);
    }

    @Override
    public void ExcuteCommand() {
        receiver.BakeMutton();
    }
}
