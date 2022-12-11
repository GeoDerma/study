public class ProgramThread extends Thread{
    @Override
    public void run(){
        System.out.println("Logging| " + Thread.currentThread().getName() + " is running");
    }

}
