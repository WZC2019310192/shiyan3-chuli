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
	//����ѧ��������
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

	//��ѧ��
	 // public abstract void pay();	
	//	public String c = new String("����ѧ��");
		//public String d = new String("���ɳɹ�");
	//��ѧ��
	//public abstract void search();	
	//public String a = new String("��ѯѧ��");
	//public String b = new String("ѧ��һ��4600Ԫ");
	//System.out.println(a);
	
	
//public static void main(String args[]) {
	//System.out.println("�����������Լ�ѧ���!");
	
//}


   