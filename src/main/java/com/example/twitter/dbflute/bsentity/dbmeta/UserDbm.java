package com.example.twitter.dbflute.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.dbflute.Entity;
import org.dbflute.dbmeta.AbstractDBMeta;
import org.dbflute.dbmeta.info.*;
import org.dbflute.dbmeta.name.*;
import org.dbflute.dbmeta.property.PropertyGateway;
import org.dbflute.dbway.DBDef;
import com.example.twitter.dbflute.allcommon.*;
import com.example.twitter.dbflute.exentity.*;

/**
 * The DB meta of USER. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class UserDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final UserDbm _instance = new UserDbm();
    private UserDbm() {}
    public static UserDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public String getProjectName() { return DBCurrent.getInstance().projectName(); }
    public String getProjectPrefix() { return DBCurrent.getInstance().projectPrefix(); }
    public String getGenerationGapBasePrefix() { return DBCurrent.getInstance().generationGapBasePrefix(); }
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    // -----------------------------------------------------
    //                                       Column Property
    //                                       ---------------
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    { xsetupEpg(); }
    protected void xsetupEpg() {
        setupEpg(_epgMap, et -> ((User)et).getUserId(), (et, vl) -> ((User)et).setUserId(ctl(vl)), "userId");
        setupEpg(_epgMap, et -> ((User)et).getUserName(), (et, vl) -> ((User)et).setUserName((String)vl), "userName");
        setupEpg(_epgMap, et -> ((User)et).getPassword(), (et, vl) -> ((User)et).setPassword((String)vl), "password");
        setupEpg(_epgMap, et -> ((User)et).getMailAddress(), (et, vl) -> ((User)et).setMailAddress((String)vl), "mailAddress");
        setupEpg(_epgMap, et -> ((User)et).getBirthDate(), (et, vl) -> ((User)et).setBirthDate(ctld(vl)), "birthDate");
        setupEpg(_epgMap, et -> ((User)et).getProfileSentence(), (et, vl) -> ((User)et).setProfileSentence((String)vl), "profileSentence");
        setupEpg(_epgMap, et -> ((User)et).getRegisterDatetime(), (et, vl) -> ((User)et).setRegisterDatetime(ctldt(vl)), "registerDatetime");
        setupEpg(_epgMap, et -> ((User)et).getUpdateDatetime(), (et, vl) -> ((User)et).setUpdateDatetime(ctldt(vl)), "updateDatetime");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "USER";
    protected final String _tableDispName = "USER";
    protected final String _tablePropertyName = "user";
    protected final TableSqlName _tableSqlName = new TableSqlName("USER", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnUserId = cci("USER_ID", "USER_ID", null, null, Long.class, "userId", null, true, true, true, "BIGINT", 19, 0, null, null, false, null, null, null, "favoliteList,followByFolloweeIdList,followByFollowerIdList,replyByReplyeeIdList,replyByReplyerIdList,retweetList,tweetList", null, false);
    protected final ColumnInfo _columnUserName = cci("USER_NAME", "USER_NAME", null, null, String.class, "userName", null, false, false, true, "VARCHAR", 64, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPassword = cci("PASSWORD", "PASSWORD", null, null, String.class, "password", null, false, false, true, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMailAddress = cci("MAIL_ADDRESS", "MAIL_ADDRESS", null, null, String.class, "mailAddress", null, false, false, false, "VARCHAR", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBirthDate = cci("BIRTH_DATE", "BIRTH_DATE", null, null, java.time.LocalDate.class, "birthDate", null, false, false, false, "DATE", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProfileSentence = cci("PROFILE_SENTENCE", "PROFILE_SENTENCE", null, null, String.class, "profileSentence", null, false, false, false, "VARCHAR", 200, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterDatetime = cci("REGISTER_DATETIME", "REGISTER_DATETIME", null, null, java.time.LocalDateTime.class, "registerDatetime", null, false, false, true, "DATETIME", 19, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateDatetime = cci("UPDATE_DATETIME", "UPDATE_DATETIME", null, null, java.time.LocalDateTime.class, "updateDatetime", null, false, false, true, "DATETIME", 19, 0, null, null, true, null, null, null, null, null, false);

    /**
     * USER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUserId() { return _columnUserId; }
    /**
     * USER_NAME: {NotNull, VARCHAR(64)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUserName() { return _columnUserName; }
    /**
     * PASSWORD: {NotNull, VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPassword() { return _columnPassword; }
    /**
     * MAIL_ADDRESS: {UQ, VARCHAR(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMailAddress() { return _columnMailAddress; }
    /**
     * BIRTH_DATE: {DATE(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBirthDate() { return _columnBirthDate; }
    /**
     * PROFILE_SENTENCE: {VARCHAR(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProfileSentence() { return _columnProfileSentence; }
    /**
     * REGISTER_DATETIME: {NotNull, DATETIME(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRegisterDatetime() { return _columnRegisterDatetime; }
    /**
     * UPDATE_DATETIME: {NotNull, DATETIME(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdateDatetime() { return _columnUpdateDatetime; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnUserId());
        ls.add(columnUserName());
        ls.add(columnPassword());
        ls.add(columnMailAddress());
        ls.add(columnBirthDate());
        ls.add(columnProfileSentence());
        ls.add(columnRegisterDatetime());
        ls.add(columnUpdateDatetime());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnUserId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() { return hpcui(columnMailAddress()); }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * FAVOLITE by USER_ID, named 'favoliteList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerFavoliteList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnUserId(), FavoliteDbm.getInstance().columnUserId());
        return cri("FK_FAVOLITE_USER", "favoliteList", this, FavoliteDbm.getInstance(), mp, false, "user");
    }
    /**
     * FOLLOW by FOLLOWEE_ID, named 'followByFolloweeIdList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerFollowByFolloweeIdList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnUserId(), FollowDbm.getInstance().columnFolloweeId());
        return cri("FK_FOLLOWEE_USER", "followByFolloweeIdList", this, FollowDbm.getInstance(), mp, false, "userByFolloweeId");
    }
    /**
     * FOLLOW by FOLLOWER_ID, named 'followByFollowerIdList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerFollowByFollowerIdList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnUserId(), FollowDbm.getInstance().columnFollowerId());
        return cri("FK_FOLLOWER_USER", "followByFollowerIdList", this, FollowDbm.getInstance(), mp, false, "userByFollowerId");
    }
    /**
     * REPLY by REPLYEE_ID, named 'replyByReplyeeIdList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerReplyByReplyeeIdList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnUserId(), ReplyDbm.getInstance().columnReplyeeId());
        return cri("FK_REPLYEE_USER", "replyByReplyeeIdList", this, ReplyDbm.getInstance(), mp, false, "userByReplyeeId");
    }
    /**
     * REPLY by REPLYER_ID, named 'replyByReplyerIdList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerReplyByReplyerIdList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnUserId(), ReplyDbm.getInstance().columnReplyerId());
        return cri("FK_REPLYER_USER", "replyByReplyerIdList", this, ReplyDbm.getInstance(), mp, false, "userByReplyerId");
    }
    /**
     * RETWEET by USER_ID, named 'retweetList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerRetweetList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnUserId(), RetweetDbm.getInstance().columnUserId());
        return cri("FK_RETWEET_USER", "retweetList", this, RetweetDbm.getInstance(), mp, false, "user");
    }
    /**
     * TWEET by USER_ID, named 'tweetList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTweetList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnUserId(), TweetDbm.getInstance().columnUserId());
        return cri("FK_TWEET_USER", "tweetList", this, TweetDbm.getInstance(), mp, false, "user");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasIdentity() { return true; }
    public boolean hasCommonColumn() { return true; }
    public List<ColumnInfo> getCommonColumnInfoList()
    { return newArrayList(columnRegisterDatetime(), columnUpdateDatetime()); }
    public List<ColumnInfo> getCommonColumnInfoBeforeInsertList()
    { return newArrayList(columnRegisterDatetime(), columnUpdateDatetime()); }
    public List<ColumnInfo> getCommonColumnInfoBeforeUpdateList()
    { return newArrayList(columnUpdateDatetime()); }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.example.twitter.dbflute.exentity.User"; }
    public String getConditionBeanTypeName() { return "com.example.twitter.dbflute.cbean.UserCB"; }
    public String getBehaviorTypeName() { return "com.example.twitter.dbflute.exbhv.UserBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<User> getEntityType() { return User.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public User newEntity() { return new User(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((User)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((User)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
