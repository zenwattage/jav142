/**
    * More comments go here.
    *
    * @param How many values in the array.
    * @param lo The low point in the array
    * @param hi The high point in the array
    * @return A double array with values equally spaced
    */
    public double[] equalSpace(int n, double lo, double hi){
        if(n < 2){
        //throw exception;
        }
        double[] arr = new double[n];
        arr[0] = lo;
        arr[n-1] = hi;
        double inc = (hi - lo) / (double)(n - 1);
        for(int i = 1; i < n - 1;i++){
            arr[i] = lo + (i * inc);
        }
        return arr;
    }