public class Cleric {
    String name;
    int hp = 50;
    final int MAX_HP = 50;
    int mp = 10;
    final int MAX_MP = 10;
    public void selfAid() {
        System.out.println(this.name + "はセルフエイドを唱えた！");
        this.mp -= 5;
        this.hp = this.MAX_HP;
        System.out.println("HPが全回復しました");
    }
}