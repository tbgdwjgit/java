public class QuickSort{

	// static int quickSortFun (vector<int> &v, int left, int right){
	//         if(left < right){
	//                 int key = v[left];
	//                 int low = left;
	//                 int high = right;
	//                 while(low < high){
	//                         while(low < high && v[high] > key){
	//                                 high--;
	//                         }
	//                         v[low] = v[high];
	//                         while(low < high && v[low] < key){
	//                                 low++;
	//                         }
	//                         v[high] = v[low];
	//                 }
	//                 v[low] = key;
	//                 quickSortFun(v,left,low-1);
	//                 quickSortFun(v,low+1,right);
	//         }
	// }

    public static int getMiddle(int[] numbers, int low,int high)
    {
        int temp = numbers[low];
        while(low < high)
        {
        while(low < high && numbers[high] > temp)
        {
            high--;
        }
        numbers[low] = numbers[high];
        while(low < high && numbers[low] < temp)
        {
            low++;
        }
        numbers[high] = numbers[low];
        }
        numbers[low] = temp;
        return low ;
    }	

	public static void main(String args[]){
       int a[] = {12,21,34,67,43,1,56,89,32,2};
       getMiddle(a,1,2);
       for(int i=0;i<a.length;i++){
       	   System.out.println(a[i]);
       }
	}
}