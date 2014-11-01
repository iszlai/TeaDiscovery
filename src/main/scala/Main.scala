import com.coffemon.TeaDB.core.ObjectStore


object Main extends App {
	val test=new TestDataBean("john","snow");
	ObjectStore.put("keyforJohn", test);
	val test2=ObjectStore.pop("keyforJohn", classOf[TestDataBean])
	println(test2.toString())
}