package org.usfirst.frc.team6141.robot.subsystems;

import org.usfirst.frc.team6141.robot.RobotConst;
import org.usfirst.frc.team6141.robot.sensors.*;
import org.usfirst.frc.team6141.robot.misc.*;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class RobotControl extends Subsystem {
	
	public DriveTrain drive;
	public Shooter shooter;
	//public Intake intake;
	public Climber climber;
	public F_Gyro gyro;
	public F_Ultrasonic ultrasonic;
	public RobotPosition robotPos;
	public MatchDetails matchDetails;
	
	public RobotControl() {
		drive = new DriveTrain();
		shooter = new Shooter();
		//intake = new Intake();
		climber = new Climber();
		gyro = new F_Gyro();
		ultrasonic = new F_Ultrasonic(RobotConst.ULTRASONIC_ANALOG_INPUT_PORT);
		ultrasonic.calibrate(RobotConst.ULTRASONIC_20_INCHES_VOLTAGE, RobotConst.ULTRASONIC_40_INCHES_VOLTAGE, RobotConst.ULTRASONIC_80_INCHES_VOLTAGE);
		robotPos = new RobotPosition();
		matchDetails = new MatchDetails();
	}
	
	public void update() {
		drive.update();
		shooter.update();
		//intake.update();
		climber.update();
		gyro.update();
		ultrasonic.update();
		matchDetails.update();
		robotPos.update();
		SmartDashboard.putData("Gyro", gyro);
	}

    public void initDefaultCommand() {
    }
        
}

