//package org.ysy.controller;
//
//import org.springframework.web.bind.annotation.*;
//import org.ysy.entity.User;
//
//import java.util.*;
//
//@RestController
//@RequestMapping(value = "/users")
//public class UserController {
//
//    // 创建线程安全的Map，模拟users信息的存储
//    static Map<Long, User> users = Collections.synchronizedMap(new HashMap<Long, User>());
//
//    /**
//     * 处理"/users/"的GET请求，用来获取用户列表
//     *
//     * @return
//     */
//    @GetMapping("/")
//    public List<User> getUserList(){
//        ArrayList<User> users1 = new ArrayList<>(users.values());
//        return users1;
//    }
//
//    /**
//     * 处理"/users/"的POST请求，用来创建User
//     *
//     * @param user
//     * @return
//     */
//    @PostMapping("/")
//    public String postUser(@RequestBody User user) {
//        // @RequestBody注解用来绑定通过http请求中application/json类型上传的数据
//        users.put(user.getId(), user);
//        return "success";
//    }
//
//    /**
//     * 处理"/users/{id}"的GET请求，用来获取url中id值的User信息
//     *
//     * @param id
//     * @return
//     */
//    @GetMapping("/{id}")
//    public User getUser(@PathVariable Long id) {
//        // url中的id可通过@PathVariable绑定到函数的参数中
//        return users.get(id);
//    }
//
//    /**
//     * 处理"/users/{id}"的PUT请求，用来更新User信息
//     *
//     * @param id
//     * @param user
//     * @return
//     */
//    @PutMapping("/{id}")
//    public String putUser(@PathVariable Long id, @RequestBody User user) {
//        User u = users.get(id);
//        u.setName(user.getName());
//        u.setAge(user.getAge());
//        users.put(id, u);
//        return "success";
//    }
//
//    /**
//     * 处理"/users/{id}"的DELETE请求，用来删除User
//     *
//     * @param id
//     * @return
//     */
//    @DeleteMapping("/{id}")
//    public String deleteUser(@PathVariable Long id) {
//        users.remove(id);
//        return "success";
//    }
//}


//////////////////////////////////////
package org.ysy.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;
import org.ysy.entity.User;

@RestController
@RequestMapping("/user")
@Api(tags = "用户控制器")
public class UserController {
    @GetMapping("/getUsers")
    @ApiOperation(value = "查询所有用户", notes = "查询所有用户信息")
    public List<User> getAllUsers(){
        User user = new User();
        user.setId(100L);
        user.setName("itcast");
        user.setAge(20);
        user.setAddress("bj");
        List<User> list = new ArrayList<>();
        list.add(user);
        return list;
    }

    @PostMapping("/save")
    @ApiOperation(value = "新增用户", notes = "新增用户信息")
    public String save(@RequestBody User user){
        return "OK";
    }

    @PutMapping("/update")
    @ApiOperation(value = "修改用户", notes = "修改用户信息")
    public String update(@RequestBody User user){
        return "OK";
    }

    @DeleteMapping("/delete")
    @ApiOperation(value = "删除用户", notes = "删除用户信息")
    public String delete(int id){
        return "OK";
    }

    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageNum", value = "页码",
                    required = true, type = "Integer"),
            @ApiImplicitParam(name = "pageSize", value = "每页条数",
                    required = true, type = "Integer"),
    })
    @ApiOperation(value = "分页查询用户信息")
    @GetMapping(value = "page/{pageNum}/{pageSize}")
    public String findByPage(@PathVariable Integer pageNum,
                             @PathVariable Integer pageSize) {
        return "OK";
    }
}





