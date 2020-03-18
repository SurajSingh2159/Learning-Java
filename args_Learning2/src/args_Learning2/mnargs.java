package args_Learning2;

public class mnargs {

	public static void main(String[] args) {
		int n;
		n=args.length;
		for (int c=0;c<n;++c)
		{
			System.out.println("args["+c+"]="+args[c]);
		}

	}

}
