package com.example.twitter.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import com.example.twitter.dbflute.allcommon.EntityDefinedCommonColumn;
import com.example.twitter.dbflute.allcommon.DBMetaInstanceHandler;
import com.example.twitter.dbflute.exentity.*;

/**
 * The entity of USER as TABLE. <br>
 * 会員 : 会員テーブル
 * <pre>
 * [primary-key]
 *     USER_ID
 *
 * [column]
 *     USER_ID, USER_NAME, PASSWORD, MAIL_ADDRESS, BIRTH_DATE, PROFILE_SENTENCE, REGISTER_DATETIME, UPDATE_DATETIME
 *
 * [sequence]
 *     
 *
 * [identity]
 *     USER_ID
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     FAVOLITE, FOLLOW, REPLY, RETWEET, TWEET
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     favoliteList, followByFolloweeIdList, followByFollowerIdList, replyByReplyeeIdList, replyByReplyerIdList, retweetList, tweetList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long userId = entity.getUserId();
 * String userName = entity.getUserName();
 * String password = entity.getPassword();
 * String mailAddress = entity.getMailAddress();
 * java.time.LocalDate birthDate = entity.getBirthDate();
 * String profileSentence = entity.getProfileSentence();
 * java.time.LocalDateTime registerDatetime = entity.getRegisterDatetime();
 * java.time.LocalDateTime updateDatetime = entity.getUpdateDatetime();
 * entity.setUserId(userId);
 * entity.setUserName(userName);
 * entity.setPassword(password);
 * entity.setMailAddress(mailAddress);
 * entity.setBirthDate(birthDate);
 * entity.setProfileSentence(profileSentence);
 * entity.setRegisterDatetime(registerDatetime);
 * entity.setUpdateDatetime(updateDatetime);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsUser extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** USER_ID: {PK, ID, NotNull, BIGINT(19)} */
    protected Long _userId;

    /** USER_NAME: {NotNull, VARCHAR(64)} */
    protected String _userName;

    /** PASSWORD: {NotNull, VARCHAR(30)} */
    protected String _password;

    /** MAIL_ADDRESS: {UQ, VARCHAR(255)} */
    protected String _mailAddress;

    /** BIRTH_DATE: {DATE(10)} */
    protected java.time.LocalDate _birthDate;

    /** PROFILE_SENTENCE: {VARCHAR(200)} */
    protected String _profileSentence;

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
        return "USER";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_userId == null) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param mailAddress : UQ, VARCHAR(255). (NotNull)
     */
    public void uniqueBy(String mailAddress) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("mailAddress");
        setMailAddress(mailAddress);
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** FAVOLITE by USER_ID, named 'favoliteList'. */
    protected List<Favolite> _favoliteList;

    /**
     * [get] FAVOLITE by USER_ID, named 'favoliteList'.
     * @return The entity list of referrer property 'favoliteList'. (NotNull: even if no loading, returns empty list)
     */
    public List<Favolite> getFavoliteList() {
        if (_favoliteList == null) { _favoliteList = newReferrerList(); }
        return _favoliteList;
    }

    /**
     * [set] FAVOLITE by USER_ID, named 'favoliteList'.
     * @param favoliteList The entity list of referrer property 'favoliteList'. (NullAllowed)
     */
    public void setFavoliteList(List<Favolite> favoliteList) {
        _favoliteList = favoliteList;
    }

    /** FOLLOW by FOLLOWEE_ID, named 'followByFolloweeIdList'. */
    protected List<Follow> _followByFolloweeIdList;

    /**
     * [get] FOLLOW by FOLLOWEE_ID, named 'followByFolloweeIdList'.
     * @return The entity list of referrer property 'followByFolloweeIdList'. (NotNull: even if no loading, returns empty list)
     */
    public List<Follow> getFollowByFolloweeIdList() {
        if (_followByFolloweeIdList == null) { _followByFolloweeIdList = newReferrerList(); }
        return _followByFolloweeIdList;
    }

    /**
     * [set] FOLLOW by FOLLOWEE_ID, named 'followByFolloweeIdList'.
     * @param followByFolloweeIdList The entity list of referrer property 'followByFolloweeIdList'. (NullAllowed)
     */
    public void setFollowByFolloweeIdList(List<Follow> followByFolloweeIdList) {
        _followByFolloweeIdList = followByFolloweeIdList;
    }

    /** FOLLOW by FOLLOWER_ID, named 'followByFollowerIdList'. */
    protected List<Follow> _followByFollowerIdList;

    /**
     * [get] FOLLOW by FOLLOWER_ID, named 'followByFollowerIdList'.
     * @return The entity list of referrer property 'followByFollowerIdList'. (NotNull: even if no loading, returns empty list)
     */
    public List<Follow> getFollowByFollowerIdList() {
        if (_followByFollowerIdList == null) { _followByFollowerIdList = newReferrerList(); }
        return _followByFollowerIdList;
    }

    /**
     * [set] FOLLOW by FOLLOWER_ID, named 'followByFollowerIdList'.
     * @param followByFollowerIdList The entity list of referrer property 'followByFollowerIdList'. (NullAllowed)
     */
    public void setFollowByFollowerIdList(List<Follow> followByFollowerIdList) {
        _followByFollowerIdList = followByFollowerIdList;
    }

    /** REPLY by REPLYEE_ID, named 'replyByReplyeeIdList'. */
    protected List<Reply> _replyByReplyeeIdList;

    /**
     * [get] REPLY by REPLYEE_ID, named 'replyByReplyeeIdList'.
     * @return The entity list of referrer property 'replyByReplyeeIdList'. (NotNull: even if no loading, returns empty list)
     */
    public List<Reply> getReplyByReplyeeIdList() {
        if (_replyByReplyeeIdList == null) { _replyByReplyeeIdList = newReferrerList(); }
        return _replyByReplyeeIdList;
    }

    /**
     * [set] REPLY by REPLYEE_ID, named 'replyByReplyeeIdList'.
     * @param replyByReplyeeIdList The entity list of referrer property 'replyByReplyeeIdList'. (NullAllowed)
     */
    public void setReplyByReplyeeIdList(List<Reply> replyByReplyeeIdList) {
        _replyByReplyeeIdList = replyByReplyeeIdList;
    }

    /** REPLY by REPLYER_ID, named 'replyByReplyerIdList'. */
    protected List<Reply> _replyByReplyerIdList;

    /**
     * [get] REPLY by REPLYER_ID, named 'replyByReplyerIdList'.
     * @return The entity list of referrer property 'replyByReplyerIdList'. (NotNull: even if no loading, returns empty list)
     */
    public List<Reply> getReplyByReplyerIdList() {
        if (_replyByReplyerIdList == null) { _replyByReplyerIdList = newReferrerList(); }
        return _replyByReplyerIdList;
    }

    /**
     * [set] REPLY by REPLYER_ID, named 'replyByReplyerIdList'.
     * @param replyByReplyerIdList The entity list of referrer property 'replyByReplyerIdList'. (NullAllowed)
     */
    public void setReplyByReplyerIdList(List<Reply> replyByReplyerIdList) {
        _replyByReplyerIdList = replyByReplyerIdList;
    }

    /** RETWEET by USER_ID, named 'retweetList'. */
    protected List<Retweet> _retweetList;

    /**
     * [get] RETWEET by USER_ID, named 'retweetList'.
     * @return The entity list of referrer property 'retweetList'. (NotNull: even if no loading, returns empty list)
     */
    public List<Retweet> getRetweetList() {
        if (_retweetList == null) { _retweetList = newReferrerList(); }
        return _retweetList;
    }

    /**
     * [set] RETWEET by USER_ID, named 'retweetList'.
     * @param retweetList The entity list of referrer property 'retweetList'. (NullAllowed)
     */
    public void setRetweetList(List<Retweet> retweetList) {
        _retweetList = retweetList;
    }

    /** TWEET by USER_ID, named 'tweetList'. */
    protected List<Tweet> _tweetList;

    /**
     * [get] TWEET by USER_ID, named 'tweetList'.
     * @return The entity list of referrer property 'tweetList'. (NotNull: even if no loading, returns empty list)
     */
    public List<Tweet> getTweetList() {
        if (_tweetList == null) { _tweetList = newReferrerList(); }
        return _tweetList;
    }

    /**
     * [set] TWEET by USER_ID, named 'tweetList'.
     * @param tweetList The entity list of referrer property 'tweetList'. (NullAllowed)
     */
    public void setTweetList(List<Tweet> tweetList) {
        _tweetList = tweetList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsUser) {
            BsUser other = (BsUser)obj;
            if (!xSV(_userId, other._userId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _userId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_favoliteList != null) { for (Favolite et : _favoliteList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "favoliteList")); } } }
        if (_followByFolloweeIdList != null) { for (Follow et : _followByFolloweeIdList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "followByFolloweeIdList")); } } }
        if (_followByFollowerIdList != null) { for (Follow et : _followByFollowerIdList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "followByFollowerIdList")); } } }
        if (_replyByReplyeeIdList != null) { for (Reply et : _replyByReplyeeIdList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "replyByReplyeeIdList")); } } }
        if (_replyByReplyerIdList != null) { for (Reply et : _replyByReplyerIdList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "replyByReplyerIdList")); } } }
        if (_retweetList != null) { for (Retweet et : _retweetList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "retweetList")); } } }
        if (_tweetList != null) { for (Tweet et : _tweetList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tweetList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_userId));
        sb.append(dm).append(xfND(_userName));
        sb.append(dm).append(xfND(_password));
        sb.append(dm).append(xfND(_mailAddress));
        sb.append(dm).append(xfND(_birthDate));
        sb.append(dm).append(xfND(_profileSentence));
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
        if (_favoliteList != null && !_favoliteList.isEmpty())
        { sb.append(dm).append("favoliteList"); }
        if (_followByFolloweeIdList != null && !_followByFolloweeIdList.isEmpty())
        { sb.append(dm).append("followByFolloweeIdList"); }
        if (_followByFollowerIdList != null && !_followByFollowerIdList.isEmpty())
        { sb.append(dm).append("followByFollowerIdList"); }
        if (_replyByReplyeeIdList != null && !_replyByReplyeeIdList.isEmpty())
        { sb.append(dm).append("replyByReplyeeIdList"); }
        if (_replyByReplyerIdList != null && !_replyByReplyerIdList.isEmpty())
        { sb.append(dm).append("replyByReplyerIdList"); }
        if (_retweetList != null && !_retweetList.isEmpty())
        { sb.append(dm).append("retweetList"); }
        if (_tweetList != null && !_tweetList.isEmpty())
        { sb.append(dm).append("tweetList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public User clone() {
        return (User)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] USER_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 会員ID : 会員ID
     * @return The value of the column 'USER_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getUserId() {
        checkSpecifiedProperty("userId");
        return _userId;
    }

    /**
     * [set] USER_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 会員ID : 会員ID
     * @param userId The value of the column 'USER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setUserId(Long userId) {
        registerModifiedProperty("userId");
        _userId = userId;
    }

    /**
     * [get] USER_NAME: {NotNull, VARCHAR(64)} <br>
     * 会員名称 : 会員名称。<br>
     * このデータが名前として表示される。
     * @return The value of the column 'USER_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getUserName() {
        checkSpecifiedProperty("userName");
        return _userName;
    }

    /**
     * [set] USER_NAME: {NotNull, VARCHAR(64)} <br>
     * 会員名称 : 会員名称。<br>
     * このデータが名前として表示される。
     * @param userName The value of the column 'USER_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setUserName(String userName) {
        registerModifiedProperty("userName");
        _userName = userName;
    }

    /**
     * [get] PASSWORD: {NotNull, VARCHAR(30)} <br>
     * パスワード : パスワード
     * @return The value of the column 'PASSWORD'. (basically NotNull if selected: for the constraint)
     */
    public String getPassword() {
        checkSpecifiedProperty("password");
        return _password;
    }

    /**
     * [set] PASSWORD: {NotNull, VARCHAR(30)} <br>
     * パスワード : パスワード
     * @param password The value of the column 'PASSWORD'. (basically NotNull if update: for the constraint)
     */
    public void setPassword(String password) {
        registerModifiedProperty("password");
        _password = password;
    }

    /**
     * [get] MAIL_ADDRESS: {UQ, VARCHAR(255)} <br>
     * メールアドレス : メールアドレス
     * @return The value of the column 'MAIL_ADDRESS'. (NullAllowed even if selected: for no constraint)
     */
    public String getMailAddress() {
        checkSpecifiedProperty("mailAddress");
        return _mailAddress;
    }

    /**
     * [set] MAIL_ADDRESS: {UQ, VARCHAR(255)} <br>
     * メールアドレス : メールアドレス
     * @param mailAddress The value of the column 'MAIL_ADDRESS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMailAddress(String mailAddress) {
        registerModifiedProperty("mailAddress");
        _mailAddress = mailAddress;
    }

    /**
     * [get] BIRTH_DATE: {DATE(10)} <br>
     * 誕生日 : 誕生日<br>
     * 時間までは考慮しない<br>
     * 特に入力する必要もないのでNULLを許容する
     * @return The value of the column 'BIRTH_DATE'. (NullAllowed even if selected: for no constraint)
     */
    public java.time.LocalDate getBirthDate() {
        checkSpecifiedProperty("birthDate");
        return _birthDate;
    }

    /**
     * [set] BIRTH_DATE: {DATE(10)} <br>
     * 誕生日 : 誕生日<br>
     * 時間までは考慮しない<br>
     * 特に入力する必要もないのでNULLを許容する
     * @param birthDate The value of the column 'BIRTH_DATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBirthDate(java.time.LocalDate birthDate) {
        registerModifiedProperty("birthDate");
        _birthDate = birthDate;
    }

    /**
     * [get] PROFILE_SENTENCE: {VARCHAR(200)} <br>
     * プロフィール文 : プロフィール文<br>
     * 長いのも困るので300文字
     * @return The value of the column 'PROFILE_SENTENCE'. (NullAllowed even if selected: for no constraint)
     */
    public String getProfileSentence() {
        checkSpecifiedProperty("profileSentence");
        return _profileSentence;
    }

    /**
     * [set] PROFILE_SENTENCE: {VARCHAR(200)} <br>
     * プロフィール文 : プロフィール文<br>
     * 長いのも困るので300文字
     * @param profileSentence The value of the column 'PROFILE_SENTENCE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProfileSentence(String profileSentence) {
        registerModifiedProperty("profileSentence");
        _profileSentence = profileSentence;
    }

    /**
     * [get] REGISTER_DATETIME: {NotNull, DATETIME(19)} <br>
     * 登録日時 : 登録日時<br>
     * ユーザがサービスに登録した日時を格納する
     * @return The value of the column 'REGISTER_DATETIME'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDateTime getRegisterDatetime() {
        checkSpecifiedProperty("registerDatetime");
        return _registerDatetime;
    }

    /**
     * [set] REGISTER_DATETIME: {NotNull, DATETIME(19)} <br>
     * 登録日時 : 登録日時<br>
     * ユーザがサービスに登録した日時を格納する
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
