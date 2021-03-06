package demo.dbflute.bsbhv;

import java.util.List;

import org.dbflute.*;
import org.dbflute.bhv.*;
import org.dbflute.bhv.core.BehaviorCommandInvoker;
import org.dbflute.bhv.readable.*;
import org.dbflute.bhv.writable.*;
import org.dbflute.bhv.referrer.*;
import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.HpSLSFunction;
import org.dbflute.cbean.result.*;
import org.dbflute.exception.*;
import org.dbflute.hook.CommonColumnAutoSetupper;
import org.dbflute.optional.OptionalEntity;
import org.dbflute.outsidesql.executor.*;
import demo.dbflute.exbhv.*;
import demo.dbflute.bsbhv.loader.*;
import demo.dbflute.exentity.*;
import demo.dbflute.bsentity.dbmeta.*;
import demo.dbflute.cbean.*;

/**
 * The behavior of TWEET as TABLE. <br>
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
public abstract class BsTweetBhv extends AbstractBehaviorWritable<Tweet, TweetCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public TweetDbm asDBMeta() { return TweetDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "TWEET"; }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public TweetCB newConditionBean() { return new TweetCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">tweetBhv</span>.<span style="color: #CC4747">selectCount</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of Tweet. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(CBCall<TweetCB> cbLambda) {
        return facadeSelectCount(createCB(cbLambda));
    }

    // ===================================================================================
    //                                                                       Entity Select
    //                                                                       =============
    /**
     * Select the entity by the condition-bean. <br>
     * It returns not-null optional entity, so you should ... <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, alwaysPresent().</span> <br>
     * <span style="color: #AD4747; font-size: 120%">If it might be no data, isPresent() and orElse(), ...</span>
     * <pre>
     * <span style="color: #3F7E5E">// if the data always exists as your business rule</span>
     * <span style="color: #0000C0">tweetBhv</span>.<span style="color: #CC4747">selectEntity</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }).<span style="color: #CC4747">alwaysPresent</span>(<span style="color: #553000">tweet</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present, or exception</span>
     *     ... = <span style="color: #553000">tweet</span>.get...
     * });
     *
     * <span style="color: #3F7E5E">// if it might be no data, ...</span>
     * <span style="color: #0000C0">tweetBhv</span>.<span style="color: #CC4747">selectEntity</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }).<span style="color: #CC4747">ifPresent</span>(<span style="color: #553000">tweet</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present</span>
     *     ... = <span style="color: #553000">tweet</span>.get...
     * }).<span style="color: #994747">orElse</span>(() <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if not present</span>
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of Tweet. (NotNull)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<Tweet> selectEntity(CBCall<TweetCB> cbLambda) {
        return facadeSelectEntity(createCB(cbLambda));
    }

    protected OptionalEntity<Tweet> facadeSelectEntity(TweetCB cb) {
        return doSelectOptionalEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends Tweet> OptionalEntity<ENTITY> doSelectOptionalEntity(TweetCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)).orElse(null); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * Tweet <span style="color: #553000">tweet</span> = <span style="color: #0000C0">tweetBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> cb.acceptPK(1));
     * ... = <span style="color: #553000">tweet</span>.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cbLambda The callback for condition-bean of Tweet. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public Tweet selectEntityWithDeletedCheck(CBCall<TweetCB> cbLambda) {
        return facadeSelectEntityWithDeletedCheck(createCB(cbLambda));
    }

    /**
     * Select the entity by the primary-key value.
     * @param tweetId : PK, ID, NotNull, BIGINT(19). (NotNull)
     * @return The optional entity selected by the PK. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<Tweet> selectByPK(Long tweetId) {
        return facadeSelectByPK(tweetId);
    }

    protected OptionalEntity<Tweet> facadeSelectByPK(Long tweetId) {
        return doSelectOptionalByPK(tweetId, typeOfSelectedEntity());
    }

    protected <ENTITY extends Tweet> ENTITY doSelectByPK(Long tweetId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(tweetId), tp);
    }

    protected <ENTITY extends Tweet> OptionalEntity<ENTITY> doSelectOptionalByPK(Long tweetId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(tweetId, tp), tweetId);
    }

    protected TweetCB xprepareCBAsPK(Long tweetId) {
        assertObjectNotNull("tweetId", tweetId);
        return newConditionBean().acceptPK(tweetId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * ListResultBean&lt;Tweet&gt; <span style="color: #553000">tweetList</span> = <span style="color: #0000C0">tweetBhv</span>.<span style="color: #CC4747">selectList</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...;
     *     <span style="color: #553000">cb</span>.query().addOrderBy...;
     * });
     * <span style="color: #70226C">for</span> (Tweet <span style="color: #553000">tweet</span> : <span style="color: #553000">tweetList</span>) {
     *     ... = <span style="color: #553000">tweet</span>.get...;
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of Tweet. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<Tweet> selectList(CBCall<TweetCB> cbLambda) {
        return facadeSelectList(createCB(cbLambda));
    }

    @Override
    protected boolean isEntityDerivedMappable() { return true; }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * PagingResultBean&lt;Tweet&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">tweetBhv</span>.<span style="color: #CC4747">selectPage</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     *     <span style="color: #553000">cb</span>.query().addOrderBy...
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * });
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (Tweet tweet : <span style="color: #553000">page</span>) {
     *     ... = tweet.get...;
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of Tweet. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<Tweet> selectPage(CBCall<TweetCB> cbLambda) {
        return facadeSelectPage(createCB(cbLambda));
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * <span style="color: #0000C0">tweetBhv</span>.<span style="color: #CC4747">selectCursor</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of Tweet. (NotNull)
     * @param entityLambda The handler of entity row of Tweet. (NotNull)
     */
    public void selectCursor(CBCall<TweetCB> cbLambda, EntityRowHandler<Tweet> entityLambda) {
        facadeSelectCursor(createCB(cbLambda), entityLambda);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">tweetBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<TweetCB, RESULT> selectScalar(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    // ===================================================================================
    //                                                                            Sequence
    //                                                                            ========
    @Override
    protected Number doReadNextVal() {
        String msg = "This table is NOT related to sequence: " + asTableDbName();
        throw new UnsupportedOperationException(msg);
    }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    /**
     * Load referrer for the list by the referrer loader.
     * <pre>
     * List&lt;Member&gt; <span style="color: #553000">memberList</span> = <span style="color: #0000C0">memberBhv</span>.selectList(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * memberBhv.<span style="color: #CC4747">load</span>(<span style="color: #553000">memberList</span>, <span style="color: #553000">memberLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">memberLoader</span>.<span style="color: #CC4747">loadPurchase</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">purchaseCB</span>.setupSelect...
     *         <span style="color: #553000">purchaseCB</span>.query().set...
     *         <span style="color: #553000">purchaseCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can also load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(purchaseLoader -&gt; {</span>
     *     <span style="color: #3F7E5E">//    purchaseLoader.loadPurchasePayment(...);</span>
     *     <span style="color: #3F7E5E">//});</span>
     *
     *     <span style="color: #3F7E5E">// you can also pull out foreign table and load its referrer</span>
     *     <span style="color: #3F7E5E">// (setupSelect of the foreign table should be called)</span>
     *     <span style="color: #3F7E5E">//memberLoader.pulloutMemberStatus().loadMemberLogin(...)</span>
     * });
     * <span style="color: #70226C">for</span> (Member member : <span style="color: #553000">memberList</span>) {
     *     List&lt;Purchase&gt; purchaseList = member.<span style="color: #CC4747">getPurchaseList()</span>;
     *     <span style="color: #70226C">for</span> (Purchase purchase : purchaseList) {
     *         ...
     *     }
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has order by FK before callback.
     * @param tweetList The entity list of tweet. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<Tweet> tweetList, ReferrerLoaderHandler<LoaderOfTweet> loaderLambda) {
        xassLRArg(tweetList, loaderLambda);
        loaderLambda.handle(new LoaderOfTweet().ready(tweetList, _behaviorSelector));
    }

    /**
     * Load referrer for the entity by the referrer loader.
     * <pre>
     * Member <span style="color: #553000">member</span> = <span style="color: #0000C0">memberBhv</span>.selectEntityWithDeletedCheck(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> <span style="color: #553000">cb</span>.acceptPK(1));
     * <span style="color: #0000C0">memberBhv</span>.<span style="color: #CC4747">load</span>(<span style="color: #553000">member</span>, <span style="color: #553000">memberLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">memberLoader</span>.<span style="color: #CC4747">loadPurchase</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">purchaseCB</span>.setupSelect...
     *         <span style="color: #553000">purchaseCB</span>.query().set...
     *         <span style="color: #553000">purchaseCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can also load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(purchaseLoader -&gt; {</span>
     *     <span style="color: #3F7E5E">//    purchaseLoader.loadPurchasePayment(...);</span>
     *     <span style="color: #3F7E5E">//});</span>
     *
     *     <span style="color: #3F7E5E">// you can also pull out foreign table and load its referrer</span>
     *     <span style="color: #3F7E5E">// (setupSelect of the foreign table should be called)</span>
     *     <span style="color: #3F7E5E">//memberLoader.pulloutMemberStatus().loadMemberLogin(...)</span>
     * });
     * List&lt;Purchase&gt; purchaseList = <span style="color: #553000">member</span>.<span style="color: #CC4747">getPurchaseList()</span>;
     * <span style="color: #70226C">for</span> (Purchase purchase : purchaseList) {
     *     ...
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has order by FK before callback.
     * @param tweet The entity of tweet. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(Tweet tweet, ReferrerLoaderHandler<LoaderOfTweet> loaderLambda) {
        xassLRArg(tweet, loaderLambda);
        loaderLambda.handle(new LoaderOfTweet().ready(xnewLRAryLs(tweet), _behaviorSelector));
    }

    /**
     * Load referrer of favoliteList by the set-upper of referrer. <br>
     * FAVOLITE by TWEET_ID, named 'favoliteList'.
     * <pre>
     * <span style="color: #0000C0">tweetBhv</span>.<span style="color: #CC4747">loadFavolite</span>(<span style="color: #553000">tweetList</span>, <span style="color: #553000">favoliteCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">favoliteCB</span>.setupSelect...
     *     <span style="color: #553000">favoliteCB</span>.query().set...
     *     <span style="color: #553000">favoliteCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (Tweet tweet : <span style="color: #553000">tweetList</span>) {
     *     ... = tweet.<span style="color: #CC4747">getFavoliteList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setTweetId_InScope(pkList);
     * cb.query().addOrderBy_TweetId_Asc();
     * </pre>
     * @param tweetList The entity list of tweet. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<Favolite> loadFavolite(List<Tweet> tweetList, ReferrerConditionSetupper<FavoliteCB> refCBLambda) {
        xassLRArg(tweetList, refCBLambda);
        return doLoadFavolite(tweetList, new LoadReferrerOption<FavoliteCB, Favolite>().xinit(refCBLambda));
    }

    /**
     * Load referrer of favoliteList by the set-upper of referrer. <br>
     * FAVOLITE by TWEET_ID, named 'favoliteList'.
     * <pre>
     * <span style="color: #0000C0">tweetBhv</span>.<span style="color: #CC4747">loadFavolite</span>(<span style="color: #553000">tweet</span>, <span style="color: #553000">favoliteCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">favoliteCB</span>.setupSelect...
     *     <span style="color: #553000">favoliteCB</span>.query().set...
     *     <span style="color: #553000">favoliteCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">tweet</span>.<span style="color: #CC4747">getFavoliteList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setTweetId_InScope(pkList);
     * cb.query().addOrderBy_TweetId_Asc();
     * </pre>
     * @param tweet The entity of tweet. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<Favolite> loadFavolite(Tweet tweet, ReferrerConditionSetupper<FavoliteCB> refCBLambda) {
        xassLRArg(tweet, refCBLambda);
        return doLoadFavolite(xnewLRLs(tweet), new LoadReferrerOption<FavoliteCB, Favolite>().xinit(refCBLambda));
    }

    protected NestedReferrerListGateway<Favolite> doLoadFavolite(List<Tweet> tweetList, LoadReferrerOption<FavoliteCB, Favolite> option) {
        return helpLoadReferrerInternally(tweetList, option, "favoliteList");
    }

    /**
     * Load referrer of replyByReplyeeTweetIdList by the set-upper of referrer. <br>
     * REPLY by REPLYEE_TWEET_ID, named 'replyByReplyeeTweetIdList'.
     * <pre>
     * <span style="color: #0000C0">tweetBhv</span>.<span style="color: #CC4747">loadReplyByReplyeeTweetId</span>(<span style="color: #553000">tweetList</span>, <span style="color: #553000">replyCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">replyCB</span>.setupSelect...
     *     <span style="color: #553000">replyCB</span>.query().set...
     *     <span style="color: #553000">replyCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (Tweet tweet : <span style="color: #553000">tweetList</span>) {
     *     ... = tweet.<span style="color: #CC4747">getReplyByReplyeeTweetIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setReplyeeTweetId_InScope(pkList);
     * cb.query().addOrderBy_ReplyeeTweetId_Asc();
     * </pre>
     * @param tweetList The entity list of tweet. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<Reply> loadReplyByReplyeeTweetId(List<Tweet> tweetList, ReferrerConditionSetupper<ReplyCB> refCBLambda) {
        xassLRArg(tweetList, refCBLambda);
        return doLoadReplyByReplyeeTweetId(tweetList, new LoadReferrerOption<ReplyCB, Reply>().xinit(refCBLambda));
    }

    /**
     * Load referrer of replyByReplyeeTweetIdList by the set-upper of referrer. <br>
     * REPLY by REPLYEE_TWEET_ID, named 'replyByReplyeeTweetIdList'.
     * <pre>
     * <span style="color: #0000C0">tweetBhv</span>.<span style="color: #CC4747">loadReplyByReplyeeTweetId</span>(<span style="color: #553000">tweet</span>, <span style="color: #553000">replyCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">replyCB</span>.setupSelect...
     *     <span style="color: #553000">replyCB</span>.query().set...
     *     <span style="color: #553000">replyCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">tweet</span>.<span style="color: #CC4747">getReplyByReplyeeTweetIdList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setReplyeeTweetId_InScope(pkList);
     * cb.query().addOrderBy_ReplyeeTweetId_Asc();
     * </pre>
     * @param tweet The entity of tweet. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<Reply> loadReplyByReplyeeTweetId(Tweet tweet, ReferrerConditionSetupper<ReplyCB> refCBLambda) {
        xassLRArg(tweet, refCBLambda);
        return doLoadReplyByReplyeeTweetId(xnewLRLs(tweet), new LoadReferrerOption<ReplyCB, Reply>().xinit(refCBLambda));
    }

    protected NestedReferrerListGateway<Reply> doLoadReplyByReplyeeTweetId(List<Tweet> tweetList, LoadReferrerOption<ReplyCB, Reply> option) {
        return helpLoadReferrerInternally(tweetList, option, "replyByReplyeeTweetIdList");
    }

    /**
     * Load referrer of replyByReplyerTweetIdList by the set-upper of referrer. <br>
     * REPLY by REPLYER_TWEET_ID, named 'replyByReplyerTweetIdList'.
     * <pre>
     * <span style="color: #0000C0">tweetBhv</span>.<span style="color: #CC4747">loadReplyByReplyerTweetId</span>(<span style="color: #553000">tweetList</span>, <span style="color: #553000">replyCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">replyCB</span>.setupSelect...
     *     <span style="color: #553000">replyCB</span>.query().set...
     *     <span style="color: #553000">replyCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (Tweet tweet : <span style="color: #553000">tweetList</span>) {
     *     ... = tweet.<span style="color: #CC4747">getReplyByReplyerTweetIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setReplyerTweetId_InScope(pkList);
     * cb.query().addOrderBy_ReplyerTweetId_Asc();
     * </pre>
     * @param tweetList The entity list of tweet. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<Reply> loadReplyByReplyerTweetId(List<Tweet> tweetList, ReferrerConditionSetupper<ReplyCB> refCBLambda) {
        xassLRArg(tweetList, refCBLambda);
        return doLoadReplyByReplyerTweetId(tweetList, new LoadReferrerOption<ReplyCB, Reply>().xinit(refCBLambda));
    }

    /**
     * Load referrer of replyByReplyerTweetIdList by the set-upper of referrer. <br>
     * REPLY by REPLYER_TWEET_ID, named 'replyByReplyerTweetIdList'.
     * <pre>
     * <span style="color: #0000C0">tweetBhv</span>.<span style="color: #CC4747">loadReplyByReplyerTweetId</span>(<span style="color: #553000">tweet</span>, <span style="color: #553000">replyCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">replyCB</span>.setupSelect...
     *     <span style="color: #553000">replyCB</span>.query().set...
     *     <span style="color: #553000">replyCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">tweet</span>.<span style="color: #CC4747">getReplyByReplyerTweetIdList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setReplyerTweetId_InScope(pkList);
     * cb.query().addOrderBy_ReplyerTweetId_Asc();
     * </pre>
     * @param tweet The entity of tweet. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<Reply> loadReplyByReplyerTweetId(Tweet tweet, ReferrerConditionSetupper<ReplyCB> refCBLambda) {
        xassLRArg(tweet, refCBLambda);
        return doLoadReplyByReplyerTweetId(xnewLRLs(tweet), new LoadReferrerOption<ReplyCB, Reply>().xinit(refCBLambda));
    }

    protected NestedReferrerListGateway<Reply> doLoadReplyByReplyerTweetId(List<Tweet> tweetList, LoadReferrerOption<ReplyCB, Reply> option) {
        return helpLoadReferrerInternally(tweetList, option, "replyByReplyerTweetIdList");
    }

    /**
     * Load referrer of retweetList by the set-upper of referrer. <br>
     * RETWEET by TWEET_ID, named 'retweetList'.
     * <pre>
     * <span style="color: #0000C0">tweetBhv</span>.<span style="color: #CC4747">loadRetweet</span>(<span style="color: #553000">tweetList</span>, <span style="color: #553000">retweetCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">retweetCB</span>.setupSelect...
     *     <span style="color: #553000">retweetCB</span>.query().set...
     *     <span style="color: #553000">retweetCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (Tweet tweet : <span style="color: #553000">tweetList</span>) {
     *     ... = tweet.<span style="color: #CC4747">getRetweetList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setTweetId_InScope(pkList);
     * cb.query().addOrderBy_TweetId_Asc();
     * </pre>
     * @param tweetList The entity list of tweet. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<Retweet> loadRetweet(List<Tweet> tweetList, ReferrerConditionSetupper<RetweetCB> refCBLambda) {
        xassLRArg(tweetList, refCBLambda);
        return doLoadRetweet(tweetList, new LoadReferrerOption<RetweetCB, Retweet>().xinit(refCBLambda));
    }

    /**
     * Load referrer of retweetList by the set-upper of referrer. <br>
     * RETWEET by TWEET_ID, named 'retweetList'.
     * <pre>
     * <span style="color: #0000C0">tweetBhv</span>.<span style="color: #CC4747">loadRetweet</span>(<span style="color: #553000">tweet</span>, <span style="color: #553000">retweetCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">retweetCB</span>.setupSelect...
     *     <span style="color: #553000">retweetCB</span>.query().set...
     *     <span style="color: #553000">retweetCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">tweet</span>.<span style="color: #CC4747">getRetweetList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setTweetId_InScope(pkList);
     * cb.query().addOrderBy_TweetId_Asc();
     * </pre>
     * @param tweet The entity of tweet. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<Retweet> loadRetweet(Tweet tweet, ReferrerConditionSetupper<RetweetCB> refCBLambda) {
        xassLRArg(tweet, refCBLambda);
        return doLoadRetweet(xnewLRLs(tweet), new LoadReferrerOption<RetweetCB, Retweet>().xinit(refCBLambda));
    }

    protected NestedReferrerListGateway<Retweet> doLoadRetweet(List<Tweet> tweetList, LoadReferrerOption<RetweetCB, Retweet> option) {
        return helpLoadReferrerInternally(tweetList, option, "retweetList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'User'.
     * @param tweetList The list of tweet. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<User> pulloutUser(List<Tweet> tweetList)
    { return helpPulloutInternally(tweetList, "user"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key tweetId.
     * @param tweetList The list of tweet. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractTweetIdList(List<Tweet> tweetList)
    { return helpExtractListInternally(tweetList, "tweetId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * Tweet tweet = <span style="color: #70226C">new</span> Tweet();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * tweet.setFoo...(value);
     * tweet.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tweet.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tweet.set...;</span>
     * <span style="color: #0000C0">tweetBhv</span>.<span style="color: #CC4747">insert</span>(tweet);
     * ... = tweet.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param tweet The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(Tweet tweet) {
        doInsert(tweet, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * Tweet tweet = <span style="color: #70226C">new</span> Tweet();
     * tweet.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tweet.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tweet.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tweet.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * tweet.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">tweetBhv</span>.<span style="color: #CC4747">update</span>(tweet);
     * </pre>
     * @param tweet The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(Tweet tweet) {
        doUpdate(tweet, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param tweet The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(Tweet tweet) {
        doInsertOrUpdate(tweet, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * Tweet tweet = <span style="color: #70226C">new</span> Tweet();
     * tweet.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * tweet.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">tweetBhv</span>.<span style="color: #CC4747">delete</span>(tweet);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param tweet The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(Tweet tweet) {
        doDelete(tweet, null);
    }

    // ===================================================================================
    //                                                                        Batch Update
    //                                                                        ============
    /**
     * Batch-insert the entity list modified-only of same-set columns. (DefaultConstraintsEnabled) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <p><span style="color: #CC4747; font-size: 120%">The columns of least common multiple are registered like this:</span></p>
     * <pre>
     * <span style="color: #70226C">for</span> (... : ...) {
     *     Tweet tweet = <span style="color: #70226C">new</span> Tweet();
     *     tweet.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         tweet.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     tweetList.add(tweet);
     * }
     * <span style="color: #0000C0">tweetBhv</span>.<span style="color: #CC4747">batchInsert</span>(tweetList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param tweetList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<Tweet> tweetList) {
        return doBatchInsert(tweetList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     Tweet tweet = <span style="color: #70226C">new</span> Tweet();
     *     tweet.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         tweet.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         tweet.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//tweet.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     tweetList.add(tweet);
     * }
     * <span style="color: #0000C0">tweetBhv</span>.<span style="color: #CC4747">batchUpdate</span>(tweetList);
     * </pre>
     * @param tweetList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<Tweet> tweetList) {
        return doBatchUpdate(tweetList, null);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param tweetList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<Tweet> tweetList) {
        return doBatchDelete(tweetList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">tweetBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;Tweet, TweetCB&gt;() {
     *     public ConditionBean setup(Tweet entity, TweetCB intoCB) {
     *         FooCB cb = FooCB();
     *         cb.setupSelect_Bar();
     *
     *         <span style="color: #3F7E5E">// mapping</span>
     *         intoCB.specify().columnMyName().mappedFrom(cb.specify().columnFooName());
     *         intoCB.specify().columnMyCount().mappedFrom(cb.specify().columnFooCount());
     *         intoCB.specify().columnMyDate().mappedFrom(cb.specify().specifyBar().columnBarDate());
     *         entity.setMyFixedValue("foo"); <span style="color: #3F7E5E">// fixed value</span>
     *         <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     *         <span style="color: #3F7E5E">//entity.setRegisterUser(value);</span>
     *         <span style="color: #3F7E5E">//entity.set...;</span>
     *         <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     *         <span style="color: #3F7E5E">//entity.setVersionNo(value);</span>
     *
     *         return cb;
     *     }
     * });
     * </pre>
     * @param manyArgLambda The callback to set up query-insert. (NotNull)
     * @return The inserted count.
     */
    public int queryInsert(QueryInsertSetupper<Tweet, TweetCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * Tweet tweet = <span style="color: #70226C">new</span> Tweet();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//tweet.setPK...(value);</span>
     * tweet.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tweet.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tweet.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tweet.setVersionNo(value);</span>
     * <span style="color: #0000C0">tweetBhv</span>.<span style="color: #CC4747">queryUpdate</span>(tweet, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * });
     * </pre>
     * @param tweet The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cbLambda The callback for condition-bean of Tweet. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(Tweet tweet, CBCall<TweetCB> cbLambda) {
        return doQueryUpdate(tweet, createCB(cbLambda), null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * <span style="color: #0000C0">tweetBhv</span>.<span style="color: #CC4747">queryDelete</span>(tweet, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of Tweet. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(CBCall<TweetCB> cbLambda) {
        return doQueryDelete(createCB(cbLambda), null);
    }

    // ===================================================================================
    //                                                                      Varying Update
    //                                                                      ==============
    // -----------------------------------------------------
    //                                         Entity Update
    //                                         -------------
    /**
     * Insert the entity with varying requests. <br>
     * For example, disableCommonColumnAutoSetup(), disablePrimaryKeyIdentity(). <br>
     * Other specifications are same as insert(entity).
     * <pre>
     * Tweet tweet = <span style="color: #70226C">new</span> Tweet();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * tweet.setFoo...(value);
     * tweet.setBar...(value);
     * <span style="color: #0000C0">tweetBhv</span>.<span style="color: #CC4747">varyingInsert</span>(tweet, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = tweet.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param tweet The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(Tweet tweet, WritableOptionCall<TweetCB, InsertOption<TweetCB>> opLambda) {
        doInsert(tweet, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * Tweet tweet = <span style="color: #70226C">new</span> Tweet();
     * tweet.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tweet.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * tweet.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">tweetBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(tweet, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param tweet The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(Tweet tweet, WritableOptionCall<TweetCB, UpdateOption<TweetCB>> opLambda) {
        doUpdate(tweet, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param tweet The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(Tweet tweet, WritableOptionCall<TweetCB, InsertOption<TweetCB>> insertOpLambda, WritableOptionCall<TweetCB, UpdateOption<TweetCB>> updateOpLambda) {
        doInsertOrUpdate(tweet, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param tweet The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(Tweet tweet, WritableOptionCall<TweetCB, DeleteOption<TweetCB>> opLambda) {
        doDelete(tweet, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param tweetList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<Tweet> tweetList, WritableOptionCall<TweetCB, InsertOption<TweetCB>> opLambda) {
        return doBatchInsert(tweetList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param tweetList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<Tweet> tweetList, WritableOptionCall<TweetCB, UpdateOption<TweetCB>> opLambda) {
        return doBatchUpdate(tweetList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param tweetList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<Tweet> tweetList, WritableOptionCall<TweetCB, DeleteOption<TweetCB>> opLambda) {
        return doBatchDelete(tweetList, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Query Update
    //                                          ------------
    /**
     * Insert the several entities by query with varying requests (modified-only for fixed value). <br>
     * For example, disableCommonColumnAutoSetup(), disablePrimaryKeyIdentity(). <br>
     * Other specifications are same as queryInsert(entity, setupper).
     * @param manyArgLambda The set-upper of query-insert. (NotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The inserted count.
     */
    public int varyingQueryInsert(QueryInsertSetupper<Tweet, TweetCB> manyArgLambda, WritableOptionCall<TweetCB, InsertOption<TweetCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * Tweet tweet = <span style="color: #70226C">new</span> Tweet();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//tweet.setPK...(value);</span>
     * tweet.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tweet.setVersionNo(value);</span>
     * <span style="color: #0000C0">tweetBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(tweet, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * }, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param tweet The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cbLambda The callback for condition-bean of Tweet. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(Tweet tweet, CBCall<TweetCB> cbLambda, WritableOptionCall<TweetCB, UpdateOption<TweetCB>> opLambda) {
        return doQueryUpdate(tweet, createCB(cbLambda), createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * <pre>
     * <span style="color: #0000C0">tweetBhv</span>.<span style="color: #CC4747">queryDelete</span>(tweet, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * }, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of Tweet. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(CBCall<TweetCB> cbLambda, WritableOptionCall<TweetCB, DeleteOption<TweetCB>> opLambda) {
        return doQueryDelete(createCB(cbLambda), createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span>
     * tweetBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span>
     * tweetBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * tweetBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * tweetBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * tweetBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * tweetBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * tweetBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span>
     * tweetBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * tweetBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * tweetBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * tweetBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * tweetBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * tweetBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span>
     * tweetBhv.outideSql().removeBlockComment().selectList()
     * tweetBhv.outideSql().removeLineComment().selectList()
     * tweetBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlAllFacadeExecutor<TweetBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                         Type Helper
    //                                                                         ===========
    protected Class<? extends Tweet> typeOfSelectedEntity() { return Tweet.class; }
    protected Class<Tweet> typeOfHandlingEntity() { return Tweet.class; }
    protected Class<TweetCB> typeOfHandlingConditionBean() { return TweetCB.class; }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    @Override
    @javax.annotation.Resource(name="behaviorCommandInvoker")
    public void setBehaviorCommandInvoker(BehaviorCommandInvoker behaviorCommandInvoker) {
        super.setBehaviorCommandInvoker(behaviorCommandInvoker);
    }

    @Override
    @javax.annotation.Resource(name="behaviorSelector")
    public void setBehaviorSelector(BehaviorSelector behaviorSelector) {
        super.setBehaviorSelector(behaviorSelector);
    }

    @Override
    @javax.annotation.Resource(name="commonColumnAutoSetupper")
    public void setCommonColumnAutoSetupper(CommonColumnAutoSetupper commonColumnAutoSetupper) {
        super.setCommonColumnAutoSetupper(commonColumnAutoSetupper);
    }
}
