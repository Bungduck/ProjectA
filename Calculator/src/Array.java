public class Array {

    Array(){
        int[] arr1 = {1, 2, 3};

        int[] arr2 = new int[3];
        for(int i = 0; i < arr2.length; ++i) arr2[i] = i + 1;

        System.out.println(arr1[0] + arr1[1] + arr1[2]);
        System.out.println(arr2[0] + arr2[1] + arr2[2]);

    }
}
