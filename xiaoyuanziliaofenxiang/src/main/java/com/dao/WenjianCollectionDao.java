package com.dao;

import com.entity.WenjianCollectionEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.WenjianCollectionView;

/**
 * 文件收藏 Dao 接口
 *
 * @author 
 */
public interface WenjianCollectionDao extends BaseMapper<WenjianCollectionEntity> {

   List<WenjianCollectionView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
