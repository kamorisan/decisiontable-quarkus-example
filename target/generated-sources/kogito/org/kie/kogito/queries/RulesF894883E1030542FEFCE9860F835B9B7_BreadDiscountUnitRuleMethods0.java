package org.kie.kogito.queries;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import org.kie.kogito.queries.BreadData;
import static org.kie.kogito.queries.RulesF894883E1030542FEFCE9860F835B9B7.*;

public class RulesF894883E1030542FEFCE9860F835B9B7_BreadDiscountUnitRuleMethods0 {

    /**
     * Rule name: Bread Discount_13
     */
    public static org.drools.model.Rule rule_Bread_32Discount__13() {
        final org.drools.model.Variable<org.kie.kogito.queries.BreadData> var_$l = D.declarationOf(org.kie.kogito.queries.BreadData.class,
                                                                                                   DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_BreadData_Metadata_INSTANCE,
                                                                                                   "$l",
                                                                                                   D.entryPoint("breadData"));
        final org.drools.model.BitMask mask_$l = org.drools.model.BitMask.getPatternMask(DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_BreadData_Metadata_INSTANCE,
                                                                                         "価格",
                                                                                         "メッセージ");
        org.drools.model.Rule rule = D.rule("org.kie.kogito.queries",
                                            "Bread Discount_13").unit(org.kie.kogito.queries.BreadDiscountUnit.class)
                                                                .build(D.pattern(var_$l).expr("GENERATED_B7E7BCB3E15ECFCF8284B52D1A0A5942",
                                                                                              org.kie.kogito.queries.P6F.LambdaPredicate6F62421F5F91088B2808199758B50D14.INSTANCE,
                                                                                              D.alphaIndexedBy(java.lang.String.class,
                                                                                                               org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                               DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_BreadData_Metadata_INSTANCE.getPropertyIndex("商品名"),
                                                                                                               org.kie.kogito.queries.P82.LambdaExtractor822A6F120130D182C3BEE085E741D75A.INSTANCE,
                                                                                                               "あんぱん"),
                                                                                              D.reactOn("商品名")).expr("GENERATED_54ED794BFFE114B6F74A5854942341F8",
                                                                                                                     org.kie.kogito.queries.PFF.LambdaPredicateFFE83BB5F9FDCFE9CA309414160F608E.INSTANCE,
                                                                                                                     D.alphaIndexedBy(int.class,
                                                                                                                                      org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                                                      DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_BreadData_Metadata_INSTANCE.getPropertyIndex("経過日数"),
                                                                                                                                      org.kie.kogito.queries.P32.LambdaExtractor327DF8B3DE87AF4FBFE877AA1313986E.INSTANCE,
                                                                                                                                      3),
                                                                                                                     D.reactOn("経過日数")).expr("GENERATED_A0695748B6341A28B2475A56B98AF9A4",
                                                                                                                                             org.kie.kogito.queries.P4A.LambdaPredicate4AC47F83E803C9E1BB6566A03E875C48.INSTANCE,
                                                                                                                                             D.alphaIndexedBy(int.class,
                                                                                                                                                              org.drools.model.Index.ConstraintType.LESS_THAN,
                                                                                                                                                              DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_BreadData_Metadata_INSTANCE.getPropertyIndex("経過日数"),
                                                                                                                                                              org.kie.kogito.queries.P32.LambdaExtractor327DF8B3DE87AF4FBFE877AA1313986E.INSTANCE,
                                                                                                                                                              5),
                                                                                                                                             D.reactOn("経過日数")),
                                                                       D.on(var_$l).execute(org.kie.kogito.queries.P76.LambdaConsequence766C77510B2E5194B9FC0F8602556ECD.INSTANCE));
        return rule;
    }

    /**
     * Rule name: Bread Discount_14
     */
    public static org.drools.model.Rule rule_Bread_32Discount__14() {
        final org.drools.model.Variable<org.kie.kogito.queries.BreadData> var_$l = D.declarationOf(org.kie.kogito.queries.BreadData.class,
                                                                                                   DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_BreadData_Metadata_INSTANCE,
                                                                                                   "$l",
                                                                                                   D.entryPoint("breadData"));
        final org.drools.model.BitMask mask_$l = org.drools.model.BitMask.getPatternMask(DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_BreadData_Metadata_INSTANCE,
                                                                                         "価格",
                                                                                         "メッセージ");
        org.drools.model.Rule rule = D.rule("org.kie.kogito.queries",
                                            "Bread Discount_14").unit(org.kie.kogito.queries.BreadDiscountUnit.class)
                                                                .build(D.pattern(var_$l).expr("GENERATED_B7E7BCB3E15ECFCF8284B52D1A0A5942",
                                                                                              org.kie.kogito.queries.P6F.LambdaPredicate6F62421F5F91088B2808199758B50D14.INSTANCE,
                                                                                              D.alphaIndexedBy(java.lang.String.class,
                                                                                                               org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                               DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_BreadData_Metadata_INSTANCE.getPropertyIndex("商品名"),
                                                                                                               org.kie.kogito.queries.P82.LambdaExtractor822A6F120130D182C3BEE085E741D75A.INSTANCE,
                                                                                                               "あんぱん"),
                                                                                              D.reactOn("商品名")).expr("GENERATED_E37E82F65471253A188D9CA78A5DD3BF",
                                                                                                                     org.kie.kogito.queries.PC4.LambdaPredicateC42D15F1ED94326BB21B6AD733B01800.INSTANCE,
                                                                                                                     D.alphaIndexedBy(int.class,
                                                                                                                                      org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                                                      DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_BreadData_Metadata_INSTANCE.getPropertyIndex("経過日数"),
                                                                                                                                      org.kie.kogito.queries.P32.LambdaExtractor327DF8B3DE87AF4FBFE877AA1313986E.INSTANCE,
                                                                                                                                      5),
                                                                                                                     D.reactOn("経過日数")),
                                                                       D.on(var_$l).execute(org.kie.kogito.queries.PAF.LambdaConsequenceAFCC6C4888690FF897E48B1C768B71E4.INSTANCE));
        return rule;
    }

