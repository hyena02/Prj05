package ex02;

class Member{
//Field	: Data
	String	name;
	String	uid;
	String	email;
	int		regYear;
	
// 기본 생성자
	public Member () {}

// 인자 있는 생성자
	public Member (String n, String u,String e,int r) {
		name 	= n;
		uid	 	= u;
		email 	= e;
		regYear = r;
	}
	
	
//Method : 기능
	void info() {
		String fmt = "이름 : %s\n 아이디 : %s\n 이메일 : %s\n 연도 : %d\n";
		String msg = String.format(fmt, name,uid,email,regYear);
		System.out.println( msg );
	}	
}

public class TestMember {

	public static void main(String[] args) {
		Member m1 	= new Member();
		m1.name   	= "사나";
		m1.uid	 	= "sana";
		m1.email	= "sana@hive.com";
		m1.regYear	= 2012;
		m1.info();
		
		Member m2 	= new Member();
		m2.name   	= "정연";
		m2.uid	 	= "JY";
		m2.email	= "JY@hive.com";
		m2.regYear	= 2010;
		m2.info();

		Member m3 	= new Member();
		m3.name   	= "모모";
		m3.uid	 	= "MM";
		m3.email	= "MM@hive.com";
		m3.regYear	= 2015;
		m3.info();
		
		
		Member [] mList = new Member [3];		// 배열을 생성
		mList[0] =  new Member("사나","sana","sana@hive.com",2012);
		mList[1] =  new Member("정연","JY","JY@hive.com",2010);
		mList[2] =  new Member("모모","MM","MM@hive.com",2015);
		
		mList[0].info();
		mList[1].info();
		mList[2].info();
		
		
//Member 배열에 저장
//		Member [] mList = new Member [3];		// 배열을 생성
//		mList[0]		= new Member();			// 배열 안에 저장할 멤버를 만듬
//		mList[0].name 	= "사나";
//		mList[0].uid 	= "sana";
//		mList[0].email 	= "sana@hive.com";
//		mList[0].regYear = 2012;

		
		
	}
}
