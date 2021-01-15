
public class WrittenItem extends Item {
	/**
	 * This holds the author's name
	 */
	private String author="smith";

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
}
 class Book extends WrittenItem {
	
}
 class JournalPaper extends WrittenItem {
		
 }

