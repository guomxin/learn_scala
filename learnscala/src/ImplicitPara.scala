

object ImplicitPara {
  
  // implicit参数可以从visible的val查找，也可以通过关联的object对象里面查找
  // visible的val变量要优先，val和object中同时发现，不会报错
  def greet(name: String)(implicit prompt: PreferredPrompt) {
    println(prompt.preference + "Welcome, " + name)
  }            
  
  class PreferredPrompt(val preference: String)
	
	// implicit val prompt2 = new PreferredPrompt("Yes, master2> ")
  // visible的val变量有多于一个会报错，比如将下一行取消注释
	// implicit val prompt3 = new PreferredPrompt("Yes, master3> ")
	
	object PreferredPrompt {
		implicit val prompt = new PreferredPrompt("Yes, master> ")
		// 下面一行取消注释也会报错
		// implicit val prompt2 = new PreferredPrompt("Yes, master2> ")
	}
  
  def main(args: Array[String]) {
    greet("scala")
  }
}