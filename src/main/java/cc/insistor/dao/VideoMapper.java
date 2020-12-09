package cc.insistor.dao;

import cc.insistor.domain.Video;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * @program: mybatis
 * @description: dao层
 * @packagename: cc.insistor.dao
 * @author: cc
 * @date: 2020-12-07 14:02
 **/
public interface VideoMapper {
    /**
     * 通过id查询
     *
     * @param videoId
     * @return
     */
    public Video selectById(@Param("video_id") Integer videoId);

    /**
     * 查询全部,使用注解和xml配置是一样的，使用注解就不用xml配置了
     * @return
     */
    @Select("select * from video")
    List<Video> selectList();

    /**
     * 根据评分和标题模糊查询
     * @param point
     * @param title
     * @return
     */
    public List<Video> selectByPointAndTitleLike(@Param("point") double point,@Param("title") String title);


    /**
     * 新增一条视频记录
     * @param video
     * @return
     */
    public int add(Video video);



    /**
     * 批量插入
     * @param list
     * @return
     */
    int addBatch(List<Video> list);

    /**
     * 更新视频
     * @param video
     * @return
     */
    int updateVideo(Video video);


    /**
     * 动态选择更新
     * @param video
     * @return
     */
    int updateVideoSelective(Video video);


    /**
     * 根据时间和价格删除
     * @param map
     * @return
     */
    int deleteByCreateTimeAndPrice(Map<String,Object> map);


    /**
     * 根据id查询
     * @param id
     * @return
     */
    Video selectBaseFieldByIdWithResultMap(@Param("video_id") int id);


}
