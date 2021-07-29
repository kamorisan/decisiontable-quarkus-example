package org.kie.kogito.queries.P70;

import static org.kie.kogito.queries.RulesF894883E1030542FEFCE9860F835B9B7.*;
import org.kie.kogito.queries.BreadData;
import org.kie.kogito.queries.*;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaPredicate70E1A78C20951BD4380F76F62FA37647 implements org.drools.model.functions.Predicate1<org.kie.kogito.queries.BreadData>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "708CD4E68C009909D449A8DB9C0688ED";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public boolean test(org.kie.kogito.queries.BreadData _this) throws java.lang.Exception {
        return org.drools.modelcompiler.util.EvaluationUtil.areNullSafeEquals(_this.get商品名(), "カレーパン");
    }

    @Override()
    public org.drools.model.functions.PredicateInformation predicateInformation() {
        return new org.drools.model.functions.PredicateInformation("商品名 == \"カレーパン\"", "Bread Discount_15", "/Users/kamori/VSCode/WorkSpace/kogito-study/decisiontable-quarkus-example/src/main/resources/org/kie/kogito/queries/BreadDiscountRule.xls");
    }
}
