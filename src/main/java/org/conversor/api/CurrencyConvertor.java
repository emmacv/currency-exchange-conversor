package org.conversor.api;


import com.google.gson.Gson;
import org.conversor.models.CurrencyResult;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class CurrencyConvertor {
    private static String apiKek = "035192ee17acaa956a08bef0";
    private static String uri = "https://v6.exchangerate-api.com/v6/" + apiKek + "/pair/";

    private static Gson gson = new Gson().newBuilder().setPrettyPrinting().create();

    public static void convertCurrencies(String c1, String c2, float amount) {
        var url = URI.create(uri + c1 + "/" + c2 + "/" + amount);

        try  {
            HttpClient client = HttpClient.newBuilder().build();
            HttpRequest req = HttpRequest.newBuilder(url).build();
            HttpResponse<String> res = client.send(req, HttpResponse.BodyHandlers.ofString());

            CurrencyResult result = gson.fromJson(res.body(), CurrencyResult.class);
            System.out.println(amount + " " + result.getC1() + " are equivalent to " + result.getR2() + " " + result.getC2() );
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }

    }
}
