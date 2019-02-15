public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        Observable postMan = new Postman();

        Observer boy1 = new Boy("路飞");
        Observer boy2 = new Boy("巴乔");
        Observer girl = new Girl("刘亦菲");

        postMan.add(boy1);
        postMan.add(boy2);
        postMan.add(girl);

        postMan.notify("快递到了,请下楼领取.");
    }
}
