
class ReverseArray {
    public void reverseArray(int arr[]) {

        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i]; // half two will remove
            arr[arr.length - 1 - i] = temp; // swap the other half with the first half element.
        }
        // code here
    }

    // Test the solution
    public static void main(String[] args) {
        ReverseArray solution = new ReverseArray();
        int[] arr = { 1, 2, 3, 4, 5 };
        solution.reverseArray(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

}