package org.usfirst.frc.team6141.robot.commands;

import org.usfirst.frc.team6141.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;

/**
 *
 */
public class ClimberOnComand extends Command {
	
    public ClimberOnComand() {
    	super();
    	requires(Robot.control.climber);
    }

    protected void execute() {
    	Robot.control.climber.setSpeed(-1);
    }

    protected boolean isFinished() {
        return false;
    }
    
    @Override
    protected void interrupted() {
    	end();
    }
    
    @Override
    protected void end() {
    	Robot.control.climber.setSpeed(-0.2);
    }
}
