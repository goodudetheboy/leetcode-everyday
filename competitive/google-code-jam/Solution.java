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
        
        int[] nextIntArray(int size) {
            int[] nextArr = new int[size];
            for (int i=0;i<size;i++) {
                nextArr[i] = nextInt();
            }
            return nextArr;
        }
    }

    //---------------------------CODE STARTS HERE-------------------------------//
    public static void main (String[] args) throws java.lang.Exception { 
        FastReader sc = new FastReader(); 

		final int cases;
		cases = sc.nextInt();
			  
		Solver solver = new Solver();
		for (int i = 0; i < cases; i++) {
            // arg1 = sc.nextInt();
            // arg2 = sc.nextIntArray()
            // ...
			solver.solve(sc.nextLine(), i); // solver.solve(arg1, arg2..., i)
		}
		System.out.println(output);
    } 
} 

class Solver {
    
	public void solve(String input, int caseNo) { // solve(arg1, arg2..., caseNo)
	    
	    // Add to output by "Cases #[case]"
	    Solution.output.concat("Cases #" + (case+1));
	}

}