public class Droid{
  int batteryLevel;
  public Droid(){
    batteryLevel=100;
    
  }
  public void activate(){
    System.out.println("Activated. How can I help you?");
    batteryLevel-=5;
    System.out.println("Battery level is "+batteryLevel);
  }
  public void chargeBattery(int hours){
    System.out.println("Droid charging");      
    batteryLevel+=hours;
    if(batteryLevel>100) batteryLevel=100;
    else 
      System.out.println("Battery level is "+ batteryLevel);
  }
  public int checkBatteryLevel(){
    System.out.println(batteryLevel);
    return batteryLevel;
  }
  public void hover(int feet){
    if(feet>2) System.out.println("Error! I cannot hover above 2 feet");
    else{
      System.out.println("Hovering...");
      batteryLevel-=20;
    }
    System.out.println("Battery level is "+ batteryLevel);
  }
    
  public static void main(String[] args){
    Droid Alan=new Droid();
    Alan.activate();
    Alan.chargeBattery(5);
    Alan.hover(1);
    
  }
}
