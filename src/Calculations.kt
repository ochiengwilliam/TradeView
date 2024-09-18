class Calculations {

    fun calculations(){

        print("Deposit in Ksh: ")
        val deposit = readln().toDouble()

        val dollarCash: Double = deposit/150

        println("Your total amount in USD is: $dollarCash")

        print("Current Price per Coin in USD: ")
        val pricePerCoin = readln().toDouble()

        val totalCoinsBought = dollarCash/pricePerCoin

        println("The total coins bought: $totalCoinsBought")

        print("Enter your Take Profit: ")
        val takeProfit = readln().toDouble()

        val gainPerCoin = takeProfit - pricePerCoin

        println("The return on capital is : $gainPerCoin")

        val totalProfit = deposit + ((gainPerCoin * (totalCoinsBought) * 150))

        print("The final pay is: $totalProfit")

    }

}
