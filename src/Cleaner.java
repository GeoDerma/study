public class Cleaner extends Villager{
    SomeUtils util = new SomeUtils();

    public Cleaner(String[] familyList, String name, int age) {
        super(familyList, name, age);
    }

    public void familyRoutines() {
        ProgramThread thread = new ProgramThread();
        thread.start();

        long start = System.currentTimeMillis();
        long end = util.findDateTimeEnd(0.15);

        try {
            thread.sleep(end - start);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("I have eaten with my family: " + String.join(",", familyList));
        Thread.yield();
    }
}
