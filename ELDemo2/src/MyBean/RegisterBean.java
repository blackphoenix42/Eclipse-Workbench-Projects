package MyBean;

public class RegisterBean//pojo or bean class
{
	private String name;
	private int age;
	private String address;
	private long phone;
		public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setAge(int age){
		this.age = age;
	}
	public int getAge(){
		return age;
	}
	public void setAddress(String address){
		this.address = address;
	}
	public String getAddress(){
		return address;
	}
	public void setPhone(long phone){
		this.phone = phone;
	}
	public long getPhone(){
		return phone;
	}

}
