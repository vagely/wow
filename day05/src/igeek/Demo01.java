package igeek;


public class Demo01<E> {
	private Object[] elementData;
	private int size;
	public static final int DEFAULT_CAPACITY = 10;
	public Demo01() {
		elementData = new Object[DEFAULT_CAPACITY];
	}
	public Demo01(int capacity) {
		if(capacity<0) {
			throw new RuntimeException("容量初始容量不能为负数");
		}else if(capacity==0){
			elementData = new Object[DEFAULT_CAPACITY];
		}else {
			elementData =new Object[capacity];
		}
		elementData = new Object[capacity];
	}
	public void add(Object element) {
		//扩容问题
		
		if(size==elementData.length) {
			//扩容
			Object[] newArray=new Object[elementData.length+(elementData.length>>1)];
	        System.arraycopy(elementData,0,newArray,0,elementData.length);
		    elementData =newArray;
		}
		elementData[size++] = element;
	}
	public Object get(int index) {
		return elementData[index];
	}
	public  void remove(E element) {
		for(int i = 0;i<size;i++) {
			if(element.equals(get(i))) {
				remove(i);
			}
		}
	}
	public void remove(int index) {
		int numMoved = size - index -1;
		if(numMoved>0)
			System.arraycopy(elementData, index+1, elementData, index, numMoved);
	        elementData[--size]=null;
	}
	@Override	
	public String toString() {
		StringBuilder sb=new StringBuilder();
		sb.append("[");
		for (int i=0;i< size ; i++) {
			sb.append(elementData[i]+",");
		}
		sb.setCharAt(sb.length()-1, ']');
		
		return sb.toString();
	}
	
	public void set(Object element,int index) {
		
		if(index<0||index>size-1) {
			throw new RuntimeException(index+"不合法！！") ;
			}
		
	
		elementData[index]=element;
	}
	public static void main(String[] args) {
     	Demo01 demo01=new Demo01();
//		demo01.add("aa");
//		demo01.add("bb");
//		demo01.add("cc");
     	for(int i=0;i<40;i++) {
     		demo01.add("aa"+i);
     	}
     	demo01.remove(5);
     	System.out.println();
		System.out.println(demo01.get(3));
		demo01.set("hi", 19);
		System.out.println(demo01);
	}

}
