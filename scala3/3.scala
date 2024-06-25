object Main extends App{
    def Normalhours(Nh:Int):Int=250*Nh*4
    def OThours(Oh:Int):Int=Oh*85*4
    var x=Normalhours(40)+OThours(30)
    def Tax():Double=x*0.12
    def Salary():Double=x-Tax()
    println(Salary())
    
}