package abc;
//Program for array which holds information of student in object format which consist of name variable concatenated with date of birth year. 
//we have check the whether given year is leap year or not and print leap year in int format.

public class M3 {
	String name;
	String marks;
	String branch;	
M3(String name1,String marks1,String branch1){
	 name=name1;
	 marks=marks1;
     branch=branch1;	
}
public static void main(String[] args) {
	M3 []arr=new M3[3];
	M3 obj=new M3("Shubham2000","200","MCA");
	M3 obj1=new M3("Ravi2001","200","CSE");
	M3 obj2=new M3("Suraj2000","200","ENTC");
	
		arr[0]=obj;
		arr[1]=obj1;
		arr[2]=obj2;
	obj.split(arr);
	
}
public M3[] split(M3 []arr) {
	for(int i=0;i<3;i++)
	{	
		StringBuffer b=new StringBuffer(arr[i].name);
		StringBuffer c=new StringBuffer(b.substring(b.length()-4));
		String d=c.toString();		
		int e=Integer.valueOf(d);
		
		if(e%4==0&&e%100!=0||e%400==0) {
			System.out.println(e);
		}
	}
	return arr;
}
}
