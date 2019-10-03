package generics;

import java.util.ArrayList;

public class mylist<T>{
	
ArrayList<T> list= new ArrayList<>();

public void add(T element) {

list.add(element);

}
public void remove(T element) {//argument type is T
	list.remove(element);
}

public String toString()
{
	return list.toString();
}
public T get(int index) {  //returns T
	return list.get(index);
}
}