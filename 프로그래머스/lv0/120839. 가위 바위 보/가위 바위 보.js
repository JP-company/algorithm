function solution(rsp) {
    var answer = '';
    let a;
    for (let i of rsp) {
        i = Number(i);
        a = i === 0 ? 5 : i === 2 ? 0 : 2;
        answer += a;
    }
    return answer;
}