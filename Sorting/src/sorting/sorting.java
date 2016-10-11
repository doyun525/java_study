package sorting;

public class sorting {
	public void quicksorting(int data[], int left, int right){
		int l=left, r=right;
		int p = data[(l+r)/2];
		do{
			while(data[l]<p) l++;
			while(data[r]>p) r--;
			if(l<=r){
				int temp = data[l];
				data[l]=data[r];
				data[r]=temp;	
				l++; r--;
			}			
		}while(l<=r);
		if(left<r) quicksorting(data, left, r);
		if(right>l) quicksorting(data, l, right);
	}
	public char charUpper(char a) {
		if(a>='A'&&a<='Z') 
			return a;
		if(a>='a'&&a<='z') 
			return (char) (a-'a'+'A');
		else return a;
	}
	public void quicksorting(String data[], int left, int right){
		int l=left, r=right;
		char p = charUpper(data[(l+r)/2].charAt(0));
		do{
			while(charUpper(data[l].charAt(0))<p) l++;
			while(charUpper(data[r].charAt(0))>p) r--;
			if(l<=r){
				String temp = data[l];
				data[l]=data[r];
				data[r]=temp;	
				l++; r--;
			}			
		}while(l<=r);
		if(left<r) quicksorting(data, left, r);
		if(right>l) quicksorting(data, l, right);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int data[] = {5,7,9,1,2,6,0,4,3,8};
		String Sdata[] = {"book","about","Cpu","quick"};
		sorting sorting = new sorting();
		sorting.quicksorting(data, 0, data.length-1);
		sorting.quicksorting(Sdata, 0, Sdata.length-1);
		for(int i = 0; i < data.length ; i++){
			System.out.println("data["+i+"] = "+data[i]);
			
		}
		for(int i = 0; i < Sdata.length ; i++){
			System.out.println("Sdata["+i+"] = "+Sdata[i]);
			
		}
		
		
	}

}
