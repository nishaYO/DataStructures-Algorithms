public class ReverseArray {
    public static void main(String[] args) {
        int[] evenarr = {1,2,3,4,5, 6};

        reverse(evenarr);
        System.out.print("Printing even array: ");
        for (int i = 0; i < evenarr.length; i++) {
            System.out.print(evenarr[i] + " ");
        }
        System.out.println();
        int[] oddarr = {24,6,53,65,87,230};
        reverse(oddarr);
        System.out.print("Printing odd array: ");
        for (int i = 0; i < oddarr.length; i++) {
            System.out.print(oddarr[i] + " ");
        }
        System.out.println();
    }

    static int[] reverse(int[] arr){
        int s = 0;
        int e = arr.length -1;
        while(s<e) {
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
        return arr;
    }
}

