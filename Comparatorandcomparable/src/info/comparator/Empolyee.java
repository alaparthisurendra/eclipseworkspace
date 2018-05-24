package info.comparator;

public class Empolyee implements Comparable<Empolyee> {

	private String name;
	private Integer id;

	public Empolyee(String name, Integer id) {
		super();
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public int compareTo(Empolyee ee) {

		return this.id - ee.id;
	}

}
