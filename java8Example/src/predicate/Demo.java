package predicate;

import java.util.function.Predicate;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Demo {

	public static final Logger LOGGER = LogManager.getLogger(Demo.class);

	public static void main(String[] args) {
		
		LOGGER.info("main method started...!");

		Predicate<Integer> predicate = a -> (a > 20);
		boolean flag = predicate.test(25);
		LOGGER.info(flag);
		
		String str = "Apple";
		Predicate<String> predicate2 = (s) -> s.equals("apple");
		Predicate<String> predicate3 = (s)-> s.contains ("Apple");
		Predicate<String> predicate4 = (s) -> s.startsWith("a");
		
		LOGGER.info(predicate2.test(str));
		LOGGER.info(predicate3.test(str));
		LOGGER.info(predicate4.test(str));
		LOGGER.info("main method end....!");

	}

}
