package org.kie.kogito.queries.P76;

import static org.kie.kogito.queries.RulesF894883E1030542FEFCE9860F835B9B7.*;
import org.kie.kogito.queries.BreadData;
import org.kie.kogito.queries.*;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaConsequence766C77510B2E5194B9FC0F8602556ECD implements org.drools.model.functions.Block2<org.drools.model.Drools, org.kie.kogito.queries.BreadData>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "E4DCDF49B7D390E6BBB96611EF97B79D";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    private final org.drools.model.BitMask mask_$l = org.drools.model.BitMask.getPatternMask(DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_BreadData_Metadata_INSTANCE, "価格", "メッセージ");

    @Override()
    public void execute(org.drools.model.Drools drools, org.kie.kogito.queries.BreadData $l) throws java.lang.Exception {
        {
            int $Amount = $l.get価格();
            {
                ($l).set価格($Amount * (100 - 10) / 100);
            }
            System.out.println("10%値引きしています。");
            {
                ($l).setメッセージ("10%値引きしています。");
            }
            drools.update($l, mask_$l);
            drools.update($l, mask_$l);
        }
    }
}
