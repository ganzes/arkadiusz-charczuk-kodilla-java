package com.kodilla.spring.shape;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Random;

/*Aby całość zadziałała, klasa, w której tworzone są Beany przy
        pomocy adnotacji @Bean, musi być oznaczona adnotacją @Configuration.*/

@Configuration
public class ShapesFactory {

    /*Klasa ShapesFactory posiada w tej chwili jedną metodę createSquare(),
    która tworzy obiekt klasy Square i zwraca go jako wynik działania metody.*/
    //oznacza, że obiekty "produkowane"
    // przez tę metodę mają zostać przez Springa załadowane do Kontenera i mają stać się Beanami.

    @Bean
    public Square createSquare() {
        return new Square();
    }

    @Bean
    public Shape chosenShape() {
        Shape theShape;
        Random generator = new Random();

        int chosen = generator.nextInt(3);

        if (chosen == 0) {
            theShape = new Triangle();
        } else if (chosen == 1) {
            theShape = new Circle();
        } else {
            theShape = new Square();
        }
        return theShape;
    }
}
