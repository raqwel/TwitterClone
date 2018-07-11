package demo.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import demo.dbflute.exbhv.*;
import demo.dbflute.exentity.*;
import demo.dbflute.cbean.*;

/**
 * The referrer loader of USER as TABLE. <br>
 * <pre>
 * [primary key]
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
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfUser {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<User> _selectedList;
    protected BehaviorSelector _selector;
    protected UserBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfUser ready(List<User> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected UserBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(UserBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<Favolite> _referrerFavolite;

    /**
     * Load referrer of favoliteList by the set-upper of referrer. <br>
     * FAVOLITE by USER_ID, named 'favoliteList'.
     * <pre>
     * <span style="color: #0000C0">userBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">userList</span>, <span style="color: #553000">userLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">userLoader</span>.<span style="color: #CC4747">loadFavolite</span>(<span style="color: #553000">favoliteCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">favoliteCB</span>.setupSelect...
     *         <span style="color: #553000">favoliteCB</span>.query().set...
     *         <span style="color: #553000">favoliteCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">favoliteLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    favoliteLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (User user : <span style="color: #553000">userList</span>) {
     *     ... = user.<span style="color: #CC4747">getFavoliteList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setUserId_InScope(pkList);
     * cb.query().addOrderBy_UserId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfFavolite> loadFavolite(ReferrerConditionSetupper<FavoliteCB> refCBLambda) {
        myBhv().loadFavolite(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerFavolite = refLs);
        return hd -> hd.handle(new LoaderOfFavolite().ready(_referrerFavolite, _selector));
    }

    protected List<Follow> _referrerFollowByFolloweeId;

    /**
     * Load referrer of followByFolloweeIdList by the set-upper of referrer. <br>
     * FOLLOW by FOLLOWEE_ID, named 'followByFolloweeIdList'.
     * <pre>
     * <span style="color: #0000C0">userBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">userList</span>, <span style="color: #553000">userLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">userLoader</span>.<span style="color: #CC4747">loadFollowByFolloweeId</span>(<span style="color: #553000">followCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">followCB</span>.setupSelect...
     *         <span style="color: #553000">followCB</span>.query().set...
     *         <span style="color: #553000">followCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">followLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    followLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (User user : <span style="color: #553000">userList</span>) {
     *     ... = user.<span style="color: #CC4747">getFollowByFolloweeIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setFolloweeId_InScope(pkList);
     * cb.query().addOrderBy_FolloweeId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfFollow> loadFollowByFolloweeId(ReferrerConditionSetupper<FollowCB> refCBLambda) {
        myBhv().loadFollowByFolloweeId(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerFollowByFolloweeId = refLs);
        return hd -> hd.handle(new LoaderOfFollow().ready(_referrerFollowByFolloweeId, _selector));
    }

    protected List<Follow> _referrerFollowByFollowerId;

    /**
     * Load referrer of followByFollowerIdList by the set-upper of referrer. <br>
     * FOLLOW by FOLLOWER_ID, named 'followByFollowerIdList'.
     * <pre>
     * <span style="color: #0000C0">userBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">userList</span>, <span style="color: #553000">userLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">userLoader</span>.<span style="color: #CC4747">loadFollowByFollowerId</span>(<span style="color: #553000">followCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">followCB</span>.setupSelect...
     *         <span style="color: #553000">followCB</span>.query().set...
     *         <span style="color: #553000">followCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">followLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    followLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (User user : <span style="color: #553000">userList</span>) {
     *     ... = user.<span style="color: #CC4747">getFollowByFollowerIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setFollowerId_InScope(pkList);
     * cb.query().addOrderBy_FollowerId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfFollow> loadFollowByFollowerId(ReferrerConditionSetupper<FollowCB> refCBLambda) {
        myBhv().loadFollowByFollowerId(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerFollowByFollowerId = refLs);
        return hd -> hd.handle(new LoaderOfFollow().ready(_referrerFollowByFollowerId, _selector));
    }

    protected List<Reply> _referrerReplyByReplyeeId;

    /**
     * Load referrer of replyByReplyeeIdList by the set-upper of referrer. <br>
     * REPLY by REPLYEE_ID, named 'replyByReplyeeIdList'.
     * <pre>
     * <span style="color: #0000C0">userBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">userList</span>, <span style="color: #553000">userLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">userLoader</span>.<span style="color: #CC4747">loadReplyByReplyeeId</span>(<span style="color: #553000">replyCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">replyCB</span>.setupSelect...
     *         <span style="color: #553000">replyCB</span>.query().set...
     *         <span style="color: #553000">replyCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">replyLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    replyLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (User user : <span style="color: #553000">userList</span>) {
     *     ... = user.<span style="color: #CC4747">getReplyByReplyeeIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setReplyeeId_InScope(pkList);
     * cb.query().addOrderBy_ReplyeeId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfReply> loadReplyByReplyeeId(ReferrerConditionSetupper<ReplyCB> refCBLambda) {
        myBhv().loadReplyByReplyeeId(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerReplyByReplyeeId = refLs);
        return hd -> hd.handle(new LoaderOfReply().ready(_referrerReplyByReplyeeId, _selector));
    }

    protected List<Reply> _referrerReplyByReplyerId;

    /**
     * Load referrer of replyByReplyerIdList by the set-upper of referrer. <br>
     * REPLY by REPLYER_ID, named 'replyByReplyerIdList'.
     * <pre>
     * <span style="color: #0000C0">userBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">userList</span>, <span style="color: #553000">userLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">userLoader</span>.<span style="color: #CC4747">loadReplyByReplyerId</span>(<span style="color: #553000">replyCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">replyCB</span>.setupSelect...
     *         <span style="color: #553000">replyCB</span>.query().set...
     *         <span style="color: #553000">replyCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">replyLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    replyLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (User user : <span style="color: #553000">userList</span>) {
     *     ... = user.<span style="color: #CC4747">getReplyByReplyerIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setReplyerId_InScope(pkList);
     * cb.query().addOrderBy_ReplyerId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfReply> loadReplyByReplyerId(ReferrerConditionSetupper<ReplyCB> refCBLambda) {
        myBhv().loadReplyByReplyerId(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerReplyByReplyerId = refLs);
        return hd -> hd.handle(new LoaderOfReply().ready(_referrerReplyByReplyerId, _selector));
    }

    protected List<Retweet> _referrerRetweet;

    /**
     * Load referrer of retweetList by the set-upper of referrer. <br>
     * RETWEET by USER_ID, named 'retweetList'.
     * <pre>
     * <span style="color: #0000C0">userBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">userList</span>, <span style="color: #553000">userLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">userLoader</span>.<span style="color: #CC4747">loadRetweet</span>(<span style="color: #553000">retweetCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">retweetCB</span>.setupSelect...
     *         <span style="color: #553000">retweetCB</span>.query().set...
     *         <span style="color: #553000">retweetCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">retweetLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    retweetLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (User user : <span style="color: #553000">userList</span>) {
     *     ... = user.<span style="color: #CC4747">getRetweetList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setUserId_InScope(pkList);
     * cb.query().addOrderBy_UserId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfRetweet> loadRetweet(ReferrerConditionSetupper<RetweetCB> refCBLambda) {
        myBhv().loadRetweet(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerRetweet = refLs);
        return hd -> hd.handle(new LoaderOfRetweet().ready(_referrerRetweet, _selector));
    }

    protected List<Tweet> _referrerTweet;

    /**
     * Load referrer of tweetList by the set-upper of referrer. <br>
     * TWEET by USER_ID, named 'tweetList'.
     * <pre>
     * <span style="color: #0000C0">userBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">userList</span>, <span style="color: #553000">userLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">userLoader</span>.<span style="color: #CC4747">loadTweet</span>(<span style="color: #553000">tweetCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">tweetCB</span>.setupSelect...
     *         <span style="color: #553000">tweetCB</span>.query().set...
     *         <span style="color: #553000">tweetCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">tweetLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    tweetLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (User user : <span style="color: #553000">userList</span>) {
     *     ... = user.<span style="color: #CC4747">getTweetList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setUserId_InScope(pkList);
     * cb.query().addOrderBy_UserId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTweet> loadTweet(ReferrerConditionSetupper<TweetCB> refCBLambda) {
        myBhv().loadTweet(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTweet = refLs);
        return hd -> hd.handle(new LoaderOfTweet().ready(_referrerTweet, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<User> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
