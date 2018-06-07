package taxation;

import java.util.List;

public class TaxAdvisor {
  public static void calculateTaxes(Taxable t) {}

  public static void batchCalculateTaxes(List<? extends Taxable> lt) {
    for (Taxable t : lt) {
      calculateTaxes(t);
    }
    // NOT LEGAL (because we cannot know if Corporation is assignment
    // compatible to ?  -- we don't know what ? is for sure).
//    Corporation corp = null;
//    lt.add(corp);
  }

  public static void main(String[] args) {
    List<Taxable> clients = null;
    batchCalculateTaxes(clients);

    List<Individual> joesClients = null;
    batchCalculateTaxes(joesClients);
  }
}
