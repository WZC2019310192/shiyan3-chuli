package siyan5;

public class start {
	//System.out.prinln("ѡ��ģ��");
//	public class Testjiekou {
		public static void main(String args[]) {
			student doc1=new student("С��","��",10);
			Teacher doc2=new Teacher("С��","��",10);
			doctor doc3=new doctor("С��","��",10);
			student doc4=new student("С��","��",20);
			Teacher doc5=new Teacher("С��","��",20);
			doctor doc6=new doctor("С��","��",20);
			doc2.setWage(32000);
			doc1.setxuefei(20000);
			System.out.println(doc1.name+doc1.sex+doc1.age+"ѧ��"+doc1.tuition+"нˮ"+doc2.salary+"��˰"+doc3.jiaoshui(doc2,doc1));
			System.out.println(doc4.name+doc2.sex+doc2.age+"ѧ��"+doc1.tuition+"нˮ"+doc2.salary+"��˰"+doc3.jiaoshui(doc2,doc1));
		}


	}
