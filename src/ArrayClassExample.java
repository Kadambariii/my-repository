
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayClassExample {

public static void main(String[] args) {

int arr[]= {156,77,13,99,2,9,11};

int arr1[]= {156,77,13,99,2,9,11};

 List<int>"list="Array.asList(arr);

System.out.println(list);

//compare

System.out.println("Result="+Array.compare(arr,arr1));

//binary search

System.out.println(Arrays.binarySearch

(arr, 5));

//sort method

Array.sort(arr);

for(int i=0;i<arr.length;i++)

{ System.out.print(arr[i]+" ");

}
}
}