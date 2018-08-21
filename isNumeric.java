import java.util.*;
public class te {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	String ss=in.nextLine();
	int s1=(int)Double.parseDouble(ss);
	String s=String.valueOf(s1);
	System.out.println(s);
	boolean isNumeric = s.chars().allMatch( Character::isDigit );
	if(isNumeric==true)
		System.out.println("Yes");
	else
		System.out.println("No");
}
}
