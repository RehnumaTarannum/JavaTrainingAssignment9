package jtProjectPackage;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		jtProjectDAO dao = new jtProjectDAO();
		
		dao.setUsername("Ray");
		dao.setPassword("1234");
		dao.setEmail("rehnumatarannum@gmail.com");
		dao.setContactNo("4321");
		
		System.out.println(dao.toString());

	}

}
