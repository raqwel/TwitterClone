package demo.dbflute.cbean.cq.bs;

import java.util.Map;

import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.exception.IllegalConditionBeanOperationException;
import demo.dbflute.cbean.cq.ciq.*;
import demo.dbflute.cbean.*;
import demo.dbflute.cbean.cq.*;

/**
 * The base condition-query of RETWEET.
 * @author DBFlute(AutoGenerator)
 */
public class BsRetweetCQ extends AbstractBsRetweetCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected RetweetCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsRetweetCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from RETWEET) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public RetweetCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected RetweetCIQ xcreateCIQ() {
        RetweetCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected RetweetCIQ xnewCIQ() {
        return new RetweetCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join RETWEET on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public RetweetCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        RetweetCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _retweetId;
    public ConditionValue xdfgetRetweetId()
    { if (_retweetId == null) { _retweetId = nCV(); }
      return _retweetId; }
    protected ConditionValue xgetCValueRetweetId() { return xdfgetRetweetId(); }

    /**
     * Add order-by as ascend. <br>
     * RETWEET_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsRetweetCQ addOrderBy_RetweetId_Asc() { regOBA("RETWEET_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * RETWEET_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsRetweetCQ addOrderBy_RetweetId_Desc() { regOBD("RETWEET_ID"); return this; }

    protected ConditionValue _userId;
    public ConditionValue xdfgetUserId()
    { if (_userId == null) { _userId = nCV(); }
      return _userId; }
    protected ConditionValue xgetCValueUserId() { return xdfgetUserId(); }

    /**
     * Add order-by as ascend. <br>
     * USER_ID: {UQ+, NotNull, BIGINT(19), FK to USER}
     * @return this. (NotNull)
     */
    public BsRetweetCQ addOrderBy_UserId_Asc() { regOBA("USER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * USER_ID: {UQ+, NotNull, BIGINT(19), FK to USER}
     * @return this. (NotNull)
     */
    public BsRetweetCQ addOrderBy_UserId_Desc() { regOBD("USER_ID"); return this; }

    protected ConditionValue _tweetId;
    public ConditionValue xdfgetTweetId()
    { if (_tweetId == null) { _tweetId = nCV(); }
      return _tweetId; }
    protected ConditionValue xgetCValueTweetId() { return xdfgetTweetId(); }

    /**
     * Add order-by as ascend. <br>
     * TWEET_ID: {+UQ, IX, NotNull, BIGINT(19), FK to TWEET}
     * @return this. (NotNull)
     */
    public BsRetweetCQ addOrderBy_TweetId_Asc() { regOBA("TWEET_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * TWEET_ID: {+UQ, IX, NotNull, BIGINT(19), FK to TWEET}
     * @return this. (NotNull)
     */
    public BsRetweetCQ addOrderBy_TweetId_Desc() { regOBD("TWEET_ID"); return this; }

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
    public BsRetweetCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, BIT}
     * @return this. (NotNull)
     */
    public BsRetweetCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsRetweetCQ addOrderBy_RegisterDatetime_Asc() { regOBA("REGISTER_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * REGISTER_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsRetweetCQ addOrderBy_RegisterDatetime_Desc() { regOBD("REGISTER_DATETIME"); return this; }

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
    public BsRetweetCQ addOrderBy_UpdateDatetime_Asc() { regOBA("UPDATE_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPDATE_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsRetweetCQ addOrderBy_UpdateDatetime_Desc() { regOBD("UPDATE_DATETIME"); return this; }

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
    public BsRetweetCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsRetweetCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        RetweetCQ bq = (RetweetCQ)bqs;
        RetweetCQ uq = (RetweetCQ)uqs;
        if (bq.hasConditionQueryTweet()) {
            uq.queryTweet().reflectRelationOnUnionQuery(bq.queryTweet(), uq.queryTweet());
        }
        if (bq.hasConditionQueryUser()) {
            uq.queryUser().reflectRelationOnUnionQuery(bq.queryUser(), uq.queryUser());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * TWEET by my TWEET_ID, named 'tweet'.
     * @return The instance of condition-query. (NotNull)
     */
    public TweetCQ queryTweet() {
        return xdfgetConditionQueryTweet();
    }
    public TweetCQ xdfgetConditionQueryTweet() {
        String prop = "tweet";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryTweet()); xsetupOuterJoinTweet(); }
        return xgetQueRlMap(prop);
    }
    protected TweetCQ xcreateQueryTweet() {
        String nrp = xresolveNRP("RETWEET", "tweet"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new TweetCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "tweet", nrp);
    }
    protected void xsetupOuterJoinTweet() { xregOutJo("tweet"); }
    public boolean hasConditionQueryTweet() { return xhasQueRlMap("tweet"); }

    /**
     * Get the condition-query for relation table. <br>
     * USER by my USER_ID, named 'user'.
     * @return The instance of condition-query. (NotNull)
     */
    public UserCQ queryUser() {
        return xdfgetConditionQueryUser();
    }
    public UserCQ xdfgetConditionQueryUser() {
        String prop = "user";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryUser()); xsetupOuterJoinUser(); }
        return xgetQueRlMap(prop);
    }
    protected UserCQ xcreateQueryUser() {
        String nrp = xresolveNRP("RETWEET", "user"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new UserCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "user", nrp);
    }
    protected void xsetupOuterJoinUser() { xregOutJo("user"); }
    public boolean hasConditionQueryUser() { return xhasQueRlMap("user"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, RetweetCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(RetweetCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, RetweetCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(RetweetCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, RetweetCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(RetweetCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, RetweetCQ> _myselfExistsMap;
    public Map<String, RetweetCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(RetweetCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, RetweetCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(RetweetCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return RetweetCB.class.getName(); }
    protected String xCQ() { return RetweetCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
