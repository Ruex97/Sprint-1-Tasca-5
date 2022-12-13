package exercici1;


import static org.hamcrest.MatcherAssert.assertThat;
import org.hamcrest.FeatureMatcher;
import org.hamcrest.Matcher;
import org.junit.jupiter.api.Test;
import static org.hamcrest.CoreMatchers.*;



 	public class HamcrestTest {
 		@Test
 		public void lengthOfMordorShouldBe8() {
 		    assertThat("Mordor", length(is(8)));
 		}
 		
 		public static Matcher<String> length(Matcher<? super Integer> matcher) {
 	 	    return new FeatureMatcher<String, Integer>(matcher, "a String of length that", "length") {
 	 	        @Override
 	 	        protected Integer featureValueOf(String actual) {
 	 	          return actual.length();
 	 	        }
 	 	    };
 	 	}
 		
 	}
 	
	
	
