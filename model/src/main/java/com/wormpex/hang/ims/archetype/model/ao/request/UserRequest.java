package com.wormpex.hang.ims.archetype.model.ao.request;

import lombok.Data;
import lombok.NonNull;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * @program: hang
 * @description:
 * @author: yuhang
 * @create: 2019-07-23 17:23
 **/
@Data
public class UserRequest {
    @NotEmpty
    private String username;
    @NotEmpty
    private String password;

}
