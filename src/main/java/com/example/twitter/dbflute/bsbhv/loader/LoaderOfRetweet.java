package com.example.twitter.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.example.twitter.dbflute.exbhv.*;
import com.example.twitter.dbflute.exentity.*;

/**
 * The referrer loader of RETWEET as TABLE. <br>
 * <pre>
 * [primary key]
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
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfRetweet {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<Retweet> _selectedList;
    protected BehaviorSelector _selector;
    protected RetweetBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfRetweet ready(List<Retweet> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected RetweetBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(RetweetBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfTweet _foreignTweetLoader;
    public LoaderOfTweet pulloutTweet() {
        if (_foreignTweetLoader == null)
        { _foreignTweetLoader = new LoaderOfTweet().ready(myBhv().pulloutTweet(_selectedList), _selector); }
        return _foreignTweetLoader;
    }

    protected LoaderOfUser _foreignUserLoader;
    public LoaderOfUser pulloutUser() {
        if (_foreignUserLoader == null)
        { _foreignUserLoader = new LoaderOfUser().ready(myBhv().pulloutUser(_selectedList), _selector); }
        return _foreignUserLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<Retweet> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
