//Creating greeting functions
def greet1 (x: String): String = {"- Hello " + x + ", how you're doing today?"}
def greet2 (y:String ): String = {"- Hey " + y + ", how was your day?"}
//Callback function to call greeting functions
def frame (name: String , callback: (String) => String): String =
{
  callback(name)
}
//Printing greetings through callback function
println(frame("Alice", greet1))
println(frame("Nick", greet2))


