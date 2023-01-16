package programmers.lv0

class CharacterDuplicates {
    fun solution(my_string: String, n: Int): String {
        var answer: String = ""
        var temp : List<String> = my_string.split("")
        for (string in temp){
            for (x in 1..n){
                answer += string;
            }
        }
        return answer
    }
} // Resource : https://school.programmers.co.kr/learn/courses/30/lessons/120825