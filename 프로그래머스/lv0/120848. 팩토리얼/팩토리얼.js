function solution(n) {
    var max = 1;
    var i = 1;
    while (max <= n) {
        max *= i
        i++
    }

    return i-2;
}