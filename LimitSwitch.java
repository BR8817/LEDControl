package frc.robot.Subsystems;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj2.command.SubsystemBase;


public class LimitSwitch extends SubsystemBase{
private final DigitalInput limitSwitch = new DigitalInput(1);// Limit switch on DIO 1

public LimitSwitch(){
    
}
    // public boolean get() {
    // return limitSwitch.get();
    // }
    @Override
    public void periodic() {
      // This method will be called once per scheduler run
    }
    
    public boolean get() {
        return limitSwitch.get();

    }
    
      
}
