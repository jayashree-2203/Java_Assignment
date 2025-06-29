package assignment_Interface.Sorting;
public class MergeSort implements Sortable 
{
	public void sort(int[] nums){
		int left=0,right=nums.length-1;
		mergeSort(nums,left,right);
	}
	
	public void mergeSort(int[] nums,int left,int right){
		if(left<right){
			int mid=(left+right)/2;
			mergeSort(nums,left,mid);
			mergeSort(nums,mid+1,right);
			merge(nums,left,mid,right);
		}
	}
	public void merge(int[] nums,int left,int mid,int right){
		int n1=mid-left+1;
		int n2=right-mid;
		
		int[] L=new int[n1];
		int[] R=new int[n2];
		
		for(int i=0;i<n1;i++){
			L[i]=nums[left+i];
		}
		for(int j=0;j<n2;j++){
			R[j]=nums[mid+1+j];
		}
		int i=0,j=0,k=left;
		while(i<n1 && j<n2){
			if(L[i]<=R[j]){
				nums[k++]=L[i++];
			}
			else{
				nums[k++]=R[j++];
			}
		}
		
		while (i < n1) nums[k++] = L[i++];
        while (j < n2) nums[k++] = R[j++];
	}
}