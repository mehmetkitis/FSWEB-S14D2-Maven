package org.example;

import org.example.model.*;
import org.example.model.enums.LampType;
import org.example.model.enums.PaintColor;

public class Main {
    public static void main(String[] args) {
        Lamp lamp = new Lamp(LampType.NEON,true,100);
        Ceiling ceiling = new Ceiling(3, PaintColor.RED);
        Bed bed = new Bed("doble",2,2,2,2);
        Carpet carpet = new Carpet(PaintColor.WHITE,2,3);
        Wardrobe wardrobe = new Wardrobe(2,3,4);
        Wall northWall = new Wall("North");
        Wall eastWall = new Wall("East");
        Wall westWall = new Wall("West");
        Wall southWall = new Wall("South");

        Wall[] walls = new Wall[]{northWall,eastWall,westWall,southWall};

        Bedroom bedroom = new Bedroom(northWall,eastWall,westWall,southWall,lamp,ceiling,carpet,"bedroom",bed,
                wardrobe);
        bedroom.createBedroom();
    }
}