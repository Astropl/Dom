package Dom;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        CheckTime checkTime = new CheckTime();

        Scanner sc = new Scanner(System.in);
        Random gr = new Random();

        System.out.println("W losowym czasie  od 1 sekundy do 10 sekund pojawi się napis TERAZ\nTy w tym czasie musisz nacisnąć jak najszybciej klawisz ENTER.\nSprawdze Twój czas reakcji");
        Timings timings = new Timings(7000);

        System.out.println(" GOTÓW ? \nNo to zaczynamy");
        int czasowka = gr.nextInt(10);
        //System.out.println(czasowka); // Sprawdzamile wynosi czas oczekiwania na start w randomie
        System.out.println("START");
        checkTime.CheckStart(0);

        String klawiszEnter = sc.nextLine();
        System.out.println(" Twoj czas reakcji to :"+ " ");

    }
}
