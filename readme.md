# Preseason Digital Notebook Example
Name: **[Thanurika Iyer]**

Section: **[I2RC]**
Week: **[2-Preseason]**


## Code

The main topic this week was: **[Encoder Drive Lab]**

Commands: **[EncoderDrive]**

Subsystems: **[Drivetrain]**

### How does the code work?
The code defines a Drivetrain subsystem in a robot control framework. This subsystem controls the movement of a robot's drivetrain using two motors (left and right) and a gyroscope for navigation. Two WPI_TalonSRX objects are created to control the left and right drive motors. They are configured with the corresponding ports from the Constants.DriveTrainPorts class.
Both motors are set to NeutralMode.Coast to allow them to move freely when no voltage is applied. The other part of the code defines a Command named EncoderDrive that is used to drive a robot based on encoder readings. The constructor takes a Drivetrain object and a setPoint as parameters. The Drivetrain object is used to control the robot's movement, and the setPoint specifies the desired distance to travel. The isFinished() method determines whether the command should end. It checks if the distance traveled (dt.getMeters()) is greater than or equal to the setPoint. If it is, the command returns true to indicate completion. Otherwise, it returns false to keep the command running.


### Important notes for future reference
Notes about git, and helpful resources, etc. 
N/A

Please put them here, they will really help you in the future 