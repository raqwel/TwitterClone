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
 * The DB meta of REPLY. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class ReplyDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final ReplyDbm _instance = new ReplyDbm();
    private ReplyDbm() {}
    public static ReplyDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((Reply)et).getReplyId(), (et, vl) -> ((Reply)et).setReplyId(ctl(vl)), "replyId");
        setupEpg(_epgMap, et -> ((Reply)et).getReplyeeId(), (et, vl) -> ((Reply)et).setReplyeeId(ctl(vl)), "replyeeId");
        setupEpg(_epgMap, et -> ((Reply)et).getReplyerId(), (et, vl) -> ((Reply)et).setReplyerId(ctl(vl)), "replyerId");
        setupEpg(_epgMap, et -> ((Reply)et).getReplyeeTweetId(), (et, vl) -> ((Reply)et).setReplyeeTweetId(ctl(vl)), "replyeeTweetId");
        setupEpg(_epgMap, et -> ((Reply)et).getReplyerTweetId(), (et, vl) -> ((Reply)et).setReplyerTweetId(ctl(vl)), "replyerTweetId");
        setupEpg(_epgMap, et -> ((Reply)et).getDelFlg(), (et, vl) -> ((Reply)et).setDelFlg((Boolean)vl), "delFlg");
        setupEpg(_epgMap, et -> ((Reply)et).getRegisterDatetime(), (et, vl) -> ((Reply)et).setRegisterDatetime(ctldt(vl)), "registerDatetime");
        setupEpg(_epgMap, et -> ((Reply)et).getUpdateDatetime(), (et, vl) -> ((Reply)et).setUpdateDatetime(ctldt(vl)), "updateDatetime");
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
        setupEfpg(_efpgMap, et -> ((Reply)et).getUserByReplyeeId(), (et, vl) -> ((Reply)et).setUserByReplyeeId((OptionalEntity<User>)vl), "userByReplyeeId");
        setupEfpg(_efpgMap, et -> ((Reply)et).getTweetByReplyeeTweetId(), (et, vl) -> ((Reply)et).setTweetByReplyeeTweetId((OptionalEntity<Tweet>)vl), "tweetByReplyeeTweetId");
        setupEfpg(_efpgMap, et -> ((Reply)et).getUserByReplyerId(), (et, vl) -> ((Reply)et).setUserByReplyerId((OptionalEntity<User>)vl), "userByReplyerId");
        setupEfpg(_efpgMap, et -> ((Reply)et).getTweetByReplyerTweetId(), (et, vl) -> ((Reply)et).setTweetByReplyerTweetId((OptionalEntity<Tweet>)vl), "tweetByReplyerTweetId");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "REPLY";
    protected final String _tableDispName = "REPLY";
    protected final String _tablePropertyName = "reply";
    protected final TableSqlName _tableSqlName = new TableSqlName("REPLY", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnReplyId = cci("REPLY_ID", "REPLY_ID", null, null, Long.class, "replyId", null, true, true, true, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReplyeeId = cci("REPLYEE_ID", "REPLYEE_ID", null, null, Long.class, "replyeeId", null, false, false, true, "BIGINT", 19, 0, null, null, false, null, null, "userByReplyeeId", null, null, false);
    protected final ColumnInfo _columnReplyerId = cci("REPLYER_ID", "REPLYER_ID", null, null, Long.class, "replyerId", null, false, false, true, "BIGINT", 19, 0, null, null, false, null, null, "userByReplyerId", null, null, false);
    protected final ColumnInfo _columnReplyeeTweetId = cci("REPLYEE_TWEET_ID", "REPLYEE_TWEET_ID", null, null, Long.class, "replyeeTweetId", null, false, false, true, "BIGINT", 19, 0, null, null, false, null, null, "tweetByReplyeeTweetId", null, null, false);
    protected final ColumnInfo _columnReplyerTweetId = cci("REPLYER_TWEET_ID", "REPLYER_TWEET_ID", null, null, Long.class, "replyerTweetId", null, false, false, true, "BIGINT", 19, 0, null, null, false, null, null, "tweetByReplyerTweetId", null, null, false);
    protected final ColumnInfo _columnDelFlg = cci("DEL_FLG", "DEL_FLG", null, null, Boolean.class, "delFlg", null, false, false, true, "BIT", null, null, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterDatetime = cci("REGISTER_DATETIME", "REGISTER_DATETIME", null, null, java.time.LocalDateTime.class, "registerDatetime", null, false, false, true, "DATETIME", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateDatetime = cci("UPDATE_DATETIME", "UPDATE_DATETIME", null, null, java.time.LocalDateTime.class, "updateDatetime", null, false, false, true, "DATETIME", 19, 0, null, null, false, null, null, null, null, null, false);

    /**
     * REPLY_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReplyId() { return _columnReplyId; }
    /**
     * REPLYEE_ID: {IX, NotNull, BIGINT(19), FK to USER}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReplyeeId() { return _columnReplyeeId; }
    /**
     * REPLYER_ID: {IX, NotNull, BIGINT(19), FK to USER}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReplyerId() { return _columnReplyerId; }
    /**
     * REPLYEE_TWEET_ID: {IX, NotNull, BIGINT(19), FK to TWEET}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReplyeeTweetId() { return _columnReplyeeTweetId; }
    /**
     * REPLYER_TWEET_ID: {IX, NotNull, BIGINT(19), FK to TWEET}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReplyerTweetId() { return _columnReplyerTweetId; }
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
        ls.add(columnReplyId());
        ls.add(columnReplyeeId());
        ls.add(columnReplyerId());
        ls.add(columnReplyeeTweetId());
        ls.add(columnReplyerTweetId());
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
    protected UniqueInfo cpui() { return hpcpui(columnReplyId()); }
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
     * USER by my REPLYEE_ID, named 'userByReplyeeId'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignUserByReplyeeId() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnReplyeeId(), UserDbm.getInstance().columnUserId());
        return cfi("FK_REPLYEE_USER", "userByReplyeeId", this, UserDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "replyByReplyeeIdList", false);
    }
    /**
     * TWEET by my REPLYEE_TWEET_ID, named 'tweetByReplyeeTweetId'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignTweetByReplyeeTweetId() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnReplyeeTweetId(), TweetDbm.getInstance().columnTweetId());
        return cfi("FK_REPLYEE_TWEET", "tweetByReplyeeTweetId", this, TweetDbm.getInstance(), mp, 1, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "replyByReplyeeTweetIdList", false);
    }
    /**
     * USER by my REPLYER_ID, named 'userByReplyerId'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignUserByReplyerId() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnReplyerId(), UserDbm.getInstance().columnUserId());
        return cfi("FK_REPLYER_USER", "userByReplyerId", this, UserDbm.getInstance(), mp, 2, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "replyByReplyerIdList", false);
    }
    /**
     * TWEET by my REPLYER_TWEET_ID, named 'tweetByReplyerTweetId'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignTweetByReplyerTweetId() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnReplyerTweetId(), TweetDbm.getInstance().columnTweetId());
        return cfi("FK_REPLYER_TWEET", "tweetByReplyerTweetId", this, TweetDbm.getInstance(), mp, 3, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "replyByReplyerTweetIdList", false);
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
    public String getEntityTypeName() { return "demo.dbflute.exentity.Reply"; }
    public String getConditionBeanTypeName() { return "demo.dbflute.cbean.ReplyCB"; }
    public String getBehaviorTypeName() { return "demo.dbflute.exbhv.ReplyBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<Reply> getEntityType() { return Reply.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Reply newEntity() { return new Reply(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((Reply)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((Reply)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
