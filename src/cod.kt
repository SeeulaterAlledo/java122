import kotlin.math.pow
// 1. Функция для нахождения максимума
fun findMax(a: Int, b: Int): Int {
    if (a == b) throw IllegalArgumentException("Числа равны")
    return if (a > b) a else b
}

// 2. Калькулятор деления
fun divide(a: Int, b: Int): Double {
    if (b == 0) throw ArithmeticException("Деление на ноль недопустимо")
    return a.toDouble() / b
}

// 3. Конвертер строк в числа
fun stringToInt(input: String): Int {
    return input.toIntOrNull() ?: throw NumberFormatException("Некорректный формат строки")
}

// 4. Проверка возраста
fun checkAge(age: Int) {
    if (age < 0 || age > 150) throw IllegalArgumentException("Возраст должен быть в диапазоне от 0 до 150")
}

// 5. Нахождение корня
fun squareRoot(number: Double): Double {
    if (number < 0) throw IllegalArgumentException("Корень из отрицательного числа невозможен")
    return kotlin.math.sqrt(number)
}

// 6. Факториал
fun factorial(n: Int): Int {
    if (n < 0) throw IllegalArgumentException("Число не должно быть отрицательным")
    return if (n == 0) 1 else n * factorial(n - 1)
}

// 7. Проверка массива на нули
fun checkArrayForZeros(array: IntArray) {
    if (array.contains(0)) throw IllegalArgumentException("Массив содержит нули")
}

// 8. Калькулятор возведения в степень
fun power(base: Double, exponent: Int): Double {
    if (exponent < 0) throw IllegalArgumentException("Степень не должна быть отрицательной")
    return base.pow(exponent)
}

// 9. Обрезка строки
fun truncateString(input: String, length: Int): String {
    if (length > input.length) throw IllegalArgumentException("Длина обрезки превышает длину строки")
    return input.substring(0, length)
}

// 10. Поиск элемента в массиве
fun findElement(array: IntArray, element: Int): Int {
    val index = array.indexOf(element)
    if (index == -1) throw NoSuchElementException("Элемент не найден")
    return index
}

// 11. Конвертация в двоичную систему
fun toBinary(number: Int): String {
    if (number < 0) throw IllegalArgumentException("Число не должно быть отрицательным")
    return number.toString(2)
}

// 12. Проверка делимости
fun isDivisible(a: Int, b: Int): Boolean {
    if (b == 0) throw ArithmeticException("Деление на ноль недопустимо")
    return a % b == 0
}

// 13. Чтение элемента списка
fun getElement(list: List<Int>, index: Int): Int {
    return list.getOrElse(index) { throw IndexOutOfBoundsException("Индекс вне диапазона списка") }
}

// 14. Парольная проверка
fun checkPassword(password: String) {
    if (password.length < 8) throw IllegalArgumentException("Слабый пароль: длина менее 8 символов")
}

// 15. Проверка даты
fun checkDate(date: String) {
    try {
        java.time.LocalDate.parse(date, java.time.format.DateTimeFormatter.ofPattern("dd.MM.yyyy"))
    } catch (e: Exception) {
        throw java.time.format.DateTimeParseException("Неверный формат даты", date, 0)
    }
}

// 16. Конкатенация строк
fun concatenateStrings(a: String?, b: String?): String {
    return (a ?: throw NullPointerException("Первая строка null")) +
            (b ?: throw NullPointerException("Вторая строка null"))
}

// 17. Остаток от деления
fun modulo(a: Int, b: Int): Int {
    if (b == 0) throw ArithmeticException("Деление на ноль недопустимо")
    return a % b
}

// 18. Квадратный корень
fun findSquareRoot(number: Double): Double {
    if (number < 0) throw IllegalArgumentException("Квадратный корень от отрицательного числа невозможен")
    return kotlin.math.sqrt(number)
}

// 19. Конвертер температуры
fun celsiusToFahrenheit(celsius: Double): Double {
    if (celsius < -273.15) throw IllegalArgumentException("Температура ниже абсолютного нуля невозможна")
    return celsius * 9 / 5 + 32
}

// 20. Проверка строки на пустоту
fun checkString(input: String?) {
    if (input.isNullOrEmpty()) throw IllegalArgumentException("Строка пустая или равна null")
}
