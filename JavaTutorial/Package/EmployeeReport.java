package report;
import employee.*;
public class EmployeeReport
{
    int empId;
    String name;
        
    public static void main(String s[])
    {
        EmployeeReport empReport=new EmployeeReport();
        EmployeeInfo empInfo=new EmployeeInfo(123,"Anand");
        empInfo.getDetail();
    
    }

}