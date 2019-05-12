package cn.itsource.jiehang.util;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Tx
 * @param <T>
 */
public class PageList<T> {

    private long total;/*总数据*/
    private List<T> rows = new ArrayList<T>();/*当前页中的数据*/

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }

    public PageList() {
    }

    public PageList(long total, List<T> rows) {
        this.total = total;
        this.rows = rows;
    }
}
