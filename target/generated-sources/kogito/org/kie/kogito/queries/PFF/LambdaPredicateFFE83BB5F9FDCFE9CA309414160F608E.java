package org.kie.kogito.queries.PFF;

import static org.kie.kogito.queries.RulesF894883E1030542FEFCE9860F835B9B7.*;
import org.kie.kogito.queries.BreadData;
import org.kie.kogito.queries.*;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaPredicateFFE83BB5F9FDCFE9CA309414160F608E implements org.drools.model.functions.Predicate1<org.kie.kogito.queries.BreadData>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "E91E641EC55238B93408F4C3898E873F";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public boolean test(org.kie.kogito.queries.BreadData _this) throws java.lang.Exception {
        return org.drools.modelcompiler.util.EvaluationUtil.greaterOrEqualNumbers(_this.get経過日数(), 3);
    }

    @Override()
    public org.drools.model.functions.PredicateInformation predicateInformation() {
        return new org.drools.model.functions.PredicateInformation("商品名 == \"あんぱん\"", "Bread Discount_14", "/Users/kamori/VSCode/WorkSpace/kogito-study/decisiontable-quarkus-example/src/main/resources/org/kie/kogito/queries/BreadDiscountRule.xls");
    }
}
