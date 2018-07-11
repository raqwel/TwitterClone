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
 * The entity of RETWEET as TABLE. <br>
 * リツイート
 * <pre>
 * [primary-key]
 *     RETWEET_ID
 *
 * [column]
 *     RETWEET_ID, USER_ID, TWEET_ID, DEL_FLG, REGISTER_DATETIME, UPDATE_DATETIME
 *
 * [sequence]
 *     
 *
 * [identity]
 *     RETWEET_ID
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
 * Long retweetId = entity.getRetweetId();
 * Long userId = entity.getUserId();
 * Long tweetId = entity.getTweetId();
 * Boolean delFlg = entity.getDelFlg();
 * java.time.LocalDateTime registerDatetime = entity.getRegisterDatetime();
 * java.time.LocalDateTime updateDatetime = entity.getUpdateDatetime();
 * entity.setRetweetId(retweetId);
 * entity.setUserId(userId);
 * entity.setTweetId(tweetId);
 * entity.setDelFlg(delFlg);
 * entity.setRegisterDatetime(registerDatetime);
 * entity.setUpdateDatetime(updateDatetime);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsRetweet extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** RETWEET_ID: {PK, ID, NotNull, BIGINT(19)} */
    protected Long _retweetId;

    /** USER_ID: {UQ+, NotNull, BIGINT(19), FK to USER} */
    protected Long _userId;

    /** TWEET_ID: {+UQ, IX, NotNull, BIGINT(19), FK to TWEET} */
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
        return "RETWEET";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_retweetId == null) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param userId : UQ+, NotNull, BIGINT(19), FK to USER. (NotNull)
     * @param tweetId : +UQ, IX, NotNull, BIGINT(19), FK to TWEET. (NotNull)
     */
    public void uniqueBy(Long userId, Long tweetId) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("userId");
        __uniqueDrivenProperties.addPropertyName("tweetId");
        setUserId(userId);setTweetId(tweetId);
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
        if (obj instanceof BsRetweet) {
            BsRetweet other = (BsRetweet)obj;
            if (!xSV(_retweetId, other._retweetId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _retweetId);
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
        sb.append(dm).append(xfND(_retweetId));
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
    public Retweet clone() {
        return (Retweet)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] RETWEET_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * リツイートID : リツイートID
     * @return The value of the column 'RETWEET_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getRetweetId() {
        checkSpecifiedProperty("retweetId");
        return _retweetId;
    }

    /**
     * [set] RETWEET_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * リツイートID : リツイートID
     * @param retweetId The value of the column 'RETWEET_ID'. (basically NotNull if update: for the constraint)
     */
    public void setRetweetId(Long retweetId) {
        registerModifiedProperty("retweetId");
        _retweetId = retweetId;
    }

    /**
     * [get] USER_ID: {UQ+, NotNull, BIGINT(19), FK to USER} <br>
     * 会員ID : 会員ID<br>
     * リツイートする人の会員IDが入る
     * @return The value of the column 'USER_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getUserId() {
        checkSpecifiedProperty("userId");
        return _userId;
    }

    /**
     * [set] USER_ID: {UQ+, NotNull, BIGINT(19), FK to USER} <br>
     * 会員ID : 会員ID<br>
     * リツイートする人の会員IDが入る
     * @param userId The value of the column 'USER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setUserId(Long userId) {
        registerModifiedProperty("userId");
        _userId = userId;
    }

    /**
     * [get] TWEET_ID: {+UQ, IX, NotNull, BIGINT(19), FK to TWEET} <br>
     * ツイートID : ツイートID<br>
     * リツイートされるツイートIDが格納される
     * @return The value of the column 'TWEET_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getTweetId() {
        checkSpecifiedProperty("tweetId");
        return _tweetId;
    }

    /**
     * [set] TWEET_ID: {+UQ, IX, NotNull, BIGINT(19), FK to TWEET} <br>
     * ツイートID : ツイートID<br>
     * リツイートされるツイートIDが格納される
     * @param tweetId The value of the column 'TWEET_ID'. (basically NotNull if update: for the constraint)
     */
    public void setTweetId(Long tweetId) {
        registerModifiedProperty("tweetId");
        _tweetId = tweetId;
    }

    /**
     * [get] DEL_FLG: {NotNull, BIT} <br>
     * 削除フラグ : 削除フラグ<br>
     * リツイートしたかどうかを見る<br>
     * 一回リツイートして辞めてもう一回リツイートをするときにTにして表示できるようにする
     * @return The value of the column 'DEL_FLG'. (basically NotNull if selected: for the constraint)
     */
    public Boolean getDelFlg() {
        checkSpecifiedProperty("delFlg");
        return _delFlg;
    }

    /**
     * [set] DEL_FLG: {NotNull, BIT} <br>
     * 削除フラグ : 削除フラグ<br>
     * リツイートしたかどうかを見る<br>
     * 一回リツイートして辞めてもう一回リツイートをするときにTにして表示できるようにする
     * @param delFlg The value of the column 'DEL_FLG'. (basically NotNull if update: for the constraint)
     */
    public void setDelFlg(Boolean delFlg) {
        registerModifiedProperty("delFlg");
        _delFlg = delFlg;
    }

    /**
     * [get] REGISTER_DATETIME: {NotNull, DATETIME(19)} <br>
     * 登録日時 : 登録日時
     * @return The value of the column 'REGISTER_DATETIME'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDateTime getRegisterDatetime() {
        checkSpecifiedProperty("registerDatetime");
        return _registerDatetime;
    }

    /**
     * [set] REGISTER_DATETIME: {NotNull, DATETIME(19)} <br>
     * 登録日時 : 登録日時
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
