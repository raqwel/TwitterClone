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
 * The DB meta of RETWEET. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class RetweetDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final RetweetDbm _instance = new RetweetDbm();
    private RetweetDbm() {}
    public static RetweetDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((Retweet)et).getRetweetId(), (et, vl) -> ((Retweet)et).setRetweetId(ctl(vl)), "retweetId");
        setupEpg(_epgMap, et -> ((Retweet)et).getUserId(), (et, vl) -> ((Retweet)et).setUserId(ctl(vl)), "userId");
        setupEpg(_epgMap, et -> ((Retweet)et).getTweetId(), (et, vl) -> ((Retweet)et).setTweetId(ctl(vl)), "tweetId");
        setupEpg(_epgMap, et -> ((Retweet)et).getDelFlg(), (et, vl) -> ((Retweet)et).setDelFlg((Boolean)vl), "delFlg");
        setupEpg(_epgMap, et -> ((Retweet)et).getRegisterDatetime(), (et, vl) -> ((Retweet)et).setRegisterDatetime(ctldt(vl)), "registerDatetime");
        setupEpg(_epgMap, et -> ((Retweet)et).getUpdateDatetime(), (et, vl) -> ((Retweet)et).setUpdateDatetime(ctldt(vl)), "updateDatetime");
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
        setupEfpg(_efpgMap, et -> ((Retweet)et).getTweet(), (et, vl) -> ((Retweet)et).setTweet((OptionalEntity<Tweet>)vl), "tweet");
        setupEfpg(_efpgMap, et -> ((Retweet)et).getUser(), (et, vl) -> ((Retweet)et).setUser((OptionalEntity<User>)vl), "user");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "RETWEET";
    protected final String _tableDispName = "RETWEET";
    protected final String _tablePropertyName = "retweet";
    protected final TableSqlName _tableSqlName = new TableSqlName("RETWEET", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnRetweetId = cci("RETWEET_ID", "RETWEET_ID", null, null, Long.class, "retweetId", null, true, true, true, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUserId = cci("USER_ID", "USER_ID", null, null, Long.class, "userId", null, false, false, true, "BIGINT", 19, 0, null, null, false, null, null, "user", null, null, false);
    protected final ColumnInfo _columnTweetId = cci("TWEET_ID", "TWEET_ID", null, null, Long.class, "tweetId", null, false, false, true, "BIGINT", 19, 0, null, null, false, null, null, "tweet", null, null, false);
    protected final ColumnInfo _columnDelFlg = cci("DEL_FLG", "DEL_FLG", null, null, Boolean.class, "delFlg", null, false, false, true, "BIT", null, null, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterDatetime = cci("REGISTER_DATETIME", "REGISTER_DATETIME", null, null, java.time.LocalDateTime.class, "registerDatetime", null, false, false, true, "DATETIME", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateDatetime = cci("UPDATE_DATETIME", "UPDATE_DATETIME", null, null, java.time.LocalDateTime.class, "updateDatetime", null, false, false, true, "DATETIME", 19, 0, null, null, false, null, null, null, null, null, false);

    /**
     * RETWEET_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRetweetId() { return _columnRetweetId; }
    /**
     * USER_ID: {UQ+, NotNull, BIGINT(19), FK to USER}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUserId() { return _columnUserId; }
    /**
     * TWEET_ID: {+UQ, IX, NotNull, BIGINT(19), FK to TWEET}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTweetId() { return _columnTweetId; }
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
        ls.add(columnRetweetId());
        ls.add(columnUserId());
        ls.add(columnTweetId());
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
    protected UniqueInfo cpui() { return hpcpui(columnRetweetId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() {
        List<ColumnInfo> ls = newArrayListSized(4);
        ls.add(columnUserId());
        ls.add(columnTweetId());
        return hpcui(ls);
    }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    /**
     * TWEET by my TWEET_ID, named 'tweet'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignTweet() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnTweetId(), TweetDbm.getInstance().columnTweetId());
        return cfi("FK_RETWEET_TWEET", "tweet", this, TweetDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "retweetList", false);
    }
    /**
     * USER by my USER_ID, named 'user'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignUser() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnUserId(), UserDbm.getInstance().columnUserId());
        return cfi("FK_RETWEET_USER", "user", this, UserDbm.getInstance(), mp, 1, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "retweetList", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasIdentity() { return true; }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "demo.dbflute.exentity.Retweet"; }
    public String getConditionBeanTypeName() { return "demo.dbflute.cbean.RetweetCB"; }
    public String getBehaviorTypeName() { return "demo.dbflute.exbhv.RetweetBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<Retweet> getEntityType() { return Retweet.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Retweet newEntity() { return new Retweet(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((Retweet)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((Retweet)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
