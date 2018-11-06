package JavaProgramming.SolvingProblemsWithSoftware.GettingStarted;

import java.io.*;

public class HelloWorld {
    public static void main(String[] args) throws Exception {
        FileReader res = new FileReader("//Users//Marius//IdeaProjects//coursera//hello_unicode.txt");
        int line;
        while ((line = res.read()) != -1)
            System.out.print((char) line);
    }
}