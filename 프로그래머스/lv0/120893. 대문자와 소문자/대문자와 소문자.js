function solution(my_string) {
    var answer = '';
    for (let i of my_string) {
        if (i === i.toLowerCase()) {
            i = i.toUpperCase();
        } else {
            i = i.toLowerCase();
        }
        answer += i;
    }
    return answer;
}