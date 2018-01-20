package Dom;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        LocalDateTime a = null;
        CheckTime checkTime = new CheckTime(LocalDateTime.now());

        Scanner sc = new Scanner(System.in);
        Random gr = new Random();

        System.out.println("W losowym czasie  od 1 sekundy do 10 sekund pojawi się napis TERAZ\nTy w tym czasie musisz nacisnąć jak najszybciej klawisz ENTER.\nSprawdze Twój czas reakcji");
        Timings timings = new Timings(2000);

        System.out.println(" GOTÓW ? \nNo to zaczynamy");
        int czasowka = gr.nextInt(10);
        //System.out.println(czasowka); // Sprawdzamile wynosi czas oczekiwania na start w randomie
        System.out.println("START");
        /*
        checkTime
        int czas1;
        */

        CheckTime zmienna1 = new CheckTime(a);
        //CheckTime asder = zmienna1;

        String klawiszEnter = sc.nextLine();

        System.out.println(" Twoj czas reakcji to :" + " ");
        CheckTime zmienna2 = new CheckTime(a);

        // A tak sobie sprawdze dwie zeinne czasowe
        System.out.println(zmienna1);
        System.out.println(zmienna2);
        System.out.println(zmienna2.minus(Duration.zmienna1));
        
        
        /*LocalDate a = LocalDate.of(2014, 6, 30);
        LocalDate b = a.minus(Period.ofDays(100));
        System.out.println(b);*/
    }
}
