function solution(my_string) {
    var answer = '';
    var arr = ['a', 'e', 'i' ,'o' ,'u'];
    for (let i of my_string) {
        if (!arr.includes(i)) {
            answer += i;
        }
    }
    return answer;
}