package org.firstinspires.ftc.teamcode.IOPathFinder;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

@TeleOp(name = "Auto Path Finder", group = "ioauto")
public class AutoPathFinders extends LinearOpMode
{
    private final String filename = "command.txt";

    @Override
    public void runOpMode() throws InterruptedException
    {
        try(Scanner scanner = new Scanner(new File(filename)))
        {
            FileAI fileAI = new FileAI(scanner);
            System.out.println(scanner.findInLine("right"));
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

}
