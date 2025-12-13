class File1 {
    public static void main(String[] args) {
        int i = 5;
        double d = 9.6;
        float f = 8.5f;
        long l = 5543;
        short s = 99;
        char c = 'A';

        System.out.println(i + d);
        show();
        System.out.println(i + " " + d);
    }
    
    public static void show() {
        System.out.println("in show");
    }
}