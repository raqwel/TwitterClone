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
 * The base condition-query of USER.
 * @author DBFlute(AutoGenerator)
 */
public class BsUserCQ extends AbstractBsUserCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected UserCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsUserCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from USER) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public UserCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected UserCIQ xcreateCIQ() {
        UserCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected UserCIQ xnewCIQ() {
        return new UserCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join USER on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public UserCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        UserCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _userId;
    public ConditionValue xdfgetUserId()
    { if (_userId == null) { _userId = nCV(); }
      return _userId; }
    protected ConditionValue xgetCValueUserId() { return xdfgetUserId(); }

    public Map<String, FavoliteCQ> xdfgetUserId_ExistsReferrer_FavoliteList() { return xgetSQueMap("userId_ExistsReferrer_FavoliteList"); }
    public String keepUserId_ExistsReferrer_FavoliteList(FavoliteCQ sq) { return xkeepSQue("userId_ExistsReferrer_FavoliteList", sq); }

    public Map<String, FollowCQ> xdfgetUserId_ExistsReferrer_FollowByFolloweeIdList() { return xgetSQueMap("userId_ExistsReferrer_FollowByFolloweeIdList"); }
    public String keepUserId_ExistsReferrer_FollowByFolloweeIdList(FollowCQ sq) { return xkeepSQue("userId_ExistsReferrer_FollowByFolloweeIdList", sq); }

    public Map<String, FollowCQ> xdfgetUserId_ExistsReferrer_FollowByFollowerIdList() { return xgetSQueMap("userId_ExistsReferrer_FollowByFollowerIdList"); }
    public String keepUserId_ExistsReferrer_FollowByFollowerIdList(FollowCQ sq) { return xkeepSQue("userId_ExistsReferrer_FollowByFollowerIdList", sq); }

    public Map<String, ReplyCQ> xdfgetUserId_ExistsReferrer_ReplyByReplyeeIdList() { return xgetSQueMap("userId_ExistsReferrer_ReplyByReplyeeIdList"); }
    public String keepUserId_ExistsReferrer_ReplyByReplyeeIdList(ReplyCQ sq) { return xkeepSQue("userId_ExistsReferrer_ReplyByReplyeeIdList", sq); }

    public Map<String, ReplyCQ> xdfgetUserId_ExistsReferrer_ReplyByReplyerIdList() { return xgetSQueMap("userId_ExistsReferrer_ReplyByReplyerIdList"); }
    public String keepUserId_ExistsReferrer_ReplyByReplyerIdList(ReplyCQ sq) { return xkeepSQue("userId_ExistsReferrer_ReplyByReplyerIdList", sq); }

    public Map<String, RetweetCQ> xdfgetUserId_ExistsReferrer_RetweetList() { return xgetSQueMap("userId_ExistsReferrer_RetweetList"); }
    public String keepUserId_ExistsReferrer_RetweetList(RetweetCQ sq) { return xkeepSQue("userId_ExistsReferrer_RetweetList", sq); }

    public Map<String, TweetCQ> xdfgetUserId_ExistsReferrer_TweetList() { return xgetSQueMap("userId_ExistsReferrer_TweetList"); }
    public String keepUserId_ExistsReferrer_TweetList(TweetCQ sq) { return xkeepSQue("userId_ExistsReferrer_TweetList", sq); }

    public Map<String, FavoliteCQ> xdfgetUserId_NotExistsReferrer_FavoliteList() { return xgetSQueMap("userId_NotExistsReferrer_FavoliteList"); }
    public String keepUserId_NotExistsReferrer_FavoliteList(FavoliteCQ sq) { return xkeepSQue("userId_NotExistsReferrer_FavoliteList", sq); }

    public Map<String, FollowCQ> xdfgetUserId_NotExistsReferrer_FollowByFolloweeIdList() { return xgetSQueMap("userId_NotExistsReferrer_FollowByFolloweeIdList"); }
    public String keepUserId_NotExistsReferrer_FollowByFolloweeIdList(FollowCQ sq) { return xkeepSQue("userId_NotExistsReferrer_FollowByFolloweeIdList", sq); }

    public Map<String, FollowCQ> xdfgetUserId_NotExistsReferrer_FollowByFollowerIdList() { return xgetSQueMap("userId_NotExistsReferrer_FollowByFollowerIdList"); }
    public String keepUserId_NotExistsReferrer_FollowByFollowerIdList(FollowCQ sq) { return xkeepSQue("userId_NotExistsReferrer_FollowByFollowerIdList", sq); }

    public Map<String, ReplyCQ> xdfgetUserId_NotExistsReferrer_ReplyByReplyeeIdList() { return xgetSQueMap("userId_NotExistsReferrer_ReplyByReplyeeIdList"); }
    public String keepUserId_NotExistsReferrer_ReplyByReplyeeIdList(ReplyCQ sq) { return xkeepSQue("userId_NotExistsReferrer_ReplyByReplyeeIdList", sq); }

    public Map<String, ReplyCQ> xdfgetUserId_NotExistsReferrer_ReplyByReplyerIdList() { return xgetSQueMap("userId_NotExistsReferrer_ReplyByReplyerIdList"); }
    public String keepUserId_NotExistsReferrer_ReplyByReplyerIdList(ReplyCQ sq) { return xkeepSQue("userId_NotExistsReferrer_ReplyByReplyerIdList", sq); }

    public Map<String, RetweetCQ> xdfgetUserId_NotExistsReferrer_RetweetList() { return xgetSQueMap("userId_NotExistsReferrer_RetweetList"); }
    public String keepUserId_NotExistsReferrer_RetweetList(RetweetCQ sq) { return xkeepSQue("userId_NotExistsReferrer_RetweetList", sq); }

    public Map<String, TweetCQ> xdfgetUserId_NotExistsReferrer_TweetList() { return xgetSQueMap("userId_NotExistsReferrer_TweetList"); }
    public String keepUserId_NotExistsReferrer_TweetList(TweetCQ sq) { return xkeepSQue("userId_NotExistsReferrer_TweetList", sq); }

    public Map<String, FavoliteCQ> xdfgetUserId_SpecifyDerivedReferrer_FavoliteList() { return xgetSQueMap("userId_SpecifyDerivedReferrer_FavoliteList"); }
    public String keepUserId_SpecifyDerivedReferrer_FavoliteList(FavoliteCQ sq) { return xkeepSQue("userId_SpecifyDerivedReferrer_FavoliteList", sq); }

    public Map<String, FollowCQ> xdfgetUserId_SpecifyDerivedReferrer_FollowByFolloweeIdList() { return xgetSQueMap("userId_SpecifyDerivedReferrer_FollowByFolloweeIdList"); }
    public String keepUserId_SpecifyDerivedReferrer_FollowByFolloweeIdList(FollowCQ sq) { return xkeepSQue("userId_SpecifyDerivedReferrer_FollowByFolloweeIdList", sq); }

    public Map<String, FollowCQ> xdfgetUserId_SpecifyDerivedReferrer_FollowByFollowerIdList() { return xgetSQueMap("userId_SpecifyDerivedReferrer_FollowByFollowerIdList"); }
    public String keepUserId_SpecifyDerivedReferrer_FollowByFollowerIdList(FollowCQ sq) { return xkeepSQue("userId_SpecifyDerivedReferrer_FollowByFollowerIdList", sq); }

    public Map<String, ReplyCQ> xdfgetUserId_SpecifyDerivedReferrer_ReplyByReplyeeIdList() { return xgetSQueMap("userId_SpecifyDerivedReferrer_ReplyByReplyeeIdList"); }
    public String keepUserId_SpecifyDerivedReferrer_ReplyByReplyeeIdList(ReplyCQ sq) { return xkeepSQue("userId_SpecifyDerivedReferrer_ReplyByReplyeeIdList", sq); }

    public Map<String, ReplyCQ> xdfgetUserId_SpecifyDerivedReferrer_ReplyByReplyerIdList() { return xgetSQueMap("userId_SpecifyDerivedReferrer_ReplyByReplyerIdList"); }
    public String keepUserId_SpecifyDerivedReferrer_ReplyByReplyerIdList(ReplyCQ sq) { return xkeepSQue("userId_SpecifyDerivedReferrer_ReplyByReplyerIdList", sq); }

    public Map<String, RetweetCQ> xdfgetUserId_SpecifyDerivedReferrer_RetweetList() { return xgetSQueMap("userId_SpecifyDerivedReferrer_RetweetList"); }
    public String keepUserId_SpecifyDerivedReferrer_RetweetList(RetweetCQ sq) { return xkeepSQue("userId_SpecifyDerivedReferrer_RetweetList", sq); }

    public Map<String, TweetCQ> xdfgetUserId_SpecifyDerivedReferrer_TweetList() { return xgetSQueMap("userId_SpecifyDerivedReferrer_TweetList"); }
    public String keepUserId_SpecifyDerivedReferrer_TweetList(TweetCQ sq) { return xkeepSQue("userId_SpecifyDerivedReferrer_TweetList", sq); }

    public Map<String, FavoliteCQ> xdfgetUserId_QueryDerivedReferrer_FavoliteList() { return xgetSQueMap("userId_QueryDerivedReferrer_FavoliteList"); }
    public String keepUserId_QueryDerivedReferrer_FavoliteList(FavoliteCQ sq) { return xkeepSQue("userId_QueryDerivedReferrer_FavoliteList", sq); }
    public Map<String, Object> xdfgetUserId_QueryDerivedReferrer_FavoliteListParameter() { return xgetSQuePmMap("userId_QueryDerivedReferrer_FavoliteList"); }
    public String keepUserId_QueryDerivedReferrer_FavoliteListParameter(Object pm) { return xkeepSQuePm("userId_QueryDerivedReferrer_FavoliteList", pm); }

    public Map<String, FollowCQ> xdfgetUserId_QueryDerivedReferrer_FollowByFolloweeIdList() { return xgetSQueMap("userId_QueryDerivedReferrer_FollowByFolloweeIdList"); }
    public String keepUserId_QueryDerivedReferrer_FollowByFolloweeIdList(FollowCQ sq) { return xkeepSQue("userId_QueryDerivedReferrer_FollowByFolloweeIdList", sq); }
    public Map<String, Object> xdfgetUserId_QueryDerivedReferrer_FollowByFolloweeIdListParameter() { return xgetSQuePmMap("userId_QueryDerivedReferrer_FollowByFolloweeIdList"); }
    public String keepUserId_QueryDerivedReferrer_FollowByFolloweeIdListParameter(Object pm) { return xkeepSQuePm("userId_QueryDerivedReferrer_FollowByFolloweeIdList", pm); }

    public Map<String, FollowCQ> xdfgetUserId_QueryDerivedReferrer_FollowByFollowerIdList() { return xgetSQueMap("userId_QueryDerivedReferrer_FollowByFollowerIdList"); }
    public String keepUserId_QueryDerivedReferrer_FollowByFollowerIdList(FollowCQ sq) { return xkeepSQue("userId_QueryDerivedReferrer_FollowByFollowerIdList", sq); }
    public Map<String, Object> xdfgetUserId_QueryDerivedReferrer_FollowByFollowerIdListParameter() { return xgetSQuePmMap("userId_QueryDerivedReferrer_FollowByFollowerIdList"); }
    public String keepUserId_QueryDerivedReferrer_FollowByFollowerIdListParameter(Object pm) { return xkeepSQuePm("userId_QueryDerivedReferrer_FollowByFollowerIdList", pm); }

    public Map<String, ReplyCQ> xdfgetUserId_QueryDerivedReferrer_ReplyByReplyeeIdList() { return xgetSQueMap("userId_QueryDerivedReferrer_ReplyByReplyeeIdList"); }
    public String keepUserId_QueryDerivedReferrer_ReplyByReplyeeIdList(ReplyCQ sq) { return xkeepSQue("userId_QueryDerivedReferrer_ReplyByReplyeeIdList", sq); }
    public Map<String, Object> xdfgetUserId_QueryDerivedReferrer_ReplyByReplyeeIdListParameter() { return xgetSQuePmMap("userId_QueryDerivedReferrer_ReplyByReplyeeIdList"); }
    public String keepUserId_QueryDerivedReferrer_ReplyByReplyeeIdListParameter(Object pm) { return xkeepSQuePm("userId_QueryDerivedReferrer_ReplyByReplyeeIdList", pm); }

    public Map<String, ReplyCQ> xdfgetUserId_QueryDerivedReferrer_ReplyByReplyerIdList() { return xgetSQueMap("userId_QueryDerivedReferrer_ReplyByReplyerIdList"); }
    public String keepUserId_QueryDerivedReferrer_ReplyByReplyerIdList(ReplyCQ sq) { return xkeepSQue("userId_QueryDerivedReferrer_ReplyByReplyerIdList", sq); }
    public Map<String, Object> xdfgetUserId_QueryDerivedReferrer_ReplyByReplyerIdListParameter() { return xgetSQuePmMap("userId_QueryDerivedReferrer_ReplyByReplyerIdList"); }
    public String keepUserId_QueryDerivedReferrer_ReplyByReplyerIdListParameter(Object pm) { return xkeepSQuePm("userId_QueryDerivedReferrer_ReplyByReplyerIdList", pm); }

    public Map<String, RetweetCQ> xdfgetUserId_QueryDerivedReferrer_RetweetList() { return xgetSQueMap("userId_QueryDerivedReferrer_RetweetList"); }
    public String keepUserId_QueryDerivedReferrer_RetweetList(RetweetCQ sq) { return xkeepSQue("userId_QueryDerivedReferrer_RetweetList", sq); }
    public Map<String, Object> xdfgetUserId_QueryDerivedReferrer_RetweetListParameter() { return xgetSQuePmMap("userId_QueryDerivedReferrer_RetweetList"); }
    public String keepUserId_QueryDerivedReferrer_RetweetListParameter(Object pm) { return xkeepSQuePm("userId_QueryDerivedReferrer_RetweetList", pm); }

    public Map<String, TweetCQ> xdfgetUserId_QueryDerivedReferrer_TweetList() { return xgetSQueMap("userId_QueryDerivedReferrer_TweetList"); }
    public String keepUserId_QueryDerivedReferrer_TweetList(TweetCQ sq) { return xkeepSQue("userId_QueryDerivedReferrer_TweetList", sq); }
    public Map<String, Object> xdfgetUserId_QueryDerivedReferrer_TweetListParameter() { return xgetSQuePmMap("userId_QueryDerivedReferrer_TweetList"); }
    public String keepUserId_QueryDerivedReferrer_TweetListParameter(Object pm) { return xkeepSQuePm("userId_QueryDerivedReferrer_TweetList", pm); }

    /**
     * Add order-by as ascend. <br>
     * USER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsUserCQ addOrderBy_UserId_Asc() { regOBA("USER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * USER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsUserCQ addOrderBy_UserId_Desc() { regOBD("USER_ID"); return this; }

    protected ConditionValue _userName;
    public ConditionValue xdfgetUserName()
    { if (_userName == null) { _userName = nCV(); }
      return _userName; }
    protected ConditionValue xgetCValueUserName() { return xdfgetUserName(); }

    /**
     * Add order-by as ascend. <br>
     * USER_NAME: {NotNull, VARCHAR(64)}
     * @return this. (NotNull)
     */
    public BsUserCQ addOrderBy_UserName_Asc() { regOBA("USER_NAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * USER_NAME: {NotNull, VARCHAR(64)}
     * @return this. (NotNull)
     */
    public BsUserCQ addOrderBy_UserName_Desc() { regOBD("USER_NAME"); return this; }

    protected ConditionValue _password;
    public ConditionValue xdfgetPassword()
    { if (_password == null) { _password = nCV(); }
      return _password; }
    protected ConditionValue xgetCValuePassword() { return xdfgetPassword(); }

    /**
     * Add order-by as ascend. <br>
     * PASSWORD: {NotNull, VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsUserCQ addOrderBy_Password_Asc() { regOBA("PASSWORD"); return this; }

    /**
     * Add order-by as descend. <br>
     * PASSWORD: {NotNull, VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsUserCQ addOrderBy_Password_Desc() { regOBD("PASSWORD"); return this; }

    protected ConditionValue _mailAddress;
    public ConditionValue xdfgetMailAddress()
    { if (_mailAddress == null) { _mailAddress = nCV(); }
      return _mailAddress; }
    protected ConditionValue xgetCValueMailAddress() { return xdfgetMailAddress(); }

    /**
     * Add order-by as ascend. <br>
     * MAIL_ADDRESS: {UQ, VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsUserCQ addOrderBy_MailAddress_Asc() { regOBA("MAIL_ADDRESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * MAIL_ADDRESS: {UQ, VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsUserCQ addOrderBy_MailAddress_Desc() { regOBD("MAIL_ADDRESS"); return this; }

    protected ConditionValue _birthDate;
    public ConditionValue xdfgetBirthDate()
    { if (_birthDate == null) { _birthDate = nCV(); }
      return _birthDate; }
    protected ConditionValue xgetCValueBirthDate() { return xdfgetBirthDate(); }

    /**
     * Add order-by as ascend. <br>
     * BIRTH_DATE: {DATE(10)}
     * @return this. (NotNull)
     */
    public BsUserCQ addOrderBy_BirthDate_Asc() { regOBA("BIRTH_DATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * BIRTH_DATE: {DATE(10)}
     * @return this. (NotNull)
     */
    public BsUserCQ addOrderBy_BirthDate_Desc() { regOBD("BIRTH_DATE"); return this; }

    protected ConditionValue _profileSentence;
    public ConditionValue xdfgetProfileSentence()
    { if (_profileSentence == null) { _profileSentence = nCV(); }
      return _profileSentence; }
    protected ConditionValue xgetCValueProfileSentence() { return xdfgetProfileSentence(); }

    /**
     * Add order-by as ascend. <br>
     * PROFILE_SENTENCE: {VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsUserCQ addOrderBy_ProfileSentence_Asc() { regOBA("PROFILE_SENTENCE"); return this; }

    /**
     * Add order-by as descend. <br>
     * PROFILE_SENTENCE: {VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsUserCQ addOrderBy_ProfileSentence_Desc() { regOBD("PROFILE_SENTENCE"); return this; }

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
    public BsUserCQ addOrderBy_RegisterDatetime_Asc() { regOBA("REGISTER_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * REGISTER_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsUserCQ addOrderBy_RegisterDatetime_Desc() { regOBD("REGISTER_DATETIME"); return this; }

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
    public BsUserCQ addOrderBy_UpdateDatetime_Asc() { regOBA("UPDATE_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPDATE_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsUserCQ addOrderBy_UpdateDatetime_Desc() { regOBD("UPDATE_DATETIME"); return this; }

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
    public BsUserCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsUserCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, UserCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(UserCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, UserCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(UserCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, UserCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(UserCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, UserCQ> _myselfExistsMap;
    public Map<String, UserCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(UserCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, UserCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(UserCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return UserCB.class.getName(); }
    protected String xCQ() { return UserCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
