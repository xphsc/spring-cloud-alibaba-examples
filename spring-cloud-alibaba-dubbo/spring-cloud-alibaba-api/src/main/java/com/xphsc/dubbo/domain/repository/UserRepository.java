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
package com.xphsc.dubbo.domain.repository;

import com.xphsc.dubbo.domain.model.User;
import com.xphsc.easyjdbc.core.EasyJdbcDao;
import org.springframework.stereotype.Repository;
/**
 * @author huipei.x
 * @date  2019-9-20
 * @description  :
 */
@Repository
public interface UserRepository extends EasyJdbcDao<User> {
}
