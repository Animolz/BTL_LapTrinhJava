/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lhn.repository.impl;

import com.lhn.pojo.Post;
import com.lhn.pojo.User;
import com.lhn.repository.PostRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.CriteriaUpdate;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Admin
 */
@Repository
@Transactional
public class PostRepositoryImpl implements PostRepository{
    @Autowired
    private LocalSessionFactoryBean sessionFactory;
    
    @Override
    public List<Object[]> getPosts(Map<String, String> param) {
        Session session = this.sessionFactory.getObject().getCurrentSession();
        CriteriaBuilder b = session.getCriteriaBuilder();
        CriteriaQuery<Object[]> q = b.createQuery(Object[].class);
        
        Root rootP = q.from(Post.class);
        Root rootU = q.from(User.class);
        
        List<Predicate> predicates = new ArrayList<>();
        predicates.add(b.equal(rootP.get("userId"), rootU.get("id")));
        
        if(param != null && !param.isEmpty()){
            if(param.containsKey("id"))
                predicates.add(b.equal(rootP.get("id").as(Integer.class), Integer.parseInt(param.get("id"))));
            if(param.containsKey("content"))
                predicates.add(b.like(rootP.get("content").as(String.class), String.format("%%%s%%", param.get("content"))));
            if(param.containsKey("isAuction"))
                predicates.add(b.equal(rootP.get("isAuction").as(Boolean.class), Boolean.parseBoolean(param.get("isAuction"))));
            if(param.containsKey("userId"))
                predicates.add(b.equal(rootP.get("userId").as(Integer.class), Integer.parseInt(param.get("userId"))));
            
            q = q.where(predicates.toArray(new Predicate[]{}));
        }
        
        q.multiselect(rootP.get("id"),rootP.get("content"),rootP.get("image"),rootP.get("postedDate"),rootP.get("isAuction"),rootP.get("price"),
                        rootP.get("active"), rootU.get("id"),rootU.get("username"), rootU.get("avatar"));
        
        return session.createQuery(q).getResultList();
    }

    @Override
    public boolean disablePost(int postId) {
        Session session = this.sessionFactory.getObject().getCurrentSession();
        CriteriaBuilder b = session.getCriteriaBuilder();
        CriteriaUpdate u = b.createCriteriaUpdate(Post.class);
        Root root = u.from(Post.class);
        u.set("active", false);
        u.where(b.equal(root.get("id").as(Integer.class), postId));
        
        return session.createQuery(u).executeUpdate() > 0;
    }
    
}
