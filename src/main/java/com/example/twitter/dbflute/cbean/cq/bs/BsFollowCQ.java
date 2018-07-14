package com.example.twitter.dbflute.cbean.cq.bs;

import java.util.Map;

import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.exception.IllegalConditionBeanOperationException;
import com.example.twitter.dbflute.cbean.cq.ciq.*;
import com.example.twitter.dbflute.cbean.*;
import com.example.twitter.dbflute.cbean.cq.*;

/**
 * The base condition-query of FOLLOW.
 * @author DBFlute(AutoGenerator)
 */
public class BsFollowCQ extends AbstractBsFollowCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected FollowCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsFollowCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from FOLLOW) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public FollowCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected FollowCIQ xcreateCIQ() {
        FollowCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected FollowCIQ xnewCIQ() {
        return new FollowCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join FOLLOW on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public FollowCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        FollowCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _followId;
    public ConditionValue xdfgetFollowId()
    { if (_followId == null) { _followId = nCV(); }
      return _followId; }
    protected ConditionValue xgetCValueFollowId() { return xdfgetFollowId(); }

    /**
     * Add order-by as ascend. <br>
     * FOLLOW_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsFollowCQ addOrderBy_FollowId_Asc() { regOBA("FOLLOW_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * FOLLOW_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsFollowCQ addOrderBy_FollowId_Desc() { regOBD("FOLLOW_ID"); return this; }

    protected ConditionValue _followeeId;
    public ConditionValue xdfgetFolloweeId()
    { if (_followeeId == null) { _followeeId = nCV(); }
      return _followeeId; }
    protected ConditionValue xgetCValueFolloweeId() { return xdfgetFolloweeId(); }

    /**
     * Add order-by as ascend. <br>
     * FOLLOWEE_ID: {UQ+, NotNull, BIGINT(19), FK to USER}
     * @return this. (NotNull)
     */
    public BsFollowCQ addOrderBy_FolloweeId_Asc() { regOBA("FOLLOWEE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * FOLLOWEE_ID: {UQ+, NotNull, BIGINT(19), FK to USER}
     * @return this. (NotNull)
     */
    public BsFollowCQ addOrderBy_FolloweeId_Desc() { regOBD("FOLLOWEE_ID"); return this; }

    protected ConditionValue _followerId;
    public ConditionValue xdfgetFollowerId()
    { if (_followerId == null) { _followerId = nCV(); }
      return _followerId; }
    protected ConditionValue xgetCValueFollowerId() { return xdfgetFollowerId(); }

    /**
     * Add order-by as ascend. <br>
     * FOLLOWER_ID: {+UQ, IX, NotNull, BIGINT(19), FK to USER}
     * @return this. (NotNull)
     */
    public BsFollowCQ addOrderBy_FollowerId_Asc() { regOBA("FOLLOWER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * FOLLOWER_ID: {+UQ, IX, NotNull, BIGINT(19), FK to USER}
     * @return this. (NotNull)
     */
    public BsFollowCQ addOrderBy_FollowerId_Desc() { regOBD("FOLLOWER_ID"); return this; }

    protected ConditionValue _delFlg;
    public ConditionValue xdfgetDelFlg()
    { if (_delFlg == null) { _delFlg = nCV(); }
      return _delFlg; }
    protected ConditionValue xgetCValueDelFlg() { return xdfgetDelFlg(); }

    /**
     * Add order-by as ascend. <br>
     * DEL_FLG: {NotNull, BIT}
     * @return this. (NotNull)
     */
    public BsFollowCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, BIT}
     * @return this. (NotNull)
     */
    public BsFollowCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

    protected ConditionValue _registerDatetime;
    public ConditionValue xdfgetRegisterDatetime()
    { if (_registerDatetime == null) { _registerDatetime = nCV(); }
      return _registerDatetime; }
    protected ConditionValue xgetCValueRegisterDatetime() { return xdfgetRegisterDatetime(); }

    /**
     * Add order-by as ascend. <br>
     * REGISTER_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsFollowCQ addOrderBy_RegisterDatetime_Asc() { regOBA("REGISTER_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * REGISTER_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsFollowCQ addOrderBy_RegisterDatetime_Desc() { regOBD("REGISTER_DATETIME"); return this; }

    protected ConditionValue _updateDatetime;
    public ConditionValue xdfgetUpdateDatetime()
    { if (_updateDatetime == null) { _updateDatetime = nCV(); }
      return _updateDatetime; }
    protected ConditionValue xgetCValueUpdateDatetime() { return xdfgetUpdateDatetime(); }

    /**
     * Add order-by as ascend. <br>
     * UPDATE_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsFollowCQ addOrderBy_UpdateDatetime_Asc() { regOBA("UPDATE_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPDATE_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsFollowCQ addOrderBy_UpdateDatetime_Desc() { regOBD("UPDATE_DATETIME"); return this; }

    // ===================================================================================
    //                                                             SpecifiedDerivedOrderBy
    //                                                             =======================
    /**
     * Add order-by for specified derived column as ascend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] asc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Asc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsFollowCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

    /**
     * Add order-by for specified derived column as descend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] desc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Desc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsFollowCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        FollowCQ bq = (FollowCQ)bqs;
        FollowCQ uq = (FollowCQ)uqs;
        if (bq.hasConditionQueryUserByFolloweeId()) {
            uq.queryUserByFolloweeId().reflectRelationOnUnionQuery(bq.queryUserByFolloweeId(), uq.queryUserByFolloweeId());
        }
        if (bq.hasConditionQueryUserByFollowerId()) {
            uq.queryUserByFollowerId().reflectRelationOnUnionQuery(bq.queryUserByFollowerId(), uq.queryUserByFollowerId());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * USER by my FOLLOWEE_ID, named 'userByFolloweeId'.
     * @return The instance of condition-query. (NotNull)
     */
    public UserCQ queryUserByFolloweeId() {
        return xdfgetConditionQueryUserByFolloweeId();
    }
    public UserCQ xdfgetConditionQueryUserByFolloweeId() {
        String prop = "userByFolloweeId";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryUserByFolloweeId()); xsetupOuterJoinUserByFolloweeId(); }
        return xgetQueRlMap(prop);
    }
    protected UserCQ xcreateQueryUserByFolloweeId() {
        String nrp = xresolveNRP("FOLLOW", "userByFolloweeId"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new UserCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "userByFolloweeId", nrp);
    }
    protected void xsetupOuterJoinUserByFolloweeId() { xregOutJo("userByFolloweeId"); }
    public boolean hasConditionQueryUserByFolloweeId() { return xhasQueRlMap("userByFolloweeId"); }

    /**
     * Get the condition-query for relation table. <br>
     * USER by my FOLLOWER_ID, named 'userByFollowerId'.
     * @return The instance of condition-query. (NotNull)
     */
    public UserCQ queryUserByFollowerId() {
        return xdfgetConditionQueryUserByFollowerId();
    }
    public UserCQ xdfgetConditionQueryUserByFollowerId() {
        String prop = "userByFollowerId";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryUserByFollowerId()); xsetupOuterJoinUserByFollowerId(); }
        return xgetQueRlMap(prop);
    }
    protected UserCQ xcreateQueryUserByFollowerId() {
        String nrp = xresolveNRP("FOLLOW", "userByFollowerId"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new UserCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "userByFollowerId", nrp);
    }
    protected void xsetupOuterJoinUserByFollowerId() { xregOutJo("userByFollowerId"); }
    public boolean hasConditionQueryUserByFollowerId() { return xhasQueRlMap("userByFollowerId"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, FollowCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(FollowCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, FollowCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(FollowCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, FollowCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(FollowCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, FollowCQ> _myselfExistsMap;
    public Map<String, FollowCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(FollowCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, FollowCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(FollowCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return FollowCB.class.getName(); }
    protected String xCQ() { return FollowCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
