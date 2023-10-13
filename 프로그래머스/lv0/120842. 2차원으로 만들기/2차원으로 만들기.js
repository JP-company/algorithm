function solution(num_list, n) {
    var answer = [[]];
    for (var i=0;i<num_list.length/n;i++) {
        answer[i] = [];
        for (var j=i*n;j<i*n+n;j++) {
            answer[i].push(num_list[j]);
        }
    }
    return answer;
}