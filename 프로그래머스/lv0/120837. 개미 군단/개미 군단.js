function solution(hp) {
    var answer = 0;
    let i1 = (hp % 5) % 3;
    let i2 = (hp-i1) % 5 / 3;
    let i3 = (hp-i1-i2*3) / 5;
    answer = i1 + i2 + i3;
    return answer;
}