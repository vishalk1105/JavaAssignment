//1.

class Pattern1{


public static void main(String args[]){
 int n=4;
 for(int i=0; i<n;i++){
	 for(int j=0;j<n-i-1;j++){
		 System.out.print(" ");
	 }
	 for(int k=0;k<1;k++){
		  System.out.print("*");
	 }
	 for(int j=0;j<(i*2)-1;j++){
		 if(j==-1)continue; 
		 System.out.print(" ");
	 }
      for(int j=0;j<1;j++){
		  if(i==0)continue;
	       System.out.print("*");
	 }
	 System.out.println();
 }
 for(int i=0;i<n+8;i++){
	  System.out.print("*");
 }
}
}
 