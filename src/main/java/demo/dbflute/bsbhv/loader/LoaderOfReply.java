package demo.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import demo.dbflute.exbhv.*;
import demo.dbflute.exentity.*;

/**
 * The referrer loader of REPLY as TABLE. <br>
 * <pre>
 * [primary key]
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
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfReply {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<Reply> _selectedList;
    protected BehaviorSelector _selector;
    protected ReplyBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfReply ready(List<Reply> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected ReplyBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(ReplyBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfUser _foreignUserByReplyeeIdLoader;
    public LoaderOfUser pulloutUserByReplyeeId() {
        if (_foreignUserByReplyeeIdLoader == null)
        { _foreignUserByReplyeeIdLoader = new LoaderOfUser().ready(myBhv().pulloutUserByReplyeeId(_selectedList), _selector); }
        return _foreignUserByReplyeeIdLoader;
    }

    protected LoaderOfTweet _foreignTweetByReplyeeTweetIdLoader;
    public LoaderOfTweet pulloutTweetByReplyeeTweetId() {
        if (_foreignTweetByReplyeeTweetIdLoader == null)
        { _foreignTweetByReplyeeTweetIdLoader = new LoaderOfTweet().ready(myBhv().pulloutTweetByReplyeeTweetId(_selectedList), _selector); }
        return _foreignTweetByReplyeeTweetIdLoader;
    }

    protected LoaderOfUser _foreignUserByReplyerIdLoader;
    public LoaderOfUser pulloutUserByReplyerId() {
        if (_foreignUserByReplyerIdLoader == null)
        { _foreignUserByReplyerIdLoader = new LoaderOfUser().ready(myBhv().pulloutUserByReplyerId(_selectedList), _selector); }
        return _foreignUserByReplyerIdLoader;
    }

    protected LoaderOfTweet _foreignTweetByReplyerTweetIdLoader;
    public LoaderOfTweet pulloutTweetByReplyerTweetId() {
        if (_foreignTweetByReplyerTweetIdLoader == null)
        { _foreignTweetByReplyerTweetIdLoader = new LoaderOfTweet().ready(myBhv().pulloutTweetByReplyerTweetId(_selectedList), _selector); }
        return _foreignTweetByReplyerTweetIdLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<Reply> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
