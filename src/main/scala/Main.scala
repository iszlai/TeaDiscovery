import com.coffemon.TeaDB.core.ObjectStore


object Main extends App {
  
	//Data you want to store
	val test=new TestDataBean("john","snow");
	
	//This is how you store you data
	ObjectStore.put("keyforJohn", test);
	
	//This is how you fetch
	val test2=ObjectStore.get("keyforJohn", classOf[TestDataBean])
	println(test2.toString())
}