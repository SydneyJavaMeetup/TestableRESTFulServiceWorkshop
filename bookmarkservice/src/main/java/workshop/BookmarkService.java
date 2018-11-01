package workshop;

import static act.controller.Controller.Util.notFoundIfNull;

import act.controller.annotation.UrlContext;
import com.alibaba.fastjson.JSONObject;
import org.osgl.$;
import org.osgl.mvc.annotation.*;

import javax.inject.Inject;

@UrlContext("/bookmarks")
public class BookmarkService {

    @Inject
    private Bookmark.Dao dao;

    @PostAction
    public Bookmark create(Bookmark bookmark) {
        return dao.save(bookmark);
    }

    @GetAction("{id}")
    public Bookmark get(Integer id) {
        return dao.findById(id);
    }

    @PutAction("{id}")
    public void update(Integer id, JSONObject data) {
        Bookmark bookmark = dao.findById(id);
        notFoundIfNull(bookmark);
        $.merge(data).to(bookmark);
        dao.save(bookmark);
    }

}
