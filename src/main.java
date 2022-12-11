
public class main {
    public static void main(String[] args) throws InterruptedException {
        Programmer programmer = new Programmer(new String[]{"Mom", "Dad", "Sister"}, "Andrew", 12);
        Cleaner cleaner = new Cleaner(new String[]{"Mom", "Dad", "Sister", "Brother"}, "Andrew", 12);

        cleaner.familyRoutines();
        programmer.familyRoutines();
    }
}


