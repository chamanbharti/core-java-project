package encapsulation;

public class EncapsTest {
	public static void main(String args[]){
        EncapsulationDemo obj = new EncapsulationDemo(),obj2=new EncapsulationDemo();
        obj.setEmpName("Mario");
        obj.setEmpAge(32);
        obj.setSsn(112233);
        System.out.println("Employee Name: " + obj.getEmpName());
        System.out.println("Employee SSN: " + obj.getSsn());
        System.out.println("Employee Age: " + obj.getEmpAge());
   } 

}
