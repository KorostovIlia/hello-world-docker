package org.example;
import static java.lang.String.format;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        int count =0;
        while (true) {
            Thread.sleep(1000);
            System.out.println(format("App running forever... %d", count++));
        }
    }
}
