package Payroll;

import java.util.ArrayList;

abstract class Employee{
 private int id;
 private String name;
 
 public Employee (int id, String name) {
	 this.id=id;
	 this.name=name;
}
 public String getName() {
	 return name;
 }
 public int getId() {
	 return id;
 }
 public abstract double calculateSalary();
 @Override
 public String toString() {
	 return "Employee[name="+name+",id="+id+",salary="+calculateSalary()+"]";
	 
 }
}
class FullTimeEmployee extends Employee{
private double MonthlySalary;
	public FullTimeEmployee(int id, String name, double MonthlySalary) {
		super(id, name);
		this.MonthlySalary=MonthlySalary;
	}
	@Override	
		public double calculateSalary() {
		return MonthlySalary;
		
	}
	
}

class PartTimeEmployee extends Employee{
	private int hoursWorked;
	private double hourlyrate;
	public PartTimeEmployee(int id,String name,int hoursWorked,double hourlyrate) {
		super(id,name);
		this.hoursWorked=hoursWorked;
		this.hourlyrate=hourlyrate;
		
	}
	@Override
	public double calculateSalary() {
		
		return hoursWorked * hourlyrate;
	}
	
}

class PayRollSystem{
	
	private ArrayList<Employee> employeeList;
	
	public PayRollSystem() {
		employeeList=new ArrayList<>();
	}
	public void addEmployee(Employee employee) {
		employeeList.add(employee);
	}
	public void removeEmployee(int id) {
		Employee employeeToRemove=null;
		for(Employee employee: employeeList) {
			if(employee.getId()==id) {
				employeeToRemove=employee;
				break;
			}
			
		}
		if(employeeToRemove!=null) {
			employeeList.remove(employeeToRemove);
		}
	}
	public void displayEmployee() {
		for(Employee employee: employeeList) {
			System.out.println(employee);
		}
	}
	
}
 
 

public class Main {
	
	public static void main(String[] args) {
		PayRollSystem payrollsystem=new PayRollSystem();
		FullTimeEmployee emp1=new FullTimeEmployee(12,"Ashok",26611.78);
		PartTimeEmployee emp2=new PartTimeEmployee(17,"Vivek",9,4321.50);
		
		payrollsystem.addEmployee(emp1);
		payrollsystem.addEmployee(emp2);
		System.out.println("Initial Employee Details... ");
		payrollsystem.displayEmployee();
	}

}

