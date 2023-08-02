import java.util.*;
import java.util.stream.Collectors;

   class PartnerMerger {
        public static void main(String[] args) {
            final Partner[] partnerArrayA = new Partner[] {
                    new Partner("BMO", 0),
                    new Partner("Budget", 10),
                    new Partner("Good Year", 20)
            };
            final Partner[] partnerArrayB = new Partner[] {
                    new Partner("good year", 5),
                    new Partner("IHG", 25)
            };
            final List<Partner> partners = mergePartners(partnerArrayA, partnerArrayB);
            // expected: [Partner{name=‘IHG’, priority=25}, Partner{name=‘Budget’, priority=10}, Partner{name=‘good year’, priority=5}, Partner{name=‘BMO’, priority=0}]
            System.out.println(partners);
        }
        /**
         * Merge 2 partner array and get a list of distinct partners sorted by priority in descending order.
         *
         * Note:
         * If 2 partners have the same name (case insensitive), we assume they are the same partner.
         * And if both array contains the same partner, take the one in partnerArrayB as the source of truth.
         *
         * @param partnerArrayA partners to be merged
         * @param partnerArrayB partners to be merged
         * @return a list of distinct partners sorted by priority in descending order
         */
        private static List<Partner> mergePartnersToCheck(final Partner[] partnerArrayA, final Partner[] partnerArrayB) {
            // TODO: implement it by leveraging the APIs from Java Collection Framework, and feel free to add appropriate method in the Partner class

            // Utilizar TreeSet para mantener los objetos Partner ordenados automáticamente
            Set<Partner> resultSet = new TreeSet<>(Comparator.reverseOrder());


            resultSet.addAll(Arrays.asList(partnerArrayA));
            resultSet.addAll(Arrays.asList(partnerArrayB));


            // Devolver la lista ordenada a partir del TreeSet
            return resultSet.stream().collect(Collectors.toList());
        }

       private static List<Partner> mergePartners(final Partner[] partnerArrayA, final Partner[] partnerArrayB) {
           Map<String, Partner> partnersMap = new HashMap<>();

           // Agregar los partners del partnerArrayA al mapa
           for (Partner partner : partnerArrayA) {
               partnersMap.put(partner.name.toLowerCase(), partner);
           }

           // Agregar los partners del partnerArrayB al mapa (los de partnerArrayB sobrescribirán los duplicados)
           for (Partner partner : partnerArrayB) {
               partnersMap.put(partner.name.toLowerCase(), partner);
           }

           // Obtener la lista ordenada de partners a partir de los valores del mapa
           List<Partner> mergedPartners = new ArrayList<>(partnersMap.values());
           mergedPartners.sort(Comparator.comparingInt(Partner::getPriority).reversed());

           return mergedPartners;
       }
        private static class Partner implements Comparable<Partner> {
            private final String name;
            private final int priority;

            public String getName() {
                return name;
            }

            public int getPriority() {
                return priority;
            }

            public Partner(String name, int priority) {
                this.name = name;
                this.priority = priority;
            }

            @Override
            public String toString() {
                return "Partner{" +
                        "name='" + name + '\'' +
                        ", priority=" + priority +
                        '}';
            }

            @Override
            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                Partner partner = (Partner) o;
                return Objects.equals(name.toLowerCase(), partner.name.toLowerCase());
            }

            @Override
            public int hashCode() {
                return Objects.hash(name);
            }


            @Override
            public int compareTo(Partner o) {
                return Integer.compare(this.priority, o.priority);
            }
        }
}