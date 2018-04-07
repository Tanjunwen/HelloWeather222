package android.helloweather222.com.helloweather222.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2018/4/7.
 */

public class Province extends DataSupport {
    private int id;
    private String provinceName;
    private int provinceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }

    public Province(int id, String provinceName) {
        this.id = id;
        this.provinceName = provinceName;
    }

    Province() {
    }

    public Province(int id, String provinceName, int provinceCode) {
        this.id = id;
        this.provinceName = provinceName;
        this.provinceCode = provinceCode;
    }

    @Override
    public String toString() {
        return provinceName;
    }
}
