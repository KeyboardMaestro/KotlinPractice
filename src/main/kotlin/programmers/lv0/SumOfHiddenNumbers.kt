package programmers.lv0

class SumOfHiddenNumbers {
    fun solution(my_string: String): Int {
        var answer: Int = 0
        for (a in my_string.toCharArray())
            if (a in '1'..'9')
                answer += a.toString().toInt();
        return answer
    }
} // Resource : https://school.programmers.co.kr/learn/courses/30/lessons/120851