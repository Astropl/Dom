package Dom;

public class Timings extends Thread
{
    public Timings(int czas) {try {

        Thread.sleep(czas);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    }

   // public static void Timings(int czas)
    {

}}
