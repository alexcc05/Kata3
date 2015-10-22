/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata3;

import java.awt.Dimension;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;

/**
 *
 * @author usuario
 */
public class HistogramDisplay extends ApplicationFrame{

    public HistogramDisplay() { //Creamos la ventana
        super("HISTOGRAMA");
        setContentPane(createPanel());
        pack();//se expande la ventana al tamaño del panel

    }
    
    private ChartPanel createPanel(){
        ChartPanel chartPanel = new ChartPanel(createChart(createDataset()));
        chartPanel.setPreferredSize(new Dimension(500, 450));
        return chartPanel;
        
    }

    private JFreeChart createChart(DefaultCategoryDataset dataset){
        JFreeChart chart =ChartFactory.createBarChart(null, "Dominios", "Nº email", dataset, PlotOrientation.VERTICAL , false, false, false); 
                
        return chart;
    }
    
    
    private DefaultCategoryDataset createDataset(){
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        
        dataset.addValue(10, "", "gmail.com");
        dataset.addValue(7, "", "ulpgc.es");
        dataset.addValue(4, "", "ull.es");
        dataset.addValue(8, "", "hotmail.com");
        
        return dataset;
    }
    public void execute(){
        setVisible(true);
    }
    
}
