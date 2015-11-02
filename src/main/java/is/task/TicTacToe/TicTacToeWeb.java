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
        post("/newgame", (req, res) -> {
            game = new Game();
            res.redirect("/");
            return res;
        });
        post("/makemove", (req, res) -> {

            String inputMove = String.valueOf(req.queryParams("move"));

            if(!game.gameOver()){
                humanPlayer.setMove(inputMove);
                humanPlayer.askMove();
            }

            StringBuilder html = new StringBuilder();
            html.append("<pre>").append(game.displayBoard()).append("</pre");
            return html.toString();
        });

    }
}
