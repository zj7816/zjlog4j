/** *dianping.com Inc *Copyright(c)2004-2016 All Rights Reserved. */package com.quark.ren.api;/** * @author zhangjie * @version $Id: Level.java, v 0.1 2016-08-30 下午7:21 zhangjie Exp $$ */public final class Level {    public static final Level OFF = new Level(0, "off");    public static final Level INFO = new Level(1, "info");    public static final Level ERROR = new Level(2, "error");    private final int code;    private final String desc;    private Level(int code, String desc) {        this.code = code;        this.desc = desc;    }}