package programmers.lv0
class Pizza2 {
    fun solution(n: Int): Int {
        var plate : Int = 1;
        while (true){
            if ((plate * 6) % n == 0)
                break;
            else
                plate++;
        }
        return plate;
    }
} // Resource : https://school.programmers.co.kr/learn/courses/30/lessons/120815