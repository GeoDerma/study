public class Programmer extends Villager{

    SomeUtils util = new SomeUtils();

    public Programmer(String[] familyList, String name, int age){
        super(familyList, name, age);
    }

    public void familyRoutines() {
        ProgramThread thread = new ProgramThread();
        thread.start();


        long start = System.currentTimeMillis();
        long end = util.findDateTimeEnd(0.1);

        try {
            thread.sleep(end - start);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("I have eaten with my family: " + String.join(",", familyList));
        Thread.yield();

    }

}
