package org.conversor.models;

import com.google.gson.annotations.SerializedName;

public class CurrencyResult {
    @SerializedName("conversion_rate")
    private float r1;
    @SerializedName("conversion_result")
    private float r2;
    @SerializedName("base_code")
    private String c1;
    @SerializedName("target_code")
    private String c2;

    public float getR2() {
        return r2;
    }

    public String getC1() {
        return c1;
    }

    public String getC2() {
        return c2;
    }
}
