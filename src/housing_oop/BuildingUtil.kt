package housing_oop

object BuildingUtil {
    private const val standardFee: Double = 1_000.0
    private const val deluxeFee: Double = 2_100.0

    fun costOfStandardRate(months: Int) = if (months > 0) standardFee * months else 0.0
    fun costOfDeluxeRate(months: Int) = if (months > 0) deluxeFee * months else 0.0
}