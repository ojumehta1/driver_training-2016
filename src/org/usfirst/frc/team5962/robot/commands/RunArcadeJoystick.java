package org.usfirst.frc.team5962.robot.commands;

import org.usfirst.frc.team5962.robot.Robot;
import org.usfirst.frc.team5962.robot.subsystems.JoystickThrottle;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class RunArcadeJoystick extends Command {

    public RunArcadeJoystick() {
        // Use requires() here to declare subsystem dependencies
        requires(Robot.drive1);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.oi.currentDriveMode = "Joystick in Arcade mode";
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.drive1.arcadeJoystick();
    	JoystickThrottle.Speed();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	 return Robot.oi.gameArcadeMode.get()
    	     || Robot.oi.gameXArcadeMode.get()
    	     || Robot.oi.gameTankMode.get()
    		 || Robot.oi.gameXTankMode.get()
    		 || Robot.oi.joystickTankMode.get();
    		     
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
