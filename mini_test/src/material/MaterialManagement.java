package material;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MaterialManagement {
    private List<Material> materials;

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
                break;
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

    public void display() {
        for (Material material : materials) {
            System.out.println(material.toString());
        }
    }

    public double totalCost() {
        double total = 0;
        for (Material material : materials) {
            total += material.getRealMoney();
        }
        return total;
    }

    public void sortByRealMoney() {
        List<Material> newMaterial = new ArrayList<>(materials);
        newMaterial.sort(new Comparator<Material>() {
            @Override
            public int compare(Material o1, Material o2) {
                return (int) (o1.getRealMoney() - o2.getRealMoney());
            }
        });
        for (Material material : newMaterial) {
            System.out.println(material.toString());
        }
    }

    public double difference() {
        double totalNoDiscount = 0;
        double totalDiscount = 0;

        for (Material material : materials) {
            totalNoDiscount += material.getAmount();
            totalDiscount += material.getRealMoney();
        }
        return totalNoDiscount - totalDiscount;
    }
}
