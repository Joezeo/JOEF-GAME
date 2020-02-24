package com.joezeo.joefgame.potal.service;

import com.joezeo.joefgame.potal.dto.CommentDTO;
import com.joezeo.joefgame.common.enums.CommentTypeEnum;
import com.joezeo.joefgame.dao.pojo.User;

import java.util.List;

public interface CommentService {
    void addComment(CommentDTO commentDTO, User notifier);

    List<CommentDTO> listByParentId(Long parentId, CommentTypeEnum typeEnum);

    CommentDTO like(Long commentid, Long userid);

    CommentDTO unlike(Long commentid, Long userid);
}