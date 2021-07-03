int[] extractEachKth(int[] inputArray, int k) {
    ArrayList<Integer> re = new ArrayList<Integer>();
    for(int i=0;i<inputArray.length;i++){
        if(i+1<k || (i+1>=k && (i+1)%k!=0)){re.add(inputArray[i]);}
    }
    int[] result = new int[re.size()];
    for(int i=0;i<result.length;i++){
        result[i]=re.get(i);
    }
    return result;
}
