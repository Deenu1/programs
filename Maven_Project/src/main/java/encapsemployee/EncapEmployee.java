package encapsemployee;

public class EncapEmployee {
	private int id;
	private String empName;
	private int empAge;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EncapEmployee ee=new EncapEmployee();
		ee.setId(123456);
		ee.setEmpName("Jan");
		ee.setEmpAge(32);
		
		System.out.println("The Employee ID is:" +ee.getId());
		System.out.println("The Employee Name is:" +ee.getEmpName());
		System.out.println("The Employee ID is:" +ee.getEmpAge());
	}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id=id;
		}
		public String getEmpName() {
			return empName;
		}
		public void setEmpName(String empName) {
			this.empName=empName;
		}
		public int getEmpAge() {
			return empAge;
		}
		public void setEmpAge(int empAge) {
			this.empAge=empAge;
		}
		
	}


