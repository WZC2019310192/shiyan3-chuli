package siyan5;
//import java.util.Scanner;
interface xuesheng {
	void setxuefei(int xuefei);
	
	void chaxuefei();
}


public class student extends doctor implements xuesheng{
	student(String name, String sex, int age ) {
		super(name, sex, age);
		this.name=name;
		this.sex=sex;
		this.age=age;
		

	}
	//定义学生的属性
	public String name;
	public String sex;
	public int age;
	public int tuition;
	@Override
	public void setxuefei(int xuefei) {
		// TODO Auto-generated method stub
		this.tuition=xuefei;
	}
	@Override
	public void chaxuefei() {
		// TODO Auto-generated method stub
		
	}
	

}

	//纳学费
	 // public abstract void pay();	
	//	public String c = new String("缴纳学费");
		//public String d = new String("缴纳成功");
	//查学费
	//public abstract void search();	
	//public String a = new String("查询学费");
	//public String b = new String("学费一共4600元");
	//System.out.println(a);
	
	
//public static void main(String args[]) {
	//System.out.println("请输入姓名以及学号喔!");
	
//}


   