// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;


public class Drivetrain extends SubsystemBase {
  private final WPI_TalonSRX leftDriveTalon;
  private final WPI_TalonSRX rightDriveTalon;

  /** Creates a new ExampleSubsystem. */
  public Drivetrain() {
    //Initialize with corresponding ports
    leftDriveTalon = new WPI_TalonSRX(Constants.DriveTrainPorts.leftDriveTalonPort);
    rightDriveTalon = new WPI_TalonSRX(Constants.DriveTrainPorts.rightDriveTalonPort);

    //Set Drive trains to NeutralMode.Coast,
    leftDriveTalon.setNeutralMode();
    rightDriveTalon.setNeutralMode();
    
    //TODO::set rightDriveTalon inverted 
    rightDriveTalon.BlahBlahBlah(/*Set Inverted */);

  }
  public boolean setSpeed(double leftSpeed, double rightSpeed) {
    // Assuming 'leftTalon' and 'rightTalon' are instances of TalonSRX
    boolean setLeftOk = leftTalon.setSpeed(leftSpeed);
    boolean setRightOk = rightTalon.setSpeed(rightSpeed);

    return (setLeftOk && setRightOk);
}


  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
