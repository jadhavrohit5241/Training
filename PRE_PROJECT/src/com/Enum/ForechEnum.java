package com.Enum;

public class ForechEnum {
    public static void main(String[] args) {
    System.out.println(EnumGloble.values());
	EnumGloble[] o=EnumGloble.values();
	for(EnumGloble o1:o) {
		o1.info();
		/* its iterating 5 TIMES           */
		
		
		
		o1.info(o1);
	}
	
	
	System.out.println(EnumGloble.returnInt());
	/* method from enum returning sone int value */
	
	
	
	int a=EnumGloble.returnInt()+10;
	/* save and perform some operation on that value */
	System.out.println(a);
	
	
	EnumGloble.AA.info();
	/* access non static method of enum*/
	
	EnumGloble.returnInt();
	/* calling Ststic method of enum using static way*/
	/* calling static method of using ref/non static way 
	 *   EnumGloble.AA.returnInt();     */

}
}
