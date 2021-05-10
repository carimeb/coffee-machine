package machine
import java.util.*

fun main() {
    var water = 400
    var milk = 540
    var beans = 120
    var cups = 9
    var money = 550
    var waterUse = 0
    var beansUse = 0
    var milkUse = 0
    var costUse = 0

    var exit = true
    while(exit) {
        println("Write action (buy, fill, take, remaining, exit): ")
        val scanner = Scanner(System.`in`)
        val option = scanner.next()
        when (option) {
            "buy" -> {
                println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ")
                val num = scanner.next()
                when (num) {
                    "1" -> {
                        waterUse = 250; beansUse = 16; milkUse = 0; costUse = 4
                        if (water < waterUse || beans < beansUse || milk < milkUse || cups == 0) {
                            if (water < waterUse) println("Sorry, not enough water!")
                            else if (beans < beansUse) println("Sorry, not enough coffee beans!")
                            else if (milk < milkUse) println("Sorry, not enough milk!")
                            else println("Sorry, not enough cups!")
                        } else {
                            println("I have enough resources, making you a coffee!")
                            water -= waterUse; beans -= beansUse; milk -= milkUse; money += costUse; cups--
                        }
                    }
                    "2" -> {
                        waterUse = 350; beansUse = 20; milkUse = 75; costUse = 7
                        if (water < waterUse || beans < beansUse || milk < milkUse || cups == 0) {
                            if (water < waterUse) println("Sorry, not enough water!")
                            else if (beans < beansUse) println("Sorry, not enough coffee beans!")
                            else if (milk < milkUse) println("Sorry, not enough milk!")
                            else println("Sorry, not enough cups!")
                        } else {
                            println("I have enough resources, making you a coffee!")
                            water -= waterUse; beans -= beansUse; milk -= milkUse; money += costUse; cups--
                        }
                    }
                    "3" -> {
                        waterUse = 200; beansUse = 12; milkUse = 100; costUse = 6
                        if (water < waterUse || beans < beansUse || milk < milkUse || cups == 0) {
                            if (water < waterUse) println("Sorry, not enough water!")
                            else if (beans < beansUse) println("Sorry, not enough coffee beans!")
                            else if (milk < milkUse) println("Sorry, not enough milk!")
                            else println("Sorry, not enough cups!")
                        } else {
                            println("I have enough resources, making you a coffee!")
                            water -= waterUse; beans -= beansUse; milk -= milkUse; money += costUse; cups--
                        }
                    }
                    "back" -> {
                        exit = true
                    }
                }
            }
            "fill" -> {
                println("Write how many ml of water do you want to add:")
                val waterFill = scanner.nextInt()
                println("Write how many ml of milk do you want to add:")
                val milkFill = scanner.nextInt()
                println("Write how many grams of coffee beans do you want to add:")
                val beansFill = scanner.nextInt()
                println("Write how many disposable cups of coffee do you want to add:")
                val cupsFill = scanner.nextInt()
                water += waterFill; beans += beansFill; milk += milkFill; cups += cupsFill
            }
            "take" -> {
                println("I gave you \$$money")
                money = 0
            }
            "remaining" -> {
                println("The coffee machine has:\n" +
                        "$water of water\n" +
                        "$milk of milk\n" +
                        "$beans of coffee beans\n" +
                        "$cups of disposable cups\n" +
                        "\$$money of money")
            }
            "exit" -> {
                exit = false
            }
        }
    }
}
