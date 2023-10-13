function solution(arr, k) {
    var answer = [];
    if (k % 2 === 0) {
        answer = arr.map(x => x+k);
    } else {
        answer = arr.map(x => x*k);
    }
    return answer;
}