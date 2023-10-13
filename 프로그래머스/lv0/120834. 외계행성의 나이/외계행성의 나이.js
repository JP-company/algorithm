function solution(age) {
    var answer = '';
    let str = age.toString();
    for (let i=0; i<str.length;i++) {
        answer += String.fromCharCode(str.charCodeAt(i)+49);
    }
    return answer;
}