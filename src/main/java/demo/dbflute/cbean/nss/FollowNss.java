package demo.dbflute.cbean.nss;

import demo.dbflute.cbean.cq.FollowCQ;

/**
 * The nest select set-upper of FOLLOW.
 * @author DBFlute(AutoGenerator)
 */
public class FollowNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final FollowCQ _query;
    public FollowNss(FollowCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * USER by my FOLLOWEE_ID, named 'userByFolloweeId'.
     */
    public void withUserByFolloweeId() {
        _query.xdoNss(() -> _query.queryUserByFolloweeId());
    }
    /**
     * With nested relation columns to select clause. <br>
     * USER by my FOLLOWER_ID, named 'userByFollowerId'.
     */
    public void withUserByFollowerId() {
        _query.xdoNss(() -> _query.queryUserByFollowerId());
    }
}
