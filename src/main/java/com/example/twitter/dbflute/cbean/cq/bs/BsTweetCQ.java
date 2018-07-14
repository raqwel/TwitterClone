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
 * The base condition-query of TWEET.
 * @author DBFlute(AutoGenerator)
 */
public class BsTweetCQ extends AbstractBsTweetCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TweetCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTweetCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from TWEET) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TweetCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TweetCIQ xcreateCIQ() {
        TweetCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TweetCIQ xnewCIQ() {
        return new TweetCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join TWEET on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TweetCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TweetCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _tweetId;
    public ConditionValue xdfgetTweetId()
    { if (_tweetId == null) { _tweetId = nCV(); }
      return _tweetId; }
    protected ConditionValue xgetCValueTweetId() { return xdfgetTweetId(); }

    public Map<String, FavoliteCQ> xdfgetTweetId_ExistsReferrer_FavoliteList() { return xgetSQueMap("tweetId_ExistsReferrer_FavoliteList"); }
    public String keepTweetId_ExistsReferrer_FavoliteList(FavoliteCQ sq) { return xkeepSQue("tweetId_ExistsReferrer_FavoliteList", sq); }

    public Map<String, ReplyCQ> xdfgetTweetId_ExistsReferrer_ReplyByReplyeeTweetIdList() { return xgetSQueMap("tweetId_ExistsReferrer_ReplyByReplyeeTweetIdList"); }
    public String keepTweetId_ExistsReferrer_ReplyByReplyeeTweetIdList(ReplyCQ sq) { return xkeepSQue("tweetId_ExistsReferrer_ReplyByReplyeeTweetIdList", sq); }

    public Map<String, ReplyCQ> xdfgetTweetId_ExistsReferrer_ReplyByReplyerTweetIdList() { return xgetSQueMap("tweetId_ExistsReferrer_ReplyByReplyerTweetIdList"); }
    public String keepTweetId_ExistsReferrer_ReplyByReplyerTweetIdList(ReplyCQ sq) { return xkeepSQue("tweetId_ExistsReferrer_ReplyByReplyerTweetIdList", sq); }

    public Map<String, RetweetCQ> xdfgetTweetId_ExistsReferrer_RetweetList() { return xgetSQueMap("tweetId_ExistsReferrer_RetweetList"); }
    public String keepTweetId_ExistsReferrer_RetweetList(RetweetCQ sq) { return xkeepSQue("tweetId_ExistsReferrer_RetweetList", sq); }

    public Map<String, FavoliteCQ> xdfgetTweetId_NotExistsReferrer_FavoliteList() { return xgetSQueMap("tweetId_NotExistsReferrer_FavoliteList"); }
    public String keepTweetId_NotExistsReferrer_FavoliteList(FavoliteCQ sq) { return xkeepSQue("tweetId_NotExistsReferrer_FavoliteList", sq); }

    public Map<String, ReplyCQ> xdfgetTweetId_NotExistsReferrer_ReplyByReplyeeTweetIdList() { return xgetSQueMap("tweetId_NotExistsReferrer_ReplyByReplyeeTweetIdList"); }
    public String keepTweetId_NotExistsReferrer_ReplyByReplyeeTweetIdList(ReplyCQ sq) { return xkeepSQue("tweetId_NotExistsReferrer_ReplyByReplyeeTweetIdList", sq); }

    public Map<String, ReplyCQ> xdfgetTweetId_NotExistsReferrer_ReplyByReplyerTweetIdList() { return xgetSQueMap("tweetId_NotExistsReferrer_ReplyByReplyerTweetIdList"); }
    public String keepTweetId_NotExistsReferrer_ReplyByReplyerTweetIdList(ReplyCQ sq) { return xkeepSQue("tweetId_NotExistsReferrer_ReplyByReplyerTweetIdList", sq); }

    public Map<String, RetweetCQ> xdfgetTweetId_NotExistsReferrer_RetweetList() { return xgetSQueMap("tweetId_NotExistsReferrer_RetweetList"); }
    public String keepTweetId_NotExistsReferrer_RetweetList(RetweetCQ sq) { return xkeepSQue("tweetId_NotExistsReferrer_RetweetList", sq); }

    public Map<String, FavoliteCQ> xdfgetTweetId_SpecifyDerivedReferrer_FavoliteList() { return xgetSQueMap("tweetId_SpecifyDerivedReferrer_FavoliteList"); }
    public String keepTweetId_SpecifyDerivedReferrer_FavoliteList(FavoliteCQ sq) { return xkeepSQue("tweetId_SpecifyDerivedReferrer_FavoliteList", sq); }

    public Map<String, ReplyCQ> xdfgetTweetId_SpecifyDerivedReferrer_ReplyByReplyeeTweetIdList() { return xgetSQueMap("tweetId_SpecifyDerivedReferrer_ReplyByReplyeeTweetIdList"); }
    public String keepTweetId_SpecifyDerivedReferrer_ReplyByReplyeeTweetIdList(ReplyCQ sq) { return xkeepSQue("tweetId_SpecifyDerivedReferrer_ReplyByReplyeeTweetIdList", sq); }

    public Map<String, ReplyCQ> xdfgetTweetId_SpecifyDerivedReferrer_ReplyByReplyerTweetIdList() { return xgetSQueMap("tweetId_SpecifyDerivedReferrer_ReplyByReplyerTweetIdList"); }
    public String keepTweetId_SpecifyDerivedReferrer_ReplyByReplyerTweetIdList(ReplyCQ sq) { return xkeepSQue("tweetId_SpecifyDerivedReferrer_ReplyByReplyerTweetIdList", sq); }

    public Map<String, RetweetCQ> xdfgetTweetId_SpecifyDerivedReferrer_RetweetList() { return xgetSQueMap("tweetId_SpecifyDerivedReferrer_RetweetList"); }
    public String keepTweetId_SpecifyDerivedReferrer_RetweetList(RetweetCQ sq) { return xkeepSQue("tweetId_SpecifyDerivedReferrer_RetweetList", sq); }

    public Map<String, FavoliteCQ> xdfgetTweetId_QueryDerivedReferrer_FavoliteList() { return xgetSQueMap("tweetId_QueryDerivedReferrer_FavoliteList"); }
    public String keepTweetId_QueryDerivedReferrer_FavoliteList(FavoliteCQ sq) { return xkeepSQue("tweetId_QueryDerivedReferrer_FavoliteList", sq); }
    public Map<String, Object> xdfgetTweetId_QueryDerivedReferrer_FavoliteListParameter() { return xgetSQuePmMap("tweetId_QueryDerivedReferrer_FavoliteList"); }
    public String keepTweetId_QueryDerivedReferrer_FavoliteListParameter(Object pm) { return xkeepSQuePm("tweetId_QueryDerivedReferrer_FavoliteList", pm); }

    public Map<String, ReplyCQ> xdfgetTweetId_QueryDerivedReferrer_ReplyByReplyeeTweetIdList() { return xgetSQueMap("tweetId_QueryDerivedReferrer_ReplyByReplyeeTweetIdList"); }
    public String keepTweetId_QueryDerivedReferrer_ReplyByReplyeeTweetIdList(ReplyCQ sq) { return xkeepSQue("tweetId_QueryDerivedReferrer_ReplyByReplyeeTweetIdList", sq); }
    public Map<String, Object> xdfgetTweetId_QueryDerivedReferrer_ReplyByReplyeeTweetIdListParameter() { return xgetSQuePmMap("tweetId_QueryDerivedReferrer_ReplyByReplyeeTweetIdList"); }
    public String keepTweetId_QueryDerivedReferrer_ReplyByReplyeeTweetIdListParameter(Object pm) { return xkeepSQuePm("tweetId_QueryDerivedReferrer_ReplyByReplyeeTweetIdList", pm); }

    public Map<String, ReplyCQ> xdfgetTweetId_QueryDerivedReferrer_ReplyByReplyerTweetIdList() { return xgetSQueMap("tweetId_QueryDerivedReferrer_ReplyByReplyerTweetIdList"); }
    public String keepTweetId_QueryDerivedReferrer_ReplyByReplyerTweetIdList(ReplyCQ sq) { return xkeepSQue("tweetId_QueryDerivedReferrer_ReplyByReplyerTweetIdList", sq); }
    public Map<String, Object> xdfgetTweetId_QueryDerivedReferrer_ReplyByReplyerTweetIdListParameter() { return xgetSQuePmMap("tweetId_QueryDerivedReferrer_ReplyByReplyerTweetIdList"); }
    public String keepTweetId_QueryDerivedReferrer_ReplyByReplyerTweetIdListParameter(Object pm) { return xkeepSQuePm("tweetId_QueryDerivedReferrer_ReplyByReplyerTweetIdList", pm); }

    public Map<String, RetweetCQ> xdfgetTweetId_QueryDerivedReferrer_RetweetList() { return xgetSQueMap("tweetId_QueryDerivedReferrer_RetweetList"); }
    public String keepTweetId_QueryDerivedReferrer_RetweetList(RetweetCQ sq) { return xkeepSQue("tweetId_QueryDerivedReferrer_RetweetList", sq); }
    public Map<String, Object> xdfgetTweetId_QueryDerivedReferrer_RetweetListParameter() { return xgetSQuePmMap("tweetId_QueryDerivedReferrer_RetweetList"); }
    public String keepTweetId_QueryDerivedReferrer_RetweetListParameter(Object pm) { return xkeepSQuePm("tweetId_QueryDerivedReferrer_RetweetList", pm); }

    /**
     * Add order-by as ascend. <br>
     * TWEET_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTweetCQ addOrderBy_TweetId_Asc() { regOBA("TWEET_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * TWEET_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTweetCQ addOrderBy_TweetId_Desc() { regOBD("TWEET_ID"); return this; }

    protected ConditionValue _userId;
    public ConditionValue xdfgetUserId()
    { if (_userId == null) { _userId = nCV(); }
      return _userId; }
    protected ConditionValue xgetCValueUserId() { return xdfgetUserId(); }

    /**
     * Add order-by as ascend. <br>
     * USER_ID: {IX, NotNull, BIGINT(19), FK to USER}
     * @return this. (NotNull)
     */
    public BsTweetCQ addOrderBy_UserId_Asc() { regOBA("USER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * USER_ID: {IX, NotNull, BIGINT(19), FK to USER}
     * @return this. (NotNull)
     */
    public BsTweetCQ addOrderBy_UserId_Desc() { regOBD("USER_ID"); return this; }

    protected ConditionValue _tweet;
    public ConditionValue xdfgetTweet()
    { if (_tweet == null) { _tweet = nCV(); }
      return _tweet; }
    protected ConditionValue xgetCValueTweet() { return xdfgetTweet(); }

    /**
     * Add order-by as ascend. <br>
     * TWEET: {NotNull, VARCHAR(140)}
     * @return this. (NotNull)
     */
    public BsTweetCQ addOrderBy_Tweet_Asc() { regOBA("TWEET"); return this; }

    /**
     * Add order-by as descend. <br>
     * TWEET: {NotNull, VARCHAR(140)}
     * @return this. (NotNull)
     */
    public BsTweetCQ addOrderBy_Tweet_Desc() { regOBD("TWEET"); return this; }

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
    public BsTweetCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, BIT}
     * @return this. (NotNull)
     */
    public BsTweetCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsTweetCQ addOrderBy_RegisterDatetime_Asc() { regOBA("REGISTER_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * REGISTER_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTweetCQ addOrderBy_RegisterDatetime_Desc() { regOBD("REGISTER_DATETIME"); return this; }

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
    public BsTweetCQ addOrderBy_UpdateDatetime_Asc() { regOBA("UPDATE_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPDATE_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTweetCQ addOrderBy_UpdateDatetime_Desc() { regOBD("UPDATE_DATETIME"); return this; }

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
    public BsTweetCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsTweetCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        TweetCQ bq = (TweetCQ)bqs;
        TweetCQ uq = (TweetCQ)uqs;
        if (bq.hasConditionQueryUser()) {
            uq.queryUser().reflectRelationOnUnionQuery(bq.queryUser(), uq.queryUser());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
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
        String nrp = xresolveNRP("TWEET", "user"); String jan = xresolveJAN(nrp, xgetNNLvl());
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
    public Map<String, TweetCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TweetCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TweetCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TweetCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TweetCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TweetCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TweetCQ> _myselfExistsMap;
    public Map<String, TweetCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TweetCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TweetCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TweetCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TweetCB.class.getName(); }
    protected String xCQ() { return TweetCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
