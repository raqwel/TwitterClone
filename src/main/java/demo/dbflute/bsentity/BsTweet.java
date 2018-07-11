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
 * The entity of TWEET as TABLE. <br>
 * ツイート
 * <pre>
 * [primary-key]
 *     TWEET_ID
 *
 * [column]
 *     TWEET_ID, USER_ID, TWEET, DEL_FLG, REGISTER_DATETIME, UPDATE_DATETIME
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TWEET_ID
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     USER
 *
 * [referrer table]
 *     FAVOLITE, REPLY, RETWEET
 *
 * [foreign property]
 *     user
 *
 * [referrer property]
 *     favoliteList, replyByReplyeeTweetIdList, replyByReplyerTweetIdList, retweetList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long tweetId = entity.getTweetId();
 * Long userId = entity.getUserId();
 * String tweet = entity.getTweet();
 * Boolean delFlg = entity.getDelFlg();
 * java.time.LocalDateTime registerDatetime = entity.getRegisterDatetime();
 * java.time.LocalDateTime updateDatetime = entity.getUpdateDatetime();
 * entity.setTweetId(tweetId);
 * entity.setUserId(userId);
 * entity.setTweet(tweet);
 * entity.setDelFlg(delFlg);
 * entity.setRegisterDatetime(registerDatetime);
 * entity.setUpdateDatetime(updateDatetime);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsTweet extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** TWEET_ID: {PK, ID, NotNull, BIGINT(19)} */
    protected Long _tweetId;

    /** USER_ID: {IX, NotNull, BIGINT(19), FK to USER} */
    protected Long _userId;

    /** TWEET: {NotNull, VARCHAR(140)} */
    protected String _tweet;

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
        return "TWEET";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_tweetId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
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
    /** FAVOLITE by TWEET_ID, named 'favoliteList'. */
    protected List<Favolite> _favoliteList;

    /**
     * [get] FAVOLITE by TWEET_ID, named 'favoliteList'.
     * @return The entity list of referrer property 'favoliteList'. (NotNull: even if no loading, returns empty list)
     */
    public List<Favolite> getFavoliteList() {
        if (_favoliteList == null) { _favoliteList = newReferrerList(); }
        return _favoliteList;
    }

    /**
     * [set] FAVOLITE by TWEET_ID, named 'favoliteList'.
     * @param favoliteList The entity list of referrer property 'favoliteList'. (NullAllowed)
     */
    public void setFavoliteList(List<Favolite> favoliteList) {
        _favoliteList = favoliteList;
    }

    /** REPLY by REPLYEE_TWEET_ID, named 'replyByReplyeeTweetIdList'. */
    protected List<Reply> _replyByReplyeeTweetIdList;

    /**
     * [get] REPLY by REPLYEE_TWEET_ID, named 'replyByReplyeeTweetIdList'.
     * @return The entity list of referrer property 'replyByReplyeeTweetIdList'. (NotNull: even if no loading, returns empty list)
     */
    public List<Reply> getReplyByReplyeeTweetIdList() {
        if (_replyByReplyeeTweetIdList == null) { _replyByReplyeeTweetIdList = newReferrerList(); }
        return _replyByReplyeeTweetIdList;
    }

    /**
     * [set] REPLY by REPLYEE_TWEET_ID, named 'replyByReplyeeTweetIdList'.
     * @param replyByReplyeeTweetIdList The entity list of referrer property 'replyByReplyeeTweetIdList'. (NullAllowed)
     */
    public void setReplyByReplyeeTweetIdList(List<Reply> replyByReplyeeTweetIdList) {
        _replyByReplyeeTweetIdList = replyByReplyeeTweetIdList;
    }

    /** REPLY by REPLYER_TWEET_ID, named 'replyByReplyerTweetIdList'. */
    protected List<Reply> _replyByReplyerTweetIdList;

    /**
     * [get] REPLY by REPLYER_TWEET_ID, named 'replyByReplyerTweetIdList'.
     * @return The entity list of referrer property 'replyByReplyerTweetIdList'. (NotNull: even if no loading, returns empty list)
     */
    public List<Reply> getReplyByReplyerTweetIdList() {
        if (_replyByReplyerTweetIdList == null) { _replyByReplyerTweetIdList = newReferrerList(); }
        return _replyByReplyerTweetIdList;
    }

    /**
     * [set] REPLY by REPLYER_TWEET_ID, named 'replyByReplyerTweetIdList'.
     * @param replyByReplyerTweetIdList The entity list of referrer property 'replyByReplyerTweetIdList'. (NullAllowed)
     */
    public void setReplyByReplyerTweetIdList(List<Reply> replyByReplyerTweetIdList) {
        _replyByReplyerTweetIdList = replyByReplyerTweetIdList;
    }

    /** RETWEET by TWEET_ID, named 'retweetList'. */
    protected List<Retweet> _retweetList;

    /**
     * [get] RETWEET by TWEET_ID, named 'retweetList'.
     * @return The entity list of referrer property 'retweetList'. (NotNull: even if no loading, returns empty list)
     */
    public List<Retweet> getRetweetList() {
        if (_retweetList == null) { _retweetList = newReferrerList(); }
        return _retweetList;
    }

    /**
     * [set] RETWEET by TWEET_ID, named 'retweetList'.
     * @param retweetList The entity list of referrer property 'retweetList'. (NullAllowed)
     */
    public void setRetweetList(List<Retweet> retweetList) {
        _retweetList = retweetList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsTweet) {
            BsTweet other = (BsTweet)obj;
            if (!xSV(_tweetId, other._tweetId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _tweetId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_user != null && _user.isPresent())
        { sb.append(li).append(xbRDS(_user, "user")); }
        if (_favoliteList != null) { for (Favolite et : _favoliteList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "favoliteList")); } } }
        if (_replyByReplyeeTweetIdList != null) { for (Reply et : _replyByReplyeeTweetIdList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "replyByReplyeeTweetIdList")); } } }
        if (_replyByReplyerTweetIdList != null) { for (Reply et : _replyByReplyerTweetIdList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "replyByReplyerTweetIdList")); } } }
        if (_retweetList != null) { for (Retweet et : _retweetList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "retweetList")); } } }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_tweetId));
        sb.append(dm).append(xfND(_userId));
        sb.append(dm).append(xfND(_tweet));
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
        if (_user != null && _user.isPresent())
        { sb.append(dm).append("user"); }
        if (_favoliteList != null && !_favoliteList.isEmpty())
        { sb.append(dm).append("favoliteList"); }
        if (_replyByReplyeeTweetIdList != null && !_replyByReplyeeTweetIdList.isEmpty())
        { sb.append(dm).append("replyByReplyeeTweetIdList"); }
        if (_replyByReplyerTweetIdList != null && !_replyByReplyerTweetIdList.isEmpty())
        { sb.append(dm).append("replyByReplyerTweetIdList"); }
        if (_retweetList != null && !_retweetList.isEmpty())
        { sb.append(dm).append("retweetList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public Tweet clone() {
        return (Tweet)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] TWEET_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * ツイートID : ツイートID
     * @return The value of the column 'TWEET_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getTweetId() {
        checkSpecifiedProperty("tweetId");
        return _tweetId;
    }

    /**
     * [set] TWEET_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * ツイートID : ツイートID
     * @param tweetId The value of the column 'TWEET_ID'. (basically NotNull if update: for the constraint)
     */
    public void setTweetId(Long tweetId) {
        registerModifiedProperty("tweetId");
        _tweetId = tweetId;
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
     * [get] TWEET: {NotNull, VARCHAR(140)} <br>
     * ツイート : ツイート<br>
     * 140文字制限されているので最大長140に設定
     * @return The value of the column 'TWEET'. (basically NotNull if selected: for the constraint)
     */
    public String getTweet() {
        checkSpecifiedProperty("tweet");
        return _tweet;
    }

    /**
     * [set] TWEET: {NotNull, VARCHAR(140)} <br>
     * ツイート : ツイート<br>
     * 140文字制限されているので最大長140に設定
     * @param tweet The value of the column 'TWEET'. (basically NotNull if update: for the constraint)
     */
    public void setTweet(String tweet) {
        registerModifiedProperty("tweet");
        _tweet = tweet;
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
     * 登録日時 : ツイートした時間
     * @return The value of the column 'REGISTER_DATETIME'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDateTime getRegisterDatetime() {
        checkSpecifiedProperty("registerDatetime");
        return _registerDatetime;
    }

    /**
     * [set] REGISTER_DATETIME: {NotNull, DATETIME(19)} <br>
     * 登録日時 : ツイートした時間
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
