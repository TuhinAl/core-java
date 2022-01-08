package basic;

public class LeftShift {

	public static void main(String[] args) {
		try {
			long h1 = 24L, h2 = 24L, m = 60L, s = 60L, mil = 1000L, mic = 1000L, nan = 1000L;
			h1 *= (m * s * mil * mic * nan);
			 System.out.println(h2);
			 System.out.println(h1);
			 h2 = (h2 << 6) - (h2 << 2);
			 System.out.println(h2);
			 h2 = (h2 << 6) - (h2 << 2);
			 System.out.println(h2);
			 h2 = (h2 << 10) - ((h2 << 2) + (h2 << 3));
			 System.out.println(h2);
			 h2 = (h2 << 10) - ((h2 << 2) + (h2 << 3));
			 System.out.println(h2);
			 h2 = (h2 << 10) - ((h2 << 2) + (h2 << 3));
			 
			 System.out.println(h1 == h2);
			
		} catch(Exception e) {
			
			System.out.println(e.toString());
		}

	}

}
