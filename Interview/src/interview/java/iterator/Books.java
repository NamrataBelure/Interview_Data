package interview.java.iterator;

public class Books {
	int id;
	String Name;
	String Author;
	String publisher;
	int quality;
	
	@Override
	public String toString() {
		return "Books [id=" + id + ", Name=" + Name + ", Author=" + Author + ", publisher=" + publisher
				+ ", quality=" + quality + "]";
	}

	public Books(int id, String name, String author, String publisher, int quality) {
		super();
		this.id = id;
		this.Name = name;
		this.Author = author;
		this.publisher = publisher;
		this.quality = quality;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getAuthor() {
		return Author;
	}

	public void setAuthor(String author) {
		Author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getQuality() {
		return quality;
	}

	public void setQuality(int quality) {
		this.quality = quality;
	}
}
