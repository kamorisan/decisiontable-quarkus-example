package org.kie.kogito.queries.P82;

import static org.kie.kogito.queries.RulesF894883E1030542FEFCE9860F835B9B7.*;
import org.kie.kogito.queries.BreadData;
import org.kie.kogito.queries.*;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaExtractor822A6F120130D182C3BEE085E741D75A implements org.drools.model.functions.Function1<org.kie.kogito.queries.BreadData, java.lang.String>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "7717ED9B4C32A41607C143CA881E62CE";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public java.lang.String apply(org.kie.kogito.queries.BreadData _this) {
        return _this.get商品名();
    }
}
