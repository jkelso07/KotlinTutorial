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

operator fun MyDate.rangeTo(other: MyDate): DateRange {
    return DateRange(this, other)
}

operator fun MyDate.plus(timeInterval: TimeInterval) {
    if(timeInterval == TimeInterval.YEAR){
        this.nextYear()
    }else if(timeInterval == TimeInterval.WEEK){
        this.nextWeek()
    }else{
        this.nextDay()
    }
}

operator fun MyDate.plus(repeatedTimeInterval: RepeatedTimeInterval) {

}

class RepeatedTimeInterval(val timeInterval: TimeInterval, val numOfIntervals: Int)

enum class TimeInterval {
    DAY,
    WEEK,
    YEAR
}

fun TimeInterval.times(times: Int){

}

class DateRange(val start: MyDate, val endInclusive: MyDate): Iterable<MyDate> {
    override fun iterator(): Iterator<MyDate> {
        return DateRangeIterator(this)
    }
}

operator fun DateRange.contains(date: MyDate): Boolean {
    return if(date>this.start && date<=this.endInclusive) true else false
}

class DateRangeIterator(val dateRange: DateRange) : Iterator<MyDate> {
    val currentDate: MyDate = dateRange.start
    override fun hasNext(): Boolean {
        return currentDate <= dateRange.endInclusive
    }
    override fun next(): MyDate {
        currentDate == currentDate.nextDay()
        return currentDate
    }
}
