package com.example.twitter.dbflute.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.dbflute.Entity;
import org.dbflute.optional.OptionalEntity;
import org.dbflute.dbmeta.AbstractDBMeta;
import org.dbflute.dbmeta.info.*;
import org.dbflute.dbmeta.name.*;
import org.dbflute.dbmeta.property.PropertyGateway;
import org.dbflute.dbway.DBDef;
import com.example.twitter.dbflute.allcommon.*;
import com.example.twitter.dbflute.exentity.*;

/**
 * The DB meta of FAVOLITE. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class FavoliteDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final FavoliteDbm _instance = new FavoliteDbm();
    private FavoliteDbm() {}
    public static FavoliteDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((Favolite)et).getFavoliteId(), (et, vl) -> ((Favolite)et).setFavoliteId(ctl(vl)), "favoliteId");
        setupEpg(_epgMap, et -> ((Favolite)et).getUserId(), (et, vl) -> ((Favolite)et).setUserId(ctl(vl)), "userId");
        setupEpg(_epgMap, et -> ((Favolite)et).getTweetId(), (et, vl) -> ((Favolite)et).setTweetId(ctl(vl)), "tweetId");
        setupEpg(_epgMap, et -> ((Favolite)et).getDelFlg(), (et, vl) -> ((Favolite)et).setDelFlg((Boolean)vl), "delFlg");
        setupEpg(_epgMap, et -> ((Favolite)et).getRegisterDatetime(), (et, vl) -> ((Favolite)et).setRegisterDatetime(ctldt(vl)), "registerDatetime");
        setupEpg(_epgMap, et -> ((Favolite)et).getUpdateDatetime(), (et, vl) -> ((Favolite)et).setUpdateDatetime(ctldt(vl)), "updateDatetime");
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
        setupEfpg(_efpgMap, et -> ((Favolite)et).getTweet(), (et, vl) -> ((Favolite)et).setTweet((OptionalEntity<Tweet>)vl), "tweet");
        setupEfpg(_efpgMap, et -> ((Favolite)et).getUser(), (et, vl) -> ((Favolite)et).setUser((OptionalEntity<User>)vl), "user");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "FAVOLITE";
    protected final String _tableDispName = "FAVOLITE";
    protected final String _tablePropertyName = "favolite";
    protected final TableSqlName _tableSqlName = new TableSqlName("FAVOLITE", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnFavoliteId = cci("FAVOLITE_ID", "FAVOLITE_ID", null, null, Long.class, "favoliteId", null, true, true, true, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUserId = cci("USER_ID", "USER_ID", null, null, Long.class, "userId", null, false, false, true, "BIGINT", 19, 0, null, null, false, null, null, "user", null, null, false);
    protected final ColumnInfo _columnTweetId = cci("TWEET_ID", "TWEET_ID", null, null, Long.class, "tweetId", null, false, false, true, "BIGINT", 19, 0, null, null, false, null, null, "tweet", null, null, false);
    protected final ColumnInfo _columnDelFlg = cci("DEL_FLG", "DEL_FLG", null, null, Boolean.class, "delFlg", null, false, false, true, "BIT", null, null, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterDatetime = cci("REGISTER_DATETIME", "REGISTER_DATETIME", null, null, java.time.LocalDateTime.class, "registerDatetime", null, false, false, true, "DATETIME", 19, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateDatetime = cci("UPDATE_DATETIME", "UPDATE_DATETIME", null, null, java.time.LocalDateTime.class, "updateDatetime", null, false, false, true, "DATETIME", 19, 0, null, null, true, null, null, null, null, null, false);

    /**
     * FAVOLITE_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFavoliteId() { return _columnFavoliteId; }
    /**
     * USER_ID: {IX, NotNull, BIGINT(19), FK to USER}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUserId() { return _columnUserId; }
    /**
     * TWEET_ID: {IX, NotNull, BIGINT(19), FK to TWEET}
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
        ls.add(columnFavoliteId());
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
    protected UniqueInfo cpui() { return hpcpui(columnFavoliteId()); }
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
     * TWEET by my TWEET_ID, named 'tweet'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignTweet() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnTweetId(), TweetDbm.getInstance().columnTweetId());
        return cfi("FK_FAVOLITE_TWEET", "tweet", this, TweetDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "favoliteList", false);
    }
    /**
     * USER by my USER_ID, named 'user'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignUser() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnUserId(), UserDbm.getInstance().columnUserId());
        return cfi("FK_FAVOLITE_USER", "user", this, UserDbm.getInstance(), mp, 1, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "favoliteList", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

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
    public String getEntityTypeName() { return "com.example.twitter.dbflute.exentity.Favolite"; }
    public String getConditionBeanTypeName() { return "com.example.twitter.dbflute.cbean.FavoliteCB"; }
    public String getBehaviorTypeName() { return "com.example.twitter.dbflute.exbhv.FavoliteBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<Favolite> getEntityType() { return Favolite.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Favolite newEntity() { return new Favolite(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((Favolite)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((Favolite)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
