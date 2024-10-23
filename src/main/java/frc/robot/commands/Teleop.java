package frc.robot.commands;
import edu.wpi.first.wpilibj2.command.Command; 
import frc.robot.subsystems.Drivetrain; 
import edu.wpi.first.wpilibj.Joystick;

public class Teleop extends Command{
    double leftPowerRaw;
    double rightPowerRaw;
    Drivetrain dt;
    Joystick joy;


    public Teleop(Joystick joystick){
        joy = joystick;
        leftPowerRaw = joystick.getRawAxis(1);
        leftPowerRaw = joystick.getRawAxis(4);
    }

@Override public void initialize(){ 
    dt.tankDrive(0, 0);
 
}
@Override public void execute(){ 
    dt.tankDrive(leftPowerRaw, rightPowerRaw);
} 
@Override public void end(boolean interrupted){
     dt.tankDrive(0, 0);

} 
@Override public boolean isFinished(){ 
return true;
 } 
}

