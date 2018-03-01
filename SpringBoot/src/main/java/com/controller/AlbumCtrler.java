package com.controller;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.config.SpringConfig;
import com.dao.AlbumDao;
import com.entity.Album;

@RestController
public class AlbumCtrler {
    
    @RequestMapping("/albums")
    public List<Album> getAllEmployees() {
        List<Album> ret = null;
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class)) {
            AlbumDao pd = (AlbumDao) context.getBean("albumDaoImpl");
            
            ret = pd.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ret;
    }
    
    @RequestMapping("/albums/{id}")
    public Album getAlbumById(@PathVariable("id") int id) {
        Album ret = null;
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class)) {
            AlbumDao pd = (AlbumDao) context.getBean("albumDaoImpl");
            ret = pd.getById(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ret;
    }
    
    @RequestMapping("/search/albumtitle/{title}")
    public List<Album> getAlbumById(@PathVariable("title") String title) {
        List<Album> ret = null;
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class)) {
            AlbumDao pd = (AlbumDao) context.getBean("albumDaoImpl");
            ret = pd.searchByTitle(title);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ret;
    }
}
