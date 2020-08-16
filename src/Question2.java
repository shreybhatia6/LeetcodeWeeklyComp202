public class Question2 {
    public int minOperations(int n) {
        int count = 0;
        int temp = 0;
        int minus = 1;
        if (n == 0)
            return 0;

        if (n % 2 == 1){
            temp = 1 + (2*(n/2));
            for (int i = 0; i < n/2; i++){
                count += (temp - minus);
                minus+=2;
            }
            return count;
        }
        else {
            temp = (2*(n/2));
            for (int i = 0; i < n/2; i++){
                count += (temp - minus);
                minus+=2;
            }

        }
        return count;


    }
}

