package programmers.lv0

class IceAmericano {
    fun solution(money: Int): IntArray {
        return intArrayOf(lambdaCups(money,{money / 5500}), changes(money))
    }

    fun cups (money: Int) : Int {
        return money / 5500;
    }

    fun changes (money: Int) : Int{
        val price = cups(money) * 5500;
        return money - price;
    }

    fun lambdaCups (money: Int ,cal : (Int) -> Int) : Int{
        return cal(money);
    }
}
// Resource : https://school.programmers.co.kr/learn/courses/30/lessons/120819?language=kotlin