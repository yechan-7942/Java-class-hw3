import javax.swing.JOptionPane;

public class Rep03Replace2 {
    public static void main(String[] args) {
        String gender = JOptionPane.showInputDialog("성별을 입력하세요 (남자는 M, m, 여자는 W, w):");
        String weight = JOptionPane.showInputDialog("몸무게를 입력하세요:");
        String height = JOptionPane.showInputDialog("키를 입력하세요:");
        String age = JOptionPane.showInputDialog("나이를 입력하세요:");


        String message = "성별: " + gender
                + "\n몸무게: " + weight
                + "\n키: " + height
                + "\n나이: " + age;
        JOptionPane.showMessageDialog(null, message);

        if (!(gender.equalsIgnoreCase("m") || gender.equalsIgnoreCase("w"))) {
            JOptionPane.showMessageDialog(null, "성별이 잘못 입력되었습니다");
        }
        else {
            double dweight = Double.parseDouble(weight);
            double dheight = Double.parseDouble(height);
            int dage = Integer.parseInt(age);

            double calories =0;
            if (gender.equalsIgnoreCase("m")) {
                calories = (10 * dweight) + (6.25 * dheight) - (5 * dage) + 5;
            } else if (gender.equalsIgnoreCase("w")) {
                calories = (10 * dweight) + (6.25 * dheight) - (5 * dage) - 161;
            }


            int chocolate= (int)(calories / 200);

            JOptionPane.showMessageDialog(null,"하루에 필요한 칼로리 : " + calories + "kcal" + "\n" +
                    "하루에 필요한 초콜릿 수 :" + chocolate + "개");
        }
    }
}