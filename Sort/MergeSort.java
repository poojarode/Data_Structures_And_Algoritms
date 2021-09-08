class MergeSort{
	public static void main(String[] args) {
		int a[] = new int[]{2,5,1,8,9,3,7};
		int l=0, r=a.length-1;
		mergesort(a,l,r);
	}

	static void mergesort(int a[], int l, int r){
		while(l < r){
			int mid = (l+r)/2;
			mergesort(a,l,mid);
			mergesort(a,mid+1,r);
			merge(a,l,mid,r);
		}
	}
	static void merge(int a[] ,int l,int mid,int r){
		int b[] = new int[r];
		int i=l, j=mid+1, k=l;
		while(j<=mid && j<=r){
			if(a[i] < a[j]){
				b[k] = a[i];
				j++;
			}else{
				b[k]=a[j];
				j++;
			}
			k++;
		}
		if(i>mid){
			while(j<=r){
				b[k]=a[j];
				k++;j++;
			}
		}else{
			while(i<=mid){
				b[k]=a[j];
				k++;i++;
			}
		}
		for (k=l;k<=r;k++) {
			a[k]=b[k];
		}
	}
}