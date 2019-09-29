package order;

/**
 * @author CarterChou at 2019/4/25 12:36
 * @description
 */
public class BakeChickenWingCommand extends Command {

    public BakeChickenWingCommand(Barbecuer receiver) {
        super(receiver);
    }

    @Override
    public void ExcuteCommand() {
        receiver.BakeChickenWing();
    }


}
