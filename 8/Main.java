public class Main {
    public static void main(String []args) {
        System.out.println("勇者よ、この世界に生まれよ！");
        Hero h = new Hero();
        h.name = "みなと";
        h.hp = 100;
        System.out.println("勇者" + h.name + "を生み出しました！");
        h.sit(5);
        h.slip();
        h.sit(25);
        h.run();
    }
}