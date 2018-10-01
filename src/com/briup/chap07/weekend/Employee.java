package com.briup.chap07.weekend;

public class Employee  {
	private String id;
	private String name;
	private int age;
	private double salary;
	private String card;
	private int totalemployee;
	private double totalsalary;
    public Employee(){
    	super();
    }
	public Employee(String id,int age,String name)throws UserException{
		super();
		this.id=id;	
		this.age=age;
		if(this.getAge()<18){
			System.out.println("未成年");
		}
		if(this.getAge()>60){
			System.out.println("年龄高异常");
		}		
		this.name=name;
		if(this.getName().length()==0){
		System.out.println("空异常");
		}
	}
	public Employee(double salary,String card)throws UserException{
		super();
		this.salary=salary;
		this.card=card;			
		if(this.getSalary()<600){
			System.out.println("工资太低异常");
		}
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getCard() {
		return card;
	}
	public void setCard(String card) {
		this.card = card;
	}
	public int getTotalemployee() {
		return totalemployee;
	}
	public void setTotalemployee(int totalemployee) {
	
		this.totalemployee = totalemployee;
	}
	public double getTotalsalary() {
		return totalsalary;
	}
	public void setTotalsalary(double totalsalary) {
		this.totalsalary = totalsalary;
	}
	public void addSalary(double addSalary)throws UserException{
		addSalary=getSalary()+addSalary;
		if(addSalary>totalsalary){
			System.out.println("工资太高");
		}		
	}
	public void minusSalary(double minusSalary)throws UserException{	
			minusSalary=this.getSalary()-minusSalary;
			if(minusSalary<200){
				System.out.println("工资太低");
			}
	}
	public void showTotalSalary(double totalsalary)throws UserException{
			if(totalsalary==0){
				System.out.println("空异常");
			}
	}
	public void showTotalEmployee(int totalemployee)throws UserException{	
			if(totalemployee==0){
				System.out.println("空异常");
			}
	}
}
