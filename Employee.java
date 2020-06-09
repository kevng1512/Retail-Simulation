// The "Employee" class.
public class Employee
{
    protected String employee;
    protected double id;


    public Employee (String femployee, double fid)
    {
	this.employee = femployee;
	this.id = fid;

    }


    public String getEmployee ()
    {
	return (employee);
    }


    public void setEmployee (String femployee)
    {
	this.employee = femployee;
    }


    public double getId ()
    {
	return (id);
    }
} // Employee class
