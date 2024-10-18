# Preseason Digital Notebook Example
Name: **[Thanurika Iyer]**

Section: **[I2RC]**
Week: **[2-Preseason]**


## Code

The main topic this week was: **[Encoder Drive Lab]**

Commands: **[EncoderDrive]**

Subsystems: **[Drivetrain]**

### How does the code work?
PID controllers are a control algorithm used in various fields. They're used to regulate the movement and behavior of robots based on feedback from sensors.

Example: A Robotic Arm
Setpoint: The desired position of the robotic arm's end effector.
Feedback: Position sensors in the arm joints measure the current position.
Error Calculation: The difference between the desired and actual positions is calculated.
PID Calculation: The PID controller determines the necessary motor speeds to move the arm towards the desired position.
Control Action: The calculated motor speeds are applied to the arm's motors, causing it to move.

### Important notes for future reference
Notes about git, and helpful resources, etc. 

package frc.robot.commands;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Drivetrain;
Command Outline
public class example extends Command{
    int variable;
    public exampleCommand(int var){
        variable = var
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