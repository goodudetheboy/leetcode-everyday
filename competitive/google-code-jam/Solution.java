/*
 * No package must be added here because some Online Judges don't support it
 * please remove, if any.
 * 
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.*; 
import java.lang.*; 
import java.io.*; 
 
public class Solution { 

	public static String output = "";
    static class FastReader {  
        BufferedReader br;  
        StringTokenizer st;  
   
        public FastReader() {  
            br = new BufferedReader(new 
                     InputStreamReader(System.in));  
        }  
   
        String next()  {  
            while (st == null || !st.hasMoreElements()){  
                try {  
                    st = new StringTokenizer(br.readLine());  
                }  
                catch (IOException  e) {  
                    e.printStackTrace();  
                }  
            }  
            return st.nextToken();  
        }  
   
        int nextInt() {  
            return Integer.parseInt(next());  
        }  
   
        long nextLong() {  
            return Long.parseLong(next());  
        }  
   
        double nextDouble() {  
            return Double.parseDouble(next());  
        }  
   
        String nextLine() {  
            String str = "";  
            try {  
                str = br.readLine();  
            } catch (IOException e) {  
                e.printStackTrace();  
            }  
            return str;  
        }  
    }  
    static int MOD=1000000000+7; 
     
    //Brian Kernighan’s Algorithm 
    static long countSetBits(long n){ 
        if(n==0) return 0; 
        return 1+countSetBits(n&(n-1)); 
    } 
    //Factorial 
    static long factorial(long n) { 
        if(n==1) return 1; 
        if(n==2) return 2; 
        if(n==3) return 6; 
        return n*factorial(n-1); 
    } 
    //Euclidean Algorithm 
    static long gcd(long A,long B) { 
        if(B==0) return A; 
        return gcd(B,A%B); 
    } 
    //Modular Exponentiation 
    static long fastExpo(long x,long n) { 
        if(n==0) return 1; 
        if((n&1)==0) return fastExpo((x*x)%MOD,n/2); 
        return ((x%MOD)*fastExpo((x*x)%MOD,(n-1)/2)); 
    } 
    //AKS Algorithm 
    static boolean isPrime(long n) { 
        if(n<=1) return false; 
        if(n<=3) return true; 
        if(n%2==0 || n%3==0) return false; 
        for(int i=5;i*i<=n;i+=6) 
            if(n%i==0 || n%(i+2)==0) return false; 
        return true; 
    } 
    //Sieve of eratosthenes 
    static int[] findPrimes(int n) { 
        boolean isPrime[]=new boolean[n+1]; 
        ArrayList<Integer> a=new ArrayList<>(); 
        int result[]; 
        Arrays.fill(isPrime,true); 
        isPrime[0]=false; 
        isPrime[1]=false; 
        for(int i=2;i*i<=n;++i){ 
            if(isPrime[i]==true){ 
                for(int j=i*i;j<=n;j+=i) isPrime[j]=false; 
            } 
        } 
        for(int i=0;i<=n;i++) if(isPrime[i]==true) a.add(i); 
        result=new int[a.size()]; 
        for(int i=0;i<a.size();i++) result[i]=a.get(i); 
        return result; 
         
    } 
    //Euler Totent function 
    static long countCoprimes(long n) { 
        ArrayList<Long> prime_factors=new ArrayList<>(); 
        long x=n,flag=0; 
        while(x%2==0){ 
            if(flag==0) prime_factors.add(2L); 
            flag=1; 
            x/=2; 
        } 
        for(long i=3;i*i<=x;i+=2) { 
            flag=0; 
            while(x%i==0){ 
                if(flag==0) prime_factors.add(i); 
                flag=1; 
                x/=i; 
            } 
        } 
        if(x>2) prime_factors.add(x); 
        double ans=(double)n; 
        for(Long p:prime_factors){ 
            ans*=(1.0-(Double)1.0/p); 
        } 
        return (long)ans; 
    } 

    String output = "";

    //---------------------------CODE STARTS HERE-------------------------------//
    public static void main (String[] args) throws java.lang.Exception { 
        FastReader sc = new FastReader(); 

		final int cases;
		try {
			cases = sc.nextInt();
			  
			Solver solver = new Solver();
			for (int i = 0; i < cases; i++) {
                // args1 = ...
                // args2 = ...
                // ...
				solver.solve(br.readLine()/** arg1, arg2... */);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(output);
    } 
} 

class Solver {
    
	public void solve(String input /**arg1, arg2... */) {
	    
		Solution.output.concat(input);	
	}

}


