package org.kie.kogito.queries;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import org.kie.kogito.queries.BreadData;
import static org.kie.kogito.queries.RulesF894883E1030542FEFCE9860F835B9B7.*;
import org.drools.model.Query;

public class RulesF894883E1030542FEFCE9860F835B9B7_BreadDiscountUnit extends RulesF894883E1030542FEFCE9860F835B9B7 {

    @Override
    public String getName() {
        return super.getName() + ".BreadDiscountUnit";
    }

    @Override
    public String getPackageName() {
        return super.getName();
    }

    /**
     * With the following expression ID:
     * org.drools.modelcompiler.builder.generator.DRLIdGenerator@1af863c0
     */
    @Override
    public java.util.List<org.drools.model.Rule> getRules() {
        return rules;
    }

    public java.util.List<org.drools.model.Rule> getRulesList() {
        return java.util.Arrays.asList(RulesF894883E1030542FEFCE9860F835B9B7_BreadDiscountUnitRuleMethods0.rule_Bread_32Discount__13(),
                                       RulesF894883E1030542FEFCE9860F835B9B7_BreadDiscountUnitRuleMethods0.rule_Bread_32Discount__14(),
                                       RulesF894883E1030542FEFCE9860F835B9B7_BreadDiscountUnitRuleMethods0.rule_Bread_32Discount__15(),
                                       RulesF894883E1030542FEFCE9860F835B9B7_BreadDiscountUnitRuleMethods0.rule_Bread_32Discount__16(),
                                       RulesF894883E1030542FEFCE9860F835B9B7_BreadDiscountUnitRuleMethods0.rule_Bread_32Discount__17());
    }

    java.util.List<org.drools.model.Rule> rules = getRulesList();

    final Query query_GetAllBread = query_GetAllBread();

    @Override
    public java.util.List<org.drools.model.Query> getQueries() {
        return queries;
    }

    private org.drools.model.Query query_GetAllBread() {
        final org.drools.model.Variable<org.kie.kogito.queries.BreadData> var_$l = D.declarationOf(org.kie.kogito.queries.BreadData.class,
                                                                                                   DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_BreadData_Metadata_INSTANCE,
                                                                                                   "$l",
                                                                                                   D.entryPoint("breadData"));
        org.drools.model.Query GetAllBread_build = queryDef_GetAllBread.build(D.pattern(var_$l,
                                                                                        D.entryPoint("breadData")));
        return GetAllBread_build;
    }

    java.util.List<org.drools.model.Query> queries = new java.util.ArrayList<>();

    {
        queries.add(query_GetAllBread);
    }
}
