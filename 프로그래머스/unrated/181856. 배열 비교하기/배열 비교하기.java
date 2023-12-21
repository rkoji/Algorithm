class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        int arr1Sum = 0; 
        int arr2Sum = 0;
        
        for(int x : arr1){
            arr1Sum += x;
        }
         for(int x : arr2){
            arr2Sum += x;
        }
        
        if(arr1.length < arr2.length){
            answer = -1;
        }else if(arr1.length == arr2.length){
            if(arr1Sum != arr2Sum){
                if(arr1Sum < arr2Sum){
                    answer = -1;
                }else if(arr1Sum > arr2Sum){
                    answer = 1;
                }else{
                    answer = 0;
                }
            }
        }else{
            answer = 1;
        }
        return answer;
    }
}