import java.util.Random;

public class PasswordGenerator 
{
	public static void main(String[] args)
	{
		
		Password(16);//we set the numbers of characters for the password

	}
	public static void Password(int len_password)
	{
	        
		String numbers = "0123456789";
		String charsLow = "abcdefghijklmnopqrstuvwxyz";
		String charsUpper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String symbols = "!@#$%^&*_=+-/[]{}:'()><?";

		String x = numbers + charsLow + charsUpper + symbols; // A string with all tha above
		Random r = new Random();
		
		char[] password = new char[len_password];
		
		
		for (int i = 0; i < len_password; i++) 
		{
			password[i] = x.charAt(r.nextInt(x.length()));//a random character of the String x (numbers + charsLow + charsUpper + symbols)
                                                                           
		}
		System.out.println(password);
	}
}
