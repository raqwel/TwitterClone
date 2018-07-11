package demo.dbflute.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.dbflute.Entity;
import org.dbflute.optional.OptionalEntity;
import org.dbflute.dbmeta.AbstractDBMeta;
import org.dbflute.dbmeta.info.*;
import org.dbflute.dbmeta.name.*;
import org.dbflute.dbmeta.property.PropertyGateway;
import org.dbflute.dbway.DBDef;
import demo.dbflute.allcommon.*;
import demo.dbflute.exentity.*;

/**
 * The DB meta of TWEET. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TweetDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TweetDbm _instance = new TweetDbm();
    private TweetDbm() {}
    public static TweetDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((Tweet)et).getTweetId(), (et, vl) -> ((Tweet)et).setTweetId(ctl(vl)), "tweetId");
        setupEpg(_epgMap, et -> ((Tweet)et).getUserId(), (et, vl) -> ((Tweet)et).setUserId(ctl(vl)), "userId");
        setupEpg(_epgMap, et -> ((Tweet)et).getTweet(), (et, vl) -> ((Tweet)et).setTweet((String)vl), "tweet");
        setupEpg(_epgMap, et -> ((Tweet)et).getDelFlg(), (et, vl) -> ((Tweet)et).setDelFlg((Boolean)vl), "delFlg");
        setupEpg(_epgMap, et -> ((Tweet)et).getRegisterDatetime(), (et, vl) -> ((Tweet)et).setRegisterDatetime(ctldt(vl)), "registerDatetime");
        setupEpg(_epgMap, et -> ((Tweet)et).getUpdateDatetime(), (et, vl) -> ((Tweet)et).setUpdateDatetime(ctldt(vl)), "updateDatetime");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    @SuppressWarnings("unchecked")
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((Tweet)et).getUser(), (et, vl) -> ((Tweet)et).setUser((OptionalEntity<User>)vl), "user");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "TWEET";
    protected final String _tableDispName = "TWEET";
    protected final String _tablePropertyName = "tweet";
    protected final TableSqlName _tableSqlName = new TableSqlName("TWEET", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnTweetId = cci("TWEET_ID", "TWEET_ID", null, null, Long.class, "tweetId", null, true, true, true, "BIGINT", 19, 0, null, null, false, null, null, null, "favoliteList,replyByReplyeeTweetIdList,replyByReplyerTweetIdList,retweetList", null, false);
    protected final ColumnInfo _columnUserId = cci("USER_ID", "USER_ID", null, null, Long.class, "userId", null, false, false, true, "BIGINT", 19, 0, null, null, false, null, null, "user", null, null, false);
    protected final ColumnInfo _columnTweet = cci("TWEET", "TWEET", null, null, String.class, "tweet", null, false, false, true, "VARCHAR", 140, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelFlg = cci("DEL_FLG", "DEL_FLG", null, null, Boolean.class, "delFlg", null, false, false, true, "BIT", null, null, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterDatetime = cci("REGISTER_DATETIME", "REGISTER_DATETIME", null, null, java.time.LocalDateTime.class, "registerDatetime", null, false, false, true, "DATETIME", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateDatetime = cci("UPDATE_DATETIME", "UPDATE_DATETIME", null, null, java.time.LocalDateTime.class, "updateDatetime", null, false, false, true, "DATETIME", 19, 0, null, null, false, null, null, null, null, null, false);

    /**
     * TWEET_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTweetId() { return _columnTweetId; }
    /**
     * USER_ID: {IX, NotNull, BIGINT(19), FK to USER}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUserId() { return _columnUserId; }
    /**
     * TWEET: {NotNull, VARCHAR(140)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTweet() { return _columnTweet; }
    /**
     * DEL_FLG: {NotNull, BIT}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelFlg() { return _columnDelFlg; }
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
        ls.add(columnTweetId());
        ls.add(columnUserId());
        ls.add(columnTweet());
        ls.add(columnDelFlg());
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
    protected UniqueInfo cpui() { return hpcpui(columnTweetId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    /**
     * USER by my USER_ID, named 'user'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignUser() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnUserId(), UserDbm.getInstance().columnUserId());
        return cfi("FK_TWEET_USER", "user", this, UserDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "tweetList", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * FAVOLITE by TWEET_ID, named 'favoliteList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerFavoliteList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnTweetId(), FavoliteDbm.getInstance().columnTweetId());
        return cri("FK_FAVOLITE_TWEET", "favoliteList", this, FavoliteDbm.getInstance(), mp, false, "tweet");
    }
    /**
     * REPLY by REPLYEE_TWEET_ID, named 'replyByReplyeeTweetIdList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerReplyByReplyeeTweetIdList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnTweetId(), ReplyDbm.getInstance().columnReplyeeTweetId());
        return cri("FK_REPLYEE_TWEET", "replyByReplyeeTweetIdList", this, ReplyDbm.getInstance(), mp, false, "tweetByReplyeeTweetId");
    }
    /**
     * REPLY by REPLYER_TWEET_ID, named 'replyByReplyerTweetIdList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerReplyByReplyerTweetIdList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnTweetId(), ReplyDbm.getInstance().columnReplyerTweetId());
        return cri("FK_REPLYER_TWEET", "replyByReplyerTweetIdList", this, ReplyDbm.getInstance(), mp, false, "tweetByReplyerTweetId");
    }
    /**
     * RETWEET by TWEET_ID, named 'retweetList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerRetweetList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnTweetId(), RetweetDbm.getInstance().columnTweetId());
        return cri("FK_RETWEET_TWEET", "retweetList", this, RetweetDbm.getInstance(), mp, false, "tweet");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasIdentity() { return true; }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "demo.dbflute.exentity.Tweet"; }
    public String getConditionBeanTypeName() { return "demo.dbflute.cbean.TweetCB"; }
    public String getBehaviorTypeName() { return "demo.dbflute.exbhv.TweetBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<Tweet> getEntityType() { return Tweet.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Tweet newEntity() { return new Tweet(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((Tweet)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((Tweet)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
