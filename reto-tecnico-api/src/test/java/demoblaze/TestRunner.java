import com.intuit.karate.junit5.Karate;

class TestRunner {
    
 
	/*RUN ALL TESTS*/
     @Karate.Test
     Karate testAll() {
         return Karate.run().relativeTo(getClass());
     }
	
     
}
