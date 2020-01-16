package com.zqspringbootgithubjenkins.springbootgithubjenkins.github;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * java类简单作用描述
 *
 * @ProjectName: springbootgithubjenkins
 * @Package: com.zqspringbootgithubjenkins.springbootgithubjenkins.github
 * @ClassName: test
 * @Description: java类作用描述
 * @Author: zhangq
 * @CreateDate: 2020-01-16 16:36
 * @UpdateUser: zhangq
 * @UpdateDate: 2020-01-16 16:36
 * @UpdateRemark: The modified content
 * @Version: 1.0 *
 */

@RestController
public class test {

  @RequestMapping("/test")
  public String get(){
    return "范德萨范德萨f范德萨发付付付付付付付付付";
  }
  @RequestMapping("/test1")
  public String get123(){
    return "范德萨范德萨ffffffffffffffdfsaf范德萨范德萨fffffffffffffffffffffff";
  }
}
