public class MinInArray {
    public static void main(String[] args) {
        //tìm giá trị nhỏ nhất trong mảng sử dụng method.
    int[] array = {11,2,3,4,5,6,7,8,9,1,10};
    int min = minValue(array);
        System.out.println(min);

    }
    public static int minValue(int[] array){
        int min = array[0];
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if(min > array[i]){
                index = i;
            }
        }
        return index;
    }
}
