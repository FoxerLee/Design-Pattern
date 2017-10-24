package Item;

import action.Entity;

import java.util.List;

public Facility extends Item implements Component{
    public List getLoggerList() {
        return loggerList;
    }

    public void setLoggerList(List loggerList) {
        this.loggerList = loggerList;
    }

    private List loggerList;

    protected abstract boolean addLogger(Entity e);


    public boolean remove(Entity e){
        return  loggerList.remove(e);
    }


}
