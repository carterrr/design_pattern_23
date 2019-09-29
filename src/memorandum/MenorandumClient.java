package memorandum;

/**
 * @author CarterChou at 2019/4/16 15:09
 * @description  备忘录模式   发起者GameRole   备忘录RoleStateMemento  备忘者RoleStateCaretaker
 *                  用于对象状态的还原    备忘录RoleStateMemento 封装了需要保存的属性细节   但是还是需要GameRole来将细节传给他
 *
 */
public class MenorandumClient {
    public static void main(String[] args) {
        GameRole lixiaoyao = new GameRole();

        System.out.println("大战boss前\n");
        lixiaoyao.roleStateShow();

        System.out.println("\n保存进度\n");
        RoleStateCaretaker admin = new RoleStateCaretaker();
        //存档和回档都在主账号里
        admin.setRoleStateMemento(lixiaoyao.saveState());

        System.out.println("\n哎呀！ 被打死了\n");
        lixiaoyao.fight();
        lixiaoyao.roleStateShow();

        System.out.println("\n没打过boss  回档\n");
        //存档和回档都在主账号里
        lixiaoyao.recoveryState( admin.getRoleStateMemento() );
        lixiaoyao.roleStateShow();
    }
}
