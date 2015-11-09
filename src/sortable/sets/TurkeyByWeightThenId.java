package sortable.sets;


import java.util.Comparator;
import org.apache.commons.lang3.builder.CompareToBuilder;

/**
 * This Comparator implementation offers an alternate way to sort Employee
 * entities -- by LastName
 *
 * @author jlombardo
 */
public class TurkeyByWeightThenId implements Comparator<Turkey> {

    @Override
    public int compare(Turkey e1, Turkey e2) {

        return new CompareToBuilder()
                .append(e1.getWeight(), e2.getWeight())
                .append(e1.getId(), e2.getId())
                .toComparison();
    }
}
