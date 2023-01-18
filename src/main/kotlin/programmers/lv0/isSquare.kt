package programmers.lv0

import kotlin.math.*

class isSquare {
    fun solution(n: Int): Int {
        val root : Double = sqrt(n.toDouble())
        return if(ceil(root) == floor(root))
            1;
        else
            2;
    }
} // Resource : https://school.programmers.co.kr/learn/courses/30/lessons/120909