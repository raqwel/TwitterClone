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
 * The base condition-query of REPLY.
 * @author DBFlute(AutoGenerator)
 */
public class BsReplyCQ extends AbstractBsReplyCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected ReplyCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsReplyCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from REPLY) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public ReplyCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected ReplyCIQ xcreateCIQ() {
        ReplyCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected ReplyCIQ xnewCIQ() {
        return new ReplyCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join REPLY on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public ReplyCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        ReplyCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _replyId;
    public ConditionValue xdfgetReplyId()
    { if (_replyId == null) { _replyId = nCV(); }
      return _replyId; }
    protected ConditionValue xgetCValueReplyId() { return xdfgetReplyId(); }

    /**
     * Add order-by as ascend. <br>
     * REPLY_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsReplyCQ addOrderBy_ReplyId_Asc() { regOBA("REPLY_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * REPLY_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsReplyCQ addOrderBy_ReplyId_Desc() { regOBD("REPLY_ID"); return this; }

    protected ConditionValue _replyeeId;
    public ConditionValue xdfgetReplyeeId()
    { if (_replyeeId == null) { _replyeeId = nCV(); }
      return _replyeeId; }
    protected ConditionValue xgetCValueReplyeeId() { return xdfgetReplyeeId(); }

    /**
     * Add order-by as ascend. <br>
     * REPLYEE_ID: {IX, NotNull, BIGINT(19), FK to USER}
     * @return this. (NotNull)
     */
    public BsReplyCQ addOrderBy_ReplyeeId_Asc() { regOBA("REPLYEE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * REPLYEE_ID: {IX, NotNull, BIGINT(19), FK to USER}
     * @return this. (NotNull)
     */
    public BsReplyCQ addOrderBy_ReplyeeId_Desc() { regOBD("REPLYEE_ID"); return this; }

    protected ConditionValue _replyerId;
    public ConditionValue xdfgetReplyerId()
    { if (_replyerId == null) { _replyerId = nCV(); }
      return _replyerId; }
    protected ConditionValue xgetCValueReplyerId() { return xdfgetReplyerId(); }

    /**
     * Add order-by as ascend. <br>
     * REPLYER_ID: {IX, NotNull, BIGINT(19), FK to USER}
     * @return this. (NotNull)
     */
    public BsReplyCQ addOrderBy_ReplyerId_Asc() { regOBA("REPLYER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * REPLYER_ID: {IX, NotNull, BIGINT(19), FK to USER}
     * @return this. (NotNull)
     */
    public BsReplyCQ addOrderBy_ReplyerId_Desc() { regOBD("REPLYER_ID"); return this; }

    protected ConditionValue _replyeeTweetId;
    public ConditionValue xdfgetReplyeeTweetId()
    { if (_replyeeTweetId == null) { _replyeeTweetId = nCV(); }
      return _replyeeTweetId; }
    protected ConditionValue xgetCValueReplyeeTweetId() { return xdfgetReplyeeTweetId(); }

    /**
     * Add order-by as ascend. <br>
     * REPLYEE_TWEET_ID: {IX, NotNull, BIGINT(19), FK to TWEET}
     * @return this. (NotNull)
     */
    public BsReplyCQ addOrderBy_ReplyeeTweetId_Asc() { regOBA("REPLYEE_TWEET_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * REPLYEE_TWEET_ID: {IX, NotNull, BIGINT(19), FK to TWEET}
     * @return this. (NotNull)
     */
    public BsReplyCQ addOrderBy_ReplyeeTweetId_Desc() { regOBD("REPLYEE_TWEET_ID"); return this; }

    protected ConditionValue _replyerTweetId;
    public ConditionValue xdfgetReplyerTweetId()
    { if (_replyerTweetId == null) { _replyerTweetId = nCV(); }
      return _replyerTweetId; }
    protected ConditionValue xgetCValueReplyerTweetId() { return xdfgetReplyerTweetId(); }

    /**
     * Add order-by as ascend. <br>
     * REPLYER_TWEET_ID: {IX, NotNull, BIGINT(19), FK to TWEET}
     * @return this. (NotNull)
     */
    public BsReplyCQ addOrderBy_ReplyerTweetId_Asc() { regOBA("REPLYER_TWEET_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * REPLYER_TWEET_ID: {IX, NotNull, BIGINT(19), FK to TWEET}
     * @return this. (NotNull)
     */
    public BsReplyCQ addOrderBy_ReplyerTweetId_Desc() { regOBD("REPLYER_TWEET_ID"); return this; }

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
    public BsReplyCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, BIT}
     * @return this. (NotNull)
     */
    public BsReplyCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsReplyCQ addOrderBy_RegisterDatetime_Asc() { regOBA("REGISTER_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * REGISTER_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsReplyCQ addOrderBy_RegisterDatetime_Desc() { regOBD("REGISTER_DATETIME"); return this; }

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
    public BsReplyCQ addOrderBy_UpdateDatetime_Asc() { regOBA("UPDATE_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPDATE_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsReplyCQ addOrderBy_UpdateDatetime_Desc() { regOBD("UPDATE_DATETIME"); return this; }

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
    public BsReplyCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsReplyCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        ReplyCQ bq = (ReplyCQ)bqs;
        ReplyCQ uq = (ReplyCQ)uqs;
        if (bq.hasConditionQueryUserByReplyeeId()) {
            uq.queryUserByReplyeeId().reflectRelationOnUnionQuery(bq.queryUserByReplyeeId(), uq.queryUserByReplyeeId());
        }
        if (bq.hasConditionQueryTweetByReplyeeTweetId()) {
            uq.queryTweetByReplyeeTweetId().reflectRelationOnUnionQuery(bq.queryTweetByReplyeeTweetId(), uq.queryTweetByReplyeeTweetId());
        }
        if (bq.hasConditionQueryUserByReplyerId()) {
            uq.queryUserByReplyerId().reflectRelationOnUnionQuery(bq.queryUserByReplyerId(), uq.queryUserByReplyerId());
        }
        if (bq.hasConditionQueryTweetByReplyerTweetId()) {
            uq.queryTweetByReplyerTweetId().reflectRelationOnUnionQuery(bq.queryTweetByReplyerTweetId(), uq.queryTweetByReplyerTweetId());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * USER by my REPLYEE_ID, named 'userByReplyeeId'.
     * @return The instance of condition-query. (NotNull)
     */
    public UserCQ queryUserByReplyeeId() {
        return xdfgetConditionQueryUserByReplyeeId();
    }
    public UserCQ xdfgetConditionQueryUserByReplyeeId() {
        String prop = "userByReplyeeId";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryUserByReplyeeId()); xsetupOuterJoinUserByReplyeeId(); }
        return xgetQueRlMap(prop);
    }
    protected UserCQ xcreateQueryUserByReplyeeId() {
        String nrp = xresolveNRP("REPLY", "userByReplyeeId"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new UserCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "userByReplyeeId", nrp);
    }
    protected void xsetupOuterJoinUserByReplyeeId() { xregOutJo("userByReplyeeId"); }
    public boolean hasConditionQueryUserByReplyeeId() { return xhasQueRlMap("userByReplyeeId"); }

    /**
     * Get the condition-query for relation table. <br>
     * TWEET by my REPLYEE_TWEET_ID, named 'tweetByReplyeeTweetId'.
     * @return The instance of condition-query. (NotNull)
     */
    public TweetCQ queryTweetByReplyeeTweetId() {
        return xdfgetConditionQueryTweetByReplyeeTweetId();
    }
    public TweetCQ xdfgetConditionQueryTweetByReplyeeTweetId() {
        String prop = "tweetByReplyeeTweetId";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryTweetByReplyeeTweetId()); xsetupOuterJoinTweetByReplyeeTweetId(); }
        return xgetQueRlMap(prop);
    }
    protected TweetCQ xcreateQueryTweetByReplyeeTweetId() {
        String nrp = xresolveNRP("REPLY", "tweetByReplyeeTweetId"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new TweetCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "tweetByReplyeeTweetId", nrp);
    }
    protected void xsetupOuterJoinTweetByReplyeeTweetId() { xregOutJo("tweetByReplyeeTweetId"); }
    public boolean hasConditionQueryTweetByReplyeeTweetId() { return xhasQueRlMap("tweetByReplyeeTweetId"); }

    /**
     * Get the condition-query for relation table. <br>
     * USER by my REPLYER_ID, named 'userByReplyerId'.
     * @return The instance of condition-query. (NotNull)
     */
    public UserCQ queryUserByReplyerId() {
        return xdfgetConditionQueryUserByReplyerId();
    }
    public UserCQ xdfgetConditionQueryUserByReplyerId() {
        String prop = "userByReplyerId";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryUserByReplyerId()); xsetupOuterJoinUserByReplyerId(); }
        return xgetQueRlMap(prop);
    }
    protected UserCQ xcreateQueryUserByReplyerId() {
        String nrp = xresolveNRP("REPLY", "userByReplyerId"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new UserCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "userByReplyerId", nrp);
    }
    protected void xsetupOuterJoinUserByReplyerId() { xregOutJo("userByReplyerId"); }
    public boolean hasConditionQueryUserByReplyerId() { return xhasQueRlMap("userByReplyerId"); }

    /**
     * Get the condition-query for relation table. <br>
     * TWEET by my REPLYER_TWEET_ID, named 'tweetByReplyerTweetId'.
     * @return The instance of condition-query. (NotNull)
     */
    public TweetCQ queryTweetByReplyerTweetId() {
        return xdfgetConditionQueryTweetByReplyerTweetId();
    }
    public TweetCQ xdfgetConditionQueryTweetByReplyerTweetId() {
        String prop = "tweetByReplyerTweetId";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryTweetByReplyerTweetId()); xsetupOuterJoinTweetByReplyerTweetId(); }
        return xgetQueRlMap(prop);
    }
    protected TweetCQ xcreateQueryTweetByReplyerTweetId() {
        String nrp = xresolveNRP("REPLY", "tweetByReplyerTweetId"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new TweetCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "tweetByReplyerTweetId", nrp);
    }
    protected void xsetupOuterJoinTweetByReplyerTweetId() { xregOutJo("tweetByReplyerTweetId"); }
    public boolean hasConditionQueryTweetByReplyerTweetId() { return xhasQueRlMap("tweetByReplyerTweetId"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, ReplyCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(ReplyCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, ReplyCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(ReplyCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, ReplyCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(ReplyCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, ReplyCQ> _myselfExistsMap;
    public Map<String, ReplyCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(ReplyCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, ReplyCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(ReplyCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return ReplyCB.class.getName(); }
    protected String xCQ() { return ReplyCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
