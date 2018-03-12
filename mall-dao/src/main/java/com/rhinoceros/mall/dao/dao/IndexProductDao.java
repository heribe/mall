package com.rhinoceros.mall.dao.dao;

import com.rhinoceros.mall.core.po.CategoryWithProducts;
import com.rhinoceros.mall.core.po.IndexProduct;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IndexProductDao {

    /**
     * 查找全部主页展示的商品
     *
     * @return
     */
    List<CategoryWithProducts> findAll();

    /**
     * 根据根分类ID查找主页展示商品
     *
     * @param categoryId
     * @return
     */
    List<IndexProduct> findByCategoryId(@Param("categoryId") Long categoryId);

    /**
     * 添加主页展示商品
     *
     * @param indexProduct
     * @return
     */
    int add(IndexProduct indexProduct);

    /**
     * 删除主页展示商品
     *
     * @param id
     */
    void deleteById(Long id);

    /**
     * 根据id查询
     *
     * @param productId
     * @return
     */
    IndexProduct findByProductId(Long productId);
}
