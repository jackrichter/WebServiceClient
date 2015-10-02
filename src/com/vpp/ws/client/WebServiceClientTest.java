package com.vpp.ws.client;

import java.util.List;

import com.vpp.staffmanagement.Employee;
import com.vpp.staffmanagement.EmployeeManagementImplementationService;
import com.vpp.staffmanagement.EmployeeManagementWebService;
import com.vpp.staffmanagement.SystemUnavailableException_Exception;

public class WebServiceClientTest
{
	public static void main(String[] args)
	{
		EmployeeManagementWebService service = 
				new EmployeeManagementImplementationService().getEmployeeManagementWebServicePort();
		
		Employee newEmp = new Employee();
		newEmp.setFirstName("Bill");
		newEmp.setSurname("Maynard");
		newEmp.setJobRole("Actor");
		newEmp.setSalary(17999);
		
		try 
		{
			service.registerEmployee(newEmp);
		}
		catch (SystemUnavailableException_Exception e)
		{
			System.out.println("Payroll System Unavailable. Please try later.");
		}
		
		List<Employee> employees = service.getAllEmployees();
		
		for(Employee next : employees)
		{
			System.out.println(next.getFirstName() + " " + next.getSurname());
		}
	}
}
