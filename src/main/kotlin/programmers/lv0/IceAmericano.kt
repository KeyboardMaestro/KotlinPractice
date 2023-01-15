package programmers.lv0

class Solution {
    fun solution(money: Int): IntArray {
        var answer: IntArray = intArrayOf(cups(money), changes(money))
        return answer
    }

    fun cups (money: Int) : Int {
        return money / 5500;
    }

    fun changes (money: Int) : Int{
        val price = cups(money) * 5500;
        return money - price;
    }
}
// Resource : https://school.programmers.co.kr/learn/courses/30/lessons/120819?language=kotlin