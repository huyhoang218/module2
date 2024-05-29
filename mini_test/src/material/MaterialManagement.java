package material;

import java.util.ArrayList;
import java.util.Comparator;

public class MaterialManagement {
    private ArrayList<Material> materials;

    public MaterialManagement() {
        materials = new ArrayList<>();
    }

    public void addMaterial(Material material) {
        materials.add(material);
    }

    public void removeMaterial(String id) {
        for (Material material : materials) {
            if (material.getId().equals(id)) {
                materials.remove(material);
                return;
            }
        }
    }

    public void editMaterialById(String id, Material newMaterial) {
        for (int i = 0; i < materials.size(); i++) {
            if (materials.get(i).getId().equals(id)) {
                materials.set(i, newMaterial);
                return;
            }
        }
    }

    public double totalRealMoney() {
        double total = 0;
        for (Material material : materials) {
            total += material.getRealMoney();
        }
        return total;
    }

    public ArrayList<Material> getSortByRealMoney() {
        ArrayList<Material> newMaterial = new ArrayList<>(materials);
        newMaterial.sort(new Comparator<Material>() {
            @Override
            public int compare(Material o1, Material o2) {
                return (int) (o1.getRealMoney() - o2.getRealMoney());
            }
        });
        return newMaterial;
    }

    public void displaySortMaterial(ArrayList<Material> materials) {
        for (Material material : materials) {
            System.out.println(material.toString());
        }
    }

    public double getDifference() {
        double totalNoDiscount = 0;

        for (Material material : materials) {
            totalNoDiscount += material.getAmount();
        }
        return totalNoDiscount - totalRealMoney();
    }

    public void displayAll() {
        for (Material material : materials) {
            System.out.println(material.toString());
        }
    }
}
