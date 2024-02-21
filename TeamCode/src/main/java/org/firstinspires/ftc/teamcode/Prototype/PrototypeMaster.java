package org.firstinspires.ftc.teamcode.Prototype;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.util.ElapsedTime;

import org.firstinspires.ftc.teamcode.Controller.MecanumDriveBases.MecanumDriveBaseGoBILDA;

@TeleOp(name = "Prototype TeleOp", group = "full code")
@Disabled
public class PrototypeMaster extends OpMode
{
    MecanumDriveBaseGoBILDA mecanumDriveBaseGoBILDA;
    ElapsedTime elapsedTime;

    @Override
    public void init()
    {
        mecanumDriveBaseGoBILDA = new MecanumDriveBaseGoBILDA(hardwareMap);
        telemetry.addData("Ready", "");
        telemetry.update();
    }

    @Override
    public void loop()
    {
        telemetryCall();

    }

    private void telemetryCall()
    {
        mecanumDriveBaseGoBILDA.driveBaseTelemetry(telemetry);
    }
}
