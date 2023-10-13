function solution(numbers, direction) {
    var answer = [];
    if (direction === "right") {
        let j = numbers[numbers.length-1]
        for (let i=numbers.length-1;i>0;i--) {
            numbers[i] = numbers[i-1];
        }
        numbers[0] = j;
    } else {
        let j = numbers[0]
        for (let i=0;i<numbers.length-1;i++) {
            numbers[i] = numbers[i+1];
        }
        numbers[numbers.length-1] = j;
    }
    return numbers;
}