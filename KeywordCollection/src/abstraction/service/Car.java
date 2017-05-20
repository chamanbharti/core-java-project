package abstraction.service;

abstract class MotorCar
{
  public void fuel()
  {
    System.out.println("Must to use fuel");
  }
  public void brake()
  {
    System.out.println("Must to have brakes");
  }
  public void airConditioning()
  {
    System.out.println("Air conditioning is optional");
  }
}
public class Car extends MotorCar
{
  public static void main(String args[])
  {
    Car c1 = new Car();
    c1.fuel();
    c1.brake();
    c1.airConditioning();
  }
}
