package programmers.lv0
class BiggestValue {
    fun solution(numbers: IntArray): Int {
        numbers.sort()
        return numbers[numbers.lastIndex] * numbers[numbers.lastIndex-1];
    }
} // Resource : https://school.programmers.co.kr/learn/courses/30/lessons/120847