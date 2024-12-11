package org.example;
import io.javalin.Javalin;
import io.javalin.http.Context;

//Estudiante: Alvaro Salamanca Peña - Asignatura: Desarrollo de Soluciones Móviles


public class Main {
    public static void main(String[] args) {
        Javalin app = Javalin.create().start(7000);

        // Bienvenida
        app.get("/", ctx -> ctx.result("Bienvenido a la API de números romanos"));

        // Conversión de números romanos
        app.get("/convert/{number}", ctx -> {
            try {
                int number = Integer.parseInt(ctx.pathParam("number"));
                String roman = ConvertidorRomano.toRoman(number);
                ctx.result("Roman numeral for " + number + " is: " + roman);
            } catch (NumberFormatException e) {
                ctx.status(400).result("Formato de número no válido. Proporcione números enteros válidos.");
            } catch (IllegalArgumentException e) {
                ctx.status(400).result(e.getMessage());
            }
        });

        // ruta adicional
        app.get("/add/:num1/:num2", ctx -> {
            try {
                int num1 = Integer.parseInt(ctx.pathParam("num1"));
                int num2 = Integer.parseInt(ctx.pathParam("num2"));
                ctx.result("Sum: " + (num1 + num2));
            } catch (NumberFormatException e) {
                ctx.status(400).result("Formato de número no válido. Proporcione números enteros válidos.");
            }
        });

        // Resta
        app.get("/subtract/:num1/:num2", ctx -> {
            try {
                int num1 = Integer.parseInt(ctx.pathParam("num1"));
                int num2 = Integer.parseInt(ctx.pathParam("num2"));
                ctx.result("Difference: " + (num1 - num2));
            } catch (NumberFormatException e) {
                ctx.status(400).result("Formato de número no válido. Proporcione números enteros válidos.");
            }
        });

        // Multiplicacion
        app.get("/multiply/:num1/:num2", ctx -> {
            try {
                int num1 = Integer.parseInt(ctx.pathParam("num1"));
                int num2 = Integer.parseInt(ctx.pathParam("num2"));
                ctx.result("Product: " + (num1 * num2));
            } catch (NumberFormatException e) {
                ctx.status(400).result("Formato de número no válido. Proporcione números enteros válidos.");
            }
        });

        // Division
        app.get("/divide/:num1/:num2", ctx -> {
            try {
                int num1 = Integer.parseInt(ctx.pathParam("num1"));
                int num2 = Integer.parseInt(ctx.pathParam("num2"));
                if (num2 == 0) {
                    ctx.status(400).result("Error: No se permite la división por cero.");
                } else {
                    ctx.result("Quotient: " + (num1 / num2));
                }
            } catch (NumberFormatException e) {
                ctx.status(400).result("Formato de número no válido. Proporcione números válidos.");
            }
        });

        // Power
        app.get("/power/:base/:exponent", ctx -> {
            try {
                int base = Integer.parseInt(ctx.pathParam("base"));
                int exponent = Integer.parseInt(ctx.pathParam("exponent"));
                ctx.result("Result: " + Math.pow(base, exponent));
            } catch (NumberFormatException e) {
                ctx.status(400).result("Formato de número no válido. Proporcione números enteros válidos.");
            }
        });

        // Modulo
        app.get("/modulo/:num1/:num2", ctx -> {
            try {
                int num1 = Integer.parseInt(ctx.pathParam("num1"));
                int num2 = Integer.parseInt(ctx.pathParam("num2"));
                if (num2 == 0) {
                    ctx.status(400).result("Error: No se permite el módulo por cero.");
                } else {
                    ctx.result("Modulo: " + (num1 % num2));
                }
            } catch (NumberFormatException e) {
                ctx.status(400).result("Formato de número no válido. Proporcione números enteros válidos.");
            }
        });
    }
}
