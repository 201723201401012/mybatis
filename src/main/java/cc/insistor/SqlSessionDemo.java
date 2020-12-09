package cc.insistor;

import cc.insistor.dao.VideoMapper;
import cc.insistor.domain.Video;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.*;

/**
 * @program: mybatis
 * @description: 启动类
 * @packagename: cc.insistor
 * @author: cc
 * @date: 2020-12-07 13:59
 **/
public class SqlSessionDemo {
    public static void main(String [] args) throws IOException {
        System.out.println("fdsfas");
        String resouce = "config/mybatis-config.xml";
        //读取配置文件6666r
        InputStream inputStream =  Resources.getResourceAsStream(resouce);
        //构建Session工厂
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //获取Session
        try(SqlSession sqlSession = sqlSessionFactory.openSession()){
            VideoMapper videoMapper = sqlSession.getMapper(VideoMapper.class);
            Video video = videoMapper.selectBaseFieldByIdWithResultMap(45);
            System.out.println(video);



            //Video video = videoMapper.selectById(44);
            //System.out.println(video.toString());
//            List<Video> videoList =  videoMapper.selectList();
//
//            List<Video> html = videoMapper.selectByPointAndTitleLike(8.7, "HTML");
            //System.out.println(html.toString());


//            //新增一条记录
//            Video video1 =  new Video();
//            video1.setTitle("小滴课堂面试专题900道13451");
//            video1.setCoverImg("xdclass.net/aaa.png111");
//            video1.setPoint(9.41);
//            video1.setCreateTime(new Date());
//            video1.setPrice(9911);
//            video1.setSummary("这个是面试专题概要11");
            //videoMapper.add(video1);

            //新增一条记录
//            Video video2 =  new Video();
//            video2.setTitle("小滴课堂面试专题900道2");
//            video2.setCoverImg("xdclass.net/aaa.png2");
//            video2.setPoint(9.2);
//            video2.setCreateTime(new Date());
//            video2.setPrice(9922);
//            video2.setSummary("这个是面试专题概要22");
//
//            List<Video> list = new ArrayList<>();
//            list.add(video1);
//            list.add(video2);
//            //int rows =  videoMapper.addBatch(list);
//
//            Video video4 =  new Video();
//            video4.setId(57);
//            video4.setTitle("小滴课堂面试专题900道 2021年新版");
//            video4.setCoverImg("xdclass.net/6666.png");

            //videoMapper.updateVideoSelective(video4);


//            Map<String,Object> map = new HashMap<>();
//            map.put("createTime","2021-01-11 09:33:20");
//
//            map.put("price",9000);
//
//            int rows = videoMapper.deleteByCreateTimeAndPrice(map);
//
//            System.out.println(rows);

        }

    }
}
