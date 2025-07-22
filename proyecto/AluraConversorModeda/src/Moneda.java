import java.util.List;
import java.util.Map;

public record Moneda(String base_code,
                     String result,
                     Map<String, Double> conversion_rates) {
}
