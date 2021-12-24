package design.pattern.study.adapterpattern;

import design.pattern.study.adapterpattern.example.FileIO;
import design.pattern.study.adapterpattern.example.FileProperties;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
//        Print p = new PrintBanner("This is sehyeong world!!!!");
//        p.printWeak();
//        p.printStrong();
//
//        design.pattern.study.adapterpattern.delegation.Print p2 = new design.pattern.study.adapterpattern.delegation.PrintBanner("good morning");
//        p2.printStrong();
//        p2.printWeak();

        FileIO f = new FileProperties();

        try {
            f.readFromFile("file.txt");
            f.setValue("year", "2021");
            f.setValue("month", "12");
            f.setValue("day", "24");
            f.writeToFile("newfile.txt");
        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}
