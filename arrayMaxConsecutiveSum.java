/*Given array of integers, find the maximal possible sum of some of its k consecutive elements.

Example

For inputArray = [2, 3, 5, 1, 6] and k = 2, the output should be
arrayMaxConsecutiveSum(inputArray, k) = 8.
All possible sums of 2 consecutive elements are:

2 + 3 = 5;
3 + 5 = 8;
5 + 1 = 6;
1 + 6 = 7.
Thus, the answer is 8.
*/
int arrayMaxConsecutiveSum(int[] inputArray, int k) {
    int sum = 0;
    for(int i=0;i<inputArray.length-k+1;i++){
        int temp = 0;
        for(int j=0;j<k;j++){
            temp +=inputArray[j+i];
        }
        sum=temp>sum?temp:sum;
    }
    return sum;

}
