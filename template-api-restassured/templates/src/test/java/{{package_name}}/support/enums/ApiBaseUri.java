package {{package_name}}.support.enums;

import static {{package_name}}.support.utils.GetProperties.getProp;

public enum ApiBaseUri {
    URI_SERVE_REST(getProp("baseurl"));

    private String path;

    ApiBaseUri(String path){this.path=path;}

    public String getPath(){return path;}
}
