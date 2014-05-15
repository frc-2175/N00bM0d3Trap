// RobotBuilder Version: 1.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.
package org.usfirst.frc2175.N00bM0d3Trap;
import org.usfirst.frc2175.N00bM0d3Trap.commands.*;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);
    
    // Another type of button you can create is a DigitalIOButton, which is
    // a button or switch hooked up to the cypress module. These are useful if
    // you want to build a customized operator interface.
    // Button button = new DigitalIOButton(1);
    
    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.
    
    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:
    
    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());
    
    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());
    
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());
    
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public JoystickButton spinWheelsButton;
    public Joystick leftStick;
    public JoystickButton shootButton;
    public Joystick rightStick;
    public Joystick gamepad;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private boolean isNoob;
    public OI() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        gamepad = new Joystick(3);
        
        rightStick = new Joystick(2);
        
        shootButton = new JoystickButton(rightStick, 1);
        shootButton.whileHeld(new Shoot());
        leftStick = new Joystick(1);
        
        spinWheelsButton = new JoystickButton(leftStick, 1);
        spinWheelsButton.whileHeld(new SpinWheels());
	    
        // SmartDashboard Buttons
        SmartDashboard.putData("Autonomous Command", new AutonomousCommand());
        SmartDashboard.putData("Spin Wheels", new SpinWheels());
        SmartDashboard.putData("Shoot", new Shoot());
        SmartDashboard.putData("Shift", new Shift());
        SmartDashboard.putData("Toggle Hatchet", new HatchetToggle());
        //SmartDashboard.putData("Pro Mode", new ProMode());
        
        isNoob = true;
    }
    
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
    public Joystick getLeftStick() {
        return leftStick;
    }
    public Joystick getRightStick() {
        return rightStick;
    }
    public Joystick getGamepad() {
        return gamepad;
    }
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
    
    public double getForwardValue() {
        return -leftStick.getY();
    }
    
    public double getTurningValue() {
        return rightStick.getX();
    }
    
    public double getLeftThrottle() {
        return leftStick.getThrottle();
    }
    
    public void setNoob(boolean noob) {
        isNoob = noob;
    }
    
    public boolean getNoob() {
        return isNoob;
    }
}
