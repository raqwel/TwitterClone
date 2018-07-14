package com.example.twitter.dbflute.cbean.cq.bs;

import java.util.*;

import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.ckey.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.ordering.*;
import org.dbflute.cbean.scoping.*;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.dbmeta.DBMetaProvider;
import com.example.twitter.dbflute.allcommon.*;
import com.example.twitter.dbflute.cbean.*;
import com.example.twitter.dbflute.cbean.cq.*;

/**
 * The abstract condition-query of TWEET.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTweetCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTweetCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    @Override
    protected DBMetaProvider xgetDBMetaProvider() {
        return DBMetaInstanceHandler.getProvider();
    }

    public String asTableDbName() {
        return "TWEET";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TWEET_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param tweetId The value of tweetId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTweetId_Equal(Long tweetId) {
        doSetTweetId_Equal(tweetId);
    }

    protected void doSetTweetId_Equal(Long tweetId) {
        regTweetId(CK_EQ, tweetId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TWEET_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param tweetId The value of tweetId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTweetId_NotEqual(Long tweetId) {
        doSetTweetId_NotEqual(tweetId);
    }

    protected void doSetTweetId_NotEqual(Long tweetId) {
        regTweetId(CK_NES, tweetId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TWEET_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param tweetId The value of tweetId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTweetId_GreaterThan(Long tweetId) {
        regTweetId(CK_GT, tweetId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TWEET_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param tweetId The value of tweetId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTweetId_LessThan(Long tweetId) {
        regTweetId(CK_LT, tweetId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TWEET_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param tweetId The value of tweetId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTweetId_GreaterEqual(Long tweetId) {
        regTweetId(CK_GE, tweetId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TWEET_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param tweetId The value of tweetId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTweetId_LessEqual(Long tweetId) {
        regTweetId(CK_LE, tweetId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TWEET_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of tweetId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of tweetId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setTweetId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setTweetId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TWEET_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of tweetId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of tweetId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setTweetId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTweetId(), "TWEET_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TWEET_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param tweetIdList The collection of tweetId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTweetId_InScope(Collection<Long> tweetIdList) {
        doSetTweetId_InScope(tweetIdList);
    }

    protected void doSetTweetId_InScope(Collection<Long> tweetIdList) {
        regINS(CK_INS, cTL(tweetIdList), xgetCValueTweetId(), "TWEET_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TWEET_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param tweetIdList The collection of tweetId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTweetId_NotInScope(Collection<Long> tweetIdList) {
        doSetTweetId_NotInScope(tweetIdList);
    }

    protected void doSetTweetId_NotInScope(Collection<Long> tweetIdList) {
        regINS(CK_NINS, cTL(tweetIdList), xgetCValueTweetId(), "TWEET_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select TWEET_ID from FAVOLITE where ...)} <br>
     * FAVOLITE by TWEET_ID, named 'favoliteAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsFavolite</span>(favoliteCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     favoliteCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of FavoliteList for 'exists'. (NotNull)
     */
    public void existsFavolite(SubQuery<FavoliteCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        FavoliteCB cb = new FavoliteCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepTweetId_ExistsReferrer_FavoliteList(cb.query());
        registerExistsReferrer(cb.query(), "TWEET_ID", "TWEET_ID", pp, "favoliteList");
    }
    public abstract String keepTweetId_ExistsReferrer_FavoliteList(FavoliteCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select REPLYEE_TWEET_ID from REPLY where ...)} <br>
     * REPLY by REPLYEE_TWEET_ID, named 'replyByReplyeeTweetIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsReplyByReplyeeTweetId</span>(replyCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     replyCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ReplyByReplyeeTweetIdList for 'exists'. (NotNull)
     */
    public void existsReplyByReplyeeTweetId(SubQuery<ReplyCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        ReplyCB cb = new ReplyCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepTweetId_ExistsReferrer_ReplyByReplyeeTweetIdList(cb.query());
        registerExistsReferrer(cb.query(), "TWEET_ID", "REPLYEE_TWEET_ID", pp, "replyByReplyeeTweetIdList");
    }
    public abstract String keepTweetId_ExistsReferrer_ReplyByReplyeeTweetIdList(ReplyCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select REPLYER_TWEET_ID from REPLY where ...)} <br>
     * REPLY by REPLYER_TWEET_ID, named 'replyByReplyerTweetIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsReplyByReplyerTweetId</span>(replyCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     replyCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ReplyByReplyerTweetIdList for 'exists'. (NotNull)
     */
    public void existsReplyByReplyerTweetId(SubQuery<ReplyCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        ReplyCB cb = new ReplyCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepTweetId_ExistsReferrer_ReplyByReplyerTweetIdList(cb.query());
        registerExistsReferrer(cb.query(), "TWEET_ID", "REPLYER_TWEET_ID", pp, "replyByReplyerTweetIdList");
    }
    public abstract String keepTweetId_ExistsReferrer_ReplyByReplyerTweetIdList(ReplyCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select TWEET_ID from RETWEET where ...)} <br>
     * RETWEET by TWEET_ID, named 'retweetAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsRetweet</span>(retweetCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     retweetCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of RetweetList for 'exists'. (NotNull)
     */
    public void existsRetweet(SubQuery<RetweetCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        RetweetCB cb = new RetweetCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepTweetId_ExistsReferrer_RetweetList(cb.query());
        registerExistsReferrer(cb.query(), "TWEET_ID", "TWEET_ID", pp, "retweetList");
    }
    public abstract String keepTweetId_ExistsReferrer_RetweetList(RetweetCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select TWEET_ID from FAVOLITE where ...)} <br>
     * FAVOLITE by TWEET_ID, named 'favoliteAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsFavolite</span>(favoliteCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     favoliteCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TweetId_NotExistsReferrer_FavoliteList for 'not exists'. (NotNull)
     */
    public void notExistsFavolite(SubQuery<FavoliteCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        FavoliteCB cb = new FavoliteCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepTweetId_NotExistsReferrer_FavoliteList(cb.query());
        registerNotExistsReferrer(cb.query(), "TWEET_ID", "TWEET_ID", pp, "favoliteList");
    }
    public abstract String keepTweetId_NotExistsReferrer_FavoliteList(FavoliteCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select REPLYEE_TWEET_ID from REPLY where ...)} <br>
     * REPLY by REPLYEE_TWEET_ID, named 'replyByReplyeeTweetIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsReplyByReplyeeTweetId</span>(replyCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     replyCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TweetId_NotExistsReferrer_ReplyByReplyeeTweetIdList for 'not exists'. (NotNull)
     */
    public void notExistsReplyByReplyeeTweetId(SubQuery<ReplyCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        ReplyCB cb = new ReplyCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepTweetId_NotExistsReferrer_ReplyByReplyeeTweetIdList(cb.query());
        registerNotExistsReferrer(cb.query(), "TWEET_ID", "REPLYEE_TWEET_ID", pp, "replyByReplyeeTweetIdList");
    }
    public abstract String keepTweetId_NotExistsReferrer_ReplyByReplyeeTweetIdList(ReplyCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select REPLYER_TWEET_ID from REPLY where ...)} <br>
     * REPLY by REPLYER_TWEET_ID, named 'replyByReplyerTweetIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsReplyByReplyerTweetId</span>(replyCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     replyCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TweetId_NotExistsReferrer_ReplyByReplyerTweetIdList for 'not exists'. (NotNull)
     */
    public void notExistsReplyByReplyerTweetId(SubQuery<ReplyCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        ReplyCB cb = new ReplyCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepTweetId_NotExistsReferrer_ReplyByReplyerTweetIdList(cb.query());
        registerNotExistsReferrer(cb.query(), "TWEET_ID", "REPLYER_TWEET_ID", pp, "replyByReplyerTweetIdList");
    }
    public abstract String keepTweetId_NotExistsReferrer_ReplyByReplyerTweetIdList(ReplyCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select TWEET_ID from RETWEET where ...)} <br>
     * RETWEET by TWEET_ID, named 'retweetAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsRetweet</span>(retweetCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     retweetCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TweetId_NotExistsReferrer_RetweetList for 'not exists'. (NotNull)
     */
    public void notExistsRetweet(SubQuery<RetweetCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        RetweetCB cb = new RetweetCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepTweetId_NotExistsReferrer_RetweetList(cb.query());
        registerNotExistsReferrer(cb.query(), "TWEET_ID", "TWEET_ID", pp, "retweetList");
    }
    public abstract String keepTweetId_NotExistsReferrer_RetweetList(RetweetCQ sq);

    public void xsderiveFavoliteList(String fn, SubQuery<FavoliteCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        FavoliteCB cb = new FavoliteCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepTweetId_SpecifyDerivedReferrer_FavoliteList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "TWEET_ID", "TWEET_ID", pp, "favoliteList", al, op);
    }
    public abstract String keepTweetId_SpecifyDerivedReferrer_FavoliteList(FavoliteCQ sq);

    public void xsderiveReplyByReplyeeTweetIdList(String fn, SubQuery<ReplyCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        ReplyCB cb = new ReplyCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepTweetId_SpecifyDerivedReferrer_ReplyByReplyeeTweetIdList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "TWEET_ID", "REPLYEE_TWEET_ID", pp, "replyByReplyeeTweetIdList", al, op);
    }
    public abstract String keepTweetId_SpecifyDerivedReferrer_ReplyByReplyeeTweetIdList(ReplyCQ sq);

    public void xsderiveReplyByReplyerTweetIdList(String fn, SubQuery<ReplyCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        ReplyCB cb = new ReplyCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepTweetId_SpecifyDerivedReferrer_ReplyByReplyerTweetIdList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "TWEET_ID", "REPLYER_TWEET_ID", pp, "replyByReplyerTweetIdList", al, op);
    }
    public abstract String keepTweetId_SpecifyDerivedReferrer_ReplyByReplyerTweetIdList(ReplyCQ sq);

    public void xsderiveRetweetList(String fn, SubQuery<RetweetCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        RetweetCB cb = new RetweetCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepTweetId_SpecifyDerivedReferrer_RetweetList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "TWEET_ID", "TWEET_ID", pp, "retweetList", al, op);
    }
    public abstract String keepTweetId_SpecifyDerivedReferrer_RetweetList(RetweetCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from FAVOLITE where ...)} <br>
     * FAVOLITE by TWEET_ID, named 'favoliteAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedFavolite()</span>.<span style="color: #CC4747">max</span>(favoliteCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     favoliteCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     favoliteCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<FavoliteCB> derivedFavolite() {
        return xcreateQDRFunctionFavoliteList();
    }
    protected HpQDRFunction<FavoliteCB> xcreateQDRFunctionFavoliteList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveFavoliteList(fn, sq, rd, vl, op));
    }
    public void xqderiveFavoliteList(String fn, SubQuery<FavoliteCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        FavoliteCB cb = new FavoliteCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepTweetId_QueryDerivedReferrer_FavoliteList(cb.query()); String prpp = keepTweetId_QueryDerivedReferrer_FavoliteListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "TWEET_ID", "TWEET_ID", sqpp, "favoliteList", rd, vl, prpp, op);
    }
    public abstract String keepTweetId_QueryDerivedReferrer_FavoliteList(FavoliteCQ sq);
    public abstract String keepTweetId_QueryDerivedReferrer_FavoliteListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from REPLY where ...)} <br>
     * REPLY by REPLYEE_TWEET_ID, named 'replyByReplyeeTweetIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedReplyByReplyeeTweetId()</span>.<span style="color: #CC4747">max</span>(replyCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     replyCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     replyCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<ReplyCB> derivedReplyByReplyeeTweetId() {
        return xcreateQDRFunctionReplyByReplyeeTweetIdList();
    }
    protected HpQDRFunction<ReplyCB> xcreateQDRFunctionReplyByReplyeeTweetIdList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveReplyByReplyeeTweetIdList(fn, sq, rd, vl, op));
    }
    public void xqderiveReplyByReplyeeTweetIdList(String fn, SubQuery<ReplyCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        ReplyCB cb = new ReplyCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepTweetId_QueryDerivedReferrer_ReplyByReplyeeTweetIdList(cb.query()); String prpp = keepTweetId_QueryDerivedReferrer_ReplyByReplyeeTweetIdListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "TWEET_ID", "REPLYEE_TWEET_ID", sqpp, "replyByReplyeeTweetIdList", rd, vl, prpp, op);
    }
    public abstract String keepTweetId_QueryDerivedReferrer_ReplyByReplyeeTweetIdList(ReplyCQ sq);
    public abstract String keepTweetId_QueryDerivedReferrer_ReplyByReplyeeTweetIdListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from REPLY where ...)} <br>
     * REPLY by REPLYER_TWEET_ID, named 'replyByReplyerTweetIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedReplyByReplyerTweetId()</span>.<span style="color: #CC4747">max</span>(replyCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     replyCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     replyCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<ReplyCB> derivedReplyByReplyerTweetId() {
        return xcreateQDRFunctionReplyByReplyerTweetIdList();
    }
    protected HpQDRFunction<ReplyCB> xcreateQDRFunctionReplyByReplyerTweetIdList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveReplyByReplyerTweetIdList(fn, sq, rd, vl, op));
    }
    public void xqderiveReplyByReplyerTweetIdList(String fn, SubQuery<ReplyCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        ReplyCB cb = new ReplyCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepTweetId_QueryDerivedReferrer_ReplyByReplyerTweetIdList(cb.query()); String prpp = keepTweetId_QueryDerivedReferrer_ReplyByReplyerTweetIdListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "TWEET_ID", "REPLYER_TWEET_ID", sqpp, "replyByReplyerTweetIdList", rd, vl, prpp, op);
    }
    public abstract String keepTweetId_QueryDerivedReferrer_ReplyByReplyerTweetIdList(ReplyCQ sq);
    public abstract String keepTweetId_QueryDerivedReferrer_ReplyByReplyerTweetIdListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from RETWEET where ...)} <br>
     * RETWEET by TWEET_ID, named 'retweetAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedRetweet()</span>.<span style="color: #CC4747">max</span>(retweetCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     retweetCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     retweetCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<RetweetCB> derivedRetweet() {
        return xcreateQDRFunctionRetweetList();
    }
    protected HpQDRFunction<RetweetCB> xcreateQDRFunctionRetweetList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveRetweetList(fn, sq, rd, vl, op));
    }
    public void xqderiveRetweetList(String fn, SubQuery<RetweetCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        RetweetCB cb = new RetweetCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepTweetId_QueryDerivedReferrer_RetweetList(cb.query()); String prpp = keepTweetId_QueryDerivedReferrer_RetweetListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "TWEET_ID", "TWEET_ID", sqpp, "retweetList", rd, vl, prpp, op);
    }
    public abstract String keepTweetId_QueryDerivedReferrer_RetweetList(RetweetCQ sq);
    public abstract String keepTweetId_QueryDerivedReferrer_RetweetListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TWEET_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setTweetId_IsNull() { regTweetId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TWEET_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setTweetId_IsNotNull() { regTweetId(CK_ISNN, DOBJ); }

    protected void regTweetId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTweetId(), "TWEET_ID"); }
    protected abstract ConditionValue xgetCValueTweetId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * USER_ID: {IX, NotNull, BIGINT(19), FK to USER}
     * @param userId The value of userId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserId_Equal(Long userId) {
        doSetUserId_Equal(userId);
    }

    protected void doSetUserId_Equal(Long userId) {
        regUserId(CK_EQ, userId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * USER_ID: {IX, NotNull, BIGINT(19), FK to USER}
     * @param userId The value of userId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserId_NotEqual(Long userId) {
        doSetUserId_NotEqual(userId);
    }

    protected void doSetUserId_NotEqual(Long userId) {
        regUserId(CK_NES, userId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * USER_ID: {IX, NotNull, BIGINT(19), FK to USER}
     * @param userId The value of userId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserId_GreaterThan(Long userId) {
        regUserId(CK_GT, userId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * USER_ID: {IX, NotNull, BIGINT(19), FK to USER}
     * @param userId The value of userId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserId_LessThan(Long userId) {
        regUserId(CK_LT, userId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * USER_ID: {IX, NotNull, BIGINT(19), FK to USER}
     * @param userId The value of userId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserId_GreaterEqual(Long userId) {
        regUserId(CK_GE, userId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * USER_ID: {IX, NotNull, BIGINT(19), FK to USER}
     * @param userId The value of userId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserId_LessEqual(Long userId) {
        regUserId(CK_LE, userId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * USER_ID: {IX, NotNull, BIGINT(19), FK to USER}
     * @param minNumber The min number of userId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of userId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setUserId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setUserId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * USER_ID: {IX, NotNull, BIGINT(19), FK to USER}
     * @param minNumber The min number of userId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of userId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setUserId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueUserId(), "USER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * USER_ID: {IX, NotNull, BIGINT(19), FK to USER}
     * @param userIdList The collection of userId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserId_InScope(Collection<Long> userIdList) {
        doSetUserId_InScope(userIdList);
    }

    protected void doSetUserId_InScope(Collection<Long> userIdList) {
        regINS(CK_INS, cTL(userIdList), xgetCValueUserId(), "USER_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * USER_ID: {IX, NotNull, BIGINT(19), FK to USER}
     * @param userIdList The collection of userId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserId_NotInScope(Collection<Long> userIdList) {
        doSetUserId_NotInScope(userIdList);
    }

    protected void doSetUserId_NotInScope(Collection<Long> userIdList) {
        regINS(CK_NINS, cTL(userIdList), xgetCValueUserId(), "USER_ID");
    }

    protected void regUserId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUserId(), "USER_ID"); }
    protected abstract ConditionValue xgetCValueUserId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TWEET: {NotNull, VARCHAR(140)}
     * @param tweet The value of tweet as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTweet_Equal(String tweet) {
        doSetTweet_Equal(fRES(tweet));
    }

    protected void doSetTweet_Equal(String tweet) {
        regTweet(CK_EQ, tweet);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TWEET: {NotNull, VARCHAR(140)}
     * @param tweet The value of tweet as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTweet_NotEqual(String tweet) {
        doSetTweet_NotEqual(fRES(tweet));
    }

    protected void doSetTweet_NotEqual(String tweet) {
        regTweet(CK_NES, tweet);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TWEET: {NotNull, VARCHAR(140)}
     * @param tweet The value of tweet as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTweet_GreaterThan(String tweet) {
        regTweet(CK_GT, fRES(tweet));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TWEET: {NotNull, VARCHAR(140)}
     * @param tweet The value of tweet as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTweet_LessThan(String tweet) {
        regTweet(CK_LT, fRES(tweet));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TWEET: {NotNull, VARCHAR(140)}
     * @param tweet The value of tweet as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTweet_GreaterEqual(String tweet) {
        regTweet(CK_GE, fRES(tweet));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TWEET: {NotNull, VARCHAR(140)}
     * @param tweet The value of tweet as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTweet_LessEqual(String tweet) {
        regTweet(CK_LE, fRES(tweet));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TWEET: {NotNull, VARCHAR(140)}
     * @param tweetList The collection of tweet as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTweet_InScope(Collection<String> tweetList) {
        doSetTweet_InScope(tweetList);
    }

    protected void doSetTweet_InScope(Collection<String> tweetList) {
        regINS(CK_INS, cTL(tweetList), xgetCValueTweet(), "TWEET");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TWEET: {NotNull, VARCHAR(140)}
     * @param tweetList The collection of tweet as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTweet_NotInScope(Collection<String> tweetList) {
        doSetTweet_NotInScope(tweetList);
    }

    protected void doSetTweet_NotInScope(Collection<String> tweetList) {
        regINS(CK_NINS, cTL(tweetList), xgetCValueTweet(), "TWEET");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TWEET: {NotNull, VARCHAR(140)} <br>
     * <pre>e.g. setTweet_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param tweet The value of tweet as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setTweet_LikeSearch(String tweet, ConditionOptionCall<LikeSearchOption> opLambda) {
        setTweet_LikeSearch(tweet, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TWEET: {NotNull, VARCHAR(140)} <br>
     * <pre>e.g. setTweet_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param tweet The value of tweet as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setTweet_LikeSearch(String tweet, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(tweet), xgetCValueTweet(), "TWEET", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TWEET: {NotNull, VARCHAR(140)}
     * @param tweet The value of tweet as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setTweet_NotLikeSearch(String tweet, ConditionOptionCall<LikeSearchOption> opLambda) {
        setTweet_NotLikeSearch(tweet, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TWEET: {NotNull, VARCHAR(140)}
     * @param tweet The value of tweet as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setTweet_NotLikeSearch(String tweet, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(tweet), xgetCValueTweet(), "TWEET", likeSearchOption);
    }

    protected void regTweet(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTweet(), "TWEET"); }
    protected abstract ConditionValue xgetCValueTweet();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * DEL_FLG: {NotNull, BIT}
     * @param delFlg The value of delFlg as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setDelFlg_Equal(Boolean delFlg) {
        regDelFlg(CK_EQ, delFlg);
    }

    protected void regDelFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDelFlg(), "DEL_FLG"); }
    protected abstract ConditionValue xgetCValueDelFlg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * REGISTER_DATETIME: {NotNull, DATETIME(19)}
     * @param registerDatetime The value of registerDatetime as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setRegisterDatetime_Equal(java.time.LocalDateTime registerDatetime) {
        regRegisterDatetime(CK_EQ,  registerDatetime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REGISTER_DATETIME: {NotNull, DATETIME(19)}
     * @param registerDatetime The value of registerDatetime as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRegisterDatetime_GreaterThan(java.time.LocalDateTime registerDatetime) {
        regRegisterDatetime(CK_GT,  registerDatetime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REGISTER_DATETIME: {NotNull, DATETIME(19)}
     * @param registerDatetime The value of registerDatetime as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRegisterDatetime_LessThan(java.time.LocalDateTime registerDatetime) {
        regRegisterDatetime(CK_LT,  registerDatetime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * REGISTER_DATETIME: {NotNull, DATETIME(19)}
     * @param registerDatetime The value of registerDatetime as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRegisterDatetime_GreaterEqual(java.time.LocalDateTime registerDatetime) {
        regRegisterDatetime(CK_GE,  registerDatetime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * REGISTER_DATETIME: {NotNull, DATETIME(19)}
     * @param registerDatetime The value of registerDatetime as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRegisterDatetime_LessEqual(java.time.LocalDateTime registerDatetime) {
        regRegisterDatetime(CK_LE, registerDatetime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * REGISTER_DATETIME: {NotNull, DATETIME(19)}
     * <pre>e.g. setRegisterDatetime_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of registerDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of registerDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setRegisterDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setRegisterDatetime_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * REGISTER_DATETIME: {NotNull, DATETIME(19)}
     * <pre>e.g. setRegisterDatetime_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of registerDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of registerDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setRegisterDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, FromToOption fromToOption) {
        String nm = "REGISTER_DATETIME"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueRegisterDatetime(), nm, op);
    }

    protected void regRegisterDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRegisterDatetime(), "REGISTER_DATETIME"); }
    protected abstract ConditionValue xgetCValueRegisterDatetime();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * UPDATE_DATETIME: {NotNull, DATETIME(19)}
     * @param updateDatetime The value of updateDatetime as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdateDatetime_Equal(java.time.LocalDateTime updateDatetime) {
        regUpdateDatetime(CK_EQ,  updateDatetime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * UPDATE_DATETIME: {NotNull, DATETIME(19)}
     * @param updateDatetime The value of updateDatetime as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdateDatetime_GreaterThan(java.time.LocalDateTime updateDatetime) {
        regUpdateDatetime(CK_GT,  updateDatetime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * UPDATE_DATETIME: {NotNull, DATETIME(19)}
     * @param updateDatetime The value of updateDatetime as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdateDatetime_LessThan(java.time.LocalDateTime updateDatetime) {
        regUpdateDatetime(CK_LT,  updateDatetime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * UPDATE_DATETIME: {NotNull, DATETIME(19)}
     * @param updateDatetime The value of updateDatetime as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdateDatetime_GreaterEqual(java.time.LocalDateTime updateDatetime) {
        regUpdateDatetime(CK_GE,  updateDatetime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * UPDATE_DATETIME: {NotNull, DATETIME(19)}
     * @param updateDatetime The value of updateDatetime as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdateDatetime_LessEqual(java.time.LocalDateTime updateDatetime) {
        regUpdateDatetime(CK_LE, updateDatetime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * UPDATE_DATETIME: {NotNull, DATETIME(19)}
     * <pre>e.g. setUpdateDatetime_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updateDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updateDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setUpdateDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setUpdateDatetime_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * UPDATE_DATETIME: {NotNull, DATETIME(19)}
     * <pre>e.g. setUpdateDatetime_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updateDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updateDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setUpdateDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, FromToOption fromToOption) {
        String nm = "UPDATE_DATETIME"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueUpdateDatetime(), nm, op);
    }

    protected void regUpdateDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUpdateDatetime(), "UPDATE_DATETIME"); }
    protected abstract ConditionValue xgetCValueUpdateDatetime();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO = (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TweetCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TweetCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO &lt;&gt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TweetCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TweetCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br>
     * {where FOO &gt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TweetCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TweetCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br>
     * {where FOO &lt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TweetCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TweetCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br>
     * {where FOO &gt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TweetCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TweetCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TweetCB&gt;() {
     *     public void query(TweetCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TweetCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TweetCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TweetCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TweetCQ sq);

    protected TweetCB xcreateScalarConditionCB() {
        TweetCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TweetCB xcreateScalarConditionPartitionByCB() {
        TweetCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<TweetCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TweetCB cb = new TweetCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "TWEET_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(TweetCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<TweetCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(TweetCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TweetCB cb = new TweetCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "TWEET_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(TweetCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<TweetCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TweetCB cb = new TweetCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(TweetCQ sq);

    // ===================================================================================
    //                                                                        Manual Order
    //                                                                        ============
    /**
     * Order along manual ordering information.
     * <pre>
     * cb.query().addOrderBy_Birthdate_Asc().<span style="color: #CC4747">withManualOrder</span>(<span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_GreaterEqual</span>(priorityDate); <span style="color: #3F7E5E">// e.g. 2000/01/01</span>
     * });
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when BIRTHDATE &gt;= '2000/01/01' then 0</span>
     * <span style="color: #3F7E5E">//     else 1</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     *
     * cb.query().addOrderBy_MemberStatusCode_Asc().<span style="color: #CC4747">withManualOrder</span>(<span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Withdrawal);
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Formalized);
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Provisional);
     * });
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'WDL' then 0</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'FML' then 1</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'PRV' then 2</span>
     * <span style="color: #3F7E5E">//     else 3</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     * </pre>
     * <p>This function with Union is unsupported!</p>
     * <p>The order values are bound (treated as bind parameter).</p>
     * @param opLambda The callback for option of manual-order containing order values. (NotNull)
     */
    public void withManualOrder(ManualOrderOptionCall opLambda) { // is user public!
        xdoWithManualOrder(cMOO(opLambda));
    }

    // ===================================================================================
    //                                                                    Small Adjustment
    //                                                                    ================
    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    protected TweetCB newMyCB() {
        return new TweetCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TweetCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
