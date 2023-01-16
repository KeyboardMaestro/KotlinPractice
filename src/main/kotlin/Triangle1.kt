class Triangle1 {
    fun solution(sides: IntArray): Int {
        sides.sort();
        return if (sides[2] < sides[1] + sides[0])
            1;
        else
            2;
    }
} // Resource : https://school.programmers.co.kr/learn/courses/30/lessons/120889