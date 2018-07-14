package com.example.twitter.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.Entity;
import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import org.dbflute.optional.OptionalEntity;
import com.example.twitter.dbflute.allcommon.EntityDefinedCommonColumn;
import com.example.twitter.dbflute.allcommon.DBMetaInstanceHandler;
import com.example.twitter.dbflute.exentity.*;

/**
 * The entity of FOLLOW as TABLE. <br>
 * フォロー
 * <pre>
 * [primary-key]
 *     FOLLOW_ID
 *
 * [column]
 *     FOLLOW_ID, FOLLOWEE_ID, FOLLOWER_ID, DEL_FLG, REGISTER_DATETIME, UPDATE_DATETIME
 *
 * [sequence]
 *     
 *
 * [identity]
 *     FOLLOW_ID
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     USER
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     userByFolloweeId, userByFollowerId
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long followId = entity.getFollowId();
 * Long followeeId = entity.getFolloweeId();
 * Long followerId = entity.getFollowerId();
 * Boolean delFlg = entity.getDelFlg();
 * java.time.LocalDateTime registerDatetime = entity.getRegisterDatetime();
 * java.time.LocalDateTime updateDatetime = entity.getUpdateDatetime();
 * entity.setFollowId(followId);
 * entity.setFolloweeId(followeeId);
 * entity.setFollowerId(followerId);
 * entity.setDelFlg(delFlg);
 * entity.setRegisterDatetime(registerDatetime);
 * entity.setUpdateDatetime(updateDatetime);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsFollow extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** FOLLOW_ID: {PK, ID, NotNull, BIGINT(19)} */
    protected Long _followId;

    /** FOLLOWEE_ID: {UQ+, NotNull, BIGINT(19), FK to USER} */
    protected Long _followeeId;

    /** FOLLOWER_ID: {+UQ, IX, NotNull, BIGINT(19), FK to USER} */
    protected Long _followerId;

    /** DEL_FLG: {NotNull, BIT} */
    protected Boolean _delFlg;

    /** REGISTER_DATETIME: {NotNull, DATETIME(19)} */
    protected java.time.LocalDateTime _registerDatetime;

    /** UPDATE_DATETIME: {NotNull, DATETIME(19)} */
    protected java.time.LocalDateTime _updateDatetime;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "FOLLOW";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_followId == null) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param followeeId : UQ+, NotNull, BIGINT(19), FK to USER. (NotNull)
     * @param followerId : +UQ, IX, NotNull, BIGINT(19), FK to USER. (NotNull)
     */
    public void uniqueBy(Long followeeId, Long followerId) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("followeeId");
        __uniqueDrivenProperties.addPropertyName("followerId");
        setFolloweeId(followeeId);setFollowerId(followerId);
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** USER by my FOLLOWEE_ID, named 'userByFolloweeId'. */
    protected OptionalEntity<User> _userByFolloweeId;

    /**
     * [get] USER by my FOLLOWEE_ID, named 'userByFolloweeId'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'userByFolloweeId'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<User> getUserByFolloweeId() {
        if (_userByFolloweeId == null) { _userByFolloweeId = OptionalEntity.relationEmpty(this, "userByFolloweeId"); }
        return _userByFolloweeId;
    }

    /**
     * [set] USER by my FOLLOWEE_ID, named 'userByFolloweeId'.
     * @param userByFolloweeId The entity of foreign property 'userByFolloweeId'. (NullAllowed)
     */
    public void setUserByFolloweeId(OptionalEntity<User> userByFolloweeId) {
        _userByFolloweeId = userByFolloweeId;
    }

    /** USER by my FOLLOWER_ID, named 'userByFollowerId'. */
    protected OptionalEntity<User> _userByFollowerId;

    /**
     * [get] USER by my FOLLOWER_ID, named 'userByFollowerId'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'userByFollowerId'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<User> getUserByFollowerId() {
        if (_userByFollowerId == null) { _userByFollowerId = OptionalEntity.relationEmpty(this, "userByFollowerId"); }
        return _userByFollowerId;
    }

    /**
     * [set] USER by my FOLLOWER_ID, named 'userByFollowerId'.
     * @param userByFollowerId The entity of foreign property 'userByFollowerId'. (NullAllowed)
     */
    public void setUserByFollowerId(OptionalEntity<User> userByFollowerId) {
        _userByFollowerId = userByFollowerId;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsFollow) {
            BsFollow other = (BsFollow)obj;
            if (!xSV(_followId, other._followId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _followId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_userByFolloweeId != null && _userByFolloweeId.isPresent())
        { sb.append(li).append(xbRDS(_userByFolloweeId, "userByFolloweeId")); }
        if (_userByFollowerId != null && _userByFollowerId.isPresent())
        { sb.append(li).append(xbRDS(_userByFollowerId, "userByFollowerId")); }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_followId));
        sb.append(dm).append(xfND(_followeeId));
        sb.append(dm).append(xfND(_followerId));
        sb.append(dm).append(xfND(_delFlg));
        sb.append(dm).append(xfND(_registerDatetime));
        sb.append(dm).append(xfND(_updateDatetime));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_userByFolloweeId != null && _userByFolloweeId.isPresent())
        { sb.append(dm).append("userByFolloweeId"); }
        if (_userByFollowerId != null && _userByFollowerId.isPresent())
        { sb.append(dm).append("userByFollowerId"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public Follow clone() {
        return (Follow)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] FOLLOW_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * フォローID : フォローID
     * @return The value of the column 'FOLLOW_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getFollowId() {
        checkSpecifiedProperty("followId");
        return _followId;
    }

    /**
     * [set] FOLLOW_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * フォローID : フォローID
     * @param followId The value of the column 'FOLLOW_ID'. (basically NotNull if update: for the constraint)
     */
    public void setFollowId(Long followId) {
        registerModifiedProperty("followId");
        _followId = followId;
    }

    /**
     * [get] FOLLOWEE_ID: {UQ+, NotNull, BIGINT(19), FK to USER} <br>
     * フォロイーID : フォロイーID<br>
     * フォローする人の会員IDが入る
     * @return The value of the column 'FOLLOWEE_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getFolloweeId() {
        checkSpecifiedProperty("followeeId");
        return _followeeId;
    }

    /**
     * [set] FOLLOWEE_ID: {UQ+, NotNull, BIGINT(19), FK to USER} <br>
     * フォロイーID : フォロイーID<br>
     * フォローする人の会員IDが入る
     * @param followeeId The value of the column 'FOLLOWEE_ID'. (basically NotNull if update: for the constraint)
     */
    public void setFolloweeId(Long followeeId) {
        registerModifiedProperty("followeeId");
        _followeeId = followeeId;
    }

    /**
     * [get] FOLLOWER_ID: {+UQ, IX, NotNull, BIGINT(19), FK to USER} <br>
     * フォロワーID : フォロワーID<br>
     * フォローされる人のIDが入る
     * @return The value of the column 'FOLLOWER_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getFollowerId() {
        checkSpecifiedProperty("followerId");
        return _followerId;
    }

    /**
     * [set] FOLLOWER_ID: {+UQ, IX, NotNull, BIGINT(19), FK to USER} <br>
     * フォロワーID : フォロワーID<br>
     * フォローされる人のIDが入る
     * @param followerId The value of the column 'FOLLOWER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setFollowerId(Long followerId) {
        registerModifiedProperty("followerId");
        _followerId = followerId;
    }

    /**
     * [get] DEL_FLG: {NotNull, BIT} <br>
     * 削除フラグ : 削除フラグ<br>
     * フォローされているかをT / Fで判定する
     * @return The value of the column 'DEL_FLG'. (basically NotNull if selected: for the constraint)
     */
    public Boolean getDelFlg() {
        checkSpecifiedProperty("delFlg");
        return _delFlg;
    }

    /**
     * [set] DEL_FLG: {NotNull, BIT} <br>
     * 削除フラグ : 削除フラグ<br>
     * フォローされているかをT / Fで判定する
     * @param delFlg The value of the column 'DEL_FLG'. (basically NotNull if update: for the constraint)
     */
    public void setDelFlg(Boolean delFlg) {
        registerModifiedProperty("delFlg");
        _delFlg = delFlg;
    }

    /**
     * [get] REGISTER_DATETIME: {NotNull, DATETIME(19)} <br>
     * 登録日時 : フォローした日時
     * @return The value of the column 'REGISTER_DATETIME'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDateTime getRegisterDatetime() {
        checkSpecifiedProperty("registerDatetime");
        return _registerDatetime;
    }

    /**
     * [set] REGISTER_DATETIME: {NotNull, DATETIME(19)} <br>
     * 登録日時 : フォローした日時
     * @param registerDatetime The value of the column 'REGISTER_DATETIME'. (basically NotNull if update: for the constraint)
     */
    public void setRegisterDatetime(java.time.LocalDateTime registerDatetime) {
        registerModifiedProperty("registerDatetime");
        _registerDatetime = registerDatetime;
    }

    /**
     * [get] UPDATE_DATETIME: {NotNull, DATETIME(19)} <br>
     * 更新日時 : 更新日時
     * @return The value of the column 'UPDATE_DATETIME'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDateTime getUpdateDatetime() {
        checkSpecifiedProperty("updateDatetime");
        return _updateDatetime;
    }

    /**
     * [set] UPDATE_DATETIME: {NotNull, DATETIME(19)} <br>
     * 更新日時 : 更新日時
     * @param updateDatetime The value of the column 'UPDATE_DATETIME'. (basically NotNull if update: for the constraint)
     */
    public void setUpdateDatetime(java.time.LocalDateTime updateDatetime) {
        registerModifiedProperty("updateDatetime");
        _updateDatetime = updateDatetime;
    }
}
