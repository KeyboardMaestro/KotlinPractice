package programmers.lv0

class DiscountClothes {
    fun solution(price: Int): Int {
        var answer: Int = price
        when(price){
            in 100000 ..299999 -> answer = (price.toDouble() * 0.95).toInt()
            in 300000 .. 499999-> answer = (price.toDouble() * 0.9).toInt()
            in 500000 .. 1000000 -> answer = (price.toDouble() * 0.8).toInt()
        }
        return answer
    }
} // Resource : https://school.programmers.co.kr/learn/courses/30/lessons/120818