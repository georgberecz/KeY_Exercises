
public class ForallExists {

    /*@ spec_public @*/ int[] b;
    /*@ spec_public @*/ int j,k,n;
	

    // Question 1a 
    // All elements in b[j..k] are zero.
    //@ public invariant (*TO DO...*)

    // Question 1b:
    // b[0..n-1] contains at least two zeros.

    //@ public invariant (*TO DO...*)


    // Question 1c:
    // b[0..n-1] contains at most two zeros.

    /*@ public invariant (*TO DO...*)
      @*/


    // Question 1d:
    // Reverse the order of elements in a.

    /*@ public normal_behavior
      @ ensures (* TO DO *)
      @*/
    public static void reverse(int[] a) {
	// ...
    }
    
    
	// Question 1e
	// All zeros of b[0..n-1] are in b[j..k].
	//@ public invariant (* TO DO *)
	

	// Question 1f
	// It is not the case that all zeros of b[0..n-1] are in b[j..k]	
	//@ public invariant  (* TO DO *)
    


}
