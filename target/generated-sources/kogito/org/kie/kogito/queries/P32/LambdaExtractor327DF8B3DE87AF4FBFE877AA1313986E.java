package org.kie.kogito.queries.P32;

import static org.kie.kogito.queries.RulesF894883E1030542FEFCE9860F835B9B7.*;
import org.kie.kogito.queries.BreadData;
import org.kie.kogito.queries.*;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaExtractor327DF8B3DE87AF4FBFE877AA1313986E implements org.drools.model.functions.Function1<org.kie.kogito.queries.BreadData, Integer>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "3F772E585D2FFB23A14CEC18913C1136";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public Integer apply(org.kie.kogito.queries.BreadData _this) {
        return _this.get経過日数();
    }
}
