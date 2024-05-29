package material;

import java.time.LocalDate;
import java.util.Collections;

public class MaterialMain {
    public static void main(String[] args) {
        MaterialManagement management = new MaterialManagement();

        management.addMaterial(new CrispyFlour("1", "Bot mi 1", LocalDate.of(2024, 5, 29), 100, 2));
        management.addMaterial(new CrispyFlour("2", "Bot mi 2", LocalDate.of(2024, 5, 29), 400, 1));
        management.addMaterial(new CrispyFlour("3", "Bot mi 3", LocalDate.of(2024, 5, 29), 100, 2));
        management.addMaterial(new CrispyFlour("4", "Bot mi 4", LocalDate.of(2024, 5, 29), 200, 2));
        management.addMaterial(new CrispyFlour("5", "Bot mi 5", LocalDate.of(2024, 5, 29), 100, 2));

        management.addMaterial(new Meat("6", "thit lon", LocalDate.of(2024, 5, 28), 200, 50));
        management.addMaterial(new Meat("7", "thit lon", LocalDate.of(2024, 5, 28), 200, 50));
        management.addMaterial(new Meat("8", "thit lon 8", LocalDate.of(2024, 5, 28), 300, 50));
        management.addMaterial(new Meat("9", "thit lon", LocalDate.of(2024, 5, 28), 50, 50));
        management.addMaterial(new Meat("10", "thit lon", LocalDate.of(2024, 5, 28), 200, 50));

        management.removeMaterial("3");

        management.editMaterialById("5", new Meat("8", "thit lon real", LocalDate.of(2024, 1, 20), 200, 50));

        management.display();

        System.out.println("----------------------------------------");

        System.out.println("Total of cost: " + management.totalCost());

        management.sortByRealMoney();

        System.out.print("Chênh lệch giữa chiết khấu và không chiết khấu tại ngày hôm nay " + management.difference());
    }

}
