import java.util.Arrays;
public class SortArray {
    int[] arry = {20, 45, 1000, 51, 1, 19};
    public String toString(){
        String info="";
        for (int index=0;index < arry.length; index++) {
            info += "["+index+","+arry[index]+"] ";
        }
        return info;
    }
    public static void main(String[] args) {
        SortArray sortArray = new SortArray();
        Arrays.sort(sortArray.arry);
        System.out.println("Array: " + sortArray);
        for (int i = 0; i < sortArray.arry.length; i++) {
            if (sortArray.arry[i] % 2 == 0)
                System.out.println(sortArray.arry[i]);
        }
    }
}
