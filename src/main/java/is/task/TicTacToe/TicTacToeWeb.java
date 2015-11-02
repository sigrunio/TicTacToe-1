package main.java.is.task.TicTacToe;

import spark.*;
import static spark.Spark.*;
import spark.servlet.SparkApplication;


public class TicTacToeWeb implements SparkApplication {

    private TicTacToe game = new TicTacToe();

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

        get("/getboard", (req, res) -> game.getGame().displayBoard());


        post("/newgame", (req, res) -> {
            game = new TicTacToe();
            res.redirect("/");
            res.status(200);
            return "";
        });
        post("/makemove", (req, res) -> {

            String inputMove = String.valueOf(req.queryParams("move"));

            if(!game.getGame().gameOver()){
                game.getHuman().setMove(inputMove);
                game.getHuman().askMove();
            }

            StringBuilder html = new StringBuilder();
            html.append("<pre>").append(game.getGame().displayBoard()).append("</pre>");
            res.status(200);
            return html.toString();
        });
    }
}
