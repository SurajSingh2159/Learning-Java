package methodmainasThread;

public class MethodMainAsThread {

	public static void main(String[] args) {
		Thread ref=Thread.currentThread();
		System.out.println(ref);
		ref.setName("Suraj");
		System.out.println(ref);
		ref.setPriority(ref.getPriority()+2);
		System.out.println(ref);
        System.out.println(ref.getPriority());
}
}