class Solution {
    
    // code here
    public static int gcd(int a,int b){
    if(b==0) return a;
    return gcd(b,a%b);
}

public static int[] lcmAndGcd(int a, int b) {
    // code here
    int hcf = gcd(a,b);
    int lcm = (a*b)/hcf;
    return new int[]{lcm,hcf};
    
    
}
}