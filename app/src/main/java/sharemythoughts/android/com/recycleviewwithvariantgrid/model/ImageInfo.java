package sharemythoughts.android.com.recycleviewwithvariantgrid.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by Md.Fazla Rabbi OPu on 8/1/2018.
 */

public class ImageInfo  {
    @SerializedName("url")
    @Expose
    private String imgUrl = "";
    @SerializedName("name")
    @Expose
    private String imgName = "";
    @SerializedName("id")
    @Expose
    private int id;

    public void setImgName(String imgName) {
        this.imgName = imgName;
    }

    public String getImgName() {
        return imgName;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}