public class Singleton {
    private static Singleton singleton = new Singleton();
    private Singleton() {                                 
        System.out.println("���󥹥��󥹤��������ޤ�����");
    }
    public static Singleton getInstance() {
        return singleton;
    }
}
