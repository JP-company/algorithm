function solution(num_list) {
    var answer = 0;
    answer = num_list.indexOf(num_list.find(x => x<0));
    return answer;
}