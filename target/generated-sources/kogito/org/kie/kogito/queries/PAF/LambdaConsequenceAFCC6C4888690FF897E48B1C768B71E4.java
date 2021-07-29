package org.kie.kogito.queries.PAF;

import static org.kie.kogito.queries.RulesF894883E1030542FEFCE9860F835B9B7.*;
import org.kie.kogito.queries.BreadData;
import org.kie.kogito.queries.*;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaConsequenceAFCC6C4888690FF897E48B1C768B71E4 implements org.drools.model.functions.Block2<org.drools.model.Drools, org.kie.kogito.queries.BreadData>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "56C370E427A2D35D039A49483E369B03";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    private final org.drools.model.BitMask mask_$l = org.drools.model.BitMask.getPatternMask(DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_BreadData_Metadata_INSTANCE, "価格", "メッセージ");

    @Override()
    public void execute(org.drools.model.Drools drools, org.kie.kogito.queries.BreadData $l) throws java.lang.Exception {
        {
            int $Amount = $l.get価格();
            {
                ($l).set価格($Amount * (100 - 20) / 100);
            }
            System.out.println("20%値引きしています。");
            {
                ($l).setメッセージ("20%値引きしています。");
            }
            drools.update($l, mask_$l);
            drools.update($l, mask_$l);
        }
    }
}
