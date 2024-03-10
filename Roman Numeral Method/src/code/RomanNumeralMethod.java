package code;

public class RomanNumeralMethod {
	
	public static String romanNumeral(int number)
	{	
		String romanNumeral = "";
		
		while(number >= 100)
		{
			romanNumeral += "C";
			number -= 100; 
		}
		
		if(number >= 90)
		{
			romanNumeral += "XC";
			number -= 90;
		}
		else if(number >= 50)
		{
			romanNumeral += "L";
			number -= 50;
		}
		else if(number >= 40)
		{
			romanNumeral += "XL";
			number -= 40;
		}
		
		while(number >= 10)
		{
			romanNumeral += "X";
			number -= 10;
		}
		
		if(number >= 9)
		{
			romanNumeral += "IX";
			number -= 9;
		}
		else if(number >= 5)
		{
			romanNumeral += "V";
			number -= 5;
		}
		else if(number >= 4)
		{
			romanNumeral += "IV";
			number -= 4;
		}
		
		while(number >= 1)
		{
			romanNumeral += "I";
			number -= 1;
		}
		
		return romanNumeral;
		
	}
	
	public static void main(String[] args)
	{
		
		System.out.println( romanNumeral(88) );
		
	}

}
