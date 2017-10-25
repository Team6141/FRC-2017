package org.usfirst.frc.team6141.robot.subsystems;

import org.usfirst.frc.team6141.robot.RobotConst;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class Climber extends Subsystem {

	private Spark motorOne;
	private Spark motorTwo;
	
	
	public Climber() {
		motorOne = new Spark(RobotConst.CLIMBER_MOTOR_ONE_PWM_PORT);
		motorTwo = new Spark(RobotConst.CLIMBER_MOTOR_TWO_PWM_PORT);
	}
	
	public void setSpeed(double speed) {
		motorOne.set(speed);
		motorTwo.set(speed);
	}
	
	public void stop() {
		motorOne.stopMotor();
		motorTwo.stopMotor();
	}
	
	public void update() {
		SmartDashboard.putNumber("Climber One", motorOne.getSpeed());
		SmartDashboard.putNumber("Climber Two", motorTwo.getSpeed());
	}

	@Override
	protected void initDefaultCommand() {
	}

}

