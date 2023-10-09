package com.custom_hashmap;

import java.util.Objects;

public class Employee {

	int emp_id;
	String emp_name;
	int emp_salary;
	
	public Employee()
	{
		super();
	}
	public Employee(int emp_id, String emp_name, int emp_salary) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.emp_salary = emp_salary;
	}
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public int getEmp_salary() {
		return emp_salary;
	}
	public void setEmp_salary(int emp_salary) {
		this.emp_salary = emp_salary;
	}
	
	@Override
    public int hashCode()
    {
	   return Objects.hash(emp_id,emp_name,emp_salary);
	   // return Objects.hash(id,name); // now it will not compare salary
	
    }
	
	@Override
	public boolean equals(Object obj)
	{
		if(this==obj)
			return true;
		if(obj==null)
			return false;
		if(this.getClass()!=obj.getClass())
			return false;
		Employee other= (Employee) obj;
		 
		//return (id==other.id)&& Objects.equals(name,other.name);	// will compare salary because hashcode of salary is calculated
		if(emp_id!=other. emp_id)
			return false;
		else if(!emp_name.equals(other.emp_name))
			 return false;
		else if(emp_salary!= other.emp_salary)
			return false;
		
		return true;
		
		
	}

	
	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", emp_name=" + emp_name + ", emp_salary=" + emp_salary + "]";
	}
	
	
	
	
	
}
