package info.comparableandcomparator;

public class Books implements Comparable<Books> {

	private int bId;
	private String bName;
	private String bAuthor;
	private int bPrice;

	public Books(int bId, String bName, String bAuthor, int bPrice) {
		super();
		this.bId = bId;
		this.bName = bName;
		this.bAuthor = bAuthor;
		this.bPrice = bPrice;
	}

	public int getbId() {
		return bId;
	}

	public void setbId(int bId) {
		this.bId = bId;
	}

	public String getbName() {
		return bName;
	}

	public void setbName(String bName) {
		this.bName = bName;
	}

	public String getbAuthor() {
		return bAuthor;
	}

	public void setbAuthor(String bAuthor) {
		this.bAuthor = bAuthor;
	}

	public int getbPrice() {
		return bPrice;
	}

	public void setbPrice(int bPrice) {
		this.bPrice = bPrice;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Books [bId=");
		builder.append(bId);
		builder.append(", bName=");
		builder.append(bName);
		builder.append(", bAuthor=");
		builder.append(bAuthor);
		builder.append(", bPrice=");
		builder.append(bPrice);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int compareTo(Books o) {

		if (this.bId > o.bId)
			return 1;
		else if (this.bId < o.bId)
			return -1;

		return 0;
	}

}
