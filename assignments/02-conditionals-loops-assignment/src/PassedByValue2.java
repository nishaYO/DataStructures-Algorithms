public class PassedByValue2 {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50};
        change(arr);
        System.out.println(arr[0]);

        /*
        the value of arr is changed because it is an object instance and not a primitive datatype.
        Also, it is mutable so its value can be changed.
         */
    }

    static void change(int arr[]){
        arr[0] = 100;
    }
}
