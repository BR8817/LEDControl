package frc.robot.Subsystems;


import edu.wpi.first.wpilibj.motorcontrol.PWMSparkMax;
import edu.wpi.first.wpilibj2.command.SubsystemBase;



public class Led extends SubsystemBase{
    private final PWMSparkMax blinkin = new PWMSparkMax(0);

  //Creates an LED
  public Led(){
    //m_blinkin.setInverted(false);
      
    
  }

public void set(double speed) {
    blinkin.set(speed);
}



  // public void set(double speed) {
    
  //}
}

