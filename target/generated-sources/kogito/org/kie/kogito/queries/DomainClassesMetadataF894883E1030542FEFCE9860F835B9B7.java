package org.kie.kogito.queries;
public class DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7 {

    public static final org.drools.model.DomainClassMetadata org_kie_kogito_rules_DataStore_Metadata_INSTANCE = new org_kie_kogito_rules_DataStore_Metadata();
    private static class org_kie_kogito_rules_DataStore_Metadata implements org.drools.model.DomainClassMetadata {

        @Override
        public Class<?> getDomainClass() {
            return org.kie.kogito.rules.DataStore.class;
        }

        @Override
        public int getPropertiesSize() {
            return 0;
        }

        @Override
        public int getPropertyIndex( String name ) {
            switch(name) {
             }
             throw new RuntimeException("Unknown property '" + name + "' for class class interface org.kie.kogito.rules.DataStore");
        }
    }

    public static final org.drools.model.DomainClassMetadata org_kie_kogito_queries_BreadData_Metadata_INSTANCE = new org_kie_kogito_queries_BreadData_Metadata();
    private static class org_kie_kogito_queries_BreadData_Metadata implements org.drools.model.DomainClassMetadata {

        @Override
        public Class<?> getDomainClass() {
            return org.kie.kogito.queries.BreadData.class;
        }

        @Override
        public int getPropertiesSize() {
            return 4;
        }

        @Override
        public int getPropertyIndex( String name ) {
            switch(name) {
                case "メッセージ": return 0;
                case "価格": return 1;
                case "商品名": return 2;
                case "経過日数": return 3;
             }
             throw new RuntimeException("Unknown property '" + name + "' for class class class org.kie.kogito.queries.BreadData");
        }
    }

}