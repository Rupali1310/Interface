package interfacepackage;

	public interface Laptop
	{
		//protected int  a=50;//not allowed
		//private int a=50;//not allowed
		static int a=50;//static
		final int b=30;//final
		int c=60;//public
		
		public default void maouse()
		{
			System.out.println(a);

		}
		public static void keys()
		{
			System.out.println("static method keys");

		}
		private void test()
		{
			
		}
		void sound();//abstract method can access
		void abc();
		
	}
