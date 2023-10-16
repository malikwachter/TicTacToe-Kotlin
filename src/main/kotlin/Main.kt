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
    var playerOneInput: String?
    var playerOneInput1: String?
    var playerTwoInput: String?
    var playerTwoInput1: String?
    var playerOneField1 = Point(-1,-1)
    var playerOneField2 = Point(-1,-1)
    var playerOneField3 = Point(-1,-1)
    var playerOneField4 = Point(-1,-1)
    var playerOneField5 = Point(-1,-1)
    var playerTwoField1 = Point(-1,-1)
    var playerTwoField2 = Point(-1,-1)
    var playerTwoField3 = Point(-1,-1)
    var playerTwoField4 = Point(-1,-1)
    var playerTwoField5 = Point(-1,-1)

    while(again){
        gameField(playerOneField1, playerOneField2, playerOneField3, playerOneField4, playerOneField5, playerTwoField1, playerTwoField2, playerTwoField3, playerTwoField4, playerTwoField5)
        println("Player 1: Choose your field:\nx: ")
        playerOneInput = readlnOrNull()
        println("y: ")
        playerOneInput1 = readlnOrNull()
        if(playerOneInput != null && playerOneInput1 != null) {
            when(playerOneCounter){
                0 -> playerOneField1 = Point(playerOneInput.toInt(),playerOneInput1.toInt())
                1 -> playerOneField2 = Point(playerOneInput.toInt(),playerOneInput1.toInt())
                2 -> playerOneField3 = Point(playerOneInput.toInt(),playerOneInput1.toInt())
                3 -> playerOneField4 = Point(playerOneInput.toInt(),playerOneInput1.toInt())
                4 -> playerOneField5 = Point(playerOneInput.toInt(),playerOneInput1.toInt())
                else -> {
                    print("ERR: To many moves.")
                }
            }
            playerOneCounter++
        } else
            println("ERR: Input was NULL")

        gameField(playerOneField1, playerOneField2, playerOneField3, playerOneField4, playerOneField5, playerTwoField1, playerTwoField2, playerTwoField3, playerTwoField4, playerTwoField5)
        println("Player 2! Choose your field:\nx: ")
        playerTwoInput = readlnOrNull()
        println("y: ")
        playerTwoInput1 = readlnOrNull()
        if(playerTwoInput != null && playerTwoInput1 != null) {
            when(playerOneCounter){
                0 -> playerTwoField1 = Point(playerTwoInput.toInt(),playerTwoInput1.toInt())
                1 -> playerTwoField2 = Point(playerTwoInput.toInt(),playerTwoInput1.toInt())
                2 -> playerTwoField3 = Point(playerTwoInput.toInt(),playerTwoInput1.toInt())
                3 -> playerTwoField4 = Point(playerTwoInput.toInt(),playerTwoInput1.toInt())
                4 -> playerTwoField5 = Point(playerTwoInput.toInt(),playerTwoInput1.toInt())
                else -> {
                    print("ERR: To many moves.")
                }
            }
            playerTwoCounter++
        } else
            println("ERR: Input was NULL")
    }
}

fun gameField(playerOneField1: Point, playerOneField2: Point, playerOneField3: Point, playerOneField4: Point, playerOneField5: Point, playerTwoField1: Point, playerTwoField2: Point, playerTwoField3: Point, playerTwoField4: Point, playerTwoField5: Point) {
    val gameField1 = Point(1, 1)
    val gameField2 = Point(3, 1)
    val gameField3 = Point(5, 1)
    val gameField4 = Point(1, 3)
    val gameField5 = Point(3, 3)
    val gameField6 = Point(5, 3)
    val gameField7 = Point(1, 5)
    val gameField8 = Point(3, 5)
    val gameField9 = Point(5, 5)

    for (y in 1..5) {
        for (x in 1..5) {
            val p = Point(x, y)
            if(p == playerOneField1 || p == playerOneField2 || p == playerOneField3 || p == playerOneField4 || p == playerOneField5)
                print("❌")
            else if(p == playerTwoField1 || p == playerTwoField2 || p == playerTwoField3 || p == playerTwoField4 || p == playerTwoField5)
                print("⭕")
            else if (p == gameField1 || p == gameField2 || p == gameField2 || p == gameField3 || p == gameField4 || p == gameField5 || p == gameField6 || p == gameField7 || p == gameField8 || p == gameField9)
                print("\uD83D\uDD33")
            else
                print("⬛")
        }
        println()
    }
}

