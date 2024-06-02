import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo {
    public static void main(String[] args) {
        String string = "Chuỗi String ";
        string = string + "tạo đối tợng mới";

        StringBuilder stringBuilder = new StringBuilder("Không tạo ra đối tượng mới, ");
        stringBuilder.append("thay đổi trực tiếp trên đối tượng hiện tại");

        StringBuffer stringBuffer = new StringBuffer("Tương tự như stringBuilder, ");
        stringBuffer.append("nhưng an toàn cho đa luồng");

        System.out.println(string);
        System.out.println(stringBuilder);
        System.out.println(stringBuffer);

        String text1 = "Hello java regex 2-12-2018, hello world 12/12/2018";
        Pattern pattern = Pattern.compile("\\d{1,2}[-|/]\\d{1,2}[-|/]\\d{4}");
        Matcher matcher = pattern.matcher(text1);
        System.out.println("Ngày tháng trong chuỗi text1: " + text1);

        while (matcher.find()) {
            System.out.println(text1.substring(matcher.start(), matcher.end()));
        }

        String text2 = "2/12/2018";
        String text3 = "12/12/ssss";

        System.out.println(text2 + " có định dạng ngày tháng năm là: " + pattern.matcher(text2).matches());
        System.out.println(text3 + " có định dạng ngày tháng năm là: " + pattern.matcher(text3).matches());

        System.out.println("Java Java Java".replaceFirst("v\\w", "wi"));
    }
}
