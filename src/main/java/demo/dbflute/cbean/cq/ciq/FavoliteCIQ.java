package demo.dbflute.cbean.cq.ciq;

import java.util.Map;
import org.dbflute.cbean.*;
import org.dbflute.cbean.ckey.*;
import org.dbflute.cbean.coption.ConditionOption;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.exception.IllegalConditionBeanOperationException;
import demo.dbflute.cbean.*;
import demo.dbflute.cbean.cq.bs.*;
import demo.dbflute.cbean.cq.*;

/**
 * The condition-query for in-line of FAVOLITE.
 * @author DBFlute(AutoGenerator)
 */
public class FavoliteCIQ extends AbstractBsFavoliteCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsFavoliteCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public FavoliteCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsFavoliteCQ myCQ) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
        _myCQ = myCQ;
        _foreignPropertyName = _myCQ.xgetForeignPropertyName(); // accept foreign property name
        _relationPath = _myCQ.xgetRelationPath(); // accept relation path
        _inline = true;
    }

    // ===================================================================================
    //                                                             Override about Register
    //                                                             =======================
    protected void reflectRelationOnUnionQuery(ConditionQuery bq, ConditionQuery uq)
    { throw new IllegalConditionBeanOperationException("InlineView cannot use Union: " + bq + " : " + uq); }

    @Override
    protected void setupConditionValueAndRegisterWhereClause(ConditionKey k, Object v, ConditionValue cv, String col)
    { regIQ(k, v, cv, col); }

    @Override
    protected void setupConditionValueAndRegisterWhereClause(ConditionKey k, Object v, ConditionValue cv, String col, ConditionOption op)
    { regIQ(k, v, cv, col, op); }

    @Override
    protected void registerWhereClause(String wc)
    { registerInlineWhereClause(wc); }

    @Override
    protected boolean isInScopeRelationSuppressLocalAliasName() {
        if (_onClause) { throw new IllegalConditionBeanOperationException("InScopeRelation on OnClause is unsupported."); }
        return true;
    }

    // ===================================================================================
    //                                                                Override about Query
    //                                                                ====================
    protected ConditionValue xgetCValueFavoliteId() { return _myCQ.xdfgetFavoliteId(); }
    protected ConditionValue xgetCValueUserId() { return _myCQ.xdfgetUserId(); }
    protected ConditionValue xgetCValueTweetId() { return _myCQ.xdfgetTweetId(); }
    protected ConditionValue xgetCValueDelFlg() { return _myCQ.xdfgetDelFlg(); }
    protected ConditionValue xgetCValueRegisterDatetime() { return _myCQ.xdfgetRegisterDatetime(); }
    protected ConditionValue xgetCValueUpdateDatetime() { return _myCQ.xdfgetUpdateDatetime(); }
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String pp) { return null; }
    public String keepScalarCondition(FavoliteCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(FavoliteCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(FavoliteCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(FavoliteCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return FavoliteCB.class.getName(); }
    protected String xinCQ() { return FavoliteCQ.class.getName(); }
}
