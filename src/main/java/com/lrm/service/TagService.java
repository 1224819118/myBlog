package com.lrm.service;


import com.lrm.po.Tag;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface TagService {
    public Tag save(Tag tag);

    public Tag getTag(Long id);

    public Tag getTagByName(String name);

    public Page<Tag> listTag(Pageable pageable);

    public List<Tag> listTop(Integer size);

    public List<Tag> list();

    public List<Tag> listTag(String ids);

    public Tag updateTag(Long id,Tag tag);

    public void remove(Long id);
}
