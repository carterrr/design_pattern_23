package adapter;

/**
 * @author CarterChou at 2019/4/16 12:30
 * @description
 */
public class AdapterClient {

    public static void main(String[] args) {
        Player jordan = new Forwards("jordan");
        jordan.attack();

        Player yaoming = new Center("jams");
        yaoming.defense();


        ForginCenter forgincenterYaoMing = new ForginCenter("姚明");
        Player translator = new Translator(forgincenterYaoMing);
        translator.defense();
        translator.attack();
    }
}
