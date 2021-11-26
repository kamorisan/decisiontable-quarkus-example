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
                                                                .attribute(org.drools.model.Rule.Attribute.DATE_EXPIRES,
                                                                           java.util.GregorianCalendar.from(java.time.LocalDate.parse("1-Nov-2021",
                                                                                                                                      DATE_TIME_FORMATTER).atStartOfDay(java.time.ZoneId.systemDefault())))
                                                                .attribute(org.drools.model.Rule.Attribute.DATE_EFFECTIVE,
                                                                           java.util.GregorianCalendar.from(java.time.LocalDate.parse("1-Oct-2021",
                                                                                                                                      DATE_TIME_FORMATTER).atStartOfDay(java.time.ZoneId.systemDefault())))
                                                                .build(D.pattern(var_$l).expr("GENERATED_B7E7BCB3E15ECFCF8284B52D1A0A5942",
                                                                                              org.kie.kogito.queries.P99.LambdaPredicate99343914AC1E50A69BC1D0119E0911DC.INSTANCE,
                                                                                              D.alphaIndexedBy(java.lang.String.class,
                                                                                                               org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                               DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_BreadData_Metadata_INSTANCE.getPropertyIndex("商品名"),
                                                                                                               org.kie.kogito.queries.P82.LambdaExtractor822A6F120130D182C3BEE085E741D75A.INSTANCE,
                                                                                                               "あんぱん"),
                                                                                              D.reactOn("商品名")).expr("GENERATED_54ED794BFFE114B6F74A5854942341F8",
                                                                                                                     org.kie.kogito.queries.P2A.LambdaPredicate2A70768DB7179847B2A35357C9FCDE4B.INSTANCE,
                                                                                                                     D.alphaIndexedBy(int.class,
                                                                                                                                      org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                                                      DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_BreadData_Metadata_INSTANCE.getPropertyIndex("経過日数"),
                                                                                                                                      org.kie.kogito.queries.P32.LambdaExtractor327DF8B3DE87AF4FBFE877AA1313986E.INSTANCE,
                                                                                                                                      3),
                                                                                                                     D.reactOn("経過日数")).expr("GENERATED_A0695748B6341A28B2475A56B98AF9A4",
                                                                                                                                             org.kie.kogito.queries.P81.LambdaPredicate81BEAA37486CB3F80733B092579978A0.INSTANCE,
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
                                                                .attribute(org.drools.model.Rule.Attribute.DATE_EFFECTIVE,
                                                                           java.util.GregorianCalendar.from(java.time.LocalDate.parse("1-Oct-2021",
                                                                                                                                      DATE_TIME_FORMATTER).atStartOfDay(java.time.ZoneId.systemDefault())))
                                                                .attribute(org.drools.model.Rule.Attribute.DATE_EXPIRES,
                                                                           java.util.GregorianCalendar.from(java.time.LocalDate.parse("1-Nov-2021",
                                                                                                                                      DATE_TIME_FORMATTER).atStartOfDay(java.time.ZoneId.systemDefault())))
                                                                .build(D.pattern(var_$l).expr("GENERATED_B7E7BCB3E15ECFCF8284B52D1A0A5942",
                                                                                              org.kie.kogito.queries.P99.LambdaPredicate99343914AC1E50A69BC1D0119E0911DC.INSTANCE,
                                                                                              D.alphaIndexedBy(java.lang.String.class,
                                                                                                               org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                               DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_BreadData_Metadata_INSTANCE.getPropertyIndex("商品名"),
                                                                                                               org.kie.kogito.queries.P82.LambdaExtractor822A6F120130D182C3BEE085E741D75A.INSTANCE,
                                                                                                               "あんぱん"),
                                                                                              D.reactOn("商品名")).expr("GENERATED_E37E82F65471253A188D9CA78A5DD3BF",
                                                                                                                     org.kie.kogito.queries.PCD.LambdaPredicateCD0A755195B22E4DBABB98304A9B61AA.INSTANCE,
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
                                                                .attribute(org.drools.model.Rule.Attribute.DATE_EFFECTIVE,
                                                                           java.util.GregorianCalendar.from(java.time.LocalDate.parse("1-Oct-2021",
                                                                                                                                      DATE_TIME_FORMATTER).atStartOfDay(java.time.ZoneId.systemDefault())))
                                                                .attribute(org.drools.model.Rule.Attribute.DATE_EXPIRES,
                                                                           java.util.GregorianCalendar.from(java.time.LocalDate.parse("1-Nov-2021",
                                                                                                                                      DATE_TIME_FORMATTER).atStartOfDay(java.time.ZoneId.systemDefault())))
                                                                .build(D.pattern(var_$l).expr("GENERATED_ED0F59BB7E3237668BB889524C1E4678",
                                                                                              org.kie.kogito.queries.P37.LambdaPredicate37DB02D02EDC7659952D1E79E245E8B7.INSTANCE,
                                                                                              D.alphaIndexedBy(java.lang.String.class,
                                                                                                               org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                               DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_BreadData_Metadata_INSTANCE.getPropertyIndex("商品名"),
                                                                                                               org.kie.kogito.queries.P82.LambdaExtractor822A6F120130D182C3BEE085E741D75A.INSTANCE,
                                                                                                               "カレーパン"),
                                                                                              D.reactOn("商品名")).expr("GENERATED_E825E131F03252AF44C828399DDEA195",
                                                                                                                     org.kie.kogito.queries.PB5.LambdaPredicateB563C981E265978E4FB31BDCE8BE9D27.INSTANCE,
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
                                                                .attribute(org.drools.model.Rule.Attribute.DATE_EFFECTIVE,
                                                                           java.util.GregorianCalendar.from(java.time.LocalDate.parse("1-Oct-2021",
                                                                                                                                      DATE_TIME_FORMATTER).atStartOfDay(java.time.ZoneId.systemDefault())))
                                                                .attribute(org.drools.model.Rule.Attribute.DATE_EXPIRES,
                                                                           java.util.GregorianCalendar.from(java.time.LocalDate.parse("1-Nov-2021",
                                                                                                                                      DATE_TIME_FORMATTER).atStartOfDay(java.time.ZoneId.systemDefault())))
                                                                .build(D.pattern(var_$l).expr("GENERATED_2A5C150A506536D53C45F817510B4F81",
                                                                                              org.kie.kogito.queries.P7D.LambdaPredicate7DBA5139B040B81910AB99D25D76F899.INSTANCE,
                                                                                              D.alphaIndexedBy(java.lang.String.class,
                                                                                                               org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                               DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_BreadData_Metadata_INSTANCE.getPropertyIndex("商品名"),
                                                                                                               org.kie.kogito.queries.P82.LambdaExtractor822A6F120130D182C3BEE085E741D75A.INSTANCE,
                                                                                                               "食パン"),
                                                                                              D.reactOn("商品名")).expr("GENERATED_2289FC996373081BDAE86132793B16D8",
                                                                                                                     org.kie.kogito.queries.PE8.LambdaPredicateE872720E2F62CC1053EDCF096417C2DC.INSTANCE,
                                                                                                                     D.alphaIndexedBy(int.class,
                                                                                                                                      org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                                                      DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_BreadData_Metadata_INSTANCE.getPropertyIndex("経過日数"),
                                                                                                                                      org.kie.kogito.queries.P32.LambdaExtractor327DF8B3DE87AF4FBFE877AA1313986E.INSTANCE,
                                                                                                                                      4),
                                                                                                                     D.reactOn("経過日数")),
                                                                       D.on(var_$l).execute(org.kie.kogito.queries.P76.LambdaConsequence766C77510B2E5194B9FC0F8602556ECD.INSTANCE));
        return rule;
    }

    /**
     * Rule name: Bread Discount_17
     */
    public static org.drools.model.Rule rule_Bread_32Discount__17() {
        final org.drools.model.Variable<org.kie.kogito.queries.BreadData> var_$l = D.declarationOf(org.kie.kogito.queries.BreadData.class,
                                                                                                   DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_BreadData_Metadata_INSTANCE,
                                                                                                   "$l",
                                                                                                   D.entryPoint("breadData"));
        final org.drools.model.BitMask mask_$l = org.drools.model.BitMask.getPatternMask(DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_BreadData_Metadata_INSTANCE,
                                                                                         "価格",
                                                                                         "メッセージ");
        org.drools.model.Rule rule = D.rule("org.kie.kogito.queries",
                                            "Bread Discount_17").unit(org.kie.kogito.queries.BreadDiscountUnit.class)
                                                                .attribute(org.drools.model.Rule.Attribute.DATE_EXPIRES,
                                                                           java.util.GregorianCalendar.from(java.time.LocalDate.parse("1-Dec-2021",
                                                                                                                                      DATE_TIME_FORMATTER).atStartOfDay(java.time.ZoneId.systemDefault())))
                                                                .attribute(org.drools.model.Rule.Attribute.DATE_EFFECTIVE,
                                                                           java.util.GregorianCalendar.from(java.time.LocalDate.parse("1-Nov-2021",
                                                                                                                                      DATE_TIME_FORMATTER).atStartOfDay(java.time.ZoneId.systemDefault())))
                                                                .build(D.pattern(var_$l).expr("GENERATED_2A5C150A506536D53C45F817510B4F81",
                                                                                              org.kie.kogito.queries.P7D.LambdaPredicate7DBA5139B040B81910AB99D25D76F899.INSTANCE,
                                                                                              D.alphaIndexedBy(java.lang.String.class,
                                                                                                               org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                               DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_BreadData_Metadata_INSTANCE.getPropertyIndex("商品名"),
                                                                                                               org.kie.kogito.queries.P82.LambdaExtractor822A6F120130D182C3BEE085E741D75A.INSTANCE,
                                                                                                               "食パン"),
                                                                                              D.reactOn("商品名")).expr("GENERATED_2289FC996373081BDAE86132793B16D8",
                                                                                                                     org.kie.kogito.queries.PE8.LambdaPredicateE872720E2F62CC1053EDCF096417C2DC.INSTANCE,
                                                                                                                     D.alphaIndexedBy(int.class,
                                                                                                                                      org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                                                      DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_BreadData_Metadata_INSTANCE.getPropertyIndex("経過日数"),
                                                                                                                                      org.kie.kogito.queries.P32.LambdaExtractor327DF8B3DE87AF4FBFE877AA1313986E.INSTANCE,
                                                                                                                                      4),
                                                                                                                     D.reactOn("経過日数")),
                                                                       D.on(var_$l).execute(org.kie.kogito.queries.PAF.LambdaConsequenceAFCC6C4888690FF897E48B1C768B71E4.INSTANCE));
        return rule;
    }
}
