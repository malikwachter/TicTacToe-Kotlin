import java.awt.Point

fun main() {

    println("Welcome to TicTacToe\nGamemode:\n  1) Singleplayer\n  2) Multiplayer\n")
    val menuInput = readlnOrNull()

    if(menuInput != null) {
        if (menuInput.toInt() == 1)
            singleplayer()
        else if (menuInput.toInt() == 2)
            multiplayer()
    } else
        println("ERR: Input was NULL")

}

fun singleplayer() {
    println("Soon")
}

fun multiplayer() {
    var again = true
    var playerOneCounter = 0
    var playerTwoCounter = 0
    var playerInput: String?
    var playerFieldTemp = Point(-1,-1)
    var playerOneField1 = Point(-1,-1)
    var playerOneField2 = Point(-1,-1)
    var playerOneField3 = Point(-1,-1)
    var playerOneField4 = Point(-1,-1)
    var playerOneField5 = Point(-1,-1)
    var playerTwoField1 = Point(-1,-1)
    var playerTwoField2 = Point(-1,-1)
    var playerTwoField3 = Point(-1,-1)
    var playerTwoField4 = Point(-1,-1)
    val gameField1 = Point(1, 1)
    val gameField2 = Point(3, 1)
    val gameField3 = Point(5, 1)
    val gameField4 = Point(1, 3)
    val gameField5 = Point(3, 3)
    val gameField6 = Point(5, 3)
    val gameField7 = Point(1, 5)
    val gameField8 = Point(3, 5)
    val gameField9 = Point(5, 5)

    while(again){
        gameField(gameField1, gameField2, gameField3, gameField4, gameField5, gameField6, gameField7, gameField8, gameField9, playerOneField1, playerOneField2, playerOneField3, playerOneField4, playerOneField5, playerTwoField1, playerTwoField2, playerTwoField3, playerTwoField4)
        println("Player 1: Choose your field:")
        playerInput = readlnOrNull()

        if(playerInput != null) {
            when(playerInput.toInt()){
                1 -> playerFieldTemp = Point(gameField1)
                2 -> playerFieldTemp = Point(gameField2)
                3 -> playerFieldTemp = Point(gameField3)
                4 -> playerFieldTemp = Point(gameField4)
                5 -> playerFieldTemp = Point(gameField5)
                6 -> playerFieldTemp = Point(gameField6)
                7 -> playerFieldTemp = Point(gameField7)
                8 -> playerFieldTemp = Point(gameField8)
                9 -> playerFieldTemp = Point(gameField9)
            }
            when(playerOneCounter){
                0 -> playerOneField1 = Point(playerFieldTemp)
                1 -> playerOneField2 = Point(playerFieldTemp)
                2 -> playerOneField3 = Point(playerFieldTemp)
                3 -> playerOneField4 = Point(playerFieldTemp)
                4 -> playerOneField5 = Point(playerFieldTemp)
                else -> {
                    println("ERR: To many moves.")
                }
            }
            playerOneCounter++
        } else
            println("ERR: Input was NULL")

        gameField(gameField1, gameField2, gameField3, gameField4, gameField5, gameField6, gameField7, gameField8, gameField9, playerOneField1, playerOneField2, playerOneField3, playerOneField4, playerOneField5, playerTwoField1, playerTwoField2, playerTwoField3, playerTwoField4)
        println("Player 2! Choose your field: ")
        playerInput = readlnOrNull()

        if(playerInput != null) {
            when(playerInput.toInt()){
                1 -> playerFieldTemp = Point(gameField1)
                2 -> playerFieldTemp = Point(gameField2)
                3 -> playerFieldTemp = Point(gameField3)
                4 -> playerFieldTemp = Point(gameField4)
                5 -> playerFieldTemp = Point(gameField5)
                6 -> playerFieldTemp = Point(gameField6)
                7 -> playerFieldTemp = Point(gameField7)
                8 -> playerFieldTemp = Point(gameField8)
                9 -> playerFieldTemp = Point(gameField9)
            }
            when(playerTwoCounter){
                0 -> playerTwoField1 = Point(playerFieldTemp)
                1 -> playerTwoField2 = Point(playerFieldTemp)
                2 -> playerTwoField3 = Point(playerFieldTemp)
                3 -> playerTwoField4 = Point(playerFieldTemp)
                else -> {
                    println("ERR: To many moves.")
                }
            }
            playerTwoCounter++
        } else
            println("ERR: Input was NULL")
    }
}

fun gameField(gameField1: Point, gameField2: Point, gameField3: Point, gameField4: Point, gameField5: Point, gameField6: Point, gameField7: Point, gameField8: Point, gameField9: Point, playerOneField1: Point, playerOneField2: Point, playerOneField3: Point, playerOneField4: Point, playerOneField5: Point, playerTwoField1: Point, playerTwoField2: Point, playerTwoField3: Point, playerTwoField4: Point) {

    for (y in 1..5) {
        for (x in 1..5) {
            val p = Point(x, y)
            if(p == playerOneField1 || p == playerOneField2 || p == playerOneField3 || p == playerOneField4 || p == playerOneField5)
                print("❌")
            else if(p == playerTwoField1 || p == playerTwoField2 || p == playerTwoField3 || p == playerTwoField4)
                print("⭕")
            else if (p == gameField1 || p == gameField2 || p == gameField2 || p == gameField3 || p == gameField4 || p == gameField5 || p == gameField6 || p == gameField7 || p == gameField8 || p == gameField9)
                print("\uD83D\uDD33")
            else
                print("⬛")
        }
        println()
    }
}

