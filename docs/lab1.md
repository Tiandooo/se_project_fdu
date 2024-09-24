
功能需求
平台需要对用户信息进行管理。其中用户实体中包含以下字段
- 用户ID（UID）
- 昵称（name）
- 性别（gender）
- 年龄（age）

在该服务中，需要实现如下5个API：
1. 添加用户
   - URI Path：/api/v1/user
   - Http Method: POST
   - 功能描述：在Request Body中以json格式发送用户的具体信息，以向系统中添加用户
     ![img.png](lab1/img.png)

2. 查看用户信息
    - URI Path：/api/v1/user
   - Http Method: GET
   - 功能描述：用json格式，返回当前系统中的用户信息（以用户ID为用户判断依据，UID相同视为同一用户）
     ![img_1.png](lab1/img_1.png)

3. 查看所有用户
    - URI Path：/api/v1/user/all
   - Http Method: GET
   - 功能描述：用json格式，返回当前系统中的所有用户信息
     ![img_2.png](lab1/img_2.png)

4. 修改用户信息
    - URI Path：/api/v1/user
   - Http Method: PUT
   - 功能描述：用json格式，修改系统中某位用户的具体信息（以用户ID为用户判断依据）
     ![img_4.png](lab1/img_4.png)

5. 删除用户
   - URI Path：/api/v1/user
   - Http Method: DELETE
   - 功能描述：用json格式，删除系统中某位用户（以用户ID为用户判断依据）
   数据存储方式不做具体要求
     ![img_3.png](lab1/img_3.png)
     











