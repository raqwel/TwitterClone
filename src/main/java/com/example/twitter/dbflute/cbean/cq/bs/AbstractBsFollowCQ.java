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
 * The abstract condition-query of FOLLOW.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsFollowCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsFollowCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "FOLLOW";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * FOLLOW_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param followId The value of followId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setFollowId_Equal(Long followId) {
        doSetFollowId_Equal(followId);
    }

    protected void doSetFollowId_Equal(Long followId) {
        regFollowId(CK_EQ, followId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FOLLOW_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param followId The value of followId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFollowId_NotEqual(Long followId) {
        doSetFollowId_NotEqual(followId);
    }

    protected void doSetFollowId_NotEqual(Long followId) {
        regFollowId(CK_NES, followId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FOLLOW_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param followId The value of followId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setFollowId_GreaterThan(Long followId) {
        regFollowId(CK_GT, followId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FOLLOW_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param followId The value of followId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setFollowId_LessThan(Long followId) {
        regFollowId(CK_LT, followId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * FOLLOW_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param followId The value of followId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFollowId_GreaterEqual(Long followId) {
        regFollowId(CK_GE, followId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * FOLLOW_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param followId The value of followId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFollowId_LessEqual(Long followId) {
        regFollowId(CK_LE, followId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * FOLLOW_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of followId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of followId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setFollowId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setFollowId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * FOLLOW_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of followId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of followId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setFollowId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueFollowId(), "FOLLOW_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * FOLLOW_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param followIdList The collection of followId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFollowId_InScope(Collection<Long> followIdList) {
        doSetFollowId_InScope(followIdList);
    }

    protected void doSetFollowId_InScope(Collection<Long> followIdList) {
        regINS(CK_INS, cTL(followIdList), xgetCValueFollowId(), "FOLLOW_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * FOLLOW_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param followIdList The collection of followId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFollowId_NotInScope(Collection<Long> followIdList) {
        doSetFollowId_NotInScope(followIdList);
    }

    protected void doSetFollowId_NotInScope(Collection<Long> followIdList) {
        regINS(CK_NINS, cTL(followIdList), xgetCValueFollowId(), "FOLLOW_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * FOLLOW_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setFollowId_IsNull() { regFollowId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * FOLLOW_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setFollowId_IsNotNull() { regFollowId(CK_ISNN, DOBJ); }

    protected void regFollowId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFollowId(), "FOLLOW_ID"); }
    protected abstract ConditionValue xgetCValueFollowId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * FOLLOWEE_ID: {UQ+, NotNull, BIGINT(19), FK to USER}
     * @param followeeId The value of followeeId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setFolloweeId_Equal(Long followeeId) {
        doSetFolloweeId_Equal(followeeId);
    }

    protected void doSetFolloweeId_Equal(Long followeeId) {
        regFolloweeId(CK_EQ, followeeId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FOLLOWEE_ID: {UQ+, NotNull, BIGINT(19), FK to USER}
     * @param followeeId The value of followeeId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFolloweeId_NotEqual(Long followeeId) {
        doSetFolloweeId_NotEqual(followeeId);
    }

    protected void doSetFolloweeId_NotEqual(Long followeeId) {
        regFolloweeId(CK_NES, followeeId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FOLLOWEE_ID: {UQ+, NotNull, BIGINT(19), FK to USER}
     * @param followeeId The value of followeeId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setFolloweeId_GreaterThan(Long followeeId) {
        regFolloweeId(CK_GT, followeeId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FOLLOWEE_ID: {UQ+, NotNull, BIGINT(19), FK to USER}
     * @param followeeId The value of followeeId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setFolloweeId_LessThan(Long followeeId) {
        regFolloweeId(CK_LT, followeeId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * FOLLOWEE_ID: {UQ+, NotNull, BIGINT(19), FK to USER}
     * @param followeeId The value of followeeId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFolloweeId_GreaterEqual(Long followeeId) {
        regFolloweeId(CK_GE, followeeId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * FOLLOWEE_ID: {UQ+, NotNull, BIGINT(19), FK to USER}
     * @param followeeId The value of followeeId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFolloweeId_LessEqual(Long followeeId) {
        regFolloweeId(CK_LE, followeeId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * FOLLOWEE_ID: {UQ+, NotNull, BIGINT(19), FK to USER}
     * @param minNumber The min number of followeeId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of followeeId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setFolloweeId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setFolloweeId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * FOLLOWEE_ID: {UQ+, NotNull, BIGINT(19), FK to USER}
     * @param minNumber The min number of followeeId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of followeeId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setFolloweeId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueFolloweeId(), "FOLLOWEE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * FOLLOWEE_ID: {UQ+, NotNull, BIGINT(19), FK to USER}
     * @param followeeIdList The collection of followeeId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFolloweeId_InScope(Collection<Long> followeeIdList) {
        doSetFolloweeId_InScope(followeeIdList);
    }

    protected void doSetFolloweeId_InScope(Collection<Long> followeeIdList) {
        regINS(CK_INS, cTL(followeeIdList), xgetCValueFolloweeId(), "FOLLOWEE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * FOLLOWEE_ID: {UQ+, NotNull, BIGINT(19), FK to USER}
     * @param followeeIdList The collection of followeeId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFolloweeId_NotInScope(Collection<Long> followeeIdList) {
        doSetFolloweeId_NotInScope(followeeIdList);
    }

    protected void doSetFolloweeId_NotInScope(Collection<Long> followeeIdList) {
        regINS(CK_NINS, cTL(followeeIdList), xgetCValueFolloweeId(), "FOLLOWEE_ID");
    }

    protected void regFolloweeId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFolloweeId(), "FOLLOWEE_ID"); }
    protected abstract ConditionValue xgetCValueFolloweeId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * FOLLOWER_ID: {+UQ, IX, NotNull, BIGINT(19), FK to USER}
     * @param followerId The value of followerId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setFollowerId_Equal(Long followerId) {
        doSetFollowerId_Equal(followerId);
    }

    protected void doSetFollowerId_Equal(Long followerId) {
        regFollowerId(CK_EQ, followerId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FOLLOWER_ID: {+UQ, IX, NotNull, BIGINT(19), FK to USER}
     * @param followerId The value of followerId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFollowerId_NotEqual(Long followerId) {
        doSetFollowerId_NotEqual(followerId);
    }

    protected void doSetFollowerId_NotEqual(Long followerId) {
        regFollowerId(CK_NES, followerId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FOLLOWER_ID: {+UQ, IX, NotNull, BIGINT(19), FK to USER}
     * @param followerId The value of followerId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setFollowerId_GreaterThan(Long followerId) {
        regFollowerId(CK_GT, followerId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FOLLOWER_ID: {+UQ, IX, NotNull, BIGINT(19), FK to USER}
     * @param followerId The value of followerId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setFollowerId_LessThan(Long followerId) {
        regFollowerId(CK_LT, followerId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * FOLLOWER_ID: {+UQ, IX, NotNull, BIGINT(19), FK to USER}
     * @param followerId The value of followerId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFollowerId_GreaterEqual(Long followerId) {
        regFollowerId(CK_GE, followerId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * FOLLOWER_ID: {+UQ, IX, NotNull, BIGINT(19), FK to USER}
     * @param followerId The value of followerId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFollowerId_LessEqual(Long followerId) {
        regFollowerId(CK_LE, followerId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * FOLLOWER_ID: {+UQ, IX, NotNull, BIGINT(19), FK to USER}
     * @param minNumber The min number of followerId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of followerId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setFollowerId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setFollowerId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * FOLLOWER_ID: {+UQ, IX, NotNull, BIGINT(19), FK to USER}
     * @param minNumber The min number of followerId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of followerId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setFollowerId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueFollowerId(), "FOLLOWER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * FOLLOWER_ID: {+UQ, IX, NotNull, BIGINT(19), FK to USER}
     * @param followerIdList The collection of followerId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFollowerId_InScope(Collection<Long> followerIdList) {
        doSetFollowerId_InScope(followerIdList);
    }

    protected void doSetFollowerId_InScope(Collection<Long> followerIdList) {
        regINS(CK_INS, cTL(followerIdList), xgetCValueFollowerId(), "FOLLOWER_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * FOLLOWER_ID: {+UQ, IX, NotNull, BIGINT(19), FK to USER}
     * @param followerIdList The collection of followerId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFollowerId_NotInScope(Collection<Long> followerIdList) {
        doSetFollowerId_NotInScope(followerIdList);
    }

    protected void doSetFollowerId_NotInScope(Collection<Long> followerIdList) {
        regINS(CK_NINS, cTL(followerIdList), xgetCValueFollowerId(), "FOLLOWER_ID");
    }

    protected void regFollowerId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFollowerId(), "FOLLOWER_ID"); }
    protected abstract ConditionValue xgetCValueFollowerId();

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
    public HpSLCFunction<FollowCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, FollowCB.class);
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
    public HpSLCFunction<FollowCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, FollowCB.class);
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
    public HpSLCFunction<FollowCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, FollowCB.class);
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
    public HpSLCFunction<FollowCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, FollowCB.class);
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
    public HpSLCFunction<FollowCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, FollowCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;FollowCB&gt;() {
     *     public void query(FollowCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<FollowCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, FollowCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        FollowCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(FollowCQ sq);

    protected FollowCB xcreateScalarConditionCB() {
        FollowCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected FollowCB xcreateScalarConditionPartitionByCB() {
        FollowCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<FollowCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        FollowCB cb = new FollowCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "FOLLOW_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(FollowCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<FollowCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(FollowCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        FollowCB cb = new FollowCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "FOLLOW_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(FollowCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<FollowCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        FollowCB cb = new FollowCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(FollowCQ sq);

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
    protected FollowCB newMyCB() {
        return new FollowCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return FollowCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
