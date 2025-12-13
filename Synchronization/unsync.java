class unsync {

    private int count = 0;

    public void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }

    public static void main(String[] args) {
        unsync s = new unsync();

        Runnable task = new Runnable() {
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    s.increment();
                }
            }
        };

        Thread a = new Thread(task);
        Thread b = new Thread(task);

        a.start();
        b.start();

        try {
            a.join();
            b.join();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(s.getCount());
    }
}