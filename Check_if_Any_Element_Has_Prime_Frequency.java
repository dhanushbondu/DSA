class Check_if_Any_Element_Has_Prime_Frequency{
	public static void main(String args[]){
        int a[] = {3,0,3,6,3,3};
        System.err.println(checkPrimeFrequency(a));
        
    }
    public static  boolean checkPrimeFrequency(int[] a) {
        HashMap<Integer,Integer> h = new HashMap<>();
        int n = a.length;
        for(int i=0;i<n;i++){
            if(h.containsKey(a[i])){
                h.put(a[i],h.get(a[i])+1);
            }
            else{
                h.put(a[i],1);
            }
        }
        for(Map.Entry<Integer,Integer> map : h.entrySet()){
            if(isPrime(map.getValue()) == true){
                System.out.println(map.getKey()+" "+map.getValue());
                return true;
            }
        }
        return false;
    }
    static boolean isPrime(int n){
        boolean x = true;
        if(n<2){
            return false;
        }
        if( n == 2 || n == 3 || n == 5){
            return true;
        }
        for(int i = 2; i*i <= n; i++){
            if(n%i==0){
                x = false;
                break;
            }
        }
        if(x){
            return true;
        }
        return false;
    }   
}