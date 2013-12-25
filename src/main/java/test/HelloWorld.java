package test;

import spark.*;
import spark.servlet.SparkApplication;

public class HelloWorld implements SparkApplication {

	public void init() {
		Spark.get(new Route("/hello") {
		 @Override
		 public Object handle(Request request, Response response) {
			response.header("Content-Type", "text/html; charset=utf-8");
			return "Hello World!";
		 }
		});
	}
}
