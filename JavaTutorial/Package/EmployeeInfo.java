package employee;

public class EmployeeInfo
{
    int empId;
    String name;
    
    public EmployeeInfo(int empId,String name)
    {
        this.empId=empId;
        this.name=name;
    }
    public void getDetail()
    {
        System.out.println("Employee getDetail");
        System.out.println("Employee Id   : "+empId);
        System.out.println("Employee Name : "+name);
    }

}