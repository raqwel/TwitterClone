package demo.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import demo.dbflute.exbhv.*;
import demo.dbflute.exentity.*;

/**
 * The referrer loader of FOLLOW as TABLE. <br>
 * <pre>
 * [primary key]
 *     FOLLOW_ID
 *
 * [column]
 *     FOLLOW_ID, FOLLOWEE_ID, FOLLOWER_ID, DEL_FLG, REGISTER_DATETIME, UPDATE_DATETIME
 *
 * [sequence]
 *     
 *
 * [identity]
 *     FOLLOW_ID
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     USER
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     userByFolloweeId, userByFollowerId
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfFollow {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<Follow> _selectedList;
    protected BehaviorSelector _selector;
    protected FollowBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfFollow ready(List<Follow> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected FollowBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(FollowBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfUser _foreignUserByFolloweeIdLoader;
    public LoaderOfUser pulloutUserByFolloweeId() {
        if (_foreignUserByFolloweeIdLoader == null)
        { _foreignUserByFolloweeIdLoader = new LoaderOfUser().ready(myBhv().pulloutUserByFolloweeId(_selectedList), _selector); }
        return _foreignUserByFolloweeIdLoader;
    }

    protected LoaderOfUser _foreignUserByFollowerIdLoader;
    public LoaderOfUser pulloutUserByFollowerId() {
        if (_foreignUserByFollowerIdLoader == null)
        { _foreignUserByFollowerIdLoader = new LoaderOfUser().ready(myBhv().pulloutUserByFollowerId(_selectedList), _selector); }
        return _foreignUserByFollowerIdLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<Follow> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
