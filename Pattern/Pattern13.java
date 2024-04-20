class Pattern13{

public static void main(String args[]){
int n=11;
char ch='A';
for(int i=0;i<=n/2;i++){
	for(int j=0; j<n/2-i;j++){
		System.out.print(" ");
	}
	
	for(int j=0;j<1;j++){
		System.out.print(ch);
	}
	for(int j=0;j<2*i-2;j++){
	if(i==0) continue;
		System.out.print("_");
    }
	for(int j=0;j<1;j++){
		if(i==0)continue;
		System.out.print(ch);
	}
	if(i==n/2)continue;
	else
	ch++;	
	System.out.println();
}
for(int i=(n/2); i<n;i++){
	for(int j=0;j<i-((n/2));j++){
		System.out.print(" ");
	}
     for(int j=0;j<1;j++){
		System.out.print(ch);
	}
	ch--;
	System.out.println();
}


}
}