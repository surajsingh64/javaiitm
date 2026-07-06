import java.util.Scanner;

class EmployeeData{
    String ename;
    String eid;
    String edept;
    
    public EmployeeData(){
        ename = "guest";
    }
    public EmployeeData(String name, String id, String dept) {
        ename = name;
        eid = id;
        edept = dept;
    }
    public void copyDept(EmployeeData e){
        this.edept = e.edept;
    }
    public void displayDetails() {
        System.out.println("ename : "+this.ename);
        System.out.println("eid : "+this.eid);
        System.out.println("edept : "+this.edept);
    }
}
public class employee 
{
	    public static void main(String args[]) 
	    {
		        Scanner s = new Scanner(System.in);
EmployeeData e1 = new EmployeeData();

        //Enter name of the employee
        String name = s.nextLine();

        //Enter id of the employee
        String id = s.nextLine();

        //Enter department of the employee
        String dept = s.nextLine();

        EmployeeData e2 = new EmployeeData(name,id,dept);
		
		        e1.copyDept(e2); 
		        //Copies the department name of e2 into e1's department name.
		
		        e1.displayDetails();
	    }
}