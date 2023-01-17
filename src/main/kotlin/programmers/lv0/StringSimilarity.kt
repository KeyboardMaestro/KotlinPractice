package programmers.lv0

class StringSimilarity {
    fun solution(s1: Array<String>, s2: Array<String>): Int {
        var answer: Int = 0
        for (a in s1)
            for (b in s2)
                if (a.equals(b))
                    answer++;
        return answer
    }
} // Resource : https://school.programmers.co.kr/learn/courses/30/lessons/120903?language=kotlin