package hashcode_equal;

import java.util.HashSet;
import java.util.Set;

public class TestEmployee {
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee(123);
		//Employee e2 = new Employee();
		
		/*e1.setId(100);
		e2.setId(100);
		System.out.println(e1);
		System.out.println(e2);
		//print false in console
		System.out.println(e1.equals(e2));//false when I override equals() then true
		System.out.println(e1 == e2);//false
*/		
		Set<Employee> employees = new HashSet<Employee>();
		employees.add(e1);
		employees.add(e1);
		employees.add(e1);
		
		System.out.println(e1.equals(e1));
		//print two object
		System.out.println(employees);//when you will not override hashCode() output will be two otherwise one
	}

}
