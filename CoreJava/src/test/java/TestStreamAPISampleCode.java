import dev.SwanHtet.streamAPI.sample.StreamAPISampleCode;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class TestStreamAPISampleCode {
	private  final StreamAPISampleCode streamAPISampleCode = new StreamAPISampleCode();

	@Test
	public  void questionNumberOneTest(){
		List<String> input = Arrays.asList("Alice", "Bob", "Charlotte", "David", "Eve", "Frank", "Grace");
		List<String> result = streamAPISampleCode.filterAndTransformStrings(input);
		assertEquals(List.of( "BOB","EVE"), result);
	}

	@Test
	public  void questionNumberTwoTest(){
		List<Integer> input = Arrays.asList(1, 2, 3, 4,10);
		assertEquals(48, streamAPISampleCode.processIntegers(input));
	}
	@Test
	public void testQuestionNumberThree() {
		List<String> inputList = Arrays.asList("apple", "banana", "orange", "grape", "kiwi", "pear", "pineapple");
		double result = streamAPISampleCode.calculateAverageLength(inputList);
		assertEquals(6.0, result);
	}

	@Test
	public void questionNumberFourTest(){
		List<String> inputList = Arrays.asList("apple", "banana", "orange", "grape", "kiwi", "pear", "pineapple");
		Map<Integer, List<String>> result = streamAPISampleCode.groupStringsByLength(inputList);
		assertEquals(2, result.get(5).size());
		assertEquals(2, result.get(6).size()); // Expecting one string with length 6
		assertEquals(1, result.get(9).size());
	}
}
