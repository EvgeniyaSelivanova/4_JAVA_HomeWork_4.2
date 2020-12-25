import com.sun.source.tree.IfTree;

public class BmiService {
    public float calculate(float height, float weight) {
        if (height > 0) {
            if (weight > 0) {
                return weight / (height / 100 * height / 100);
            }
        }
        return 0;
    }

    public String diagnosis(float BMI) {
        if (BMI <= 16) {
            if (BMI > 0) {
                return "Выраженный дефицит массы тела";
            }
        }
        if (BMI > 16) {
            if (BMI < 18.5) {
                return "Недостаточная (дефицит) масса тела";
            }
        }
        if (BMI > 18.5) {
            if (BMI < 25) {
                return "Норма";
            }
        }
        if (BMI > 25) {
            if (BMI < 30) {
                return "Избыточная масса тела (предожирение)";
            }
        }
        if (BMI > 30) {
            if (BMI < 35) {
                return "Ожирение";
            }
        }
        if (BMI > 35) {
            if (BMI < 40) {
                return "Ожирение резкое";
            }
        }
        if (BMI >= 40) {
            return "Очень резкое ожирение";
        }

        return "Неверный ввод данных";
    }
}
