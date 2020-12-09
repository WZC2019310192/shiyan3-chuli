package siyan5;
interface boshi extends mainTeacher{
	public double jiaoshui(Teacher a,student b);
	
}
public class doctor implements boshi{
	public String name;
	public String sex;
	public int age;
	public int salary;
	public int tuition;
	public double jiaoshui(Teacher a,student b) {
		if ((a.salary-b.tuition)*0.03>0)
		{return (a.salary-b.tuition)*0.03;}
		else 
			return 0;
		
	}
	doctor(String name,String sex,int age){
		this.name=name;
		this.sex=sex;
		this.age=age;
	}
	
	
	@Override
	public void setWage(int salary) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String yesWage() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String noWage() {
		// TODO Auto-generated method stub
		return null;
	//}
	//@Override
	//public void setxuefei(int xuefei) {
		// TODO Auto-generated method stub
		
	//}
	//@Override
	//public void chaxuefei() {
		// TODO Auto-generated method stub
		
	}
	

	
}

	

	

       
       

