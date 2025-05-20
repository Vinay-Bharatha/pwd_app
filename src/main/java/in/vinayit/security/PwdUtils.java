package in.vinayit.security;

import java.util.Base64;
import java.util.Base64.Encoder;

public class PwdUtils {
	
	public String encodedpwd(String pwd) {
		
		Encoder encoder = Base64.getEncoder();
		
		byte[] encode = encoder.encode(pwd.getBytes());
		
		String encodedpwd = new String(encode);
		
		return encodedpwd;
	}

}
