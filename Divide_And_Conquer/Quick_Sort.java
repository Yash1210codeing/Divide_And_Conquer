package Divide_And_Conquer;
public class Quick_Sort {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int []arr= {5,3,2,11,4};
        sort(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++) {
        	System.out.print(arr[i]+" ");
        }
	}
	public static void sort (int []arr,int si,int ei) {
		if(si>=ei) {
			return;
		}
		int idx= Partition(arr,si,ei);
		sort(arr,si,idx-1);
		sort(arr,idx+1,ei);
	}
	public static int Partition(int[]arr,int si,int ei) {
		int item=arr[ei];
		int idx=si;
		for(int i=si;i<ei;i++) {
			if(arr[i]<=item) {
				int temp=arr[i];
				arr[i]=arr[idx];
				arr[idx]=temp;
				idx++;
			}
		}
		int temp=arr[ei];
		arr[ei]=arr[idx];
		arr[idx]=temp;
		return idx;
	}
}
