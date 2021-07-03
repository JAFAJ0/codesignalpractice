/*Given array of integers, remove each kth element from it.

Example

For inputArray = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10] and k = 3, the output should be
extractEachKth(inputArray, k) = [1, 2, 4, 5, 7, 8, 10].*/

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
