package Practical;

import java.util.Scanner;

public class ConversionUtil {
     double fahrenheitToCelcius(double fDegree){
        return (fDegree-32) / 1.8;
    }
     double celciusToFahrenheit(double cDegree){
        return cDegree * 1.8 + 32;
    }
}
