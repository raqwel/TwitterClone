package demo.dbflute.cbean.cq.bs;

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
import demo.dbflute.allcommon.*;
import demo.dbflute.cbean.*;
import demo.dbflute.cbean.cq.*;

/**
 * The abstract condition-query of USER.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsUserCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsUserCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "USER";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * USER_ID: {PK, ID, NotNull, BIGINT(19)}
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
     * USER_ID: {PK, ID, NotNull, BIGINT(19)}
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
     * USER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param userId The value of userId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserId_GreaterThan(Long userId) {
        regUserId(CK_GT, userId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * USER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param userId The value of userId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserId_LessThan(Long userId) {
        regUserId(CK_LT, userId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * USER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param userId The value of userId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserId_GreaterEqual(Long userId) {
        regUserId(CK_GE, userId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * USER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param userId The value of userId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserId_LessEqual(Long userId) {
        regUserId(CK_LE, userId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * USER_ID: {PK, ID, NotNull, BIGINT(19)}
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
     * USER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of userId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of userId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setUserId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueUserId(), "USER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * USER_ID: {PK, ID, NotNull, BIGINT(19)}
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
     * USER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param userIdList The collection of userId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserId_NotInScope(Collection<Long> userIdList) {
        doSetUserId_NotInScope(userIdList);
    }

    protected void doSetUserId_NotInScope(Collection<Long> userIdList) {
        regINS(CK_NINS, cTL(userIdList), xgetCValueUserId(), "USER_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select USER_ID from FAVOLITE where ...)} <br>
     * FAVOLITE by USER_ID, named 'favoliteAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepUserId_ExistsReferrer_FavoliteList(cb.query());
        registerExistsReferrer(cb.query(), "USER_ID", "USER_ID", pp, "favoliteList");
    }
    public abstract String keepUserId_ExistsReferrer_FavoliteList(FavoliteCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select FOLLOWEE_ID from FOLLOW where ...)} <br>
     * FOLLOW by FOLLOWEE_ID, named 'followByFolloweeIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsFollowByFolloweeId</span>(followCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     followCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of FollowByFolloweeIdList for 'exists'. (NotNull)
     */
    public void existsFollowByFolloweeId(SubQuery<FollowCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        FollowCB cb = new FollowCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepUserId_ExistsReferrer_FollowByFolloweeIdList(cb.query());
        registerExistsReferrer(cb.query(), "USER_ID", "FOLLOWEE_ID", pp, "followByFolloweeIdList");
    }
    public abstract String keepUserId_ExistsReferrer_FollowByFolloweeIdList(FollowCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select FOLLOWER_ID from FOLLOW where ...)} <br>
     * FOLLOW by FOLLOWER_ID, named 'followByFollowerIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsFollowByFollowerId</span>(followCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     followCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of FollowByFollowerIdList for 'exists'. (NotNull)
     */
    public void existsFollowByFollowerId(SubQuery<FollowCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        FollowCB cb = new FollowCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepUserId_ExistsReferrer_FollowByFollowerIdList(cb.query());
        registerExistsReferrer(cb.query(), "USER_ID", "FOLLOWER_ID", pp, "followByFollowerIdList");
    }
    public abstract String keepUserId_ExistsReferrer_FollowByFollowerIdList(FollowCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select REPLYEE_ID from REPLY where ...)} <br>
     * REPLY by REPLYEE_ID, named 'replyByReplyeeIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsReplyByReplyeeId</span>(replyCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     replyCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ReplyByReplyeeIdList for 'exists'. (NotNull)
     */
    public void existsReplyByReplyeeId(SubQuery<ReplyCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        ReplyCB cb = new ReplyCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepUserId_ExistsReferrer_ReplyByReplyeeIdList(cb.query());
        registerExistsReferrer(cb.query(), "USER_ID", "REPLYEE_ID", pp, "replyByReplyeeIdList");
    }
    public abstract String keepUserId_ExistsReferrer_ReplyByReplyeeIdList(ReplyCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select REPLYER_ID from REPLY where ...)} <br>
     * REPLY by REPLYER_ID, named 'replyByReplyerIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsReplyByReplyerId</span>(replyCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     replyCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ReplyByReplyerIdList for 'exists'. (NotNull)
     */
    public void existsReplyByReplyerId(SubQuery<ReplyCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        ReplyCB cb = new ReplyCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepUserId_ExistsReferrer_ReplyByReplyerIdList(cb.query());
        registerExistsReferrer(cb.query(), "USER_ID", "REPLYER_ID", pp, "replyByReplyerIdList");
    }
    public abstract String keepUserId_ExistsReferrer_ReplyByReplyerIdList(ReplyCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select USER_ID from RETWEET where ...)} <br>
     * RETWEET by USER_ID, named 'retweetAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepUserId_ExistsReferrer_RetweetList(cb.query());
        registerExistsReferrer(cb.query(), "USER_ID", "USER_ID", pp, "retweetList");
    }
    public abstract String keepUserId_ExistsReferrer_RetweetList(RetweetCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select USER_ID from TWEET where ...)} <br>
     * TWEET by USER_ID, named 'tweetAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTweet</span>(tweetCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     tweetCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TweetList for 'exists'. (NotNull)
     */
    public void existsTweet(SubQuery<TweetCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TweetCB cb = new TweetCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepUserId_ExistsReferrer_TweetList(cb.query());
        registerExistsReferrer(cb.query(), "USER_ID", "USER_ID", pp, "tweetList");
    }
    public abstract String keepUserId_ExistsReferrer_TweetList(TweetCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select USER_ID from FAVOLITE where ...)} <br>
     * FAVOLITE by USER_ID, named 'favoliteAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsFavolite</span>(favoliteCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     favoliteCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of UserId_NotExistsReferrer_FavoliteList for 'not exists'. (NotNull)
     */
    public void notExistsFavolite(SubQuery<FavoliteCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        FavoliteCB cb = new FavoliteCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepUserId_NotExistsReferrer_FavoliteList(cb.query());
        registerNotExistsReferrer(cb.query(), "USER_ID", "USER_ID", pp, "favoliteList");
    }
    public abstract String keepUserId_NotExistsReferrer_FavoliteList(FavoliteCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select FOLLOWEE_ID from FOLLOW where ...)} <br>
     * FOLLOW by FOLLOWEE_ID, named 'followByFolloweeIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsFollowByFolloweeId</span>(followCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     followCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of UserId_NotExistsReferrer_FollowByFolloweeIdList for 'not exists'. (NotNull)
     */
    public void notExistsFollowByFolloweeId(SubQuery<FollowCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        FollowCB cb = new FollowCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepUserId_NotExistsReferrer_FollowByFolloweeIdList(cb.query());
        registerNotExistsReferrer(cb.query(), "USER_ID", "FOLLOWEE_ID", pp, "followByFolloweeIdList");
    }
    public abstract String keepUserId_NotExistsReferrer_FollowByFolloweeIdList(FollowCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select FOLLOWER_ID from FOLLOW where ...)} <br>
     * FOLLOW by FOLLOWER_ID, named 'followByFollowerIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsFollowByFollowerId</span>(followCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     followCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of UserId_NotExistsReferrer_FollowByFollowerIdList for 'not exists'. (NotNull)
     */
    public void notExistsFollowByFollowerId(SubQuery<FollowCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        FollowCB cb = new FollowCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepUserId_NotExistsReferrer_FollowByFollowerIdList(cb.query());
        registerNotExistsReferrer(cb.query(), "USER_ID", "FOLLOWER_ID", pp, "followByFollowerIdList");
    }
    public abstract String keepUserId_NotExistsReferrer_FollowByFollowerIdList(FollowCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select REPLYEE_ID from REPLY where ...)} <br>
     * REPLY by REPLYEE_ID, named 'replyByReplyeeIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsReplyByReplyeeId</span>(replyCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     replyCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of UserId_NotExistsReferrer_ReplyByReplyeeIdList for 'not exists'. (NotNull)
     */
    public void notExistsReplyByReplyeeId(SubQuery<ReplyCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        ReplyCB cb = new ReplyCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepUserId_NotExistsReferrer_ReplyByReplyeeIdList(cb.query());
        registerNotExistsReferrer(cb.query(), "USER_ID", "REPLYEE_ID", pp, "replyByReplyeeIdList");
    }
    public abstract String keepUserId_NotExistsReferrer_ReplyByReplyeeIdList(ReplyCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select REPLYER_ID from REPLY where ...)} <br>
     * REPLY by REPLYER_ID, named 'replyByReplyerIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsReplyByReplyerId</span>(replyCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     replyCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of UserId_NotExistsReferrer_ReplyByReplyerIdList for 'not exists'. (NotNull)
     */
    public void notExistsReplyByReplyerId(SubQuery<ReplyCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        ReplyCB cb = new ReplyCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepUserId_NotExistsReferrer_ReplyByReplyerIdList(cb.query());
        registerNotExistsReferrer(cb.query(), "USER_ID", "REPLYER_ID", pp, "replyByReplyerIdList");
    }
    public abstract String keepUserId_NotExistsReferrer_ReplyByReplyerIdList(ReplyCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select USER_ID from RETWEET where ...)} <br>
     * RETWEET by USER_ID, named 'retweetAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsRetweet</span>(retweetCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     retweetCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of UserId_NotExistsReferrer_RetweetList for 'not exists'. (NotNull)
     */
    public void notExistsRetweet(SubQuery<RetweetCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        RetweetCB cb = new RetweetCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepUserId_NotExistsReferrer_RetweetList(cb.query());
        registerNotExistsReferrer(cb.query(), "USER_ID", "USER_ID", pp, "retweetList");
    }
    public abstract String keepUserId_NotExistsReferrer_RetweetList(RetweetCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select USER_ID from TWEET where ...)} <br>
     * TWEET by USER_ID, named 'tweetAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTweet</span>(tweetCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     tweetCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of UserId_NotExistsReferrer_TweetList for 'not exists'. (NotNull)
     */
    public void notExistsTweet(SubQuery<TweetCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TweetCB cb = new TweetCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepUserId_NotExistsReferrer_TweetList(cb.query());
        registerNotExistsReferrer(cb.query(), "USER_ID", "USER_ID", pp, "tweetList");
    }
    public abstract String keepUserId_NotExistsReferrer_TweetList(TweetCQ sq);

    public void xsderiveFavoliteList(String fn, SubQuery<FavoliteCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        FavoliteCB cb = new FavoliteCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepUserId_SpecifyDerivedReferrer_FavoliteList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "USER_ID", "USER_ID", pp, "favoliteList", al, op);
    }
    public abstract String keepUserId_SpecifyDerivedReferrer_FavoliteList(FavoliteCQ sq);

    public void xsderiveFollowByFolloweeIdList(String fn, SubQuery<FollowCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        FollowCB cb = new FollowCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepUserId_SpecifyDerivedReferrer_FollowByFolloweeIdList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "USER_ID", "FOLLOWEE_ID", pp, "followByFolloweeIdList", al, op);
    }
    public abstract String keepUserId_SpecifyDerivedReferrer_FollowByFolloweeIdList(FollowCQ sq);

    public void xsderiveFollowByFollowerIdList(String fn, SubQuery<FollowCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        FollowCB cb = new FollowCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepUserId_SpecifyDerivedReferrer_FollowByFollowerIdList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "USER_ID", "FOLLOWER_ID", pp, "followByFollowerIdList", al, op);
    }
    public abstract String keepUserId_SpecifyDerivedReferrer_FollowByFollowerIdList(FollowCQ sq);

    public void xsderiveReplyByReplyeeIdList(String fn, SubQuery<ReplyCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        ReplyCB cb = new ReplyCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepUserId_SpecifyDerivedReferrer_ReplyByReplyeeIdList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "USER_ID", "REPLYEE_ID", pp, "replyByReplyeeIdList", al, op);
    }
    public abstract String keepUserId_SpecifyDerivedReferrer_ReplyByReplyeeIdList(ReplyCQ sq);

    public void xsderiveReplyByReplyerIdList(String fn, SubQuery<ReplyCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        ReplyCB cb = new ReplyCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepUserId_SpecifyDerivedReferrer_ReplyByReplyerIdList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "USER_ID", "REPLYER_ID", pp, "replyByReplyerIdList", al, op);
    }
    public abstract String keepUserId_SpecifyDerivedReferrer_ReplyByReplyerIdList(ReplyCQ sq);

    public void xsderiveRetweetList(String fn, SubQuery<RetweetCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        RetweetCB cb = new RetweetCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepUserId_SpecifyDerivedReferrer_RetweetList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "USER_ID", "USER_ID", pp, "retweetList", al, op);
    }
    public abstract String keepUserId_SpecifyDerivedReferrer_RetweetList(RetweetCQ sq);

    public void xsderiveTweetList(String fn, SubQuery<TweetCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TweetCB cb = new TweetCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepUserId_SpecifyDerivedReferrer_TweetList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "USER_ID", "USER_ID", pp, "tweetList", al, op);
    }
    public abstract String keepUserId_SpecifyDerivedReferrer_TweetList(TweetCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from FAVOLITE where ...)} <br>
     * FAVOLITE by USER_ID, named 'favoliteAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepUserId_QueryDerivedReferrer_FavoliteList(cb.query()); String prpp = keepUserId_QueryDerivedReferrer_FavoliteListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "USER_ID", "USER_ID", sqpp, "favoliteList", rd, vl, prpp, op);
    }
    public abstract String keepUserId_QueryDerivedReferrer_FavoliteList(FavoliteCQ sq);
    public abstract String keepUserId_QueryDerivedReferrer_FavoliteListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from FOLLOW where ...)} <br>
     * FOLLOW by FOLLOWEE_ID, named 'followByFolloweeIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedFollowByFolloweeId()</span>.<span style="color: #CC4747">max</span>(followCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     followCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     followCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<FollowCB> derivedFollowByFolloweeId() {
        return xcreateQDRFunctionFollowByFolloweeIdList();
    }
    protected HpQDRFunction<FollowCB> xcreateQDRFunctionFollowByFolloweeIdList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveFollowByFolloweeIdList(fn, sq, rd, vl, op));
    }
    public void xqderiveFollowByFolloweeIdList(String fn, SubQuery<FollowCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        FollowCB cb = new FollowCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepUserId_QueryDerivedReferrer_FollowByFolloweeIdList(cb.query()); String prpp = keepUserId_QueryDerivedReferrer_FollowByFolloweeIdListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "USER_ID", "FOLLOWEE_ID", sqpp, "followByFolloweeIdList", rd, vl, prpp, op);
    }
    public abstract String keepUserId_QueryDerivedReferrer_FollowByFolloweeIdList(FollowCQ sq);
    public abstract String keepUserId_QueryDerivedReferrer_FollowByFolloweeIdListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from FOLLOW where ...)} <br>
     * FOLLOW by FOLLOWER_ID, named 'followByFollowerIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedFollowByFollowerId()</span>.<span style="color: #CC4747">max</span>(followCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     followCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     followCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<FollowCB> derivedFollowByFollowerId() {
        return xcreateQDRFunctionFollowByFollowerIdList();
    }
    protected HpQDRFunction<FollowCB> xcreateQDRFunctionFollowByFollowerIdList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveFollowByFollowerIdList(fn, sq, rd, vl, op));
    }
    public void xqderiveFollowByFollowerIdList(String fn, SubQuery<FollowCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        FollowCB cb = new FollowCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepUserId_QueryDerivedReferrer_FollowByFollowerIdList(cb.query()); String prpp = keepUserId_QueryDerivedReferrer_FollowByFollowerIdListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "USER_ID", "FOLLOWER_ID", sqpp, "followByFollowerIdList", rd, vl, prpp, op);
    }
    public abstract String keepUserId_QueryDerivedReferrer_FollowByFollowerIdList(FollowCQ sq);
    public abstract String keepUserId_QueryDerivedReferrer_FollowByFollowerIdListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from REPLY where ...)} <br>
     * REPLY by REPLYEE_ID, named 'replyByReplyeeIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedReplyByReplyeeId()</span>.<span style="color: #CC4747">max</span>(replyCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     replyCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     replyCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<ReplyCB> derivedReplyByReplyeeId() {
        return xcreateQDRFunctionReplyByReplyeeIdList();
    }
    protected HpQDRFunction<ReplyCB> xcreateQDRFunctionReplyByReplyeeIdList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveReplyByReplyeeIdList(fn, sq, rd, vl, op));
    }
    public void xqderiveReplyByReplyeeIdList(String fn, SubQuery<ReplyCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        ReplyCB cb = new ReplyCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepUserId_QueryDerivedReferrer_ReplyByReplyeeIdList(cb.query()); String prpp = keepUserId_QueryDerivedReferrer_ReplyByReplyeeIdListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "USER_ID", "REPLYEE_ID", sqpp, "replyByReplyeeIdList", rd, vl, prpp, op);
    }
    public abstract String keepUserId_QueryDerivedReferrer_ReplyByReplyeeIdList(ReplyCQ sq);
    public abstract String keepUserId_QueryDerivedReferrer_ReplyByReplyeeIdListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from REPLY where ...)} <br>
     * REPLY by REPLYER_ID, named 'replyByReplyerIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedReplyByReplyerId()</span>.<span style="color: #CC4747">max</span>(replyCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     replyCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     replyCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<ReplyCB> derivedReplyByReplyerId() {
        return xcreateQDRFunctionReplyByReplyerIdList();
    }
    protected HpQDRFunction<ReplyCB> xcreateQDRFunctionReplyByReplyerIdList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveReplyByReplyerIdList(fn, sq, rd, vl, op));
    }
    public void xqderiveReplyByReplyerIdList(String fn, SubQuery<ReplyCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        ReplyCB cb = new ReplyCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepUserId_QueryDerivedReferrer_ReplyByReplyerIdList(cb.query()); String prpp = keepUserId_QueryDerivedReferrer_ReplyByReplyerIdListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "USER_ID", "REPLYER_ID", sqpp, "replyByReplyerIdList", rd, vl, prpp, op);
    }
    public abstract String keepUserId_QueryDerivedReferrer_ReplyByReplyerIdList(ReplyCQ sq);
    public abstract String keepUserId_QueryDerivedReferrer_ReplyByReplyerIdListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from RETWEET where ...)} <br>
     * RETWEET by USER_ID, named 'retweetAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepUserId_QueryDerivedReferrer_RetweetList(cb.query()); String prpp = keepUserId_QueryDerivedReferrer_RetweetListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "USER_ID", "USER_ID", sqpp, "retweetList", rd, vl, prpp, op);
    }
    public abstract String keepUserId_QueryDerivedReferrer_RetweetList(RetweetCQ sq);
    public abstract String keepUserId_QueryDerivedReferrer_RetweetListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from TWEET where ...)} <br>
     * TWEET by USER_ID, named 'tweetAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTweet()</span>.<span style="color: #CC4747">max</span>(tweetCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     tweetCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     tweetCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TweetCB> derivedTweet() {
        return xcreateQDRFunctionTweetList();
    }
    protected HpQDRFunction<TweetCB> xcreateQDRFunctionTweetList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTweetList(fn, sq, rd, vl, op));
    }
    public void xqderiveTweetList(String fn, SubQuery<TweetCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TweetCB cb = new TweetCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepUserId_QueryDerivedReferrer_TweetList(cb.query()); String prpp = keepUserId_QueryDerivedReferrer_TweetListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "USER_ID", "USER_ID", sqpp, "tweetList", rd, vl, prpp, op);
    }
    public abstract String keepUserId_QueryDerivedReferrer_TweetList(TweetCQ sq);
    public abstract String keepUserId_QueryDerivedReferrer_TweetListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * USER_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setUserId_IsNull() { regUserId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * USER_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setUserId_IsNotNull() { regUserId(CK_ISNN, DOBJ); }

    protected void regUserId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUserId(), "USER_ID"); }
    protected abstract ConditionValue xgetCValueUserId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USER_NAME: {NotNull, VARCHAR(64)}
     * @param userName The value of userName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserName_Equal(String userName) {
        doSetUserName_Equal(fRES(userName));
    }

    protected void doSetUserName_Equal(String userName) {
        regUserName(CK_EQ, userName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USER_NAME: {NotNull, VARCHAR(64)}
     * @param userName The value of userName as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserName_NotEqual(String userName) {
        doSetUserName_NotEqual(fRES(userName));
    }

    protected void doSetUserName_NotEqual(String userName) {
        regUserName(CK_NES, userName);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USER_NAME: {NotNull, VARCHAR(64)}
     * @param userName The value of userName as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserName_GreaterThan(String userName) {
        regUserName(CK_GT, fRES(userName));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USER_NAME: {NotNull, VARCHAR(64)}
     * @param userName The value of userName as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserName_LessThan(String userName) {
        regUserName(CK_LT, fRES(userName));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USER_NAME: {NotNull, VARCHAR(64)}
     * @param userName The value of userName as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserName_GreaterEqual(String userName) {
        regUserName(CK_GE, fRES(userName));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USER_NAME: {NotNull, VARCHAR(64)}
     * @param userName The value of userName as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserName_LessEqual(String userName) {
        regUserName(CK_LE, fRES(userName));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * USER_NAME: {NotNull, VARCHAR(64)}
     * @param userNameList The collection of userName as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserName_InScope(Collection<String> userNameList) {
        doSetUserName_InScope(userNameList);
    }

    protected void doSetUserName_InScope(Collection<String> userNameList) {
        regINS(CK_INS, cTL(userNameList), xgetCValueUserName(), "USER_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * USER_NAME: {NotNull, VARCHAR(64)}
     * @param userNameList The collection of userName as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserName_NotInScope(Collection<String> userNameList) {
        doSetUserName_NotInScope(userNameList);
    }

    protected void doSetUserName_NotInScope(Collection<String> userNameList) {
        regINS(CK_NINS, cTL(userNameList), xgetCValueUserName(), "USER_NAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USER_NAME: {NotNull, VARCHAR(64)} <br>
     * <pre>e.g. setUserName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param userName The value of userName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setUserName_LikeSearch(String userName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setUserName_LikeSearch(userName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USER_NAME: {NotNull, VARCHAR(64)} <br>
     * <pre>e.g. setUserName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param userName The value of userName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setUserName_LikeSearch(String userName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(userName), xgetCValueUserName(), "USER_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USER_NAME: {NotNull, VARCHAR(64)}
     * @param userName The value of userName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setUserName_NotLikeSearch(String userName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setUserName_NotLikeSearch(userName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USER_NAME: {NotNull, VARCHAR(64)}
     * @param userName The value of userName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setUserName_NotLikeSearch(String userName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(userName), xgetCValueUserName(), "USER_NAME", likeSearchOption);
    }

    protected void regUserName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUserName(), "USER_NAME"); }
    protected abstract ConditionValue xgetCValueUserName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PASSWORD: {NotNull, VARCHAR(30)}
     * @param password The value of password as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPassword_Equal(String password) {
        doSetPassword_Equal(fRES(password));
    }

    protected void doSetPassword_Equal(String password) {
        regPassword(CK_EQ, password);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PASSWORD: {NotNull, VARCHAR(30)}
     * @param password The value of password as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPassword_NotEqual(String password) {
        doSetPassword_NotEqual(fRES(password));
    }

    protected void doSetPassword_NotEqual(String password) {
        regPassword(CK_NES, password);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PASSWORD: {NotNull, VARCHAR(30)}
     * @param password The value of password as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPassword_GreaterThan(String password) {
        regPassword(CK_GT, fRES(password));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PASSWORD: {NotNull, VARCHAR(30)}
     * @param password The value of password as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPassword_LessThan(String password) {
        regPassword(CK_LT, fRES(password));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PASSWORD: {NotNull, VARCHAR(30)}
     * @param password The value of password as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPassword_GreaterEqual(String password) {
        regPassword(CK_GE, fRES(password));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PASSWORD: {NotNull, VARCHAR(30)}
     * @param password The value of password as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPassword_LessEqual(String password) {
        regPassword(CK_LE, fRES(password));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PASSWORD: {NotNull, VARCHAR(30)}
     * @param passwordList The collection of password as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPassword_InScope(Collection<String> passwordList) {
        doSetPassword_InScope(passwordList);
    }

    protected void doSetPassword_InScope(Collection<String> passwordList) {
        regINS(CK_INS, cTL(passwordList), xgetCValuePassword(), "PASSWORD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PASSWORD: {NotNull, VARCHAR(30)}
     * @param passwordList The collection of password as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPassword_NotInScope(Collection<String> passwordList) {
        doSetPassword_NotInScope(passwordList);
    }

    protected void doSetPassword_NotInScope(Collection<String> passwordList) {
        regINS(CK_NINS, cTL(passwordList), xgetCValuePassword(), "PASSWORD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PASSWORD: {NotNull, VARCHAR(30)} <br>
     * <pre>e.g. setPassword_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param password The value of password as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setPassword_LikeSearch(String password, ConditionOptionCall<LikeSearchOption> opLambda) {
        setPassword_LikeSearch(password, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PASSWORD: {NotNull, VARCHAR(30)} <br>
     * <pre>e.g. setPassword_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param password The value of password as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setPassword_LikeSearch(String password, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(password), xgetCValuePassword(), "PASSWORD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PASSWORD: {NotNull, VARCHAR(30)}
     * @param password The value of password as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setPassword_NotLikeSearch(String password, ConditionOptionCall<LikeSearchOption> opLambda) {
        setPassword_NotLikeSearch(password, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PASSWORD: {NotNull, VARCHAR(30)}
     * @param password The value of password as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setPassword_NotLikeSearch(String password, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(password), xgetCValuePassword(), "PASSWORD", likeSearchOption);
    }

    protected void regPassword(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePassword(), "PASSWORD"); }
    protected abstract ConditionValue xgetCValuePassword();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAIL_ADDRESS: {UQ, NotNull, VARCHAR(255)}
     * @param mailAddress The value of mailAddress as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMailAddress_Equal(String mailAddress) {
        doSetMailAddress_Equal(fRES(mailAddress));
    }

    protected void doSetMailAddress_Equal(String mailAddress) {
        regMailAddress(CK_EQ, mailAddress);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAIL_ADDRESS: {UQ, NotNull, VARCHAR(255)}
     * @param mailAddress The value of mailAddress as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMailAddress_NotEqual(String mailAddress) {
        doSetMailAddress_NotEqual(fRES(mailAddress));
    }

    protected void doSetMailAddress_NotEqual(String mailAddress) {
        regMailAddress(CK_NES, mailAddress);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAIL_ADDRESS: {UQ, NotNull, VARCHAR(255)}
     * @param mailAddress The value of mailAddress as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMailAddress_GreaterThan(String mailAddress) {
        regMailAddress(CK_GT, fRES(mailAddress));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAIL_ADDRESS: {UQ, NotNull, VARCHAR(255)}
     * @param mailAddress The value of mailAddress as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMailAddress_LessThan(String mailAddress) {
        regMailAddress(CK_LT, fRES(mailAddress));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAIL_ADDRESS: {UQ, NotNull, VARCHAR(255)}
     * @param mailAddress The value of mailAddress as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMailAddress_GreaterEqual(String mailAddress) {
        regMailAddress(CK_GE, fRES(mailAddress));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAIL_ADDRESS: {UQ, NotNull, VARCHAR(255)}
     * @param mailAddress The value of mailAddress as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMailAddress_LessEqual(String mailAddress) {
        regMailAddress(CK_LE, fRES(mailAddress));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MAIL_ADDRESS: {UQ, NotNull, VARCHAR(255)}
     * @param mailAddressList The collection of mailAddress as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMailAddress_InScope(Collection<String> mailAddressList) {
        doSetMailAddress_InScope(mailAddressList);
    }

    protected void doSetMailAddress_InScope(Collection<String> mailAddressList) {
        regINS(CK_INS, cTL(mailAddressList), xgetCValueMailAddress(), "MAIL_ADDRESS");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MAIL_ADDRESS: {UQ, NotNull, VARCHAR(255)}
     * @param mailAddressList The collection of mailAddress as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMailAddress_NotInScope(Collection<String> mailAddressList) {
        doSetMailAddress_NotInScope(mailAddressList);
    }

    protected void doSetMailAddress_NotInScope(Collection<String> mailAddressList) {
        regINS(CK_NINS, cTL(mailAddressList), xgetCValueMailAddress(), "MAIL_ADDRESS");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MAIL_ADDRESS: {UQ, NotNull, VARCHAR(255)} <br>
     * <pre>e.g. setMailAddress_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param mailAddress The value of mailAddress as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setMailAddress_LikeSearch(String mailAddress, ConditionOptionCall<LikeSearchOption> opLambda) {
        setMailAddress_LikeSearch(mailAddress, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MAIL_ADDRESS: {UQ, NotNull, VARCHAR(255)} <br>
     * <pre>e.g. setMailAddress_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param mailAddress The value of mailAddress as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setMailAddress_LikeSearch(String mailAddress, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(mailAddress), xgetCValueMailAddress(), "MAIL_ADDRESS", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MAIL_ADDRESS: {UQ, NotNull, VARCHAR(255)}
     * @param mailAddress The value of mailAddress as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setMailAddress_NotLikeSearch(String mailAddress, ConditionOptionCall<LikeSearchOption> opLambda) {
        setMailAddress_NotLikeSearch(mailAddress, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MAIL_ADDRESS: {UQ, NotNull, VARCHAR(255)}
     * @param mailAddress The value of mailAddress as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setMailAddress_NotLikeSearch(String mailAddress, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(mailAddress), xgetCValueMailAddress(), "MAIL_ADDRESS", likeSearchOption);
    }

    protected void regMailAddress(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMailAddress(), "MAIL_ADDRESS"); }
    protected abstract ConditionValue xgetCValueMailAddress();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * BIRTH_DATE: {DATE(10)}
     * @param birthDate The value of birthDate as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setBirthDate_Equal(java.time.LocalDate birthDate) {
        regBirthDate(CK_EQ,  birthDate);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BIRTH_DATE: {DATE(10)}
     * @param birthDate The value of birthDate as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBirthDate_GreaterThan(java.time.LocalDate birthDate) {
        regBirthDate(CK_GT,  birthDate);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BIRTH_DATE: {DATE(10)}
     * @param birthDate The value of birthDate as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBirthDate_LessThan(java.time.LocalDate birthDate) {
        regBirthDate(CK_LT,  birthDate);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BIRTH_DATE: {DATE(10)}
     * @param birthDate The value of birthDate as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBirthDate_GreaterEqual(java.time.LocalDate birthDate) {
        regBirthDate(CK_GE,  birthDate);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BIRTH_DATE: {DATE(10)}
     * @param birthDate The value of birthDate as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBirthDate_LessEqual(java.time.LocalDate birthDate) {
        regBirthDate(CK_LE, birthDate);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * BIRTH_DATE: {DATE(10)}
     * <pre>e.g. setBirthDate_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of birthDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of birthDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setBirthDate_FromTo(java.time.LocalDate fromDatetime, java.time.LocalDate toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setBirthDate_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * BIRTH_DATE: {DATE(10)}
     * <pre>e.g. setBirthDate_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of birthDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of birthDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setBirthDate_FromTo(java.time.LocalDate fromDatetime, java.time.LocalDate toDatetime, FromToOption fromToOption) {
        String nm = "BIRTH_DATE"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueBirthDate(), nm, op);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BIRTH_DATE: {DATE(10)}
     */
    public void setBirthDate_IsNull() { regBirthDate(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BIRTH_DATE: {DATE(10)}
     */
    public void setBirthDate_IsNotNull() { regBirthDate(CK_ISNN, DOBJ); }

    protected void regBirthDate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBirthDate(), "BIRTH_DATE"); }
    protected abstract ConditionValue xgetCValueBirthDate();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROFILE_SENTENCE: {NotNull, VARCHAR(200)}
     * @param profileSentence The value of profileSentence as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProfileSentence_Equal(String profileSentence) {
        doSetProfileSentence_Equal(fRES(profileSentence));
    }

    protected void doSetProfileSentence_Equal(String profileSentence) {
        regProfileSentence(CK_EQ, profileSentence);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROFILE_SENTENCE: {NotNull, VARCHAR(200)}
     * @param profileSentence The value of profileSentence as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProfileSentence_NotEqual(String profileSentence) {
        doSetProfileSentence_NotEqual(fRES(profileSentence));
    }

    protected void doSetProfileSentence_NotEqual(String profileSentence) {
        regProfileSentence(CK_NES, profileSentence);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROFILE_SENTENCE: {NotNull, VARCHAR(200)}
     * @param profileSentence The value of profileSentence as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProfileSentence_GreaterThan(String profileSentence) {
        regProfileSentence(CK_GT, fRES(profileSentence));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROFILE_SENTENCE: {NotNull, VARCHAR(200)}
     * @param profileSentence The value of profileSentence as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProfileSentence_LessThan(String profileSentence) {
        regProfileSentence(CK_LT, fRES(profileSentence));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROFILE_SENTENCE: {NotNull, VARCHAR(200)}
     * @param profileSentence The value of profileSentence as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProfileSentence_GreaterEqual(String profileSentence) {
        regProfileSentence(CK_GE, fRES(profileSentence));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROFILE_SENTENCE: {NotNull, VARCHAR(200)}
     * @param profileSentence The value of profileSentence as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProfileSentence_LessEqual(String profileSentence) {
        regProfileSentence(CK_LE, fRES(profileSentence));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PROFILE_SENTENCE: {NotNull, VARCHAR(200)}
     * @param profileSentenceList The collection of profileSentence as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProfileSentence_InScope(Collection<String> profileSentenceList) {
        doSetProfileSentence_InScope(profileSentenceList);
    }

    protected void doSetProfileSentence_InScope(Collection<String> profileSentenceList) {
        regINS(CK_INS, cTL(profileSentenceList), xgetCValueProfileSentence(), "PROFILE_SENTENCE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PROFILE_SENTENCE: {NotNull, VARCHAR(200)}
     * @param profileSentenceList The collection of profileSentence as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProfileSentence_NotInScope(Collection<String> profileSentenceList) {
        doSetProfileSentence_NotInScope(profileSentenceList);
    }

    protected void doSetProfileSentence_NotInScope(Collection<String> profileSentenceList) {
        regINS(CK_NINS, cTL(profileSentenceList), xgetCValueProfileSentence(), "PROFILE_SENTENCE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PROFILE_SENTENCE: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setProfileSentence_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param profileSentence The value of profileSentence as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setProfileSentence_LikeSearch(String profileSentence, ConditionOptionCall<LikeSearchOption> opLambda) {
        setProfileSentence_LikeSearch(profileSentence, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PROFILE_SENTENCE: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setProfileSentence_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param profileSentence The value of profileSentence as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setProfileSentence_LikeSearch(String profileSentence, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(profileSentence), xgetCValueProfileSentence(), "PROFILE_SENTENCE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PROFILE_SENTENCE: {NotNull, VARCHAR(200)}
     * @param profileSentence The value of profileSentence as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setProfileSentence_NotLikeSearch(String profileSentence, ConditionOptionCall<LikeSearchOption> opLambda) {
        setProfileSentence_NotLikeSearch(profileSentence, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PROFILE_SENTENCE: {NotNull, VARCHAR(200)}
     * @param profileSentence The value of profileSentence as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setProfileSentence_NotLikeSearch(String profileSentence, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(profileSentence), xgetCValueProfileSentence(), "PROFILE_SENTENCE", likeSearchOption);
    }

    protected void regProfileSentence(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProfileSentence(), "PROFILE_SENTENCE"); }
    protected abstract ConditionValue xgetCValueProfileSentence();

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
    public HpSLCFunction<UserCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, UserCB.class);
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
    public HpSLCFunction<UserCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, UserCB.class);
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
    public HpSLCFunction<UserCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, UserCB.class);
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
    public HpSLCFunction<UserCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, UserCB.class);
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
    public HpSLCFunction<UserCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, UserCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;UserCB&gt;() {
     *     public void query(UserCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<UserCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, UserCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        UserCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(UserCQ sq);

    protected UserCB xcreateScalarConditionCB() {
        UserCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected UserCB xcreateScalarConditionPartitionByCB() {
        UserCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<UserCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        UserCB cb = new UserCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "USER_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(UserCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<UserCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(UserCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        UserCB cb = new UserCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "USER_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(UserCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<UserCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        UserCB cb = new UserCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(UserCQ sq);

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
    protected UserCB newMyCB() {
        return new UserCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return UserCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
