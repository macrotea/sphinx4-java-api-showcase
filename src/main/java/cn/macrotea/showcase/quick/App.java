package cn.macrotea.showcase.quick;

import org.sphx.api.SphinxClient;
import org.sphx.api.SphinxException;
import org.sphx.api.SphinxMatch;
import org.sphx.api.SphinxResult;

/**
 * @author macrotea@qq.com
 * @since 2014-8-5 上午9:08
 */
public class App {

    // NOTICE macrotea@qq.com 2014-08-16 14:27:36 代码运行前配置好环境
    // 更多的环境配置视频请访问: http://macrotea.com/tevi
    //coolseek
    //github 搜索 SphinxClient
    public static void main(String[] args) throws SphinxException {
        String host = "127.0.0.1";
        int port = 9312;
        int mode = SphinxClient.SPH_MATCH_ANY;

        //构建客户端
        SphinxClient client = new SphinxClient();
        client.SetServer(host, port);
        client.SetMatchMode(mode);
        //理解为分页
        client.SetLimits(0, 10);
        client.SetMaxQueryTime(3000);

        //执行搜索，第一个参数是关键字，第二个参数是索引
        SphinxResult result = client.Query("测试", "*");
        SphinxMatch[] matches = result.matches;

        for (SphinxMatch match : matches) {
            System.out.println(match.docId);
        }


        //88 thanks
    }

}
