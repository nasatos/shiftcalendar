package shiftcalendar.data.meta;

//@javax.annotation.Generated(value = { "slim3-gen", "@VERSION@" }, date = "2013-06-09 13:40:39")
/** */
public final class ShiftDataMeta extends org.slim3.datastore.ModelMeta<shiftcalendar.data.model.ShiftData> {

    /** */
    public final org.slim3.datastore.StringAttributeMeta<shiftcalendar.data.model.ShiftData> calendarDate = new org.slim3.datastore.StringAttributeMeta<shiftcalendar.data.model.ShiftData>(this, "calendarDate", "calendarDate");

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<shiftcalendar.data.model.ShiftData, com.google.appengine.api.datastore.Key> key = new org.slim3.datastore.CoreAttributeMeta<shiftcalendar.data.model.ShiftData, com.google.appengine.api.datastore.Key>(this, "__key__", "key", com.google.appengine.api.datastore.Key.class);

    /** */
    public final org.slim3.datastore.StringAttributeMeta<shiftcalendar.data.model.ShiftData> shiftType = new org.slim3.datastore.StringAttributeMeta<shiftcalendar.data.model.ShiftData>(this, "shiftType", "shiftType");

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<shiftcalendar.data.model.ShiftData, java.lang.Long> version = new org.slim3.datastore.CoreAttributeMeta<shiftcalendar.data.model.ShiftData, java.lang.Long>(this, "version", "version", java.lang.Long.class);

    private static final ShiftDataMeta slim3_singleton = new ShiftDataMeta();

    /**
     * @return the singleton
     */
    public static ShiftDataMeta get() {
       return slim3_singleton;
    }

    /** */
    public ShiftDataMeta() {
        super("ShiftData", shiftcalendar.data.model.ShiftData.class);
    }

    @Override
    public shiftcalendar.data.model.ShiftData entityToModel(com.google.appengine.api.datastore.Entity entity) {
        shiftcalendar.data.model.ShiftData model = new shiftcalendar.data.model.ShiftData();
        model.setCalendarDate((java.lang.String) entity.getProperty("calendarDate"));
        model.setKey(entity.getKey());
        model.setShiftType((java.lang.String) entity.getProperty("shiftType"));
        model.setVersion((java.lang.Long) entity.getProperty("version"));
        return model;
    }

    @Override
    public com.google.appengine.api.datastore.Entity modelToEntity(java.lang.Object model) {
        shiftcalendar.data.model.ShiftData m = (shiftcalendar.data.model.ShiftData) model;
        com.google.appengine.api.datastore.Entity entity = null;
        if (m.getKey() != null) {
            entity = new com.google.appengine.api.datastore.Entity(m.getKey());
        } else {
            entity = new com.google.appengine.api.datastore.Entity(kind);
        }
        entity.setProperty("calendarDate", m.getCalendarDate());
        entity.setProperty("shiftType", m.getShiftType());
        entity.setProperty("version", m.getVersion());
        entity.setProperty("slim3.schemaVersion", 1);
        return entity;
    }

    @Override
    protected com.google.appengine.api.datastore.Key getKey(Object model) {
        shiftcalendar.data.model.ShiftData m = (shiftcalendar.data.model.ShiftData) model;
        return m.getKey();
    }

    @Override
    protected void setKey(Object model, com.google.appengine.api.datastore.Key key) {
        validateKey(key);
        shiftcalendar.data.model.ShiftData m = (shiftcalendar.data.model.ShiftData) model;
        m.setKey(key);
    }

    @Override
    protected long getVersion(Object model) {
        shiftcalendar.data.model.ShiftData m = (shiftcalendar.data.model.ShiftData) model;
        return m.getVersion() != null ? m.getVersion().longValue() : 0L;
    }

    @Override
    protected void assignKeyToModelRefIfNecessary(com.google.appengine.api.datastore.AsyncDatastoreService ds, java.lang.Object model) {
    }

    @Override
    protected void incrementVersion(Object model) {
        shiftcalendar.data.model.ShiftData m = (shiftcalendar.data.model.ShiftData) model;
        long version = m.getVersion() != null ? m.getVersion().longValue() : 0L;
        m.setVersion(Long.valueOf(version + 1L));
    }

    @Override
    protected void prePut(Object model) {
    }

    @Override
    protected void postGet(Object model) {
    }

    @Override
    public String getSchemaVersionName() {
        return "slim3.schemaVersion";
    }

    @Override
    public String getClassHierarchyListName() {
        return "slim3.classHierarchyList";
    }

    @Override
    protected boolean isCipherProperty(String propertyName) {
        return false;
    }

    @Override
    protected void modelToJson(org.slim3.datastore.json.JsonWriter writer, java.lang.Object model, int maxDepth, int currentDepth) {
        shiftcalendar.data.model.ShiftData m = (shiftcalendar.data.model.ShiftData) model;
        writer.beginObject();
        org.slim3.datastore.json.Default encoder0 = new org.slim3.datastore.json.Default();
        if(m.getCalendarDate() != null){
            writer.setNextPropertyName("calendarDate");
            encoder0.encode(writer, m.getCalendarDate());
        }
        if(m.getKey() != null){
            writer.setNextPropertyName("key");
            encoder0.encode(writer, m.getKey());
        }
        if(m.getShiftType() != null){
            writer.setNextPropertyName("shiftType");
            encoder0.encode(writer, m.getShiftType());
        }
        if(m.getVersion() != null){
            writer.setNextPropertyName("version");
            encoder0.encode(writer, m.getVersion());
        }
        writer.endObject();
    }

    @Override
    protected shiftcalendar.data.model.ShiftData jsonToModel(org.slim3.datastore.json.JsonRootReader rootReader, int maxDepth, int currentDepth) {
        shiftcalendar.data.model.ShiftData m = new shiftcalendar.data.model.ShiftData();
        org.slim3.datastore.json.JsonReader reader = null;
        org.slim3.datastore.json.Default decoder0 = new org.slim3.datastore.json.Default();
        reader = rootReader.newObjectReader("calendarDate");
        m.setCalendarDate(decoder0.decode(reader, m.getCalendarDate()));
        reader = rootReader.newObjectReader("key");
        m.setKey(decoder0.decode(reader, m.getKey()));
        reader = rootReader.newObjectReader("shiftType");
        m.setShiftType(decoder0.decode(reader, m.getShiftType()));
        reader = rootReader.newObjectReader("version");
        m.setVersion(decoder0.decode(reader, m.getVersion()));
        return m;
    }
}