public class MnpPrac23 {
		void m() throws Exception {
			throw new java.io.IOException("Error");
		}
		void n()
		{
		try {
			m();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		}
		void p()
		{
			try {
				n();
			}
			catch(Exception e) {
				System.out.println(e); }  }
		public static void main(String args[]) {
			MnpPrac23 obj = new MnpPrac23();
			obj.p();
			System.out.println("Normal Flow");
			
			}
    }
