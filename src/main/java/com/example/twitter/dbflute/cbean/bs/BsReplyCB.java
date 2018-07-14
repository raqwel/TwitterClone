package com.example.twitter.dbflute.cbean.bs;

import org.dbflute.cbean.AbstractConditionBean;
import org.dbflute.cbean.ConditionBean;
import org.dbflute.cbean.ConditionQuery;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.dream.*;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.cbean.sqlclause.SqlClauseCreator;
import org.dbflute.cbean.scoping.*;
import org.dbflute.dbmeta.DBMetaProvider;
import org.dbflute.twowaysql.factory.SqlAnalyzerFactory;
import org.dbflute.twowaysql.style.BoundDateDisplayTimeZoneProvider;
import com.example.twitter.dbflute.allcommon.DBFluteConfig;
import com.example.twitter.dbflute.allcommon.DBMetaInstanceHandler;
import com.example.twitter.dbflute.allcommon.ImplementedInvokerAssistant;
import com.example.twitter.dbflute.allcommon.ImplementedSqlClauseCreator;
import com.example.twitter.dbflute.cbean.*;
import com.example.twitter.dbflute.cbean.cq.*;
import com.example.twitter.dbflute.cbean.nss.*;

/**
 * The base condition-bean of REPLY.
 * @author DBFlute(AutoGenerator)
 */
