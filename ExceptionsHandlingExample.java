package exceptionHandling;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ExceptionsHandlingExample {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("44", "35", "10", "Sriyank");

		list.forEach(handleGenericExceptions(s -> System.out.println(Integer.parseInt(s)), NumberFormatException.class));
	}

	static <Target, ExObj extends Exception> Consumer<Target> handleGenericExceptions(Consumer<Target> targetConsumer, Class<ExObj> exObjClass) {
		return obj -> {

			try {
				targetConsumer.accept(obj);
			} catch (Exception ex) {
				try {
					ExObj exObj = exObjClass.cast(ex);
					System.out.println("exception : " + exObj.getMessage());
				} catch (Exception e) {
					throw ex;
				}
			}
		};
	}
}
