package check_name;

import java.util.Scanner;

public class CheckName {
    public static void main(String[] args) {
        String regex = "^[A-ZÁÀÃẢẠĂẮẰẴẲẶÂẤẦẪẨẬĐÉÈẼẺẸÊẾỀỄỂỆÍÌĨỈỊÓÒÕỎỌÔỐỒỖỔỘƠỚỜỠỞỢÚÙŨỦỤƯỨỪỮỬỰÚÙŨỦỤƯỨỪỮỬỰÝỲỸỶỴ]" +
                "[a-záàãảạăắằẵẳặâấầẫẩậđéèẽẻẹêếềễểệíìĩỉịóòõỏọôốồỗổộơớờỡởợúùũủụưứừữửựúùũủụưứừữửựýỳỹỷỵ]+" +
                "(\\s[A-ZÁÀÃẢẠĂẮẰẴẲẶÂẤẦẪẨẬĐÉÈẼẺẸÊẾỀỄỂỆÍÌĨỈỊÓÒÕỎỌÔỐỒỖỔỘƠỚỜỠỞỢÚÙŨỦỤƯỨỪỮỬỰÚÙŨỦỤƯỨỪỮỬỰÝỲỸỶỴ]" +
                "[a-záàãảạăắằẵẳặâấầẫẩậđéèẽẻẹêếềễểệíìĩỉịóòõỏọôốồỗổộơớờỡởợúùũủụưứừữửựúùũủụưứừữửựýỳỹỷỵ]*){0,24}$";
        Scanner scanner = new Scanner(System.in);
        String name;
       do {
           System.out.print("Nhập họ và tên: ");
           name = scanner.nextLine();
           if(name.length() > 25) {
               System.out.println("Tên nên đặt không quá 25 ký tự");
           } else if(name.matches(regex)) {
               break;
           } else {
               System.out.println("Tên định dạng sai, nhâp lại!");
           }
       } while (true);
    }
}
