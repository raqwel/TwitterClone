package com.example.twitter.dbflute.cbean.nss;

import com.example.twitter.dbflute.cbean.cq.ReplyCQ;

/**
 * The nest select set-upper of REPLY.
 * @author DBFlute(AutoGenerator)
 */
public class ReplyNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final ReplyCQ _query;
    public ReplyNss(ReplyCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * USER by my REPLYEE_ID, named 'userByReplyeeId'.
     */
    public void withUserByReplyeeId() {
        _query.xdoNss(() -> _query.queryUserByReplyeeId());
    }
    /**
     * With nested relation columns to select clause. <br>
     * TWEET by my REPLYEE_TWEET_ID, named 'tweetByReplyeeTweetId'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public TweetNss withTweetByReplyeeTweetId() {
        _query.xdoNss(() -> _query.queryTweetByReplyeeTweetId());
        return new TweetNss(_query.queryTweetByReplyeeTweetId());
    }
    /**
     * With nested relation columns to select clause. <br>
     * USER by my REPLYER_ID, named 'userByReplyerId'.
     */
    public void withUserByReplyerId() {
        _query.xdoNss(() -> _query.queryUserByReplyerId());
    }
    /**
     * With nested relation columns to select clause. <br>
     * TWEET by my REPLYER_TWEET_ID, named 'tweetByReplyerTweetId'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public TweetNss withTweetByReplyerTweetId() {
        _query.xdoNss(() -> _query.queryTweetByReplyerTweetId());
        return new TweetNss(_query.queryTweetByReplyerTweetId());
    }
}
