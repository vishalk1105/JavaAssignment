import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Collections;
class Qn1{

public static void main(String args[]){
 ArrayList<String>colorList= new ArrayList<>();
colorList.add("Blue");
colorList.add("While");
colorList.add("Red");
colorList.add("Yellow");
colorList.add("Pink");
colorList.add(0,"Brown");

//System.out.println(colorList);
  
Iterator itr=colorList.iterator();
while(itr.hasNext()){
	System.out.println(itr.next());		
}
System.out.println(colorList.get(3)+" get element");
 //Collections.sort(colorList);
 System.out.println("___________");
 /*ListIterator <String> reverseColorList= colorList.listIterator(colorList.size());
 while(reverseColorList.hasPrevious()){
	String str= reverseColorList.previous();
	System.out.println(str);	 
 }
 */
 for(int i=0;i<colorList.size();i++){
	 System.out.println(colorList.get(i));
 }
 
 
}
}