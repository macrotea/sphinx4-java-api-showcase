package cn.macrotea.showcase.quick;

import org.sphx.api.SphinxClient;
import org.sphx.api.SphinxException;
import org.sphx.api.SphinxMatch;
import org.sphx.api.SphinxResult;

/**
 * @author macrotea@qq.com
 * @since 2014-8-5 上午9:08
 */
public class SphinxClientTest1 {

    // NOTICE macrotea@qq.com 2014-08-16 14:27:36 代码运行前配置好环境
    // 更多的环境配置视频请访问: http://macrotea.com/tevi
    // coreseek
    // github 搜索 SphinxClient


    public static void main(String[] args) throws SphinxException {
        String host = "127.0.0.1";
        int port = 9312;
        int mode = SphinxClient.SPH_MATCH_ANY;

        //构建客户端
        SphinxClient client = new SphinxClient();
        client.SetServer(host, port);
        client.SetMatchMode(mode);

        //设置搜索返回结果,若超过100行,仅仅返回100行以内的文档
        client.SetLimits(0, 100);
        client.SetMaxQueryTime(3000);

        client.SetFilter("group_id",2,true);

        //执行查询,关键字: 报道 , 在名为test的索引上
        SphinxResult result = client.Query("报道", "test");

        //输出匹配项
        SphinxMatch[] matches = result.matches;
        for (SphinxMatch match : matches) {
            System.out.println(String.format("doc:%s weight:%s attrValues:%s",match.docId,match.weight,match.attrValues));
        }

    }

}
