fun main() {
    print("Введите количество лайков: ")
    val likes = readln().toUInt()
    val comparisonNumber = likes % 10U
    if (comparisonNumber == 10U || (comparisonNumber % 10U) != 1U) println("Понравилось $likes людям")
    else println("Понравилось $likes человеку")
}