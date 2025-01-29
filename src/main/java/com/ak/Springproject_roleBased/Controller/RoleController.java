package com.ak.Springproject_roleBased.Controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoleController {

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/admin")
    public String adminKaMethod()
    {
        return "mai ADmin hu";
    }

    @PreAuthorize("hasAnyRole('USER','ADMIN')")
    @GetMapping("/user")
    public String userKaMethod()
    {
        return "mai ADmin hu or User bhi";
    }
}
