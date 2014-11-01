TeaDiscovery
============
Learning project of mine with the goals
I'd love pull request if you see anything odd/needs refactoring I'm pretty much self taught so any help appreciated

 *  build a key value store database 
 *  auto instance discovery on lan network with no configuration
 *  replication across instances

### Usage
```scala
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
```

### Used resources
 *  Jackson for serialization/deserialization
 *  UDP broadcast based discovery library for intelligent no config server instance discovery/communication
