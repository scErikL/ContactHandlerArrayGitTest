package contactApp;

public class ContactHandler {
	
	private static Contact[] arr; 

	public ContactHandler(){
		arr = new Contact[1];
	}
	
	public int getFirstOpenSlot(){
		for (int i=0; i<arr.length; i++)
			if (arr[i]==null)
				return i;
		return arr.length;
	}
	
	public void addContact(Contact c){
		int pos = getFirstOpenSlot();
		if (pos<arr.length)
			arr[pos] = c;
		else{
			Contact[] tmp = new Contact[arr.length+1];
			for (int i=0; i<arr.length; i++)
				tmp[i] = arr[i];
			arr = tmp;
			tmp[tmp.length-1] = c;
		}
	}
	
	public Contact[] getContacts(){
		return this.arr;
	}
		
	
}
