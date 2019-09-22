/*
 * Copyright (c) 2019  huipei.x
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.xphsc.dubbo.controller;

import com.xphsc.dubbo.application.service.UserService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * @author huipei.x
 * @date  2019-9-20
 * @description  :
 */
@RestController
public class UserController {
    @Reference
    UserService userService;
    @GetMapping("/list")
    private Object list(){
        return userService.listUser();
    }
}
