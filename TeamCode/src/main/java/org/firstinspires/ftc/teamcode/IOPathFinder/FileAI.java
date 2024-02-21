package org.firstinspires.ftc.teamcode.IOPathFinder;

import java.util.Scanner;

public class FileAI extends Thread
{
    private Scanner scanner;

    protected FileAI(Scanner scanner)
    {
        this.scanner = scanner;
    }

    @Override
    public void run()
    {
        System.out.println(scanner.findInLine("forward"));
    }
}
