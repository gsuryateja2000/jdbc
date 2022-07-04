public class Employee {

	public static void main(String[] args) {
		
		try {
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","surya2","Surya@2000");
			Statement stmt = con.createStatement();
			stmt.execute("insert into emp values(56521, 'Surya', 21, 40000, 'Developer', '2022-06-28', 'Chittoor', 9678985664, 12345685612345678, 'ASDF4563A')");
			stmt.execute("insert into emp values(56520, 'teja', 24, 35000, 'clerk', '2022-06-28', 'nellore', 9678985564, 1234567812345678, 'bSDF4563A')");
			stmt.execute("insert into emp values(56522, 'pranit', 31, 39000, 'hr dept', '2022-06-28', 'putur', 9678984664, 12345527812345678, 'cSDF4563A')");
			stmt.execute("insert into emp values(56523, 'sourya', 41, 38000, 'trainee', '2022-06-28', 'Chittoor', 9698925664, 12345321812345678, 'dSDF4563A')");
			stmt.close();
			System.out.println("Data saved Successfully....!");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		

	}

}