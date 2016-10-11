package Searching;
import java.awt.List;
import java.util.ArrayList;

public class Searching {
	public ArrayList<Integer> sequentialSearch(int data[],int target) { //숫자 배열에서 특정 숫자가 있는 배열의 인덱스를 리턴
		ArrayList<Integer> index = new ArrayList<Integer>();
		for(int i=0;i<data.length;i++){
			if(data[i]==target)
				index.add(i);
		}
		return index;
	}
	
	public ArrayList<Integer> sequentialSearch(String data[],char target) { //단어가 있는 문자열 배열에서 특정 문자가 있는 배열의 인덱스를 리턴
		ArrayList<Integer> index = new ArrayList<Integer>();
		for(int i=0;i<data.length;i++){
			char[] c = data[i].toCharArray();
			for(int j=0;j<c.length;j++){	
				if(c[j]==target){
					index.add(i);
					break;
				}
			}
		}
		return index;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int data[] = {6,4,8,7,5,1,2,3,7,9,7,5,6,7};
		String Sdata[] = {"int","char","search","length","Array","java"};
		int target = 7;
		char Starget = 'a';
		Searching search = new Searching();
		ArrayList<Integer> targetindexN = search.sequentialSearch(data, target);
		ArrayList<Integer> targetindexS = search.sequentialSearch(Sdata, Starget);
		
		System.out.print("Starget = "+Starget);
		for(int i=0;i<targetindexS.size();i++) System.out.print(" , Sdata["+targetindexS.get(i)+"] = " + Sdata[targetindexS.get(i)]);
		System.out.println("");
				
		System.out.print("target = "+target);
		for(int i=0;i<targetindexN.size();i++) System.out.print(" , data["+targetindexN.get(i)+"] = " + data[targetindexN.get(i)]);
		System.out.println("");
		
		
	}

}
