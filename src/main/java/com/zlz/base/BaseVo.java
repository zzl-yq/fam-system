package com.zlz.base;

import java.io.Serializable;

/**
 * Created by zzl on 2021-01-08.
 */
public class BaseVo implements Serializable {
    private static final long serialVersionUID = 7337150253952118847L;

    private int pageSize=10;//每页条数
    private int pageNo=1;//第几页
    private int count=0;//总条数

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
