package org.jefesimpson.blog;


import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable
public class Blogs {
    @DatabaseField(generatedId = true)
    private int id;
    @DatabaseField(foreignAutoCreate = true, foreignAutoRefresh = true, foreign = true, columnName = "users_id")
    private Users users;
    @DatabaseField(columnName = "blog_name")
    private String name;
    @DatabaseField(columnName = "blog_text")
    private String text;
    @DatabaseField(columnName = "blog_data_of_create")
    private String data;
    @DatabaseField(columnName = "blog_vip_access")
    private boolean access;

    public Blogs(Users users, String name, String text, String data, boolean access) {
        this.id = 0;
        this.users = users;
        this.name = name;
        this.text = text;
        this.data = data;
        this.access = access;
    }

    public Blogs() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public boolean isAccess() {
        return access;
    }

    public void setAccess(boolean access) {
        this.access = access;
    }

    @Override
    public String toString() {
        return "Blogs{" +
                "id=" + id +
                ", users=" + users +
                ", name='" + name + '\'' +
                ", text='" + text + '\'' +
                ", data='" + data + '\'' +
                ", access=" + access +
                '}';
    }
}
