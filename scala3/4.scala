object Main extends App{
    def Cost(price:Int):Int=500+Attendence(price)*3
    def Attendence(price:Int):Int=120+(15-price)*4
    def Rev(price:Int):Int=Attendence(price)*price
    def Profit(price:Int):Int=Rev(price)-Cost(price)
    println("Profit at TicketPrice 15->"+Profit(15))
    println("Profit at TicketPrice 20->"+Profit(20))
    println("Profit at TicketPrice 25->"+Profit(25))
    println("Profit at TicketPrice 35->"+Profit(30))
    println("Profit at TicketPrice 50->"+Profit(35))

}