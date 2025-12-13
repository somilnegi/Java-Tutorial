class Keyboard {
    int keys;
    String color;

    public Keyboard() {
        keys = 100;
        color = "white";
    }

    public void pressed() {
        System.out.println("Signal sent " + color);
    }

    public void hit() {
        System.out.println("Got hit");
        keys = 85;
    }
}

class AdvKeyboard extends Keyboard{
    public void hitNum() {
        System.out.println("Sent num");
    }
}

public class File3 {
    public static void main(String[] args) {
        Keyboard obj;
        obj = new Keyboard();
        AdvKeyboard advobj;
        advobj = new AdvKeyboard();
        obj.pressed();
        obj.hit();
        System.out.println(obj.keys);
        advobj.pressed();
        advobj.hitNum();
    }
}
