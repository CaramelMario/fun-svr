package com.okay.family.service;

import com.github.pagehelper.PageInfo;
import com.okay.family.common.bean.casecollect.request.*;
import com.okay.family.common.bean.casecollect.response.CollectionCaseInfoBean;
import com.okay.family.common.bean.casecollect.response.CollectionRunResultDetailBean;
import com.okay.family.common.bean.casecollect.response.CollectionRunSimpleResutl;
import com.okay.family.common.bean.casecollect.response.ListCollectionBean;
import com.okay.family.common.bean.common.DelBean;
import com.okay.family.common.bean.common.SimpleBean;
import com.okay.family.common.bean.testcase.request.CaseDataBean;
import com.okay.family.common.bean.casecollect.request.DelCollectionBean;

import java.util.List;
import java.util.concurrent.CountDownLatch;

public interface ICaseCollectionService {

    int addCollection(AddCollectionBean beans);

    void addCollectionCaseRelation(AddCollectionBean bean);

    void addCollectionEditRecord(CaseCollectionEditRecord record);

    int editCollection(CollectionEditBean bean);

    int shareCollection(DelCollectionBean bean);

    int delCollection(DelCollectionBean bean);

    void delCollectionCaseRelation(DelCollectionBean bean);

    int delCaseFromCollection(DelCaseCollectionRelationBean bean);

    CollectionCaseInfoBean getCases(int collectionId, int uid);

    void getCollectionInfo(CollectionCaseInfoBean bean, CountDownLatch countDownLatch);

    CollectionRunSimpleResutl runCollection(RunCollectionBean bean);

    void addCollectionRunRecord(CollectionRunResultRecord record);

    List<CaseDataBean> getCasesDeatil(RunCollectionBean bean);

    void updateCollectionStatus(int id, int status);

    PageInfo<ListCollectionBean> findCollecions(SearchCollectionBean bean);

    List<SimpleBean> searchCollectionNoPage(SearchCollectionNoPageBean bean);

    List<SimpleBean> getRecords(DelBean bean);

    CollectionRunResultDetailBean getCollectionRunDetail(int runId);

    void getCaseRunRecord(CollectionRunResultDetailBean bean, CountDownLatch countDownLatch);

    void getCollectionRunResult(CollectionRunResultDetailBean bean, CountDownLatch countDownLatch);


}
