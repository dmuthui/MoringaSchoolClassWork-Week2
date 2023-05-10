package ke.co.Safaricom;

import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.HashMap;
import java.util.Map;

import static spark.Spark.*;
import static spark.Spark.staticFileLocation;


public class Main {
    public static void main(String[] args) {
        staticFileLocation("/public");

        HandlebarsTemplateEngine engine = new HandlebarsTemplateEngine();
        get("/", (req, res)-> {
            //return "Homepage - GET"
            //MV/T C - Model View/Template Controllers
            Map<String, String> payload = new HashMap<>();
            payload.put("username", "Test User-David");
            return new ModelAndView(payload, "home.hbs");
        }, engine);

        get("/about-us",(req, res)->{
            //TODO - process request
            return new ModelAndView(new HashMap<>(), "about.hbs");
        }, engine);


    }
}