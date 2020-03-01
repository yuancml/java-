package com.API.Date;

public class Maosort {
    /*
    冒泡排序
     */
//    public void maoPao(int[] arr){
//        for(int i = 0; i < arr.length-1;i++){
//            for(int j = 0; j < arr.length-1-i;j++){
//                if(arr[j] > arr[j+1]){
//                    int temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                }
//            }
//            System.out.println("返回的新数组为" + Arrays.toString(arr));
//        }
//    }
//}
//class TestMao {
//    public static void main(String[] args) {
//        int[] arr2 = {45, 25, 34, 89, 23};
//        Maosort ms = new Maosort();
//        ms.maoPao(arr2);
//    }
    /*
    二分查找
     */
    public static int halfSearch(int[] arr ,int number){
        int min = 0;
        int max = arr.length-1;
        int mid = (min + max)/2;
        while (arr[mid] != number){
            if(arr[min] > number){
                max = mid - 1;
            }else{
                min = mid + 1;
            }
            if(max - min < 0){
                return -1;
            }
            mid = (min + max)/2;
        }
        return mid;
    }
static class TestHalf{
        public static void main(String[] args){
            int[] arr3 = {45, 25, 34, 89, 23};
            int number1 = 40;
            Maosort ms = new Maosort();
            int mid = ms.halfSearch(arr3, number1);
            System.out.println("返回的mid = " + mid);
        }
}

}

