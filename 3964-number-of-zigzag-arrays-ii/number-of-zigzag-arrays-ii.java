class Solution {

    static final long MOD = 1000000007;


    public int zigZagArrays(int n, int l, int r) {

        int m = r - l + 1;
        int size = 2 * m;
        long[][] mat = new long[size][size];

        for(int cur = 0; cur < m; cur++){

            for(int prev = 0; prev < m; prev++){

                if(prev < cur){
                    mat[cur*2][prev*2+1] = 1;
                }
                if(prev > cur){
                    mat[cur*2+1][prev*2] = 1;
                }
            }
        }


        long[] initial = new long[size];

        for(int i = 0; i < m; i++){
            initial[i*2] = 1;
            initial[i*2+1] = 1;
        }

        long[] result = power(mat, n-1, initial);
        long ans = 0;

        for(long x : result){
            ans = (ans + x) % MOD;
        }
        return (int)ans;
    }



    private long[] power(long[][] mat, long exp, long[] vec){
        int n = vec.length;

        while(exp > 0){
            if((exp & 1) == 1){
                vec = multiply(mat, vec);
            }
            mat = multiply(mat, mat);
            exp >>= 1;
        }
        return vec;
    }

    private long[] multiply(long[][] mat, long[] vec){
        int n = vec.length;
        long[] res = new long[n];

        for(int i = 0; i < n; i++){
            long sum = 0;

            for(int j = 0; j < n; j++){
                sum += mat[i][j] * vec[j];
                sum %= MOD;
            }
            res[i] = sum;
        }
        return res;
    }



    private long[][] multiply(long[][] a, long[][] b){
        int n = a.length;
        long[][] res = new long[n][n];

        for(int i=0;i<n;i++){
            for(int k=0;k<n;k++){
                if(a[i][k]==0) continue;
                for(int j=0;j<n;j++){
                    res[i][j] =
                    (res[i][j] + a[i][k]*b[k][j])%MOD;
                }
            }
        }
        return res;
    }
}