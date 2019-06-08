package com.kodilla.spring.intro.com.kodilla.spring.intro.shape;

//Klasę Drawer wyposażyliśmy w pole shape typu Shape, które inicjowane jest w
// momencie tworzenia obiektu klasy Drawer poprzez atrybut konstruktora klasy.

//nazywamy wstrzykiwaniem zależności (czyli po angielsku Dependency Injection - DI) przez konstruktor.

//Klasa Drawer nie wie o wstrzykiwanych jej obiektach niczego, poza tym,
// że implementują one interfejs Shape. Nawet jeżeli będą go rozszerzały o własne metody,
// to klasa Drawer i tak nigdy się o nich nie dowie - zawsze będzie je postrzegała w sposób
// ograniczony przez specyfikację interfejsu Shape. Z punktu widzenia klasy Drawer, wszystkie
// wstrzykiwane obiekty są "takie same" - są jakimiś implementacjami interfejsu Shape.

public class Drawer {
    final Shape shape;

    public Drawer(Shape shape) {
        this.shape = shape;
    }

    public String doDrawning() {
        return shape.draw();
    }
}