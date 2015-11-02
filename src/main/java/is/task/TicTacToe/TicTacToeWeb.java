package main.java.is.task.TicTacToe;

import spark.*;
import static spark.Spark.*;
import spark.servlet.SparkApplication;


public class TicTacToeWeb implements SparkApplication {

    private Game game = new Game();

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

        final HumanPlayer humanPlayer = new HumanPlayer();
        final ComputerPlayer computerPlayer = new ComputerPlayer();
        get("/hello", (req, res) -> "Hello World");
        get("/getboard", (req, res) -> game.displayBoard());
            post("/newgame", (req, res) -> {
                game = new Game();
                res.redirect("/");
                res.status(200);
                return "";
            });
       /* get("/getboard", (req, res) -> {
            StringBuilder html = new StringBuilder();
            html.append("<pre>").append(game.displayBoard()).append("</pre>");
            res.status(200);
            //return html.toString();
            return game.displayBoard();
        */
        });
        post("/makemove", (req, res) -> {

            String inputMove = String.valueOf(req.queryParams("move"));

            if(!game.gameOver()){
                humanPlayer.setMove(inputMove);
                humanPlayer.askMove();
            }

            StringBuilder html = new StringBuilder();
            html.append("<pre>").append(game.displayBoard()).append("</pre>");
            res.status(200);
            return html.toString();
        });

    }
}