    /**
     * Rule name: Bread Discount_15
     */
    public static org.drools.model.Rule rule_Bread_32Discount__15() {
        final org.drools.model.Variable<org.kie.kogito.queries.BreadData> var_$l = D.declarationOf(org.kie.kogito.queries.BreadData.class,
                                                                                                   DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_BreadData_Metadata_INSTANCE,
                                                                                                   "$l",
                                                                                                   D.entryPoint("breadData"));
        final org.drools.model.BitMask mask_$l = org.drools.model.BitMask.getPatternMask(DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_BreadData_Metadata_INSTANCE,
                                                                                         "価格",
                                                                                         "メッセージ");
        org.drools.model.Rule rule = D.rule("org.kie.kogito.queries",
                                            "Bread Discount_15").unit(org.kie.kogito.queries.BreadDiscountUnit.class)
                                                                .build(D.pattern(var_$l).expr("GENERATED_ED0F59BB7E3237668BB889524C1E4678",
                                                                                              org.kie.kogito.queries.P70.LambdaPredicate70E1A78C20951BD4380F76F62FA37647.INSTANCE,
                                                                                              D.alphaIndexedBy(java.lang.String.class,
                                                                                                               org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                               DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_BreadData_Metadata_INSTANCE.getPropertyIndex("商品名"),
                                                                                                               org.kie.kogito.queries.P82.LambdaExtractor822A6F120130D182C3BEE085E741D75A.INSTANCE,
                                                                                                               "カレーパン"),
                                                                                              D.reactOn("商品名")).expr("GENERATED_E825E131F03252AF44C828399DDEA195",
                                                                                                                     org.kie.kogito.queries.P5E.LambdaPredicate5EF9283CDCB7ECFF83F5D6A49AD6B1A3.INSTANCE,
                                                                                                                     D.alphaIndexedBy(int.class,
                                                                                                                                      org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                                                      DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_BreadData_Metadata_INSTANCE.getPropertyIndex("経過日数"),
                                                                                                                                      org.kie.kogito.queries.P32.LambdaExtractor327DF8B3DE87AF4FBFE877AA1313986E.INSTANCE,
                                                                                                                                      2),
                                                                                                                     D.reactOn("経過日数")),
                                                                       D.on(var_$l).execute(org.kie.kogito.queries.P5A.LambdaConsequence5AF48549E5181061A746A3B91714174C.INSTANCE));
        return rule;
    }

    /**
     * Rule name: Bread Discount_16
     */
    public static org.drools.model.Rule rule_Bread_32Discount__16() {
        final org.drools.model.Variable<org.kie.kogito.queries.BreadData> var_$l = D.declarationOf(org.kie.kogito.queries.BreadData.class,
                                                                                                   DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_BreadData_Metadata_INSTANCE,
                                                                                                   "$l",
                                                                                                   D.entryPoint("breadData"));
        final org.drools.model.BitMask mask_$l = org.drools.model.BitMask.getPatternMask(DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_BreadData_Metadata_INSTANCE,
                                                                                         "価格",
                                                                                         "メッセージ");
        org.drools.model.Rule rule = D.rule("org.kie.kogito.queries",
                                            "Bread Discount_16").unit(org.kie.kogito.queries.BreadDiscountUnit.class)
                                                                .build(D.pattern(var_$l).expr("GENERATED_2A5C150A506536D53C45F817510B4F81",
                                                                                              org.kie.kogito.queries.P4A.LambdaPredicate4A071AB934E47880B141BA8E6F0738FD.INSTANCE,
                                                                                              D.alphaIndexedBy(java.lang.String.class,
                                                                                                               org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                               DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_BreadData_Metadata_INSTANCE.getPropertyIndex("商品名"),
                                                                                                               org.kie.kogito.queries.P82.LambdaExtractor822A6F120130D182C3BEE085E741D75A.INSTANCE,
                                                                                                               "食パン"),
                                                                                              D.reactOn("商品名")).expr("GENERATED_2289FC996373081BDAE86132793B16D8",
                                                                                                                     org.kie.kogito.queries.P86.LambdaPredicate8656AE854D35CD8C061244C6829C369B.INSTANCE,
                                                                                                                     D.alphaIndexedBy(int.class,
                                                                                                                                      org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                                                      DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_BreadData_Metadata_INSTANCE.getPropertyIndex("経過日数"),
                                                                                                                                      org.kie.kogito.queries.P32.LambdaExtractor327DF8B3DE87AF4FBFE877AA1313986E.INSTANCE,
                                                                                                                                      4),
                                                                                                                     D.reactOn("経過日数")),
                                                                       D.on(var_$l).execute(org.kie.kogito.queries.P76.LambdaConsequence766C77510B2E5194B9FC0F8602556ECD.INSTANCE));
        return rule;
    }
}
