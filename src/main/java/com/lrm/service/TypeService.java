package com.lrm.service;

import com.lrm.po.Type;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface TypeService {
    public Type save(Type type);

    public Type getType(Long id);

    public Type getTypeByName(String name);

    public Page<Type> listType(Pageable pageable);

    public List<Type> listTop(Integer size);

    public List<Type> list();

    public Type updateType(Long id,Type type);

    public void remove(Long id);
}
