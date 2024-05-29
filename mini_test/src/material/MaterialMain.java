package material;

import java.time.LocalDate;
import java.util.ArrayList;

public class MaterialMain {
    public static void main(String[] args) {
        MaterialManagement management = new MaterialManagement();

        management.addMaterial(new CrispyFlour("1", "Bot mi 1", LocalDate.of(2024, 5, 29), 100, 2));
        management.addMaterial(new CrispyFlour("2", "Bot mi 2", LocalDate.of(2024, 5, 15), 400, 1));
        management.addMaterial(new CrispyFlour("3", "Bot mi 3", LocalDate.of(2024, 3, 29), 100, 2));
        management.addMaterial(new CrispyFlour("4", "Bot mi 4", LocalDate.of(2024, 2, 29), 200, 2));
        management.addMaterial(new CrispyFlour("5", "Bot mi 5", LocalDate.of(2024, 5, 29), 100, 2));

        management.addMaterial(new Meat("6", "thit lon", LocalDate.of(2024, 5, 28), 200, 50));
        management.addMaterial(new Meat("7", "thit lon", LocalDate.of(2024, 5, 28), 200, 50));
        management.addMaterial(new Meat("8", "thit lon 8", LocalDate.of(2024, 5, 28), 300, 50));
        management.addMaterial(new Meat("9", "thit lon", LocalDate.of(2024, 5, 28), 50, 50));
        management.addMaterial(new Meat("10", "thit lon", LocalDate.of(2024, 5, 28), 200, 50));

        management.removeMaterial("3");

        management.editMaterialById("5", new Meat("8", "thit bo", LocalDate.of(2024, 1, 20), 200, 50));

        System.out.println("Tổng tiền: " + management.totalRealMoney());

        System.out.println("Chưa sắp xếp: ");
        management.displayAll();
        System.out.println("----------------------------------------");

        ArrayList<Material> sortMaterials = management.getSortByRealMoney();

        System.out.println("Đã sắp xếp: ");
        management.displaySortMaterial(sortMaterials);

        System.out.println("Chênh lệch giữa chiết khấu và không chiết khấu ngày hôm nay " + management.getDifference());
    }

}
