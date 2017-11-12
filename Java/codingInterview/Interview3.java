class Interview3 {
    public static void printOdd(int[] array) {
        int i = 0;
        while(i < array.length) {
            while(array[i]%2 != 0 && i < array.length) {
                System.out.println(array[i]);                
                i++;
            }
            i++;
        }
    }

    public static void main(String[] args) {
        int[] array = {-2,4,6,0,-7,8,7,2};
        printOdd(array);
    }
}