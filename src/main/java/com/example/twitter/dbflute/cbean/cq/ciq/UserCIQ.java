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
 * The condition-query for in-line of USER.
 * @author DBFlute(AutoGenerator)
 */
public class UserCIQ extends AbstractBsUserCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsUserCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public UserCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsUserCQ myCQ) {
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
    protected ConditionValue xgetCValueUserId() { return _myCQ.xdfgetUserId(); }
    public String keepUserId_ExistsReferrer_FavoliteList(FavoliteCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepUserId_ExistsReferrer_FollowByFolloweeIdList(FollowCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepUserId_ExistsReferrer_FollowByFollowerIdList(FollowCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepUserId_ExistsReferrer_ReplyByReplyeeIdList(ReplyCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepUserId_ExistsReferrer_ReplyByReplyerIdList(ReplyCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepUserId_ExistsReferrer_RetweetList(RetweetCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepUserId_ExistsReferrer_TweetList(TweetCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepUserId_NotExistsReferrer_FavoliteList(FavoliteCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepUserId_NotExistsReferrer_FollowByFolloweeIdList(FollowCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepUserId_NotExistsReferrer_FollowByFollowerIdList(FollowCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepUserId_NotExistsReferrer_ReplyByReplyeeIdList(ReplyCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepUserId_NotExistsReferrer_ReplyByReplyerIdList(ReplyCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepUserId_NotExistsReferrer_RetweetList(RetweetCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepUserId_NotExistsReferrer_TweetList(TweetCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepUserId_SpecifyDerivedReferrer_FavoliteList(FavoliteCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepUserId_SpecifyDerivedReferrer_FollowByFolloweeIdList(FollowCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepUserId_SpecifyDerivedReferrer_FollowByFollowerIdList(FollowCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepUserId_SpecifyDerivedReferrer_ReplyByReplyeeIdList(ReplyCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepUserId_SpecifyDerivedReferrer_ReplyByReplyerIdList(ReplyCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepUserId_SpecifyDerivedReferrer_RetweetList(RetweetCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepUserId_SpecifyDerivedReferrer_TweetList(TweetCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepUserId_QueryDerivedReferrer_FavoliteList(FavoliteCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepUserId_QueryDerivedReferrer_FavoliteListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepUserId_QueryDerivedReferrer_FollowByFolloweeIdList(FollowCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepUserId_QueryDerivedReferrer_FollowByFolloweeIdListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepUserId_QueryDerivedReferrer_FollowByFollowerIdList(FollowCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepUserId_QueryDerivedReferrer_FollowByFollowerIdListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepUserId_QueryDerivedReferrer_ReplyByReplyeeIdList(ReplyCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepUserId_QueryDerivedReferrer_ReplyByReplyeeIdListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepUserId_QueryDerivedReferrer_ReplyByReplyerIdList(ReplyCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepUserId_QueryDerivedReferrer_ReplyByReplyerIdListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepUserId_QueryDerivedReferrer_RetweetList(RetweetCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepUserId_QueryDerivedReferrer_RetweetListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepUserId_QueryDerivedReferrer_TweetList(TweetCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepUserId_QueryDerivedReferrer_TweetListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue xgetCValueUserName() { return _myCQ.xdfgetUserName(); }
    protected ConditionValue xgetCValuePassword() { return _myCQ.xdfgetPassword(); }
    protected ConditionValue xgetCValueMailAddress() { return _myCQ.xdfgetMailAddress(); }
    protected ConditionValue xgetCValueBirthDate() { return _myCQ.xdfgetBirthDate(); }
    protected ConditionValue xgetCValueProfileSentence() { return _myCQ.xdfgetProfileSentence(); }
    protected ConditionValue xgetCValueRegisterDatetime() { return _myCQ.xdfgetRegisterDatetime(); }
    protected ConditionValue xgetCValueUpdateDatetime() { return _myCQ.xdfgetUpdateDatetime(); }
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String pp) { return null; }
    public String keepScalarCondition(UserCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(UserCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(UserCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(UserCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return UserCB.class.getName(); }
    protected String xinCQ() { return UserCQ.class.getName(); }
}
