fun main() {
    val celsius = 27.0
    val kelvin = 350.0
    val fahrenheit = 10.0
    
    val celsiusToFahrenheit: (Double) -> Double = { it * 9 / 5 + 32 }
    val kelvinToCelsius: (Double) -> Double = { it - 273.15 }
    val fahrenheitToKelvin: (Double) -> Double = { (it - 32) * 5 / 9 + 273.15 }
    
    printFinalTemperature(celsius, "Celsius", "Fahrenheit", celsiusToFahrenheit)
    printFinalTemperature(kelvin, "Kelvin", "Celsius", kelvinToCelsius)
    printFinalTemperature(fahrenheit, "Fahrenheit", "Kelvin", fahrenheitToKelvin)
}

fun printFinalTemperature(
    initialMeasurement: Double,
    initialUnit: String,
    finalUnit: String,
    conversionFormula: (Double) -> Double
) {
    val finalMeasurement = String.format("%.2f", conversionFormula(initialMeasurement)) // two decimal places
    println("$initialMeasurement degrees $initialUnit is $finalMeasurement degrees $finalUnit.")
}