package staff;

public class MainStaff {
    public static void main(String[] args) {
        Staff[] staffs = new Staff[8];

        staffs[0] = new StaffFullTime(1, "hoang", 18, "02384833", "daohuyhoang@gmail.com", 100000, 500000, 2000000);
        staffs[1] = new StaffFullTime(2, "hoang2", 19, "023848333", "daohuyhoang1@gmail.com", 200000, 100000, 1000000);
        staffs[2] = new StaffFullTime(3, "hoang3", 38, "032384833", "daohuyhoang2@gmail.com", 300000, 100000, 1000000);
        staffs[3] = new StaffFullTime(4, "hoang4", 38, "02384833", "daohuyhoang3@gmail.com", 300000, 100000, 2000000);

        staffs[4] = new StaffPartTime(5, "john", 24, "038348493293", "dhuhwkwkkd@gmail.com", 20);
        staffs[5] = new StaffPartTime(6, "john2", 20, "03843493293", "dhuhwkwkkd1@gmail.com", 20);
        staffs[6] = new StaffPartTime(7, "john3", 30, "038484933293", "dhuhwkwkkd2@gmail.com", 20);
        staffs[7] = new StaffPartTime(8, "john4", 20, "038484933293", "dhuhwkwkkd3@gmail.com", 20);

        System.out.print("Lương trung bình nhân viên: ");
        System.out.println(getAverageSalary(staffs));
        System.out.println();

        System.out.println("Danh sách nhân viên full time lương thấp hơn trung bình: ");
        showLowSalary(staffs);
        System.out.println();

        System.out.println("Lương phải trả cho tất cả nhân viên part time");
        System.out.println(getTotalWage(staffs));
        System.out.println();

        System.out.println("Sắp xếp lương nhân viên full time theo lương tăng dần");
        sortStaffFullTimeBySalary(staffs);
        displaySortStaffFullTimeBySalary(staffs);
    }

    public static double getAverageSalary(Staff[] staffs) {
        double total = 0;
        for (Staff staff : staffs) {
            total += staff.getRealSalary();
        }
        double average = total / staffs.length;
        return average;
    }

    public static void showLowSalary(Staff[] staffs) {
        int count = 0;
        for (Staff staff : staffs) {
            if (staff instanceof StaffFullTime) {
                StaffFullTime staffFullTime = (StaffFullTime) staff;
                if (staffFullTime.getSalary() < getAverageSalary(staffs)) {
                    System.out.println(staff.toString());
                    count++;
                }
            }
        }
        if (count == 0) {
            System.out.println("Không có nhân viên full time thấp hơn lương trung bình");
        }
    }

    public static double getTotalWage(Staff[] staffs) {
        double totalWage = 0;
        for (Staff staff : staffs) {
            if (staff instanceof StaffPartTime) {
                StaffPartTime staffPartTime = (StaffPartTime) staff;
                totalWage += staffPartTime.getRealSalary();
            }
        }
        return totalWage;
    }

    public static void sortStaffFullTimeBySalary(Staff[] staffs) {
        int min;
        for (int i = 0; i < staffs.length - 1 && (staffs[i] instanceof StaffFullTime); i++) {
            min = i;
            for (int j = i + 1; j < staffs.length && (staffs[j] instanceof StaffFullTime); j++)
                if (staffs[j].getRealSalary() < staffs[min].getRealSalary()) {
                    min = j;
                }
            if (min != i) {
                Staff temp = staffs[min];
                staffs[min] = staffs[i];
                staffs[i] = temp;
            }
        }
    }

    public static void displaySortStaffFullTimeBySalary(Staff[] staffs) {
        for (Staff staff : staffs) {
            if (staff instanceof StaffFullTime) {
                System.out.println(staff.toString());
            }
        }
    }
}
