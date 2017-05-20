
class Student
{
	String name,address,program_name;
	int age;
	Student(String name,String address,String program_name,int age)
	{
	  this.name=name;
	  this.address=address;
	  this.program_name=program_name;
	  this.age=age;
		
	} 

	void display_details()
	{
		System.out.println("Name= "+name);
		System.out.println("Address= "+address);
		System.out.println("ProgramName= "+program_name);
		System.out.println("Age= "+age);
	}

	public static void main(String [] args)
	{
		try
		{
			Student st=new Student("Chaman Bharti","Laxmi Nagar","BCA",24);
			//StudentData st=new StudentData();
			/*st.name="Chaman Bharti";
			st.address="Laxmi Nagar";
			st.program_name="BCA";
			st.age=24;
			*/
			st.display_details();
		}
		catch(Exception e)
		{
		System.out.println(e);
		}
		
	}

}