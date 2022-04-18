package samples

/* Write a program that reads one number and one character on separate lines and checks that the number matches
ts decimal representation correctly.

If the input character is represented by the input number, print true; otherwise, print false */

fun main() = println(readln().toInt().toChar().toString() == readln())