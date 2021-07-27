class Solution{
    public static int doUnion(int a[], int n, int b[], int m) 
    {
        //Your code here
        HashSet<Integer> h = new HashSet<Integer>();
        for(int i = 0; i < n; i++){
            if(!h.contains(a[i]))
                h.add(a[i]);
        }
        for(int i = 0; i < m; i++){
            if(!h.contains(b[i]))
                h.add(b[i]);
        }
        return h.size();
    }
}
