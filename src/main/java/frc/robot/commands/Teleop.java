package frc.robot.commands;
import edu.wpi.first.wpilibj2.command.Command; 
import frc.robot.subsystems.Drivetrain; 
import edu.wpi.first.wpilibj.Joystick;

public class Teleop extends Command{
    double leftPowerRaw;
    double rightPowerRaw;
    Drivetrain drivetrain;
    Joystick joy;


    public Teleop(Drivetrain dt, Joystick joystick){
        this.joy = joystick;
        this.drivetrain = dt;
        addRequirements(dt);
    }

@Override public void initialize(){ 
    drivetrain.tankDrive(0, 0);
 
}
@Override public void execute(){ 
    leftPowerRaw = joy.getRawAxis(1);
    rightPowerRaw = joy.getRawAxis(5);
    drivetrain.tankDrive(leftPowerRaw * 0.7, rightPowerRaw * 0.7);

} 
@Override public void end(boolean interrupted){
     drivetrain.tankDrive(0, 0);

} 
@Override public boolean isFinished(){ 
return false;
 } 
}

