package org.usfirst.frc.team5962.robot.commands;

import org.usfirst.frc.team5962.robot.OI;
import org.usfirst.frc.team5962.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class RunGameTank extends Command {

    public RunGameTank() {
        // Use requires() here to declare subsystem dependencies
        requires(Robot.drive1);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.drive1.gameTank();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	 return OI.gameArcadeMode.get()
        	     || OI.gameXArcadeMode.get()
        	     || OI.joystickArcadeMode.get()
        		 || OI.gameXTankMode.get()
        		 || OI.joystickTankMode.get();
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
