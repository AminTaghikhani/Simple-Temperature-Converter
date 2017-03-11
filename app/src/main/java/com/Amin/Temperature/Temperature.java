package com.Amin.Temperature;

/**
 * Created by Amin on 3/11/2017.
 */
public class Temperature {
    private Double celcius;
    private Double fahrenheit;

    public Double getCelcius() {
        return celcius;
    }

    public void setCelcius(Double celcius) {
        this.celcius = celcius;
        fahrenheit=((9d/5d)*(celcius)+32);
    }

    public Double getFahrenheit() {
        return fahrenheit;
    }

    public void setFahrenheit(Double fahrenheit) {
        this.fahrenheit = fahrenheit;
        celcius=(5d/9d)*(fahrenheit-32);
    }

    @Override
    public String toString() {
        return "Temperature{" +
                "celcius=" + celcius +
                ", fahrenheit=" + fahrenheit +
                '}';
    }
}
