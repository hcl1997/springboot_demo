package com.chixing.dao;

import com.chixing.entity.Note;
import com.chixing.dao.example.NoteExample;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * NoteDdao继承基类
 */
@Repository
@Mapper
public interface NoteDao extends MyBatisBaseDao<Note, Integer, NoteExample> {
    public Note selectByCreateTimeDescOne(int custId);
    public List<Note> selectByCreateTimeDescTen(int custId);
    public List<Note> selectAll();
    public int selectCount();

}