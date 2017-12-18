
import java.util.ArrayList;



    public class Arraystack implements Stack{
	private ArrayList list;
	
	public Arraystack(){
		list = new ArrayList();
	}
	
	public Object peekTop(){
		if (list.isEmpty())
			throw new IllegalStateException
				("Stack is empty");
		return list.get(0);
	}
	public Object pop(){
		if (list.isEmpty())
			throw new IllegalStateException
				("Stack is empty");
		return list.remove(0);
	}
	
	public void push(Object obj){
		list.add(0, obj);
	}
	
	public int size(){
		return list.size();
	}
}
