package com.abin.mallchat.common.user.domain.vo.request.ws;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Description:token类
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class WSAuthorize {
    private String token;
}
