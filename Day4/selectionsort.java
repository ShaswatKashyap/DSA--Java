public class selectionsort {
    public static void SelectionSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[j] < arr[minPos]) {
                    minPos = j;
                }
                // swap
                

            }
            int temp = arr[minPos];
                arr[minPos] = arr[i];
                arr[i] = temp;

        }

    }

    public static void PrintArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int number[] = { 5, 4, 1, 3, 2 };
        SelectionSort(number);
        PrintArray(number);
    }
}
