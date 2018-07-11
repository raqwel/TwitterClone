package demo.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.Entity;
import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import org.dbflute.optional.OptionalEntity;
import demo.dbflute.allcommon.DBMetaInstanceHandler;
import demo.dbflute.exentity.*;

/**
 * The entity of REPLY as TABLE. <br>
 * リプライ
 * <pre>
 * [primary-key]
 *     REPLY_ID
 *
 * [column]
 *     REPLY_ID, REPLYEE_ID, REPLYER_ID, REPLYEE_TWEET_ID, REPLYER_TWEET_ID, DEL_FLG, REGISTER_DATETIME, UPDATE_DATETIME
 *
 * [sequence]
 *     
 *
 * [identity]
 *     REPLY_ID
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     USER, TWEET
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     userByReplyeeId, tweetByReplyeeTweetId, userByReplyerId, tweetByReplyerTweetId
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long replyId = entity.getReplyId();
 * Long replyeeId = entity.getReplyeeId();
 * Long replyerId = entity.getReplyerId();
 * Long replyeeTweetId = entity.getReplyeeTweetId();
 * Long replyerTweetId = entity.getReplyerTweetId();
 * Boolean delFlg = entity.getDelFlg();
 * java.time.LocalDateTime registerDatetime = entity.getRegisterDatetime();
 * java.time.LocalDateTime updateDatetime = entity.getUpdateDatetime();
 * entity.setReplyId(replyId);
 * entity.setReplyeeId(replyeeId);
 * entity.setReplyerId(replyerId);
 * entity.setReplyeeTweetId(replyeeTweetId);
 * entity.setReplyerTweetId(replyerTweetId);
 * entity.setDelFlg(delFlg);
 * entity.setRegisterDatetime(registerDatetime);
 * entity.setUpdateDatetime(updateDatetime);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsReply extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** REPLY_ID: {PK, ID, NotNull, BIGINT(19)} */
    protected Long _replyId;

    /** REPLYEE_ID: {IX, NotNull, BIGINT(19), FK to USER} */
    protected Long _replyeeId;

    /** REPLYER_ID: {IX, NotNull, BIGINT(19), FK to USER} */
    protected Long _replyerId;

    /** REPLYEE_TWEET_ID: {IX, NotNull, BIGINT(19), FK to TWEET} */
    protected Long _replyeeTweetId;

    /** REPLYER_TWEET_ID: {IX, NotNull, BIGINT(19), FK to TWEET} */
    protected Long _replyerTweetId;

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
        return "REPLY";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_replyId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** USER by my REPLYEE_ID, named 'userByReplyeeId'. */
    protected OptionalEntity<User> _userByReplyeeId;

    /**
     * [get] USER by my REPLYEE_ID, named 'userByReplyeeId'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'userByReplyeeId'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<User> getUserByReplyeeId() {
        if (_userByReplyeeId == null) { _userByReplyeeId = OptionalEntity.relationEmpty(this, "userByReplyeeId"); }
        return _userByReplyeeId;
    }

    /**
     * [set] USER by my REPLYEE_ID, named 'userByReplyeeId'.
     * @param userByReplyeeId The entity of foreign property 'userByReplyeeId'. (NullAllowed)
     */
    public void setUserByReplyeeId(OptionalEntity<User> userByReplyeeId) {
        _userByReplyeeId = userByReplyeeId;
    }

    /** TWEET by my REPLYEE_TWEET_ID, named 'tweetByReplyeeTweetId'. */
    protected OptionalEntity<Tweet> _tweetByReplyeeTweetId;

    /**
     * [get] TWEET by my REPLYEE_TWEET_ID, named 'tweetByReplyeeTweetId'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'tweetByReplyeeTweetId'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<Tweet> getTweetByReplyeeTweetId() {
        if (_tweetByReplyeeTweetId == null) { _tweetByReplyeeTweetId = OptionalEntity.relationEmpty(this, "tweetByReplyeeTweetId"); }
        return _tweetByReplyeeTweetId;
    }

    /**
     * [set] TWEET by my REPLYEE_TWEET_ID, named 'tweetByReplyeeTweetId'.
     * @param tweetByReplyeeTweetId The entity of foreign property 'tweetByReplyeeTweetId'. (NullAllowed)
     */
    public void setTweetByReplyeeTweetId(OptionalEntity<Tweet> tweetByReplyeeTweetId) {
        _tweetByReplyeeTweetId = tweetByReplyeeTweetId;
    }

    /** USER by my REPLYER_ID, named 'userByReplyerId'. */
    protected OptionalEntity<User> _userByReplyerId;

    /**
     * [get] USER by my REPLYER_ID, named 'userByReplyerId'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'userByReplyerId'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<User> getUserByReplyerId() {
        if (_userByReplyerId == null) { _userByReplyerId = OptionalEntity.relationEmpty(this, "userByReplyerId"); }
        return _userByReplyerId;
    }

    /**
     * [set] USER by my REPLYER_ID, named 'userByReplyerId'.
     * @param userByReplyerId The entity of foreign property 'userByReplyerId'. (NullAllowed)
     */
    public void setUserByReplyerId(OptionalEntity<User> userByReplyerId) {
        _userByReplyerId = userByReplyerId;
    }

    /** TWEET by my REPLYER_TWEET_ID, named 'tweetByReplyerTweetId'. */
    protected OptionalEntity<Tweet> _tweetByReplyerTweetId;

    /**
     * [get] TWEET by my REPLYER_TWEET_ID, named 'tweetByReplyerTweetId'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'tweetByReplyerTweetId'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<Tweet> getTweetByReplyerTweetId() {
        if (_tweetByReplyerTweetId == null) { _tweetByReplyerTweetId = OptionalEntity.relationEmpty(this, "tweetByReplyerTweetId"); }
        return _tweetByReplyerTweetId;
    }

    /**
     * [set] TWEET by my REPLYER_TWEET_ID, named 'tweetByReplyerTweetId'.
     * @param tweetByReplyerTweetId The entity of foreign property 'tweetByReplyerTweetId'. (NullAllowed)
     */
    public void setTweetByReplyerTweetId(OptionalEntity<Tweet> tweetByReplyerTweetId) {
        _tweetByReplyerTweetId = tweetByReplyerTweetId;
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
        if (obj instanceof BsReply) {
            BsReply other = (BsReply)obj;
            if (!xSV(_replyId, other._replyId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _replyId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_userByReplyeeId != null && _userByReplyeeId.isPresent())
        { sb.append(li).append(xbRDS(_userByReplyeeId, "userByReplyeeId")); }
        if (_tweetByReplyeeTweetId != null && _tweetByReplyeeTweetId.isPresent())
        { sb.append(li).append(xbRDS(_tweetByReplyeeTweetId, "tweetByReplyeeTweetId")); }
        if (_userByReplyerId != null && _userByReplyerId.isPresent())
        { sb.append(li).append(xbRDS(_userByReplyerId, "userByReplyerId")); }
        if (_tweetByReplyerTweetId != null && _tweetByReplyerTweetId.isPresent())
        { sb.append(li).append(xbRDS(_tweetByReplyerTweetId, "tweetByReplyerTweetId")); }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_replyId));
        sb.append(dm).append(xfND(_replyeeId));
        sb.append(dm).append(xfND(_replyerId));
        sb.append(dm).append(xfND(_replyeeTweetId));
        sb.append(dm).append(xfND(_replyerTweetId));
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
        if (_userByReplyeeId != null && _userByReplyeeId.isPresent())
        { sb.append(dm).append("userByReplyeeId"); }
        if (_tweetByReplyeeTweetId != null && _tweetByReplyeeTweetId.isPresent())
        { sb.append(dm).append("tweetByReplyeeTweetId"); }
        if (_userByReplyerId != null && _userByReplyerId.isPresent())
        { sb.append(dm).append("userByReplyerId"); }
        if (_tweetByReplyerTweetId != null && _tweetByReplyerTweetId.isPresent())
        { sb.append(dm).append("tweetByReplyerTweetId"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public Reply clone() {
        return (Reply)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] REPLY_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * リプライID : リプライID
     * @return The value of the column 'REPLY_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getReplyId() {
        checkSpecifiedProperty("replyId");
        return _replyId;
    }

    /**
     * [set] REPLY_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * リプライID : リプライID
     * @param replyId The value of the column 'REPLY_ID'. (basically NotNull if update: for the constraint)
     */
    public void setReplyId(Long replyId) {
        registerModifiedProperty("replyId");
        _replyId = replyId;
    }

    /**
     * [get] REPLYEE_ID: {IX, NotNull, BIGINT(19), FK to USER} <br>
     * リプライした会員ID : リプライした会員ID
     * @return The value of the column 'REPLYEE_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getReplyeeId() {
        checkSpecifiedProperty("replyeeId");
        return _replyeeId;
    }

    /**
     * [set] REPLYEE_ID: {IX, NotNull, BIGINT(19), FK to USER} <br>
     * リプライした会員ID : リプライした会員ID
     * @param replyeeId The value of the column 'REPLYEE_ID'. (basically NotNull if update: for the constraint)
     */
    public void setReplyeeId(Long replyeeId) {
        registerModifiedProperty("replyeeId");
        _replyeeId = replyeeId;
    }

    /**
     * [get] REPLYER_ID: {IX, NotNull, BIGINT(19), FK to USER} <br>
     * リプライされた会員ID : リプライされた会員のID
     * @return The value of the column 'REPLYER_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getReplyerId() {
        checkSpecifiedProperty("replyerId");
        return _replyerId;
    }

    /**
     * [set] REPLYER_ID: {IX, NotNull, BIGINT(19), FK to USER} <br>
     * リプライされた会員ID : リプライされた会員のID
     * @param replyerId The value of the column 'REPLYER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setReplyerId(Long replyerId) {
        registerModifiedProperty("replyerId");
        _replyerId = replyerId;
    }

    /**
     * [get] REPLYEE_TWEET_ID: {IX, NotNull, BIGINT(19), FK to TWEET} <br>
     * リプライしたツイートID : リプライしたツイートのID
     * @return The value of the column 'REPLYEE_TWEET_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getReplyeeTweetId() {
        checkSpecifiedProperty("replyeeTweetId");
        return _replyeeTweetId;
    }

    /**
     * [set] REPLYEE_TWEET_ID: {IX, NotNull, BIGINT(19), FK to TWEET} <br>
     * リプライしたツイートID : リプライしたツイートのID
     * @param replyeeTweetId The value of the column 'REPLYEE_TWEET_ID'. (basically NotNull if update: for the constraint)
     */
    public void setReplyeeTweetId(Long replyeeTweetId) {
        registerModifiedProperty("replyeeTweetId");
        _replyeeTweetId = replyeeTweetId;
    }

    /**
     * [get] REPLYER_TWEET_ID: {IX, NotNull, BIGINT(19), FK to TWEET} <br>
     * リプライされたツイートID : リプライされたツイートのID
     * @return The value of the column 'REPLYER_TWEET_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getReplyerTweetId() {
        checkSpecifiedProperty("replyerTweetId");
        return _replyerTweetId;
    }

    /**
     * [set] REPLYER_TWEET_ID: {IX, NotNull, BIGINT(19), FK to TWEET} <br>
     * リプライされたツイートID : リプライされたツイートのID
     * @param replyerTweetId The value of the column 'REPLYER_TWEET_ID'. (basically NotNull if update: for the constraint)
     */
    public void setReplyerTweetId(Long replyerTweetId) {
        registerModifiedProperty("replyerTweetId");
        _replyerTweetId = replyerTweetId;
    }

    /**
     * [get] DEL_FLG: {NotNull, BIT} <br>
     * 削除フラグ : 削除フラグ<br>
     * 物理削除は怖いので論理削除を想定
     * @return The value of the column 'DEL_FLG'. (basically NotNull if selected: for the constraint)
     */
    public Boolean getDelFlg() {
        checkSpecifiedProperty("delFlg");
        return _delFlg;
    }

    /**
     * [set] DEL_FLG: {NotNull, BIT} <br>
     * 削除フラグ : 削除フラグ<br>
     * 物理削除は怖いので論理削除を想定
     * @param delFlg The value of the column 'DEL_FLG'. (basically NotNull if update: for the constraint)
     */
    public void setDelFlg(Boolean delFlg) {
        registerModifiedProperty("delFlg");
        _delFlg = delFlg;
    }

    /**
     * [get] REGISTER_DATETIME: {NotNull, DATETIME(19)} <br>
     * 登録日時 : リプライした日時
     * @return The value of the column 'REGISTER_DATETIME'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDateTime getRegisterDatetime() {
        checkSpecifiedProperty("registerDatetime");
        return _registerDatetime;
    }

    /**
     * [set] REGISTER_DATETIME: {NotNull, DATETIME(19)} <br>
     * 登録日時 : リプライした日時
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
