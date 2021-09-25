package ReplaceADigitWithAnother._ReplaceADigitWithAnother;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

public class ReplaceADigitWithAnother {
	Map<Integer,Integer> replace=new HashMap<Integer,Integer>();
	int acreplace=0;
	public int replaceNumber(int num){
		replace.put(0, 9);
		replace.put(1,8);
		replace.put(2,7);
		replace.put(3,6);
		replace.put(4,5);
		replace.put(5,4);
		replace.put(6,3);
		replace.put(7,2);
		replace.put(8,1);
		replace.put(9,0);
		int temp=num;
		int r=0;
		while(num>0) {
			 r=num%10;
			 if(replace.containsKey(r)) {
				 r=replace.get(r);
			 }
			 acreplace=acreplace*10+r;
			num=num/10;
		}
		int rev=0;
		while(acreplace>0) {
			rev=rev*10+acreplace%10;
			acreplace=acreplace/10;
		}
		return rev;
	}
	
	
	@Test
	public void t1() {
		
		
			int num=replaceNumber(123);
			System.out.println(num);
		
	}
	@Test
	public void t2() {
		
		
			int num=replaceNumber(5670);
			System.out.println(num);
		
	}

}
