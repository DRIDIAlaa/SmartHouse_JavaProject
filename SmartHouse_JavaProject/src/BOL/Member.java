package BOL;

import java.util.Date;

public class Member {
	
	private int id;
	private String name;
	private Date chechIn;
	private Date checkOut;
	
	public Member(int id, String name, Date chechIn, Date checkOut) {
		super();
		this.id = id;
		this.name = name;
		this.chechIn = chechIn;
		this.checkOut = checkOut;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getChechIn() {
		return chechIn;
	}

	public void setChechIn(Date chechIn) {
		this.chechIn = chechIn;
	}

	public Date getCheckOut() {
		return checkOut;
	}

	public void setCheckOut(Date checkOut) {
		this.checkOut = checkOut;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", chechIn=" + chechIn + ", checkOut=" + checkOut + "]";
	}
	
	
	
}
