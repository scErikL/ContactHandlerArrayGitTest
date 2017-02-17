package contactApp;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContactHandler ch = new ContactHandler();
		//System.out.println(ch.getFirstOpenSlot());
		ch.addContact(new Contact("Erik", "Öbackav 40", "mej", "0722000"));
		ch.addContact(new Contact("Kalle", "Öbackav 1", "mej2", "07233000"));
		
		Contact[] tmp = ch.getContacts();
		for (Contact c : tmp)
			System.out.println(c.getFullName() + ", "+c.getAdress());

	}

}
