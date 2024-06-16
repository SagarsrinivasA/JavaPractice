package java8features;

import java.util.Date;
import java.util.function.Supplier;

public class DemoSupplier {

	public static void main(String[] args) {

		Supplier<Date> s = () -> new Date();
		System.out.println(s.get());
		
		// Generate Random OTP
		
		Supplier<String> s1 = () -> {
			String otp = "";
			
			for(int i = 0; i < 6; i++) {
				otp = otp + (int)(Math.random() * 10);
				
			}
			return otp;
		};
		
		System.out.println(s1.get());
		System.out.println(s1.get());
		System.out.println(s1.get());
		System.out.println(s1.get());
		System.out.println(s1.get());
	}

}
