class Pattern4 {

public static void main(String args[]){
int n=5;

/*for(int i=0;i<n;i++){
	for(int j=0;j<n-i-1;j++){
		System.out.print("_");
	}
	for(int k=0;k<1;k++){
	System.out.print(1);
	}
	for(int k=0;k<i;k++){
	if(i==0)continue;
	System.out.print((i+1)+" ");
	}
	
	
	for(int k=0;k<1;k++){
	if(i==0)continue;
	System.out.print(1);
	}
	System.out.println();
}



}
}*/
for(int i=0; i<n;i++){
	
	int num=1;
	for(int j=0; j<n-i;j++){
		System.out.print(" ");
	}
	for(int j=0; j<=i;j++){
		System.out.print(num+" ");
		num=num*(i-j)/(j+1);
		
	}
	System.out.println();
}
}
}
