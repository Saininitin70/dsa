// Purpose: Binary Search Algorithm

class binarySearch {
    public void binarySearch(int[] arr, int Key, int first, int last) {
        int mid =(first + last)/2;
        while(first <= last) {
            if(arr[mid] < Key) {
                first = mid + 1;
            } else if(arr[mid] == Key) {
                System.out.println(Key + " found at location " + mid + ".");
                break;
            } else {
                last = mid - 1;
            }
            mid = (first + last)/2;
        }
        if(first > last) {
            System.out.println(Key + " is not found.");
        }
    }
    public static void main(String[] args) {
        int arr[] = {0,10, 20, 30, 40, 50};
        int Key = 30;
        int last = arr.length - 1;
        binarySearch bs = new binarySearch();
        bs.binarySearch(arr, Key, 0, last);
    }
}