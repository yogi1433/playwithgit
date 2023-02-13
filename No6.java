class No4 {
	void cool()
	{
		System.out.println("hey its cool method");
	}}
	class No5 extends No4 {
		void test()
		{
			System.out.println("hey its test method");
		}
	}
	class No6
	{
		public static void main(String[] args) {
			System.out.println("****upcasting****");
			No4 n=new No5();
			n.cool();
			System.out.println("*****downcasting*****");
			No5 n1=(No5) n;
			n1.cool();
			n1.test();
		}}