package comparator_project;

public class stu implements Comparable<stu>{
private int id;
private String name;
public stu(int id, String name) {
	
	this.id = id;
	this.name = name;
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
public String toString() { //it is automatically called so that the integer is converted to string.
	return id+" "+name;
}
@Override
public int compareTo(stu that) {//automatically called to sort the id in ascending order when default or non-default or empty constructor is called.
	
	return Integer.compare(this.id, that.id);
	//return Integer.compare(that.id, this.id);  ---sorting for descending order.

}

}
