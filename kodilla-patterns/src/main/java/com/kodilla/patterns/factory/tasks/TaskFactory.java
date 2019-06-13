package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String SHOPPING_TASK = "SHOPPING TASK";
    public static final String PAINTING_TASK = "PAITING TASK";
    public static final String DRIVING_TASK = "DRIVING TASK";

    public final Task makeTask (final String taskName){
        switch (taskName){
            case SHOPPING_TASK:
                return new ShoppingTask("Buy a New PC", "Start with Graphic Card", 2.0);
            case PAINTING_TASK:
                return new PaintingTask("Paint a Kid Room","With Color Black","Start With Southeast Wall");
            case DRIVING_TASK:
                return new DrivingTask("Drive","To Home","Car");
            default:
                return null;
        }
    }
}
