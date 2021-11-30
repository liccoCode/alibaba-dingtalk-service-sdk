package com.dingtalk.api.reqrsp;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP DingTalk-API: dingtalk.oapi.media.downloadFile response.
 *
 * @author top auto create
 * @since 1.0, null
 */
public class OapiMediaDownloadFileResponse extends TaobaoResponse {

    private static final long serialVersionUID = 3162149399966496521L;

    /**
     * errcode
     */
    @ApiField("errcode")
    private Long errcode;

    /**
     * errmsg
     */
    @ApiField("errmsg")
    private String errmsg;


    public void setErrcode(Long errcode) {
        this.errcode = errcode;
    }
    public Long getErrcode( ) {
        return this.errcode;
    }

    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }
    public String getErrmsg( ) {
        return this.errmsg;
    }

    public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }



}
