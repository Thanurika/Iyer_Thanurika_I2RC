package frc.robot.commands;

import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Drivetrain;

public class PIDTurnCCW extends Command{
    Drivetrain dt;
    double setPointAngle;
    PIDController PID = new PIDController(0.3/90,0, 0);


    public PIDTurnCCW(Drivetrain dt, double setPoint){

        this.dt = dt;
        this.setPointAngle = setPoint;

        addRequirements(dt);
        PID.setTolerance(10);
    }

    @Override
    public void initialize() {
        dt.reset();
        dt.tankDrive(0, 0);
    }

    
    @Override
    public void execute() {
        double output = PID.calculate(dt.getAngle(), setPointAngle);
        dt.tankDrive(-output, output);
    }

    @Override
    public void end(boolean interrupted) {
        dt.tankDrive(0,0);
    
    }

    @Override
    public boolean isFinished() {
        return PID.atSetpoint();
    }
}