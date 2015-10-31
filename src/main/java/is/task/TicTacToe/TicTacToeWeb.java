import spark.*;
import static spark.Spark.*;
import spark.servlet.SparkApplication;

public class HelloWorld {
    public static void main(String[] args) {
        get("/hello", (req, res) -> "Hello World");
    }
}