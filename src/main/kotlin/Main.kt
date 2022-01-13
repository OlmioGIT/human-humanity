
fun main() {
     val likes = 10111
     val someWord = likes % 10
     val someWord1 = likes % 100
     if (likes == 1000000) {
          println("Понравилось $likes человек.")
     }else if (someWord1 == 11) {
          println("Понравилось $likes людям.")
     } else if (someWord == 1) {
          println("Понравилось $likes человеку.")
     }else {
          println("Понравилось $likes людям.")
     }
}