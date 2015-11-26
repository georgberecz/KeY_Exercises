
class Problems {

    /*@ public normal_behavior
      @   requires 0<=len && len <= a.length;
      @   ensures \result <==> (\exists int i; 0<=i && i<len; a[i] == v);
      @   assignable \strictly_nothing;
      @*/
    static boolean contains(int a[], int len, int v) {
        /*@ loop_invariant 0<=i && i<=len &&
          @    (\forall int j; 0<=j && j<i; a[j] != v);
          @ decreases len-i;
          @ assignable \strictly_nothing;
          @*/
        for(int i = 0; i < len; i++) {
            if(a[i] == v) {
                return true;
            }
        }
        return false;
    }


    // PRE- AND POSTCONDITIONS
    static int[] arrayPart(int[] a, int length) {
        int[] result = new int[length];


        // LOOP INVARIANT
        for(int i = 0; i < length; i++) {
            result[i] = a[i];
        }
        return result;
    }

}
