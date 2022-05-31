fun StudyChallenge2() {
    // 1
    var year: Int = 2

    println("${year} years are equal:")
    println("${toMonths(year)} months")
    println("${toDays(year)} days")
    println("${toHours(year)} hours")
    println("${toMinutes(year)} days")
    println("${toSeconds(year)} days")

    // 2
    var randomString: String = "Random";

    println("This String ${randomString} have ${stringSize(randomString)} characters")

    // 3
    var cube: Int = 4;

    println("This number ${cube} to cube are equal to  ${toCube(cube)}")

    // 4
    var mile: Double = 1.0;

    println("${mile} Miles are equal to ${toKilometers(mile)} Kilometers")

    // 5
    println("This String ${randomString} converted will be ${convertString(randomString)}")

}

fun toMonths(year: Int): Int {
    return year * 12
}

fun toDays(year: Int): Int {
    return year * 365
}

fun toHours(year: Int): Int {
    return toDays(year) * 24
}

fun toMinutes(year: Int): Int {
    return toHours(year) * 60
}

fun toSeconds(year: Int): Int {
    return toMinutes(year) * 60
}

fun stringSize(randomString: String): Int = randomString.length


fun toCube(cube: Int): Int {
    return cube * cube * cube;
}

fun toKilometers(miles: Double): Double {
    return miles * 1.6
}

fun convertString(randomString: String): String {
    return randomString.toLowerCase().replace("a", "x");
}
