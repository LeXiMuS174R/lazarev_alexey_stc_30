public class HomeWork2 {
    public static void main(String[] args) {
        int index = BinarySearch(new int[]{0, 4, 17, 29, 47, 51, 68, 83, 92, 99}, 0, 10, 68);
        System.out.println("Element is in cell " + index);
    }

    public static int BinarySearch(int arr[], int firstElement, int lastElement, int elementToSearch) {

        if (lastElement >= firstElement) {
            int mid = firstElement + (lastElement - firstElement) / 2;

            if (arr[mid] == elementToSearch)
                return mid;

            if (arr[mid] > elementToSearch)
                return BinarySearch(arr, firstElement, mid - 1, elementToSearch);

            return BinarySearch(arr, mid + 1, lastElement, elementToSearch);
        }
        return -1;
    }
}