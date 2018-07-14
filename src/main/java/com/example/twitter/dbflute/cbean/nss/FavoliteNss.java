package com.example.twitter.dbflute.cbean.nss;

import com.example.twitter.dbflute.cbean.cq.FavoliteCQ;

/**
 * The nest select set-upper of FAVOLITE.
 * @author DBFlute(AutoGenerator)
 */
public class FavoliteNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final FavoliteCQ _query;
    public FavoliteNss(FavoliteCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * TWEET by my TWEET_ID, named 'tweet'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public TweetNss withTweet() {
        _query.xdoNss(() -> _query.queryTweet());
        return new TweetNss(_query.queryTweet());
    }
    /**
     * With nested relation columns to select clause. <br>
     * USER by my USER_ID, named 'user'.
     */
    public void withUser() {
        _query.xdoNss(() -> _query.queryUser());
    }
}
