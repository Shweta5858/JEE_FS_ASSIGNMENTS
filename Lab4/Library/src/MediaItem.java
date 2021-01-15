
public class MediaItem extends Item {

	@Override
	public int getIdentificationNumber() {
		// TODO Auto-generated method stub
		return super.getIdentificationNumber();
	}

	@Override
	public void setIdentificationNumber(int identificationNumber) {
		// TODO Auto-generated method stub
		super.setIdentificationNumber(identificationNumber);
	}

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return super.getTitle();
	}

	@Override
	public void setTitle(String title) {
		// TODO Auto-generated method stub
		super.setTitle(title);
	}

	@Override
	public int getCopies() {
		// TODO Auto-generated method stub
		return super.getCopies();
	}

	@Override
	public void setCopies(int copies) {
		// TODO Auto-generated method stub
		super.setCopies(copies);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

}
class video extends MediaItem{
	/**
	 * This holds the video directory
	 */
	private String director="c";
	/**
	 * This holds the video genre
	 */
	private String genre="movie"; 
	/**
	 * This holds the video release year
	 */
	private int year=2018;
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
}
class CD extends MediaItem{
	/**
	 * This holds name of the artist
	 */
	private String artist="milly";

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	@Override
	public int getIdentificationNumber() {
		// TODO Auto-generated method stub
		return super.getIdentificationNumber();
	}

	@Override
	public void setIdentificationNumber(int identificationNumber) {
		// TODO Auto-generated method stub
		super.setIdentificationNumber(identificationNumber);
	}

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return super.getTitle();
	}

	@Override
	public void setTitle(String title) {
		// TODO Auto-generated method stub
		super.setTitle(title);
	}

	@Override
	public int getCopies() {
		// TODO Auto-generated method stub
		return super.getCopies();
	}

	@Override
	public void setCopies(int copies) {
		// TODO Auto-generated method stub
		super.setCopies(copies);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}
	
	
}