package entity;

public class Departmentinformation {

	private String id;
	private String department;
	private double position;
	private int firstnum;
	private String note;
	public Departmentinformation() {
		this.id=id;
		this.department=department;
		this.position=position;
		this.firstnum=firstnum;
		this.note=note;
		
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public double getPosition() {
		return position;
	}
	public void setPosition(double position) {
		this.position = position;
	}
	public int getFirstnum() {
		return firstnum;
	}
	public void setFirstnum(int firstnum) {
		this.firstnum = firstnum;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public String toString() {
		return "id="+id+"department="+department+"position="+position+"firstnum="+firstnum+"note="+note;
	}
	public double getCount() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
