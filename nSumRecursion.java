class nSumRecursion{
    public static int Sum(int n){
        if(n==1){
            return 1;
        }
        int ans = Sum(n-1);
        return ans + n;
    }
    public static void main(String args[]){
        int n = 5;
        System.out.println("Sum of " + n +" is : "+Sum(n));
    }
}