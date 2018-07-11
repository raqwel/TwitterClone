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
 * The entity of FAVOLITE as TABLE. <br>
 * お気に入り
 * <pre>
 * [primary-key]
 *     FAVOLITE_ID
 *
 * [column]
 *     FAVOLITE_ID, USER_ID, TWEET_ID, DEL_FLG, REGISTER_DATETIME, UPDATE_DATETIME
 *
 * [sequence]
 *     
 *
 * [identity]
 *     FAVOLITE_ID
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     TWEET, USER
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     tweet, user
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long favoliteId = entity.getFavoliteId();
 * Long userId = entity.getUserId();
 * Long tweetId = entity.getTweetId();
 * Boolean delFlg = entity.getDelFlg();
 * java.time.LocalDateTime registerDatetime = entity.getRegisterDatetime();
 * java.time.LocalDateTime updateDatetime = entity.getUpdateDatetime();
 * entity.setFavoliteId(favoliteId);
 * entity.setUserId(userId);
 * entity.setTweetId(tweetId);
 * entity.setDelFlg(delFlg);
 * entity.setRegisterDatetime(registerDatetime);
 * entity.setUpdateDatetime(updateDatetime);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsFavolite extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** FAVOLITE_ID: {PK, ID, NotNull, BIGINT(19)} */
    protected Long _favoliteId;

    /** USER_ID: {IX, NotNull, BIGINT(19), FK to USER} */
    protected Long _userId;

    /** TWEET_ID: {IX, NotNull, BIGINT(19), FK to TWEET} */
    protected Long _tweetId;

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
        return "FAVOLITE";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_favoliteId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** TWEET by my TWEET_ID, named 'tweet'. */
    protected OptionalEntity<Tweet> _tweet;

    /**
     * [get] TWEET by my TWEET_ID, named 'tweet'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'tweet'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<Tweet> getTweet() {
        if (_tweet == null) { _tweet = OptionalEntity.relationEmpty(this, "tweet"); }
        return _tweet;
    }

    /**
     * [set] TWEET by my TWEET_ID, named 'tweet'.
     * @param tweet The entity of foreign property 'tweet'. (NullAllowed)
     */
    public void setTweet(OptionalEntity<Tweet> tweet) {
        _tweet = tweet;
    }

    /** USER by my USER_ID, named 'user'. */
    protected OptionalEntity<User> _user;

    /**
     * [get] USER by my USER_ID, named 'user'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'user'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<User> getUser() {
        if (_user == null) { _user = OptionalEntity.relationEmpty(this, "user"); }
        return _user;
    }

    /**
     * [set] USER by my USER_ID, named 'user'.
     * @param user The entity of foreign property 'user'. (NullAllowed)
     */
    public void setUser(OptionalEntity<User> user) {
        _user = user;
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
        if (obj instanceof BsFavolite) {
            BsFavolite other = (BsFavolite)obj;
            if (!xSV(_favoliteId, other._favoliteId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _favoliteId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_tweet != null && _tweet.isPresent())
        { sb.append(li).append(xbRDS(_tweet, "tweet")); }
        if (_user != null && _user.isPresent())
        { sb.append(li).append(xbRDS(_user, "user")); }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_favoliteId));
        sb.append(dm).append(xfND(_userId));
        sb.append(dm).append(xfND(_tweetId));
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
        if (_tweet != null && _tweet.isPresent())
        { sb.append(dm).append("tweet"); }
        if (_user != null && _user.isPresent())
        { sb.append(dm).append("user"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public Favolite clone() {
        return (Favolite)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] FAVOLITE_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * お気に入りID : お気に入りID
     * @return The value of the column 'FAVOLITE_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getFavoliteId() {
        checkSpecifiedProperty("favoliteId");
        return _favoliteId;
    }

    /**
     * [set] FAVOLITE_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * お気に入りID : お気に入りID
     * @param favoliteId The value of the column 'FAVOLITE_ID'. (basically NotNull if update: for the constraint)
     */
    public void setFavoliteId(Long favoliteId) {
        registerModifiedProperty("favoliteId");
        _favoliteId = favoliteId;
    }

    /**
     * [get] USER_ID: {IX, NotNull, BIGINT(19), FK to USER} <br>
     * 会員ID : 会員ID
     * @return The value of the column 'USER_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getUserId() {
        checkSpecifiedProperty("userId");
        return _userId;
    }

    /**
     * [set] USER_ID: {IX, NotNull, BIGINT(19), FK to USER} <br>
     * 会員ID : 会員ID
     * @param userId The value of the column 'USER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setUserId(Long userId) {
        registerModifiedProperty("userId");
        _userId = userId;
    }

    /**
     * [get] TWEET_ID: {IX, NotNull, BIGINT(19), FK to TWEET} <br>
     * ツイートID : お気に入りしたツイートID
     * @return The value of the column 'TWEET_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getTweetId() {
        checkSpecifiedProperty("tweetId");
        return _tweetId;
    }

    /**
     * [set] TWEET_ID: {IX, NotNull, BIGINT(19), FK to TWEET} <br>
     * ツイートID : お気に入りしたツイートID
     * @param tweetId The value of the column 'TWEET_ID'. (basically NotNull if update: for the constraint)
     */
    public void setTweetId(Long tweetId) {
        registerModifiedProperty("tweetId");
        _tweetId = tweetId;
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
     * 登録日時 : お気に入りした時間
     * @return The value of the column 'REGISTER_DATETIME'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDateTime getRegisterDatetime() {
        checkSpecifiedProperty("registerDatetime");
        return _registerDatetime;
    }

    /**
     * [set] REGISTER_DATETIME: {NotNull, DATETIME(19)} <br>
     * 登録日時 : お気に入りした時間
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
