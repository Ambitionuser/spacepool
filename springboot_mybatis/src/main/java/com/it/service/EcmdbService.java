package com.it.service;

import com.it.domain.MmsInter;

import java.util.ArrayList;
import java.util.List;

public interface EcmdbService {
    void updateInterList(MmsInter mmsInter);
    void ecmdbInterList(List<MmsInter> mmsInters);
}
