package is.task.TicTacToe;

import spark.*;
import static spark.Spark.*;
import spark.servlet.SparkApplication;


public class TicTacToeWeb implements SparkApplication {

    public static void main(String[] args) {
        staticFileLocation("/public");
        SparkApplication tictactoeweb = new TicTacToeWeb();

        String port = System.getenv("PORT");
        if (port != null) {
            port(Integer.valueOf(port));
        }

        tictactoeweb.init();
    }

    @Override
    public void init() {
	   get("/hello", (req, res) -> "Hello World2");
    }

}
