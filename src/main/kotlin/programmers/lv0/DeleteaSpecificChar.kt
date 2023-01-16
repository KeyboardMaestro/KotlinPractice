package programmers.lv0

class DeleteaSpecificChar {
    fun solution(my_string: String, letter: String): String {
        return my_string.replace(letter,"");
    }
    fun solution2(my_string: String, letter: String): String {
        return my_string.filterNot { it == letter[0]}
    } // Better Time complexity
} // Resource : https://school.programmers.co.kr/learn/courses/30/lessons/120826