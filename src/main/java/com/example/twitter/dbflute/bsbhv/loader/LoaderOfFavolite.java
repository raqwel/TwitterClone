package com.example.twitter.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.example.twitter.dbflute.exbhv.*;
import com.example.twitter.dbflute.exentity.*;

/**
 * The referrer loader of FAVOLITE as TABLE. <br>
 * <pre>
 * [primary key]
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
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfFavolite {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<Favolite> _selectedList;
    protected BehaviorSelector _selector;
    protected FavoliteBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfFavolite ready(List<Favolite> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected FavoliteBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(FavoliteBhv.class); return _myBhv; } }

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
    public List<Favolite> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
