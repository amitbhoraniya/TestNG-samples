import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

 
public class SimpleTest {
 
 @BeforeClass
 public void setUp() {
	 System.out.println("Before Class"); 
 }
 
 @Test(groups = { "fast" })
 public void aFastTest() {
   System.out.println("Fast test");
 }
 
 @Test(groups = { "slow" })
 public void aSlowTest() {
    System.out.println("Slow test");
 }
 
 @AfterClass
 public void tearDown() {
	 System.out.println("After Class"); 
 }
 
}
