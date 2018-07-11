package demo.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import demo.dbflute.exbhv.*;
import demo.dbflute.exentity.*;
import demo.dbflute.cbean.*;

/**
 * The referrer loader of TWEET as TABLE. <br>
 * <pre>
 * [primary key]
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
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfTweet {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<Tweet> _selectedList;
    protected BehaviorSelector _selector;
    protected TweetBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTweet ready(List<Tweet> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TweetBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TweetBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<Favolite> _referrerFavolite;

    /**
     * Load referrer of favoliteList by the set-upper of referrer. <br>
     * FAVOLITE by TWEET_ID, named 'favoliteList'.
     * <pre>
     * <span style="color: #0000C0">tweetBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">tweetList</span>, <span style="color: #553000">tweetLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">tweetLoader</span>.<span style="color: #CC4747">loadFavolite</span>(<span style="color: #553000">favoliteCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">favoliteCB</span>.setupSelect...
     *         <span style="color: #553000">favoliteCB</span>.query().set...
     *         <span style="color: #553000">favoliteCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">favoliteLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    favoliteLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (Tweet tweet : <span style="color: #553000">tweetList</span>) {
     *     ... = tweet.<span style="color: #CC4747">getFavoliteList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setTweetId_InScope(pkList);
     * cb.query().addOrderBy_TweetId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfFavolite> loadFavolite(ReferrerConditionSetupper<FavoliteCB> refCBLambda) {
        myBhv().loadFavolite(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerFavolite = refLs);
        return hd -> hd.handle(new LoaderOfFavolite().ready(_referrerFavolite, _selector));
    }

    protected List<Reply> _referrerReplyByReplyeeTweetId;

    /**
     * Load referrer of replyByReplyeeTweetIdList by the set-upper of referrer. <br>
     * REPLY by REPLYEE_TWEET_ID, named 'replyByReplyeeTweetIdList'.
     * <pre>
     * <span style="color: #0000C0">tweetBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">tweetList</span>, <span style="color: #553000">tweetLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">tweetLoader</span>.<span style="color: #CC4747">loadReplyByReplyeeTweetId</span>(<span style="color: #553000">replyCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">replyCB</span>.setupSelect...
     *         <span style="color: #553000">replyCB</span>.query().set...
     *         <span style="color: #553000">replyCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">replyLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    replyLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (Tweet tweet : <span style="color: #553000">tweetList</span>) {
     *     ... = tweet.<span style="color: #CC4747">getReplyByReplyeeTweetIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setReplyeeTweetId_InScope(pkList);
     * cb.query().addOrderBy_ReplyeeTweetId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfReply> loadReplyByReplyeeTweetId(ReferrerConditionSetupper<ReplyCB> refCBLambda) {
        myBhv().loadReplyByReplyeeTweetId(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerReplyByReplyeeTweetId = refLs);
        return hd -> hd.handle(new LoaderOfReply().ready(_referrerReplyByReplyeeTweetId, _selector));
    }

    protected List<Reply> _referrerReplyByReplyerTweetId;

    /**
     * Load referrer of replyByReplyerTweetIdList by the set-upper of referrer. <br>
     * REPLY by REPLYER_TWEET_ID, named 'replyByReplyerTweetIdList'.
     * <pre>
     * <span style="color: #0000C0">tweetBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">tweetList</span>, <span style="color: #553000">tweetLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">tweetLoader</span>.<span style="color: #CC4747">loadReplyByReplyerTweetId</span>(<span style="color: #553000">replyCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">replyCB</span>.setupSelect...
     *         <span style="color: #553000">replyCB</span>.query().set...
     *         <span style="color: #553000">replyCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">replyLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    replyLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (Tweet tweet : <span style="color: #553000">tweetList</span>) {
     *     ... = tweet.<span style="color: #CC4747">getReplyByReplyerTweetIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setReplyerTweetId_InScope(pkList);
     * cb.query().addOrderBy_ReplyerTweetId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfReply> loadReplyByReplyerTweetId(ReferrerConditionSetupper<ReplyCB> refCBLambda) {
        myBhv().loadReplyByReplyerTweetId(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerReplyByReplyerTweetId = refLs);
        return hd -> hd.handle(new LoaderOfReply().ready(_referrerReplyByReplyerTweetId, _selector));
    }

    protected List<Retweet> _referrerRetweet;

    /**
     * Load referrer of retweetList by the set-upper of referrer. <br>
     * RETWEET by TWEET_ID, named 'retweetList'.
     * <pre>
     * <span style="color: #0000C0">tweetBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">tweetList</span>, <span style="color: #553000">tweetLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">tweetLoader</span>.<span style="color: #CC4747">loadRetweet</span>(<span style="color: #553000">retweetCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">retweetCB</span>.setupSelect...
     *         <span style="color: #553000">retweetCB</span>.query().set...
     *         <span style="color: #553000">retweetCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">retweetLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    retweetLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (Tweet tweet : <span style="color: #553000">tweetList</span>) {
     *     ... = tweet.<span style="color: #CC4747">getRetweetList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setTweetId_InScope(pkList);
     * cb.query().addOrderBy_TweetId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfRetweet> loadRetweet(ReferrerConditionSetupper<RetweetCB> refCBLambda) {
        myBhv().loadRetweet(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerRetweet = refLs);
        return hd -> hd.handle(new LoaderOfRetweet().ready(_referrerRetweet, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfUser _foreignUserLoader;
    public LoaderOfUser pulloutUser() {
        if (_foreignUserLoader == null)
        { _foreignUserLoader = new LoaderOfUser().ready(myBhv().pulloutUser(_selectedList), _selector); }
        return _foreignUserLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<Tweet> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