public class BsReplyCB extends AbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected ReplyCQ _conditionQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsReplyCB() {
        if (DBFluteConfig.getInstance().isPagingCountLater()) {
            enablePagingCountLater();
        }
        if (DBFluteConfig.getInstance().isPagingCountLeastJoin()) {
            enablePagingCountLeastJoin();
        }
        if (DBFluteConfig.getInstance().isNonSpecifiedColumnAccessAllowed()) {
            enableNonSpecifiedColumnAccess();
        }
        if (DBFluteConfig.getInstance().isSpecifyColumnRequired()) {
            enableSpecifyColumnRequired();
        }
        xsetSpecifyColumnRequiredExceptDeterminer(DBFluteConfig.getInstance().getSpecifyColumnRequiredExceptDeterminer());
        if (DBFluteConfig.getInstance().isQueryUpdateCountPreCheck()) {
            enableQueryUpdateCountPreCheck();
        }
    }

    // ===================================================================================
    //                                                                           SqlClause
    //                                                                           =========
    @Override
    protected SqlClause createSqlClause() {
        SqlClauseCreator creator = DBFluteConfig.getInstance().getSqlClauseCreator();
        if (creator != null) {
            return creator.createSqlClause(this);
        }
        return new ImplementedSqlClauseCreator().createSqlClause(this); // as default
    }

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    @Override
    protected DBMetaProvider getDBMetaProvider() {
        return DBMetaInstanceHandler.getProvider(); // as default
    }

    public String asTableDbName() {
        return "REPLY";
    }

    // ===================================================================================
    //                                                                 PrimaryKey Handling
    //                                                                 ===================
    /**
     * Accept the query condition of primary key as equal.
     * @param replyId : PK, ID, NotNull, BIGINT(19). (NotNull)
     * @return this. (NotNull)
     */
    public ReplyCB acceptPK(Long replyId) {
        assertObjectNotNull("replyId", replyId);
        BsReplyCB cb = this;
        cb.query().setReplyId_Equal(replyId);
        return (ReplyCB)this;
    }

    public ConditionBean addOrderBy_PK_Asc() {
        query().addOrderBy_ReplyId_Asc();
        return this;
    }

    public ConditionBean addOrderBy_PK_Desc() {
        query().addOrderBy_ReplyId_Desc();
        return this;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Prepare for various queries. <br>
     * Examples of main functions are following:
     * <pre>
     * <span style="color: #3F7E5E">// Basic Queries</span>
     * cb.query().setMemberId_Equal(value);        <span style="color: #3F7E5E">// =</span>
     * cb.query().setMemberId_NotEqual(value);     <span style="color: #3F7E5E">// !=</span>
     * cb.query().setMemberId_GreaterThan(value);  <span style="color: #3F7E5E">// &gt;</span>
     * cb.query().setMemberId_LessThan(value);     <span style="color: #3F7E5E">// &lt;</span>
     * cb.query().setMemberId_GreaterEqual(value); <span style="color: #3F7E5E">// &gt;=</span>
     * cb.query().setMemberId_LessEqual(value);    <span style="color: #3F7E5E">// &lt;=</span>
     * cb.query().setMemberName_InScope(valueList);    <span style="color: #3F7E5E">// in ('a', 'b')</span>
     * cb.query().setMemberName_NotInScope(valueList); <span style="color: #3F7E5E">// not in ('a', 'b')</span>
     * <span style="color: #3F7E5E">// LikeSearch with various options: (versatile)</span>
     * <span style="color: #3F7E5E">// {like ... [options]}</span>
     * cb.query().setMemberName_LikeSearch(value, option);
     * cb.query().setMemberName_NotLikeSearch(value, option); <span style="color: #3F7E5E">// not like ...</span>
     * <span style="color: #3F7E5E">// FromTo with various options: (versatile)</span>
     * <span style="color: #3F7E5E">// {(default) fromDatetime &lt;= BIRTHDATE &lt;= toDatetime}</span>
     * cb.query().setBirthdate_FromTo(fromDatetime, toDatetime, option);
     * <span style="color: #3F7E5E">// DateFromTo: (Date means yyyy/MM/dd)</span>
     * <span style="color: #3F7E5E">// {fromDate &lt;= BIRTHDATE &lt; toDate + 1 day}</span>
     * cb.query().setBirthdate_IsNull();    <span style="color: #3F7E5E">// is null</span>
     * cb.query().setBirthdate_IsNotNull(); <span style="color: #3F7E5E">// is not null</span>
     *
     * <span style="color: #3F7E5E">// ExistsReferrer: (correlated sub-query)</span>
     * <span style="color: #3F7E5E">// {where exists (select PURCHASE_ID from PURCHASE where ...)}</span>
     * cb.query().existsPurchase(purchaseCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     purchaseCB.query().set... <span style="color: #3F7E5E">// referrer sub-query condition</span>
     * });
     * cb.query().notExistsPurchase...
     *
     * <span style="color: #3F7E5E">// (Query)DerivedReferrer: (correlated sub-query)</span>
     * cb.query().derivedPurchaseList().max(purchaseCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     purchaseCB.specify().columnPurchasePrice(); <span style="color: #3F7E5E">// derived column for function</span>
     *     purchaseCB.query().set... <span style="color: #3F7E5E">// referrer sub-query condition</span>
     * }).greaterEqual(value);
     *
     * <span style="color: #3F7E5E">// ScalarCondition: (self-table sub-query)</span>
     * cb.query().scalar_Equal().max(scalarCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     scalarCB.specify().columnBirthdate(); <span style="color: #3F7E5E">// derived column for function</span>
     *     scalarCB.query().set... <span style="color: #3F7E5E">// scalar sub-query condition</span>
     * });
     *
     * <span style="color: #3F7E5E">// OrderBy</span>
     * cb.query().addOrderBy_MemberName_Asc();
     * cb.query().addOrderBy_MemberName_Desc().withManualOrder(option);
     * cb.query().addOrderBy_MemberName_Desc().withNullsFirst();
     * cb.query().addOrderBy_MemberName_Desc().withNullsLast();
     * cb.query().addSpecifiedDerivedOrderBy_Desc(aliasName);
     *
     * <span style="color: #3F7E5E">// Query(Relation)</span>
     * cb.query().queryMemberStatus()...;
     * cb.query().queryMemberAddressAsValid(targetDate)...;
     * </pre>
     * @return The instance of condition-query for base-point table to set up query. (NotNull)
     */
    public ReplyCQ query() {
        assertQueryPurpose(); // assert only when user-public query
        return doGetConditionQuery();
    }

    public ReplyCQ xdfgetConditionQuery() { // public for parameter comment and internal
        return doGetConditionQuery();
    }

    protected ReplyCQ doGetConditionQuery() {
        if (_conditionQuery == null) {
            _conditionQuery = createLocalCQ();
        }
        return _conditionQuery;
    }

    protected ReplyCQ createLocalCQ() {
        return xcreateCQ(null, getSqlClause(), getSqlClause().getBasePointAliasName(), 0);
    }

    protected ReplyCQ xcreateCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        ReplyCQ cq = xnewCQ(childQuery, sqlClause, aliasName, nestLevel);
        cq.xsetBaseCB(this);
        return cq;
    }

    protected ReplyCQ xnewCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        return new ReplyCQ(childQuery, sqlClause, aliasName, nestLevel);
    }

    /**
     * {@inheritDoc}
     */
    public ConditionQuery localCQ() {
        return doGetConditionQuery();
    }

    // ===================================================================================
    //                                                                               Union
    //                                                                               =====
    /**
     * Set up 'union' for base-point table. <br>
     * You don't need to call SetupSelect in union-query,
     * because it inherits calls before. (Don't call SetupSelect after here)
     * <pre>
     * cb.query().<span style="color: #CC4747">union</span>(<span style="color: #553000">unionCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">unionCB</span>.query().set...
     * });
     * </pre>
     * @param unionCBLambda The callback for query of 'union'. (NotNull)
     */
    public void union(UnionQuery<ReplyCB> unionCBLambda) {
        final ReplyCB cb = new ReplyCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionCBLambda.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final ReplyCQ cq = cb.query(); query().xsetUnionQuery(cq);
    }

    /**
     * Set up 'union all' for base-point table. <br>
     * You don't need to call SetupSelect in union-query,
     * because it inherits calls before. (Don't call SetupSelect after here)
     * <pre>
     * cb.query().<span style="color: #CC4747">unionAll</span>(<span style="color: #553000">unionCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">unionCB</span>.query().set...
     * });
     * </pre>
     * @param unionCBLambda The callback for query of 'union all'. (NotNull)
     */
    public void unionAll(UnionQuery<ReplyCB> unionCBLambda) {
        final ReplyCB cb = new ReplyCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionCBLambda.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final ReplyCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
    }

    // ===================================================================================
    //                                                                         SetupSelect
    //                                                                         ===========
    /**
     * Set up relation columns to select clause. <br>
     * USER by my REPLYEE_ID, named 'userByReplyeeId'.
     * <pre>
     * <span style="color: #0000C0">replyBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_UserByReplyeeId()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">reply</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">reply</span>.<span style="color: #CC4747">getUserByReplyeeId()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     */
    public void setupSelect_UserByReplyeeId() {
        assertSetupSelectPurpose("userByReplyeeId");
        if (hasSpecifiedLocalColumn()) {
            specify().columnReplyeeId();
        }
        doSetupSelect(() -> query().queryUserByReplyeeId());
    }

    protected TweetNss _nssTweetByReplyeeTweetId;
    public TweetNss xdfgetNssTweetByReplyeeTweetId() {
        if (_nssTweetByReplyeeTweetId == null) { _nssTweetByReplyeeTweetId = new TweetNss(null); }
        return _nssTweetByReplyeeTweetId;
    }
    /**
     * Set up relation columns to select clause. <br>
     * TWEET by my REPLYEE_TWEET_ID, named 'tweetByReplyeeTweetId'.
     * <pre>
     * <span style="color: #0000C0">replyBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_TweetByReplyeeTweetId()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">reply</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">reply</span>.<span style="color: #CC4747">getTweetByReplyeeTweetId()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public TweetNss setupSelect_TweetByReplyeeTweetId() {
        assertSetupSelectPurpose("tweetByReplyeeTweetId");
        if (hasSpecifiedLocalColumn()) {
            specify().columnReplyeeTweetId();
        }
        doSetupSelect(() -> query().queryTweetByReplyeeTweetId());
        if (_nssTweetByReplyeeTweetId == null || !_nssTweetByReplyeeTweetId.hasConditionQuery())
        { _nssTweetByReplyeeTweetId = new TweetNss(query().queryTweetByReplyeeTweetId()); }
        return _nssTweetByReplyeeTweetId;
    }

    /**
     * Set up relation columns to select clause. <br>
     * USER by my REPLYER_ID, named 'userByReplyerId'.
     * <pre>
     * <span style="color: #0000C0">replyBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_UserByReplyerId()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">reply</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">reply</span>.<span style="color: #CC4747">getUserByReplyerId()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     */
    public void setupSelect_UserByReplyerId() {
        assertSetupSelectPurpose("userByReplyerId");
        if (hasSpecifiedLocalColumn()) {
            specify().columnReplyerId();
        }
        doSetupSelect(() -> query().queryUserByReplyerId());
    }

    protected TweetNss _nssTweetByReplyerTweetId;
    public TweetNss xdfgetNssTweetByReplyerTweetId() {
        if (_nssTweetByReplyerTweetId == null) { _nssTweetByReplyerTweetId = new TweetNss(null); }
        return _nssTweetByReplyerTweetId;
    }
    /**
     * Set up relation columns to select clause. <br>
     * TWEET by my REPLYER_TWEET_ID, named 'tweetByReplyerTweetId'.
     * <pre>
     * <span style="color: #0000C0">replyBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_TweetByReplyerTweetId()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">reply</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">reply</span>.<span style="color: #CC4747">getTweetByReplyerTweetId()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public TweetNss setupSelect_TweetByReplyerTweetId() {
        assertSetupSelectPurpose("tweetByReplyerTweetId");
        if (hasSpecifiedLocalColumn()) {
            specify().columnReplyerTweetId();
        }
        doSetupSelect(() -> query().queryTweetByReplyerTweetId());
        if (_nssTweetByReplyerTweetId == null || !_nssTweetByReplyerTweetId.hasConditionQuery())
        { _nssTweetByReplyerTweetId = new TweetNss(query().queryTweetByReplyerTweetId()); }
        return _nssTweetByReplyerTweetId;
    }

    // [DBFlute-0.7.4]
    // ===================================================================================
    //                                                                             Specify
    //                                                                             =======
    protected HpSpecification _specification;

    /**
     * Prepare for SpecifyColumn, (Specify)DerivedReferrer. <br>
     * This method should be called after SetupSelect.
     * <pre>
     * <span style="color: #0000C0">memberBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.setupSelect_MemberStatus(); <span style="color: #3F7E5E">// should be called before specify()</span>
     *     <span style="color: #553000">cb</span>.specify().columnMemberName();
     *     <span style="color: #553000">cb</span>.specify().specifyMemberStatus().columnMemberStatusName();
     *     <span style="color: #553000">cb</span>.specify().derivedPurchaseList().max(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">purchaseCB</span>.specify().columnPurchaseDatetime();
     *         <span style="color: #553000">purchaseCB</span>.query().set...
     *     }, aliasName);
     * }).alwaysPresent(<span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ...
     * });
     * </pre>
     * @return The instance of specification. (NotNull)
     */
    public HpSpecification specify() {
        assertSpecifyPurpose();
        if (_specification == null) { _specification = new HpSpecification(this
            , xcreateSpQyCall(() -> true, () -> xdfgetConditionQuery())
            , _purpose, getDBMetaProvider(), xcSDRFnFc()); }
        return _specification;
    }

    public HpColumnSpHandler localSp() {
        return specify();
    }

    public boolean hasSpecifiedLocalColumn() {
        return _specification != null && _specification.hasSpecifiedColumn();
    }

    public static class HpSpecification extends HpAbstractSpecification<ReplyCQ> {
        protected UserCB.HpSpecification _userByReplyeeId;
        protected TweetCB.HpSpecification _tweetByReplyeeTweetId;
        protected UserCB.HpSpecification _userByReplyerId;
        protected TweetCB.HpSpecification _tweetByReplyerTweetId;
        public HpSpecification(ConditionBean baseCB, HpSpQyCall<ReplyCQ> qyCall
                             , HpCBPurpose purpose, DBMetaProvider dbmetaProvider
                             , HpSDRFunctionFactory sdrFuncFactory)
        { super(baseCB, qyCall, purpose, dbmetaProvider, sdrFuncFactory); }
        /**
         * REPLY_ID: {PK, ID, NotNull, BIGINT(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnReplyId() { return doColumn("REPLY_ID"); }
        /**
         * REPLYEE_ID: {IX, NotNull, BIGINT(19), FK to USER}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnReplyeeId() { return doColumn("REPLYEE_ID"); }
        /**
         * REPLYER_ID: {IX, NotNull, BIGINT(19), FK to USER}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnReplyerId() { return doColumn("REPLYER_ID"); }
        /**
         * REPLYEE_TWEET_ID: {IX, NotNull, BIGINT(19), FK to TWEET}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnReplyeeTweetId() { return doColumn("REPLYEE_TWEET_ID"); }
        /**
         * REPLYER_TWEET_ID: {IX, NotNull, BIGINT(19), FK to TWEET}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnReplyerTweetId() { return doColumn("REPLYER_TWEET_ID"); }
        /**
         * DEL_FLG: {NotNull, BIT}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDelFlg() { return doColumn("DEL_FLG"); }
        /**
         * REGISTER_DATETIME: {NotNull, DATETIME(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnRegisterDatetime() { return doColumn("REGISTER_DATETIME"); }
        /**
         * UPDATE_DATETIME: {NotNull, DATETIME(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnUpdateDatetime() { return doColumn("UPDATE_DATETIME"); }
        public void everyColumn() { doEveryColumn(); }
        public void exceptRecordMetaColumn() { doExceptRecordMetaColumn(); }
        @Override
        protected void doSpecifyRequiredColumn() {
            columnReplyId(); // PK
            if (qyCall().qy().hasConditionQueryUserByReplyeeId()
                    || qyCall().qy().xgetReferrerQuery() instanceof UserCQ) {
                columnReplyeeId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryTweetByReplyeeTweetId()
                    || qyCall().qy().xgetReferrerQuery() instanceof TweetCQ) {
                columnReplyeeTweetId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryUserByReplyerId()
                    || qyCall().qy().xgetReferrerQuery() instanceof UserCQ) {
                columnReplyerId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryTweetByReplyerTweetId()
                    || qyCall().qy().xgetReferrerQuery() instanceof TweetCQ) {
                columnReplyerTweetId(); // FK or one-to-one referrer
            }
        }
        @Override
        protected String getTableDbName() { return "REPLY"; }
        /**
         * Prepare to specify functions about relation table. <br>
         * USER by my REPLYEE_ID, named 'userByReplyeeId'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public UserCB.HpSpecification specifyUserByReplyeeId() {
            assertRelation("userByReplyeeId");
            if (_userByReplyeeId == null) {
                _userByReplyeeId = new UserCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryUserByReplyeeId()
                                    , () -> _qyCall.qy().queryUserByReplyeeId())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _userByReplyeeId.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryUserByReplyeeId()
                      , () -> xsyncQyCall().qy().queryUserByReplyeeId()));
                }
            }
            return _userByReplyeeId;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * TWEET by my REPLYEE_TWEET_ID, named 'tweetByReplyeeTweetId'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public TweetCB.HpSpecification specifyTweetByReplyeeTweetId() {
            assertRelation("tweetByReplyeeTweetId");
            if (_tweetByReplyeeTweetId == null) {
                _tweetByReplyeeTweetId = new TweetCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryTweetByReplyeeTweetId()
                                    , () -> _qyCall.qy().queryTweetByReplyeeTweetId())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _tweetByReplyeeTweetId.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryTweetByReplyeeTweetId()
                      , () -> xsyncQyCall().qy().queryTweetByReplyeeTweetId()));
                }
            }
            return _tweetByReplyeeTweetId;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * USER by my REPLYER_ID, named 'userByReplyerId'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public UserCB.HpSpecification specifyUserByReplyerId() {
            assertRelation("userByReplyerId");
            if (_userByReplyerId == null) {
                _userByReplyerId = new UserCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryUserByReplyerId()
                                    , () -> _qyCall.qy().queryUserByReplyerId())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _userByReplyerId.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryUserByReplyerId()
                      , () -> xsyncQyCall().qy().queryUserByReplyerId()));
                }
            }
            return _userByReplyerId;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * TWEET by my REPLYER_TWEET_ID, named 'tweetByReplyerTweetId'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public TweetCB.HpSpecification specifyTweetByReplyerTweetId() {
            assertRelation("tweetByReplyerTweetId");
            if (_tweetByReplyerTweetId == null) {
                _tweetByReplyerTweetId = new TweetCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryTweetByReplyerTweetId()
                                    , () -> _qyCall.qy().queryTweetByReplyerTweetId())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _tweetByReplyerTweetId.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryTweetByReplyerTweetId()
                      , () -> xsyncQyCall().qy().queryTweetByReplyerTweetId()));
                }
            }
            return _tweetByReplyerTweetId;
        }
        /**
         * Prepare for (Specify)MyselfDerived (SubQuery).
         * @return The object to set up a function for myself table. (NotNull)
         */
        public HpSDRFunction<ReplyCB, ReplyCQ> myselfDerived() {
            assertDerived("myselfDerived"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<ReplyCB> sq, ReplyCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsmyselfDerive(fn, sq, al, op), _dbmetaProvider);
        }
    }

    // ===================================================================================
    //                                                                        Dream Cruise
    //                                                                        ============
    /**
     * Welcome to the Dream Cruise for condition-bean deep world. <br>
     * This is very specialty so you can get the frontier spirit. Bon voyage!
     * @return The condition-bean for dream cruise, which is linked to main condition-bean.
     */
    public ReplyCB dreamCruiseCB() {
        ReplyCB cb = new ReplyCB();
        cb.xsetupForDreamCruise((ReplyCB) this);
        return cb;
    }

    protected ConditionBean xdoCreateDreamCruiseCB() {
        return dreamCruiseCB();
    }

    // [DBFlute-0.9.5.3]
    // ===================================================================================
    //                                                                        Column Query
    //                                                                        ============
    /**
     * Set up column-query. {column1 = column2}
     * <pre>
     * <span style="color: #3F7E5E">// where FOO &lt; BAR</span>
     * cb.<span style="color: #CC4747">columnQuery</span>(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFoo()</span>; <span style="color: #3F7E5E">// left column</span>
     * }).lessThan(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBar()</span>; <span style="color: #3F7E5E">// right column</span>
     * }); <span style="color: #3F7E5E">// you can calculate for right column like '}).plus(3);'</span>
     * </pre>
     * @param colCBLambda The callback for specify-query of left column. (NotNull)
     * @return The object for setting up operand and right column. (NotNull)
     */
    public HpColQyOperand<ReplyCB> columnQuery(final SpecifyQuery<ReplyCB> colCBLambda) {
        return xcreateColQyOperand((rightSp, operand) -> {
            return xcolqy(xcreateColumnQueryCB(), xcreateColumnQueryCB(), colCBLambda, rightSp, operand);
        });
    }

    protected ReplyCB xcreateColumnQueryCB() {
        ReplyCB cb = new ReplyCB();
        cb.xsetupForColumnQuery((ReplyCB)this);
        return cb;
    }

    // [DBFlute-0.9.6.3]
    // ===================================================================================
    //                                                                       OrScope Query
    //                                                                       =============
    /**
     * Set up the query for or-scope. <br>
     * (Same-column-and-same-condition-key conditions are allowed in or-scope)
     * <pre>
     * <span style="color: #3F7E5E">// where (FOO = '...' or BAR = '...')</span>
     * cb.<span style="color: #CC4747">orScopeQuery</span>(<span style="color: #553000">orCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">orCB</span>.query().setFoo...
     *     <span style="color: #553000">orCB</span>.query().setBar...
     * });
     * </pre>
     * @param orCBLambda The callback for query of or-condition. (NotNull)
     */
    public void orScopeQuery(OrQuery<ReplyCB> orCBLambda) {
        xorSQ((ReplyCB)this, orCBLambda);
    }

    /**
     * Set up the and-part of or-scope. <br>
     * (However nested or-scope query and as-or-split of like-search in and-part are unsupported)
     * <pre>
     * <span style="color: #3F7E5E">// where (FOO = '...' or (BAR = '...' and QUX = '...'))</span>
     * cb.<span style="color: #994747">orScopeQuery</span>(<span style="color: #553000">orCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">orCB</span>.query().setFoo...
     *     <span style="color: #553000">orCB</span>.<span style="color: #CC4747">orScopeQueryAndPart</span>(<span style="color: #553000">andCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">andCB</span>.query().setBar...
     *         <span style="color: #553000">andCB</span>.query().setQux...
     *     });
     * });
     * </pre>
     * @param andCBLambda The callback for query of and-condition. (NotNull)
     */
    public void orScopeQueryAndPart(AndQuery<ReplyCB> andCBLambda) {
        xorSQAP((ReplyCB)this, andCBLambda);
    }

    // ===================================================================================
    //                                                                          DisplaySQL
    //                                                                          ==========
    @Override
    protected SqlAnalyzerFactory getSqlAnalyzerFactory()
    { return new ImplementedInvokerAssistant().assistSqlAnalyzerFactory(); }
    @Override
    protected String getConfiguredLogDatePattern() { return DBFluteConfig.getInstance().getLogDatePattern(); }
    @Override
    protected String getConfiguredLogTimestampPattern() { return DBFluteConfig.getInstance().getLogTimestampPattern(); }
    @Override
    protected String getConfiguredLogTimePattern() { return DBFluteConfig.getInstance().getLogTimePattern(); }
    @Override
    protected BoundDateDisplayTimeZoneProvider getConfiguredLogTimeZoneProvider() { return DBFluteConfig.getInstance().getLogTimeZoneProvider(); }

    // ===================================================================================
    //                                                                       Meta Handling
    //                                                                       =============
    public boolean hasUnionQueryOrUnionAllQuery() {
        return query().hasUnionQueryOrUnionAllQuery();
    }

    // ===================================================================================
    //                                                                        Purpose Type
    //                                                                        ============
    @Override
    protected void xprepareSyncQyCall(ConditionBean mainCB) {
        final ReplyCB cb;
        if (mainCB != null) {
            cb = (ReplyCB)mainCB;
        } else {
            cb = new ReplyCB();
        }
        specify().xsetSyncQyCall(xcreateSpQyCall(() -> true, () -> cb.query()));
    }

    // ===================================================================================
    //                                                                            Internal
    //                                                                            ========
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xgetConditionBeanClassNameInternally() { return ReplyCB.class.getName(); }
    protected String xgetConditionQueryClassNameInternally() { return ReplyCQ.class.getName(); }
    protected String xgetSubQueryClassNameInternally() { return SubQuery.class.getName(); }
    protected String xgetConditionOptionClassNameInternally() { return ConditionOption.class.getName(); }
}
