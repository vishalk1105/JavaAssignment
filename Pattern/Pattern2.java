class Pattern2{

public static void main(String args[]){
int n=4;

for(int i=0;i<n+9;i++) System.out.print("*");
	System.out.println();

for(int i=0;i<n;i++){
	for(int j=0;j<i;j++){
         System.out.print(" ");
	}		
	
	for(int k=0;k<1;k++){
		System.out.print("*");
	}
	for(int l=0;l<(n+1-(2*i));l++){
	
		System.out.print(" ");
			if(l==-1)continue;
	}
	for(int k=0;k<1;k++){
		if(i==n-1)continue;
		System.out.print("*");
	}
	System.out.println();
}
}
}