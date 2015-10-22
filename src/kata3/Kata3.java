/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata3;

/**
 *
 * @author usuario
 */
public class Kata3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Histogram <String> histogram = new Histogram<>();
        
        histogram.increment("gmail.com");
        histogram.increment("ulpgc.es");
        histogram.increment("gmail.com");
        histogram.increment("ull.es");
        histogram.increment("gmail.com");
        histogram.increment("gmail.com");
        
        
        HistogramDisplay histo= new HistogramDisplay(histogram);
        histo.execute();
    }
}
