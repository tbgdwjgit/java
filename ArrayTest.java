public class ArrayTest{
    public static void main(String args[]){
    int []a[]  = new int[10][10];
    int a1[][] = new int[10][10];     
    int [][]a2 = new int[10][10];
    int[][] a3 = new int[10][10]; 
    int a4[] = new int[10];

    for(int i=0 ;i < a4.length ; i++){
        System.out.println(a4[i]);
    }

    int arr[]={23,4,45,8,19}; 
    String tmp=arrayToString(arr);
    System.out.println(tmp);
    String tmp1=arrayToString1(arr);
    System.out.println(tmp1);    
    }

    static String arrayToString(int arr[]){
        String tmp="[";
        for(int i =0;i<arr.length;i++){
            if(i!=arr.length-1){
                tmp=tmp + arr[i] + ",";
            }else{
                tmp=tmp + arr[i] + "]";
            }
        }
        return tmp;
    }

    static String arrayToString1(int arr[]){
        String tmp="[";
        for(int i : arr){  
            if(i!=19){
                tmp=tmp + i + ",";
            }else{
                tmp=tmp + i + "]";
            }
        }
        return tmp;
    }    
  
}