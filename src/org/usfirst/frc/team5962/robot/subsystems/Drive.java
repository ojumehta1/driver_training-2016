
package org.usfirst.frc.team5962.robot.subsystems;

import org.usfirst.frc.team5962.robot.OI;
import org.usfirst.frc.team5962.robot.RobotMap;

import edu.wpi.first.wpilibj.ADXL345_SPI;
import edu.wpi.first.wpilibj.ADXRS450_Gyro;
import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SPI;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.interfaces.Accelerometer;

/**
 *
 */
public class Drive extends Subsystem {
	
	//RobotDrive myRobot = new RobotDrive(RobotMap.Victor1, RobotMap.Victor2);
	//public RobotDrive myRobot = new RobotDrive(RobotMap.Victor1,RobotMap.Victor2);

	//copy and paste this if you are using 4 Talons
	public RobotDrive myRobot = new RobotDrive(RobotMap.CANTalon1,RobotMap.CANTalon2,RobotMap.CANTalon3,RobotMap.CANTalon4);

	//copy and paste this if you are using 2 Victors
	//public RobotDrive myRobot = new RobotDrive(RobotMap.Victor1,RobotMap.Victor2);

	public void gameTank() {
		myRobot.tankDrive(OI.gamePad1.getRawAxis(1), OI.gamePad1.getRawAxis(5));
	}

	public void gameXTank() {
		myRobot.tankDrive(OI.gamePad2.getRawAxis(1), OI.gamePad2.getRawAxis(5));
	}

	public void joystickTank() {
		myRobot.tankDrive(OI.joystickLeft, OI.joystickRight);
	}

	public void arcadeJoystick() {
		myRobot.arcadeDrive(OI.joystickRight);
	}

	public void arcadeGame() {
		myRobot.arcadeDrive(OI.gamePad1);
	}

	public void arcadeXGame() {
		myRobot.arcadeDrive(OI.gamePad2);
	}

	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub

	}

}
