package OneCalculator

/* Calculadora Kotlin sem OOP*/

fun main(){
    println("Bem vindo a Digital Innovation One Calculator")
    println("-----------------------------------------------")
    println()
    println()
    print("Digite um valor real:")
    var x:Float = readLine()!!.toFloat() //recebe dado do teclado em forma de string e converte para float com o toFloat()
    print("Digite outro valor real: ")
    var y:Float = readLine()!!.toFloat()
    print("Agora digite em qual operacao aritmetica iremos calcular[+,-,*,/]:")
    var operation:String = readLine().toString()
    if (operation == "+"){
        println("A soma entre $x e $y e =  "+soma(x,y))
    }else if(operation == "-"){
        println("A subtracao entre $x e $y e = "+menos(x,y))
    }else if (operation == "*"){
        println("A multiplicacao entre $x e $y e = "+mult(x,y))
    }else if(operation == "/"){
        println("A divisao entre $x e $y e = "+divisor(x,y))
    }


}
fun soma(a:Float, b:Float):Float = a + b
fun menos(a:Float, b:Float):Float = a - b
fun mult(a:Float, b: Float):Float = a * b
fun divisor(a:Float, b: Float):Float = a / b