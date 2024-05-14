package team.cheese.service.CommunityHeart;

import team.cheese.Domain.CommunityHeart.CommunityHeartDto;

public interface CommunityHeartService {

    //게시글 좋아요, 취소(상태 같이 넣음)
    public int doLike(CommunityHeartDto communityHeartDto)throws Exception;

    //게시글당 총 좋아요
    public String countLike(Integer post_no) throws Exception;








    int countLike(Integer post_no, String result) throws Exception;

    public CommunityHeartDto select(Integer like_no)throws Exception;
    public CommunityHeartDto findByUserId(String ur_id,Integer post_no) throws Exception;


}
