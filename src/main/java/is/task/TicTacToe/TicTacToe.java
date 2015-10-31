package is.task.TicTacToe;

import spark.*;
import static spark.Spark.*;
import spark.servlet.SparkApplication;

public class TicTacToe implements SparkApplication {

    public static void main(String[] args) {
    	staticFileLocation("/public");
        SparkApplication tttweb = new TicTacToe();

        String port = System.getenv("PORT");
        if (port != null) {
        	port(Integer.valueOf(port));
        }

        tttweb.init();
	}

	@Override
    public void init() {
        final World world = new World();    
        get("/", (req, res) -> world.greet());
    }

}


