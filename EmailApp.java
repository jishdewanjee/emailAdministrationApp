package emailapp;

public class EmailApp {

	public static void main(String[] args) {
		email em1 = new email("John", "Smith");
		
//		em1.changePassword(null);
//		em1.setAtlernateEmail("js@email.com");
//		System.out.println(em1.getAlternateEmail());
//		em1.setMailboxCapacity(0);
		System.out.println(em1.showInfo());
		

	}
}
