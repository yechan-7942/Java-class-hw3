import javax.swing.JOptionPane;

public class Rep03Replace3 {
    public static void main(String[] args) {

        while (true) {
            // 1. 성별 입력
            String gender = JOptionPane.showInputDialog("성별을 입력하세요 (남자는 M, m, 여자는 W, w):");

            if (gender == null || gender.equalsIgnoreCase("q")) {
                JOptionPane.showMessageDialog(null, "프로그램을 종료합니다.");
                break;
            }

            if (!(gender.equalsIgnoreCase("m") || gender.equalsIgnoreCase("w"))) {
                JOptionPane.showMessageDialog(null, "성별이 잘못되었습니다. M, m 또는 W, w를 입력하세요.");
                continue;
            }

            // 2. 몸무게 입력 (숫자 + 양수 검사)
            double weight;
            while (true) {
                String weightStr = JOptionPane.showInputDialog("몸무게를 입력하세요 (kg):");
                if (weightStr == null || weightStr.equalsIgnoreCase("q")) {
                    JOptionPane.showMessageDialog(null, "프로그램을 종료합니다.");
                    return;
                }

                try {
                    weight = Double.parseDouble(weightStr);
                    if (weight <= 0) {
                        JOptionPane.showMessageDialog(null, "몸무게는 양수여야 합니다. 다시 입력하세요.");
                        continue;
                    }
                    break;
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "몸무게는 숫자로 입력해야 합니다.");
                }
            }

            // 3. 키 입력 (숫자 + 양수 검사)
            double height;
            while (true) {
                String heightStr = JOptionPane.showInputDialog("키를 입력하세요 (cm):");
                if (heightStr == null || heightStr.equalsIgnoreCase("q")) {
                    JOptionPane.showMessageDialog(null, "프로그램을 종료합니다.");
                    return;
                }

                try {
                    height = Double.parseDouble(heightStr);
                    if (height <= 0) {
                        JOptionPane.showMessageDialog(null, "키는 양수여야 합니다. 다시 입력하세요.");
                        continue;
                    }
                    break;
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "키는 숫자로 입력해야 합니다.");
                }
            }

            int age;
            while (true) {
                String ageStr = JOptionPane.showInputDialog("나이를 입력하세요:");
                if (ageStr == null || ageStr.equalsIgnoreCase("q")) {
                    JOptionPane.showMessageDialog(null, "프로그램을 종료합니다.");
                    return;
                }

                try {
                    age = Integer.parseInt(ageStr);
                    if (age <= 0) {
                        JOptionPane.showMessageDialog(null, "나이는 양수여야 합니다. 다시 입력하세요.");
                        continue;
                    }
                    break;
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "나이는 정수로 입력해야 합니다.");
                }
            }

            double calories;
            if (gender.equalsIgnoreCase("m")) {
                calories = (10 * weight) + (6.25 * height) - (5 * age) + 5;
            } else { // gender.equalsIgnoreCase("w")
                calories = (10 * weight) + (6.25 * height) - (5 * age) - 161;
            }

            int chocolate = (int)(calories / 200);

            String message =
                    "성별: " + gender +
                            "\n몸무게: " + weight + " kg" +
                            "\n키: " + height + " cm" +
                            "\n나이: " + age + " 세" +
                            "\n하루에 필요한 칼로리: " + calories + " kcal" +
                            "\n하루에 필요한 초콜릿 수: " + chocolate + " 개";
            JOptionPane.showMessageDialog(null, message);
        }
    }
}