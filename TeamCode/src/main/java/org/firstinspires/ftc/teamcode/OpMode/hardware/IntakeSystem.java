package org.firstinspires.ftc.teamcode.OpMode.hardware;
import static org.firstinspires.ftc.robotcore.external.BlocksOpModeCompanion.hardwareMap;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

public class IntakeSystem {
    public Servo intake1;
    public Servo intake2;
    public Servo intakeArm; //рука
    DcMotor intake;
    public void init () {
        intake1 = hardwareMap.get(Servo.class, "intake1");
        intake2 = hardwareMap.get(Servo.class, "intake2");
        intakeArm = hardwareMap.get(Servo.class, "intakeArm");
        intake = hardwareMap.dcMotor.get("intake");
    }

    public void startIntake() {
        intake1.setPosition(0);
        intake2.setPosition(0.6);
        intakeArm.setPosition(1); //один серво для руки
        intake.setPower(0.1);
    }

    public void stopIntake() {
        intake1.setPosition(0.6);
        intake2.setPosition(0);
        intakeArm.setPosition(0);
        intake.setPower(0);
    }

}