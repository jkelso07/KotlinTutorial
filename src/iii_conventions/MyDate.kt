package iii_conventions

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int): Comparable<MyDate> {
    override fun compareTo(other: MyDate): Int {
        if(year > other.year ||
                (year == other.year && (month > other.month ||
                        (month == other.month && dayOfMonth > other.dayOfMonth)))) {
            return 1
        }else if(year == other.year && month == other.month && dayOfMonth == other.dayOfMonth){
            return 0
        }
        return -1
    }
}

operator fun DateRange.contains(date: MyDate): Boolean {
    return if(date>this.start && date<=this.endInclusive) true else false
}

operator fun MyDate.rangeTo(other: MyDate): DateRange = todoTask27()

enum class TimeInterval {
    DAY,
    WEEK,
    YEAR
}

class DateRange(val start: MyDate, val endInclusive: MyDate)
