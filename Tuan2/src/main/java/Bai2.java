public class Bai2 {
    public static void changeArr (int[] arr) {
        for (int i = 1; i < arr.length - 1; i++) {
            if (i % 2 != 0) {
                arr[i] += (arr[i + 1] - arr[i - 1]);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        if(n % 2 == 0) {
            arr[n-1] += arr[n-2];
            changeArr(arr);
        }
        else {
            changeArr(arr);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
