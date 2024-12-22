package day14;

public class Customer //implements Comparable<Customer>
{

	private int customerId;
	private String customerName;
	private int age;
	private double height;
	
	public Customer() {}
	public Customer(int customerId, String customerName, int age, double height) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.age = age;
		this.height = height;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", age=" + age + ", height="
				+ height + "]";
	}
//	@Override
//	public int compareTo(Customer o) {
//		return this.customerName.compareTo(o.customerName);
//	}
	
	
}
