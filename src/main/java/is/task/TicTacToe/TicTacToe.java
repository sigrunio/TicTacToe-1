package is.task.TicTacToe;

import spark.*;
import static spark.Spark.*;
import spark.servlet.SparkApplication;

public class TicTacToe {                    
    public static void main(String[] args) {
    	World world = new World();
    	System.out.println(world.greet());

	get("/", (req, res) -> world.greet());
    }
}
