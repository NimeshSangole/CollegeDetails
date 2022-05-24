package org.company;

public class CompanyInfo {
	public void companyName()
	{
		System.out.println("Company name is Amazon");
	}
	public void companyId()
	{
		System.out.println("Company Id is 786");
	}
	public void companyAddress()
	{
		System.out.println("Company Address is Kapil nagar Nagpur");
	}
	public static void main(String[] args) {
		CompanyInfo s=new CompanyInfo();
		s.companyName();
		s.companyId();
		s.companyAddress();
	}

}
