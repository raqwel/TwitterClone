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
 * The abstract condition-query of REPLY.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsReplyCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsReplyCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "REPLY";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * REPLY_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param replyId The value of replyId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setReplyId_Equal(Long replyId) {
        doSetReplyId_Equal(replyId);
    }

    protected void doSetReplyId_Equal(Long replyId) {
        regReplyId(CK_EQ, replyId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REPLY_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param replyId The value of replyId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReplyId_NotEqual(Long replyId) {
        doSetReplyId_NotEqual(replyId);
    }

    protected void doSetReplyId_NotEqual(Long replyId) {
        regReplyId(CK_NES, replyId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REPLY_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param replyId The value of replyId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReplyId_GreaterThan(Long replyId) {
        regReplyId(CK_GT, replyId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REPLY_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param replyId The value of replyId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReplyId_LessThan(Long replyId) {
        regReplyId(CK_LT, replyId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * REPLY_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param replyId The value of replyId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReplyId_GreaterEqual(Long replyId) {
        regReplyId(CK_GE, replyId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * REPLY_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param replyId The value of replyId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReplyId_LessEqual(Long replyId) {
        regReplyId(CK_LE, replyId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * REPLY_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of replyId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of replyId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setReplyId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setReplyId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * REPLY_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of replyId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of replyId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setReplyId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueReplyId(), "REPLY_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * REPLY_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param replyIdList The collection of replyId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReplyId_InScope(Collection<Long> replyIdList) {
        doSetReplyId_InScope(replyIdList);
    }

    protected void doSetReplyId_InScope(Collection<Long> replyIdList) {
        regINS(CK_INS, cTL(replyIdList), xgetCValueReplyId(), "REPLY_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * REPLY_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param replyIdList The collection of replyId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReplyId_NotInScope(Collection<Long> replyIdList) {
        doSetReplyId_NotInScope(replyIdList);
    }

    protected void doSetReplyId_NotInScope(Collection<Long> replyIdList) {
        regINS(CK_NINS, cTL(replyIdList), xgetCValueReplyId(), "REPLY_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * REPLY_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setReplyId_IsNull() { regReplyId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * REPLY_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setReplyId_IsNotNull() { regReplyId(CK_ISNN, DOBJ); }

    protected void regReplyId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReplyId(), "REPLY_ID"); }
    protected abstract ConditionValue xgetCValueReplyId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * REPLYEE_ID: {IX, NotNull, BIGINT(19), FK to USER}
     * @param replyeeId The value of replyeeId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setReplyeeId_Equal(Long replyeeId) {
        doSetReplyeeId_Equal(replyeeId);
    }

    protected void doSetReplyeeId_Equal(Long replyeeId) {
        regReplyeeId(CK_EQ, replyeeId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REPLYEE_ID: {IX, NotNull, BIGINT(19), FK to USER}
     * @param replyeeId The value of replyeeId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReplyeeId_NotEqual(Long replyeeId) {
        doSetReplyeeId_NotEqual(replyeeId);
    }

    protected void doSetReplyeeId_NotEqual(Long replyeeId) {
        regReplyeeId(CK_NES, replyeeId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REPLYEE_ID: {IX, NotNull, BIGINT(19), FK to USER}
     * @param replyeeId The value of replyeeId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReplyeeId_GreaterThan(Long replyeeId) {
        regReplyeeId(CK_GT, replyeeId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REPLYEE_ID: {IX, NotNull, BIGINT(19), FK to USER}
     * @param replyeeId The value of replyeeId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReplyeeId_LessThan(Long replyeeId) {
        regReplyeeId(CK_LT, replyeeId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * REPLYEE_ID: {IX, NotNull, BIGINT(19), FK to USER}
     * @param replyeeId The value of replyeeId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReplyeeId_GreaterEqual(Long replyeeId) {
        regReplyeeId(CK_GE, replyeeId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * REPLYEE_ID: {IX, NotNull, BIGINT(19), FK to USER}
     * @param replyeeId The value of replyeeId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReplyeeId_LessEqual(Long replyeeId) {
        regReplyeeId(CK_LE, replyeeId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * REPLYEE_ID: {IX, NotNull, BIGINT(19), FK to USER}
     * @param minNumber The min number of replyeeId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of replyeeId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setReplyeeId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setReplyeeId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * REPLYEE_ID: {IX, NotNull, BIGINT(19), FK to USER}
     * @param minNumber The min number of replyeeId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of replyeeId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setReplyeeId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueReplyeeId(), "REPLYEE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * REPLYEE_ID: {IX, NotNull, BIGINT(19), FK to USER}
     * @param replyeeIdList The collection of replyeeId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReplyeeId_InScope(Collection<Long> replyeeIdList) {
        doSetReplyeeId_InScope(replyeeIdList);
    }

    protected void doSetReplyeeId_InScope(Collection<Long> replyeeIdList) {
        regINS(CK_INS, cTL(replyeeIdList), xgetCValueReplyeeId(), "REPLYEE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * REPLYEE_ID: {IX, NotNull, BIGINT(19), FK to USER}
     * @param replyeeIdList The collection of replyeeId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReplyeeId_NotInScope(Collection<Long> replyeeIdList) {
        doSetReplyeeId_NotInScope(replyeeIdList);
    }

    protected void doSetReplyeeId_NotInScope(Collection<Long> replyeeIdList) {
        regINS(CK_NINS, cTL(replyeeIdList), xgetCValueReplyeeId(), "REPLYEE_ID");
    }

    protected void regReplyeeId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReplyeeId(), "REPLYEE_ID"); }
    protected abstract ConditionValue xgetCValueReplyeeId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * REPLYER_ID: {IX, NotNull, BIGINT(19), FK to USER}
     * @param replyerId The value of replyerId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setReplyerId_Equal(Long replyerId) {
        doSetReplyerId_Equal(replyerId);
    }

    protected void doSetReplyerId_Equal(Long replyerId) {
        regReplyerId(CK_EQ, replyerId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REPLYER_ID: {IX, NotNull, BIGINT(19), FK to USER}
     * @param replyerId The value of replyerId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReplyerId_NotEqual(Long replyerId) {
        doSetReplyerId_NotEqual(replyerId);
    }

    protected void doSetReplyerId_NotEqual(Long replyerId) {
        regReplyerId(CK_NES, replyerId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REPLYER_ID: {IX, NotNull, BIGINT(19), FK to USER}
     * @param replyerId The value of replyerId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReplyerId_GreaterThan(Long replyerId) {
        regReplyerId(CK_GT, replyerId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REPLYER_ID: {IX, NotNull, BIGINT(19), FK to USER}
     * @param replyerId The value of replyerId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReplyerId_LessThan(Long replyerId) {
        regReplyerId(CK_LT, replyerId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * REPLYER_ID: {IX, NotNull, BIGINT(19), FK to USER}
     * @param replyerId The value of replyerId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReplyerId_GreaterEqual(Long replyerId) {
        regReplyerId(CK_GE, replyerId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * REPLYER_ID: {IX, NotNull, BIGINT(19), FK to USER}
     * @param replyerId The value of replyerId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReplyerId_LessEqual(Long replyerId) {
        regReplyerId(CK_LE, replyerId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * REPLYER_ID: {IX, NotNull, BIGINT(19), FK to USER}
     * @param minNumber The min number of replyerId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of replyerId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setReplyerId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setReplyerId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * REPLYER_ID: {IX, NotNull, BIGINT(19), FK to USER}
     * @param minNumber The min number of replyerId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of replyerId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setReplyerId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueReplyerId(), "REPLYER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * REPLYER_ID: {IX, NotNull, BIGINT(19), FK to USER}
     * @param replyerIdList The collection of replyerId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReplyerId_InScope(Collection<Long> replyerIdList) {
        doSetReplyerId_InScope(replyerIdList);
    }

    protected void doSetReplyerId_InScope(Collection<Long> replyerIdList) {
        regINS(CK_INS, cTL(replyerIdList), xgetCValueReplyerId(), "REPLYER_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * REPLYER_ID: {IX, NotNull, BIGINT(19), FK to USER}
     * @param replyerIdList The collection of replyerId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReplyerId_NotInScope(Collection<Long> replyerIdList) {
        doSetReplyerId_NotInScope(replyerIdList);
    }

    protected void doSetReplyerId_NotInScope(Collection<Long> replyerIdList) {
        regINS(CK_NINS, cTL(replyerIdList), xgetCValueReplyerId(), "REPLYER_ID");
    }

    protected void regReplyerId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReplyerId(), "REPLYER_ID"); }
    protected abstract ConditionValue xgetCValueReplyerId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * REPLYEE_TWEET_ID: {IX, NotNull, BIGINT(19), FK to TWEET}
     * @param replyeeTweetId The value of replyeeTweetId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setReplyeeTweetId_Equal(Long replyeeTweetId) {
        doSetReplyeeTweetId_Equal(replyeeTweetId);
    }

    protected void doSetReplyeeTweetId_Equal(Long replyeeTweetId) {
        regReplyeeTweetId(CK_EQ, replyeeTweetId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REPLYEE_TWEET_ID: {IX, NotNull, BIGINT(19), FK to TWEET}
     * @param replyeeTweetId The value of replyeeTweetId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReplyeeTweetId_NotEqual(Long replyeeTweetId) {
        doSetReplyeeTweetId_NotEqual(replyeeTweetId);
    }

    protected void doSetReplyeeTweetId_NotEqual(Long replyeeTweetId) {
        regReplyeeTweetId(CK_NES, replyeeTweetId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REPLYEE_TWEET_ID: {IX, NotNull, BIGINT(19), FK to TWEET}
     * @param replyeeTweetId The value of replyeeTweetId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReplyeeTweetId_GreaterThan(Long replyeeTweetId) {
        regReplyeeTweetId(CK_GT, replyeeTweetId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REPLYEE_TWEET_ID: {IX, NotNull, BIGINT(19), FK to TWEET}
     * @param replyeeTweetId The value of replyeeTweetId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReplyeeTweetId_LessThan(Long replyeeTweetId) {
        regReplyeeTweetId(CK_LT, replyeeTweetId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * REPLYEE_TWEET_ID: {IX, NotNull, BIGINT(19), FK to TWEET}
     * @param replyeeTweetId The value of replyeeTweetId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReplyeeTweetId_GreaterEqual(Long replyeeTweetId) {
        regReplyeeTweetId(CK_GE, replyeeTweetId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * REPLYEE_TWEET_ID: {IX, NotNull, BIGINT(19), FK to TWEET}
     * @param replyeeTweetId The value of replyeeTweetId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReplyeeTweetId_LessEqual(Long replyeeTweetId) {
        regReplyeeTweetId(CK_LE, replyeeTweetId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * REPLYEE_TWEET_ID: {IX, NotNull, BIGINT(19), FK to TWEET}
     * @param minNumber The min number of replyeeTweetId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of replyeeTweetId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setReplyeeTweetId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setReplyeeTweetId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * REPLYEE_TWEET_ID: {IX, NotNull, BIGINT(19), FK to TWEET}
     * @param minNumber The min number of replyeeTweetId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of replyeeTweetId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setReplyeeTweetId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueReplyeeTweetId(), "REPLYEE_TWEET_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * REPLYEE_TWEET_ID: {IX, NotNull, BIGINT(19), FK to TWEET}
     * @param replyeeTweetIdList The collection of replyeeTweetId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReplyeeTweetId_InScope(Collection<Long> replyeeTweetIdList) {
        doSetReplyeeTweetId_InScope(replyeeTweetIdList);
    }

    protected void doSetReplyeeTweetId_InScope(Collection<Long> replyeeTweetIdList) {
        regINS(CK_INS, cTL(replyeeTweetIdList), xgetCValueReplyeeTweetId(), "REPLYEE_TWEET_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * REPLYEE_TWEET_ID: {IX, NotNull, BIGINT(19), FK to TWEET}
     * @param replyeeTweetIdList The collection of replyeeTweetId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReplyeeTweetId_NotInScope(Collection<Long> replyeeTweetIdList) {
        doSetReplyeeTweetId_NotInScope(replyeeTweetIdList);
    }

    protected void doSetReplyeeTweetId_NotInScope(Collection<Long> replyeeTweetIdList) {
        regINS(CK_NINS, cTL(replyeeTweetIdList), xgetCValueReplyeeTweetId(), "REPLYEE_TWEET_ID");
    }

    protected void regReplyeeTweetId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReplyeeTweetId(), "REPLYEE_TWEET_ID"); }
    protected abstract ConditionValue xgetCValueReplyeeTweetId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * REPLYER_TWEET_ID: {IX, NotNull, BIGINT(19), FK to TWEET}
     * @param replyerTweetId The value of replyerTweetId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setReplyerTweetId_Equal(Long replyerTweetId) {
        doSetReplyerTweetId_Equal(replyerTweetId);
    }

    protected void doSetReplyerTweetId_Equal(Long replyerTweetId) {
        regReplyerTweetId(CK_EQ, replyerTweetId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REPLYER_TWEET_ID: {IX, NotNull, BIGINT(19), FK to TWEET}
     * @param replyerTweetId The value of replyerTweetId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReplyerTweetId_NotEqual(Long replyerTweetId) {
        doSetReplyerTweetId_NotEqual(replyerTweetId);
    }

    protected void doSetReplyerTweetId_NotEqual(Long replyerTweetId) {
        regReplyerTweetId(CK_NES, replyerTweetId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REPLYER_TWEET_ID: {IX, NotNull, BIGINT(19), FK to TWEET}
     * @param replyerTweetId The value of replyerTweetId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReplyerTweetId_GreaterThan(Long replyerTweetId) {
        regReplyerTweetId(CK_GT, replyerTweetId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REPLYER_TWEET_ID: {IX, NotNull, BIGINT(19), FK to TWEET}
     * @param replyerTweetId The value of replyerTweetId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReplyerTweetId_LessThan(Long replyerTweetId) {
        regReplyerTweetId(CK_LT, replyerTweetId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * REPLYER_TWEET_ID: {IX, NotNull, BIGINT(19), FK to TWEET}
     * @param replyerTweetId The value of replyerTweetId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReplyerTweetId_GreaterEqual(Long replyerTweetId) {
        regReplyerTweetId(CK_GE, replyerTweetId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * REPLYER_TWEET_ID: {IX, NotNull, BIGINT(19), FK to TWEET}
     * @param replyerTweetId The value of replyerTweetId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReplyerTweetId_LessEqual(Long replyerTweetId) {
        regReplyerTweetId(CK_LE, replyerTweetId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * REPLYER_TWEET_ID: {IX, NotNull, BIGINT(19), FK to TWEET}
     * @param minNumber The min number of replyerTweetId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of replyerTweetId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setReplyerTweetId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setReplyerTweetId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * REPLYER_TWEET_ID: {IX, NotNull, BIGINT(19), FK to TWEET}
     * @param minNumber The min number of replyerTweetId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of replyerTweetId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setReplyerTweetId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueReplyerTweetId(), "REPLYER_TWEET_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * REPLYER_TWEET_ID: {IX, NotNull, BIGINT(19), FK to TWEET}
     * @param replyerTweetIdList The collection of replyerTweetId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReplyerTweetId_InScope(Collection<Long> replyerTweetIdList) {
        doSetReplyerTweetId_InScope(replyerTweetIdList);
    }

    protected void doSetReplyerTweetId_InScope(Collection<Long> replyerTweetIdList) {
        regINS(CK_INS, cTL(replyerTweetIdList), xgetCValueReplyerTweetId(), "REPLYER_TWEET_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * REPLYER_TWEET_ID: {IX, NotNull, BIGINT(19), FK to TWEET}
     * @param replyerTweetIdList The collection of replyerTweetId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReplyerTweetId_NotInScope(Collection<Long> replyerTweetIdList) {
        doSetReplyerTweetId_NotInScope(replyerTweetIdList);
    }

    protected void doSetReplyerTweetId_NotInScope(Collection<Long> replyerTweetIdList) {
        regINS(CK_NINS, cTL(replyerTweetIdList), xgetCValueReplyerTweetId(), "REPLYER_TWEET_ID");
    }

    protected void regReplyerTweetId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReplyerTweetId(), "REPLYER_TWEET_ID"); }
    protected abstract ConditionValue xgetCValueReplyerTweetId();

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
    public HpSLCFunction<ReplyCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, ReplyCB.class);
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
    public HpSLCFunction<ReplyCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, ReplyCB.class);
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
    public HpSLCFunction<ReplyCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, ReplyCB.class);
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
    public HpSLCFunction<ReplyCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, ReplyCB.class);
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
    public HpSLCFunction<ReplyCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, ReplyCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;ReplyCB&gt;() {
     *     public void query(ReplyCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<ReplyCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, ReplyCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        ReplyCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(ReplyCQ sq);

    protected ReplyCB xcreateScalarConditionCB() {
        ReplyCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected ReplyCB xcreateScalarConditionPartitionByCB() {
        ReplyCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<ReplyCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        ReplyCB cb = new ReplyCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "REPLY_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(ReplyCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<ReplyCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(ReplyCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        ReplyCB cb = new ReplyCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "REPLY_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(ReplyCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<ReplyCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        ReplyCB cb = new ReplyCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(ReplyCQ sq);

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
    protected ReplyCB newMyCB() {
        return new ReplyCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return ReplyCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
