package com.rinoto.migramongo;

public class MigrationInfo {

    private final String fromVersion;
    private final String toVersion;
    private String module;
    private String info;

    public MigrationInfo(String fromVersion, String toVersion) {
        this.fromVersion = fromVersion;
        this.toVersion = toVersion;

    }

    public String getFromVersion() {
        return fromVersion;
    }

    public String getToVersion() {
        return toVersion;
    }

    public String getModule() {
        return module;
    }

    public String getInfo() {
        return info;
    }

    public MigrationInfo withModule(String module) {
        this.module = module;
        return this;
    }

    public MigrationInfo withInfo(String info) {
        this.info = info;
        return this;
    }

}
