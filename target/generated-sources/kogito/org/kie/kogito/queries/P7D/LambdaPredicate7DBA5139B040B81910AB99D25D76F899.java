package org.kie.kogito.queries.P7D;

import static org.kie.kogito.queries.RulesF894883E1030542FEFCE9860F835B9B7.*;
import org.kie.kogito.queries.BreadData;
import org.kie.kogito.queries.*;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaPredicate7DBA5139B040B81910AB99D25D76F899 implements org.drools.model.functions.Predicate1<org.kie.kogito.queries.BreadData>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "A2CC50C47DA831C729D59EF2618995E2";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public boolean test(org.kie.kogito.queries.BreadData _this) throws java.lang.Exception {
        return org.drools.modelcompiler.util.EvaluationUtil.areNullSafeEquals(_this.get商品名(), "食パン");
    }

    @Override()
    public org.drools.model.functions.PredicateInformation predicateInformation() {
        return new org.drools.model.functions.PredicateInformation("商品名 == \"食パン\"", "Bread Discount_17", "org/kie/kogito/queries/BreadDiscountRule.xls");
    }
}