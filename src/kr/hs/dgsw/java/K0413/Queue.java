package kr.hs.dgsw.java.K0413;

public class Queue {
	
	private int index = 0;
	private final int SIZE = 10;
	private String[] Qarray = new String[SIZE];

	public void add(String value) {
		this.Qarray[this.index++] = value;
	}
	
	public String poll() {
		String result = this.Qarray[0];
		for(int i=1; i<this.SIZE; i++) {
			this.Qarray[i-1] = this.Qarray[i];
		}
		index--;
		return result;
	}
	
	public static void main(String[] args) {
		Queue queue = new Queue();
		
		queue.add("Dog");
		queue.add("Lion");
		queue.add("Shark");
		queue.add("Butterfly");
		queue.add("Dog");
		queue.add("Lion");
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		
		queue.add("Shark");
		queue.add("Butterfly");
		queue.add("Dog");
		queue.add("Lion");
		queue.add("Shark");
		queue.add("Butterfly");
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
	}
	
}