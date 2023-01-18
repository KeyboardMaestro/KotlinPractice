package programmers.lv0

class StringInString {
    fun solution(str1: String, str2: String): Int {
        if(str1.contains(str2))
            return 1;
        else
            return 2;
    }
}