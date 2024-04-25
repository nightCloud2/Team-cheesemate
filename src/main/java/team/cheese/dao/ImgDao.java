package team.cheese.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import team.cheese.domain.ImgDto;

import java.util.HashMap;
import java.util.List;

@Repository
public class ImgDao {
    @Autowired
    private SqlSession session;
    private static String namespace = "team.cheese.dao.ImgDao.";

    public int insert_img(ImgDto img){
        return session.insert(namespace+"insert_img", img);
    }

    public List<ImgDto> selectAll_img(){
        return session.selectList(namespace+"select_img");
    }

    public List<ImgDto> simg_list(HashMap map){
        return session.selectList(namespace+"select_simg_view", map);
    }

    public int update_img(HashMap map){
        return session.update(namespace+"state_change_img", map);
    }

    public int insert_sale_img(HashMap map){
        return session.update(namespace+"insert_cross", map);
    }

    public int delete_sale_img_all(){
        return session.delete(namespace+"delete_sale_img_all");
    }

    public int delete_img_all(){
        return session.delete(namespace+"delete_img_all");
    }
}