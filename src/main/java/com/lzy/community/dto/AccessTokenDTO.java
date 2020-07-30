package com.lzy.community.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * date: 2020/7/30 08:58
 *
 * @author pyethel
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccessTokenDTO {

    private String client_id;
    private String client_secret;
    private String code;
    private String redirect_uri;
    private String state;


}
