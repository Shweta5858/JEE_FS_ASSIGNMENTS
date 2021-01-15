
public abstract class Item {
	/**
	 * This holds id number of the book
	 */
	private int identificationNumber=101;
	/**
	 * This holds title of the book
 	*/
	private String title="Throne";
	/**
	 * This holds copies of the book
	 */
	private int copies=20;
	
	public int getIdentificationNumber() {
		return identificationNumber;
	}
	public void setIdentificationNumber(int identificationNumber) {
		this.identificationNumber = identificationNumber;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getCopies() {
		return copies;
	}
	public void setCopies(int copies) {
		this.copies = copies;
	}
	@Override
	public String toString() {
		return "Item [identificationNumber=" + identificationNumber + ", title=" + title + ", copies=" + copies
				+ ", getIdentificationNumber()=" + getIdentificationNumber() + ", getTitle()=" + getTitle()
				+ ", getCopies()=" + getCopies() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}















}
