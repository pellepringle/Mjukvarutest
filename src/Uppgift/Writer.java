package Uppgift;

import java.util.Scanner;

public class Writer {
    public static void main(String[] args) {
        Counter counter = new Counter();
        System.out.println("Skriv in olika ord/meningar, skriv stop för att avsluta");

        while (true) {
            Scanner Scan = new Scanner(System.in);
            String line = Scan.nextLine();

            counter.checkStop(line);

            boolean stop = counter.getStop();


            if (stop) {

                System.out.println("Antal tecken: " + counter.getCharCount() + ", rader: " + counter.getLineCount());
                break;


            } else {
                counter.characterCount(line);
            }

        }

    }
}

