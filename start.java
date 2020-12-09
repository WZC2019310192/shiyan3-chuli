package siyan5;

public class start {
	//System.out.prinln("选择模块");
//	public class Testjiekou {
		public static void main(String args[]) {
			student doc1=new student("小明","男",10);
			Teacher doc2=new Teacher("小明","男",10);
			doctor doc3=new doctor("小明","男",10);
			student doc4=new student("小王","男",20);
			Teacher doc5=new Teacher("小王","男",20);
			doctor doc6=new doctor("小王","男",20);
			doc2.setWage(32000);
			doc1.setxuefei(20000);
			System.out.println(doc1.name+doc1.sex+doc1.age+"学费"+doc1.tuition+"薪水"+doc2.salary+"交税"+doc3.jiaoshui(doc2,doc1));
			System.out.println(doc4.name+doc2.sex+doc2.age+"学费"+doc1.tuition+"薪水"+doc2.salary+"交税"+doc3.jiaoshui(doc2,doc1));
		}


	}
