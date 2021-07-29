package org.kie.kogito.queries;

public class BreadDiscountUnitRuleUnitInstance extends org.kie.kogito.rules.units.AbstractRuleUnitInstance<org.kie.kogito.queries.BreadDiscountUnit> {

    public BreadDiscountUnitRuleUnitInstance(org.kie.kogito.rules.RuleUnit<org.kie.kogito.queries.BreadDiscountUnit> unit, org.kie.kogito.queries.BreadDiscountUnit value, org.kie.api.runtime.KieSession session) {
        super(unit, value, session);
    }

    @Override()
    protected void bind(org.kie.api.runtime.KieSession runtime, org.kie.kogito.queries.BreadDiscountUnit value) {
        if (value.getBreadData() == null) {
            value.setBreadData(org.kie.kogito.rules.DataSource.createStore());
        }
        value.getBreadData().subscribe(new org.kie.kogito.rules.units.EntryPointDataProcessor(runtime.getEntryPoint("breadData")));
        runtime.setGlobal("breadData", value.getBreadData());
    }

    @Override()
    protected <Q> org.kie.kogito.rules.RuleUnitQuery<Q> createRuleUnitQuery(Class<? extends org.kie.kogito.rules.RuleUnitQuery<Q>> query) {
        if (BreadDiscountUnitQueryGetAllBread.class.equals(query))
            return (org.kie.kogito.rules.RuleUnitQuery<Q>) new BreadDiscountUnitQueryGetAllBread(this);
        throw new IllegalArgumentException("Unknown query: " + query.getCanonicalName());
    }
}
