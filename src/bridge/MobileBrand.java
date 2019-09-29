package bridge;

/**
 * @author CarterChou at 2019/4/23 16:48
 * @description
 */
public abstract class MobileBrand {
    protected MobileSoft soft;

    public void setSoft(MobileSoft soft) {
        this.soft = soft;
    }

    abstract void run();
}
