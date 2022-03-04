import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Number2 {
    public static void main(String[] args) {
        List<Invoice> invoices = new ArrayList<>();
        List<Invoice> oracleAndTrainingInvoices = new ArrayList<>();
        List<Integer> ids = new ArrayList<>();
        List<Integer> firstFiveIds = new ArrayList<>();

        for(Invoice inv : invoices){
            Object Customer = null;
            if(inv.getCustomer() == Customer.ORACLE){
                if(inv.getTitle().contains("Training")){
                    oracleAndTrainingInvoices.add(inv);
                }
            }
        }

        // problem
        Collections.sort(oracleAndTrainingInvoices, new Comparator<Invoice>() {
            @Override
            public int compare(Invoice o1, Invoice o2) {
                return Double.compare(o1.getAmount(), o2.getAmount());
            }
        });
        for(Invoice inv : oracleAndTrainingInvoices){
            ids.add(inv.getId());
        }
        for (int i = 0; i <5 ; i++) {
            firstFiveIds.add(ids.get(i));
        }

         oracleAndTrainingInvoices = invoices.stream()
                .map(x -> x.getCustomer())
                .filter(x -> x == Customer.ORACLE)
                .collect(Collectors.toList());

        invoices.stream()
                .sorted()
                .collect(Collectors.toList());

        ids = invoices.stream()
                .map(Invoice::getId)
                .collect(Collectors.toList());

        firstFiveIds = invoices.stream()
                .map(Invoice::getId)
                .limit(5)
                .collect(Collectors.toList());


    }
}
