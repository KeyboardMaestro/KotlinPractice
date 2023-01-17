package programmers.lv0

class OrderedPair {
    fun solution(n: Int): Int {
        var answer: Int = 0;
        for (i in 1..n)
            if (n % i == 0)
                answer++;
        return answer
    }
} // Resource : https://school.programmers.co.kr/learn/courses/30/lessons/120836