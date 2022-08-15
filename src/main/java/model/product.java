package model;

public class product {
	private int id;
	private String title;
	private String content;
	private String image;
	

	public product() {
		
	}

	public product(int id,String title, String content, String image) {
		
		this.title = title;
		this.content = content;
		this.image = image;
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
