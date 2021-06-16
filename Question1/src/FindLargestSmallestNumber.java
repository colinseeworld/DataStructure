public class FindLargestSmallestNumber {
    public static void main(String[] args) {
        int[] array = new int[]{1,7,2,8,4,10};

        int largestElement = Integer.MIN_VALUE;
        int smallestElement = Integer.MAX_VALUE;

        for(int i: array){
            if(i > largestElement){
                largestElement = i;
            }else if(i < smallestElement){
                smallestElement = i;
            }
        }
        System.out.println("The largest element of an array is: " + largestElement);
        System.out.println("The smallest element of an array is: " + smallestElement);
    }
}
