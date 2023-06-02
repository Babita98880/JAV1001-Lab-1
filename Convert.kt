

/*Convert.kt
 Write a small Kotlin command line application (Convert.kt) that allows a user to convert between different forms of measurement. The program should:
1. Collect a numeric value from the user and store it in an appropriate variable
2. Collect the current unit of measurement.
3. Determine the appropriate conversion (in either direction, i.e., the user can enter km or mi)
4. Display the new result */

fun main()
    {
        println("---------LAB 1 : Program to Convert -----------\n\n\n")
        print("Please enter the value you want to convert: ")
        var inputValue = readLine()!!.toDouble()
        print("Please enter the current unit of measurement: ")
        var currentUnit = readLine()
        print("Please enter the unit to which you want the converted value: ")
        var targetUnit = readLine()
        var result : Double = 0.0
        currentUnit = currentUnit!!.lowercase()
        targetUnit = targetUnit!!.lowercase()
        when(currentUnit)
            {
                "km" -> when(targetUnit)
                    {
                    "mi" -> result = inputValue * 0.621371
                    "cm" -> result = inputValue * 100000
                    }

                "mi" -> when(targetUnit)       
                    {
                        "km" -> result = inputValue * 1.60934
                         "cm" -> result = inputValue * 160934
                         "in" -> result = inputValue * 63360
                    }

                "cm" -> when (targetUnit) 
                   {
                        "km" -> result = inputValue / 100000
                        "mi" -> result = inputValue / 160934
                        "in" -> result = inputValue * 0.393701
                    }
       
                "in" -> when (targetUnit) 
                   {
                       "km" -> result = inputValue / 39370.1
                        "mi" -> result = inputValue / 63360
                        "cm" -> result = inputValue / 0.393701
                   }

                "kg" -> when (targetUnit) 
                   {
                       "lb" -> result = inputValue * 2.2
                   }
                
                "f" -> when(targetUnit)
                    {
                        "c" -> result = ((inputValue-32)*5)/9
                    }
                "c" -> when(targetUnit)
                    {
                        "f" -> result = (inputValue*9/5)+32
                    }
        }
        if (result == 0.0 ) {
            println("Conversion not exist.")
        } else{
            println("The converted Value is $result")
        }
    }
