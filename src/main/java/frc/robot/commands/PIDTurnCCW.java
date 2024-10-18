package frc.robot.commands;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Drivetrain;

public class PIDTurnCCW extends Command{
    Drivetrain dt;
    double setPointAngle;


    public void exampleCommand(int var){
        //variable = var;
        //other implementation here
    }

    @Override
    public void initialize(){
        // intialization occurs here
    }

    @Override 
    public void execute(){
        // runs constantly until condition is met
    }

    @Override
    public void end(boolean interrupted){
        // ends the command if it is interrupted
    }

    @Override
    public boolean isFinished(){
        // this will return true when the command has finished
        return true;
    }
}
