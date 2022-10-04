import java.util.Arrays;

class chocolatedistribution {
    public static void main(String[] args) {
        int[] arr ={3, 4, 1, 9, 56, 7, 9, 12};
        int m = 5;
                // 1 3 4 7 9 9 12 56
                // 8,6,8,49

                //12 4 7 9 2 23 25 41 30 40 28 42 30 44 48 43 50
                // 2 4 7 9 12 23 25 28 30 30 40 41 42 43 44 48 50
               // 23 24 23 21 28 22 17 25 14 18 10  

        Arrays.sort(arr); 
        int ans = Integer.MAX_VALUE;

        for(int i = 0; i<=arr.length-m;i++){ // i = 0, i<=3 
            // 0 1 2 
            int min = arr[i]; // 1 
            int max = arr[i+m-1]; // arr[0+5-1]= 4=9
            int gap = max - min; // 9-1
            int Min2 = Math.min(ans,gap); //---,8 
            ans = Min2; // 0000 + 8;
        }
        
              
        System.out.println(ans);
    }
}