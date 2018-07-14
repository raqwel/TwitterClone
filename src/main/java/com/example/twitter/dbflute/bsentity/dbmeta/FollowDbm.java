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
 * The DB meta of FOLLOW. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class FollowDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final FollowDbm _instance = new FollowDbm();
    private FollowDbm() {}
    public static FollowDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((Follow)et).getFollowId(), (et, vl) -> ((Follow)et).setFollowId(ctl(vl)), "followId");
        setupEpg(_epgMap, et -> ((Follow)et).getFolloweeId(), (et, vl) -> ((Follow)et).setFolloweeId(ctl(vl)), "followeeId");
        setupEpg(_epgMap, et -> ((Follow)et).getFollowerId(), (et, vl) -> ((Follow)et).setFollowerId(ctl(vl)), "followerId");
        setupEpg(_epgMap, et -> ((Follow)et).getDelFlg(), (et, vl) -> ((Follow)et).setDelFlg((Boolean)vl), "delFlg");
        setupEpg(_epgMap, et -> ((Follow)et).getRegisterDatetime(), (et, vl) -> ((Follow)et).setRegisterDatetime(ctldt(vl)), "registerDatetime");
        setupEpg(_epgMap, et -> ((Follow)et).getUpdateDatetime(), (et, vl) -> ((Follow)et).setUpdateDatetime(ctldt(vl)), "updateDatetime");
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
        setupEfpg(_efpgMap, et -> ((Follow)et).getUserByFolloweeId(), (et, vl) -> ((Follow)et).setUserByFolloweeId((OptionalEntity<User>)vl), "userByFolloweeId");
        setupEfpg(_efpgMap, et -> ((Follow)et).getUserByFollowerId(), (et, vl) -> ((Follow)et).setUserByFollowerId((OptionalEntity<User>)vl), "userByFollowerId");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "FOLLOW";
    protected final String _tableDispName = "FOLLOW";
    protected final String _tablePropertyName = "follow";
    protected final TableSqlName _tableSqlName = new TableSqlName("FOLLOW", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnFollowId = cci("FOLLOW_ID", "FOLLOW_ID", null, null, Long.class, "followId", null, true, true, true, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFolloweeId = cci("FOLLOWEE_ID", "FOLLOWEE_ID", null, null, Long.class, "followeeId", null, false, false, true, "BIGINT", 19, 0, null, null, false, null, null, "userByFolloweeId", null, null, false);
    protected final ColumnInfo _columnFollowerId = cci("FOLLOWER_ID", "FOLLOWER_ID", null, null, Long.class, "followerId", null, false, false, true, "BIGINT", 19, 0, null, null, false, null, null, "userByFollowerId", null, null, false);
    protected final ColumnInfo _columnDelFlg = cci("DEL_FLG", "DEL_FLG", null, null, Boolean.class, "delFlg", null, false, false, true, "BIT", null, null, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterDatetime = cci("REGISTER_DATETIME", "REGISTER_DATETIME", null, null, java.time.LocalDateTime.class, "registerDatetime", null, false, false, true, "DATETIME", 19, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateDatetime = cci("UPDATE_DATETIME", "UPDATE_DATETIME", null, null, java.time.LocalDateTime.class, "updateDatetime", null, false, false, true, "DATETIME", 19, 0, null, null, true, null, null, null, null, null, false);

    /**
     * FOLLOW_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFollowId() { return _columnFollowId; }
    /**
     * FOLLOWEE_ID: {UQ+, NotNull, BIGINT(19), FK to USER}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFolloweeId() { return _columnFolloweeId; }
    /**
     * FOLLOWER_ID: {+UQ, IX, NotNull, BIGINT(19), FK to USER}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFollowerId() { return _columnFollowerId; }
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
        ls.add(columnFollowId());
        ls.add(columnFolloweeId());
        ls.add(columnFollowerId());
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
    protected UniqueInfo cpui() { return hpcpui(columnFollowId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() {
        List<ColumnInfo> ls = newArrayListSized(4);
        ls.add(columnFolloweeId());
        ls.add(columnFollowerId());
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
     * USER by my FOLLOWEE_ID, named 'userByFolloweeId'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignUserByFolloweeId() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnFolloweeId(), UserDbm.getInstance().columnUserId());
        return cfi("FK_FOLLOWEE_USER", "userByFolloweeId", this, UserDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "followByFolloweeIdList", false);
    }
    /**
     * USER by my FOLLOWER_ID, named 'userByFollowerId'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignUserByFollowerId() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnFollowerId(), UserDbm.getInstance().columnUserId());
        return cfi("FK_FOLLOWER_USER", "userByFollowerId", this, UserDbm.getInstance(), mp, 1, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "followByFollowerIdList", false);
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
    public String getEntityTypeName() { return "com.example.twitter.dbflute.exentity.Follow"; }
    public String getConditionBeanTypeName() { return "com.example.twitter.dbflute.cbean.FollowCB"; }
    public String getBehaviorTypeName() { return "com.example.twitter.dbflute.exbhv.FollowBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<Follow> getEntityType() { return Follow.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Follow newEntity() { return new Follow(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((Follow)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((Follow)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
