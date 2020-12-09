package siyan5;

//public interface Teacher {
interface mainTeacher {
		void setWage(int salary);
		String yesWage();
		String noWage();
	}
public class Teacher extends doctor implements mainTeacher{
		Teacher(String name, String sex, int age) {
			super(name, sex, age);
				this.name=name;
				this.sex=sex;
				this.age=age;
			// TODO Auto-generated constructor stub
		}
		//Teacher(){}
		//定义老师的属性
		String s = "";
		public String name;
		public String sex;
		public int age;
		public int salary;
		@Override
		public void setWage(int salary) {
			// TODO Auto-generated method stub
			this.salary=salary;
		}
		@Override
		public String yesWage() {
			// TODO Auto-generated method stub
			return s = "cantWage";		
		}
		public String noWage() {
			// TODO Auto-generated method stub
			return s = "canWage";		
		}
	}
