package com.example.twitter.dbflute.cbean.cq.ciq;

import java.util.Map;
import org.dbflute.cbean.*;
import org.dbflute.cbean.ckey.*;
import org.dbflute.cbean.coption.ConditionOption;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.exception.IllegalConditionBeanOperationException;
import com.example.twitter.dbflute.cbean.*;
import com.example.twitter.dbflute.cbean.cq.bs.*;
import com.example.twitter.dbflute.cbean.cq.*;

/**
 * The condition-query for in-line of TWEET.
 * @author DBFlute(AutoGenerator)
 */
public class TweetCIQ extends AbstractBsTweetCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsTweetCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public TweetCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsTweetCQ myCQ) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
        _myCQ = myCQ;
        _foreignPropertyName = _myCQ.xgetForeignPropertyName(); // accept foreign property name
        _relationPath = _myCQ.xgetRelationPath(); // accept relation path
        _inline = true;
    }

    // ===================================================================================
    //                                                             Override about Register
    //                                                             =======================
    protected void reflectRelationOnUnionQuery(ConditionQuery bq, ConditionQuery uq)
    { throw new IllegalConditionBeanOperationException("InlineView cannot use Union: " + bq + " : " + uq); }

    @Override
    protected void setupConditionValueAndRegisterWhereClause(ConditionKey k, Object v, ConditionValue cv, String col)
    { regIQ(k, v, cv, col); }

    @Override
    protected void setupConditionValueAndRegisterWhereClause(ConditionKey k, Object v, ConditionValue cv, String col, ConditionOption op)
    { regIQ(k, v, cv, col, op); }

    @Override
    protected void registerWhereClause(String wc)
    { registerInlineWhereClause(wc); }

    @Override
    protected boolean isInScopeRelationSuppressLocalAliasName() {
        if (_onClause) { throw new IllegalConditionBeanOperationException("InScopeRelation on OnClause is unsupported."); }
        return true;
    }

    // ===================================================================================
    //                                                                Override about Query
    //                                                                ====================
    protected ConditionValue xgetCValueTweetId() { return _myCQ.xdfgetTweetId(); }
    public String keepTweetId_ExistsReferrer_FavoliteList(FavoliteCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepTweetId_ExistsReferrer_ReplyByReplyeeTweetIdList(ReplyCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepTweetId_ExistsReferrer_ReplyByReplyerTweetIdList(ReplyCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepTweetId_ExistsReferrer_RetweetList(RetweetCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepTweetId_NotExistsReferrer_FavoliteList(FavoliteCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepTweetId_NotExistsReferrer_ReplyByReplyeeTweetIdList(ReplyCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepTweetId_NotExistsReferrer_ReplyByReplyerTweetIdList(ReplyCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepTweetId_NotExistsReferrer_RetweetList(RetweetCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepTweetId_SpecifyDerivedReferrer_FavoliteList(FavoliteCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepTweetId_SpecifyDerivedReferrer_ReplyByReplyeeTweetIdList(ReplyCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepTweetId_SpecifyDerivedReferrer_ReplyByReplyerTweetIdList(ReplyCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepTweetId_SpecifyDerivedReferrer_RetweetList(RetweetCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepTweetId_QueryDerivedReferrer_FavoliteList(FavoliteCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepTweetId_QueryDerivedReferrer_FavoliteListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepTweetId_QueryDerivedReferrer_ReplyByReplyeeTweetIdList(ReplyCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepTweetId_QueryDerivedReferrer_ReplyByReplyeeTweetIdListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepTweetId_QueryDerivedReferrer_ReplyByReplyerTweetIdList(ReplyCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepTweetId_QueryDerivedReferrer_ReplyByReplyerTweetIdListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepTweetId_QueryDerivedReferrer_RetweetList(RetweetCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepTweetId_QueryDerivedReferrer_RetweetListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue xgetCValueUserId() { return _myCQ.xdfgetUserId(); }
    protected ConditionValue xgetCValueTweet() { return _myCQ.xdfgetTweet(); }
    protected ConditionValue xgetCValueDelFlg() { return _myCQ.xdfgetDelFlg(); }
    protected ConditionValue xgetCValueRegisterDatetime() { return _myCQ.xdfgetRegisterDatetime(); }
    protected ConditionValue xgetCValueUpdateDatetime() { return _myCQ.xdfgetUpdateDatetime(); }
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String pp) { return null; }
    public String keepScalarCondition(TweetCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(TweetCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(TweetCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(TweetCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return TweetCB.class.getName(); }
    protected String xinCQ() { return TweetCQ.class.getName(); }
}
