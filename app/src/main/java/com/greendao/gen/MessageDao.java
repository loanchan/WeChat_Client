package com.greendao.gen;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.zhang.chat.bean.chat.Message;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "MESSAGE".
*/
public class MessageDao extends AbstractDao<Message, Long> {

    public static final String TABLENAME = "MESSAGE";

    /**
     * Properties of entity Message.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property M_ID = new Property(0, Long.class, "M_ID", true, "_id");
        public final static Property M_PostMessages = new Property(1, String.class, "M_PostMessages", false, "M__POST_MESSAGES");
        public final static Property M_status = new Property(2, int.class, "M_status", false, "M_STATUS");
        public final static Property M_Time = new Property(3, String.class, "M_Time", false, "M__TIME");
        public final static Property M_MessagesTypeID = new Property(4, int.class, "M_MessagesTypeID", false, "M__MESSAGES_TYPE_ID");
        public final static Property M_ToUserID = new Property(5, long.class, "M_ToUserID", false, "M__TO_USER_ID");
        public final static Property M_FromUserID = new Property(6, long.class, "M_FromUserID", false, "M__FROM_USER_ID");
        public final static Property Flag = new Property(7, long.class, "flag", false, "FLAG");
        public final static Property IsNew = new Property(8, boolean.class, "isNew", false, "IS_NEW");
        public final static Property IsRead = new Property(9, boolean.class, "isRead", false, "IS_READ");
    }


    public MessageDao(DaoConfig config) {
        super(config);
    }
    
    public MessageDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"MESSAGE\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: M_ID
                "\"M__POST_MESSAGES\" TEXT," + // 1: M_PostMessages
                "\"M_STATUS\" INTEGER NOT NULL ," + // 2: M_status
                "\"M__TIME\" TEXT," + // 3: M_Time
                "\"M__MESSAGES_TYPE_ID\" INTEGER NOT NULL ," + // 4: M_MessagesTypeID
                "\"M__TO_USER_ID\" INTEGER NOT NULL ," + // 5: M_ToUserID
                "\"M__FROM_USER_ID\" INTEGER NOT NULL ," + // 6: M_FromUserID
                "\"FLAG\" INTEGER NOT NULL ," + // 7: flag
                "\"IS_NEW\" INTEGER NOT NULL ," + // 8: isNew
                "\"IS_READ\" INTEGER NOT NULL );"); // 9: isRead
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"MESSAGE\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, Message entity) {
        stmt.clearBindings();
 
        Long M_ID = entity.getM_ID();
        if (M_ID != null) {
            stmt.bindLong(1, M_ID);
        }
 
        String M_PostMessages = entity.getM_PostMessages();
        if (M_PostMessages != null) {
            stmt.bindString(2, M_PostMessages);
        }
        stmt.bindLong(3, entity.getM_status());
 
        String M_Time = entity.getM_Time();
        if (M_Time != null) {
            stmt.bindString(4, M_Time);
        }
        stmt.bindLong(5, entity.getM_MessagesTypeID());
        stmt.bindLong(6, entity.getM_ToUserID());
        stmt.bindLong(7, entity.getM_FromUserID());
        stmt.bindLong(8, entity.getFlag());
        stmt.bindLong(9, entity.getIsNew() ? 1L: 0L);
        stmt.bindLong(10, entity.getIsRead() ? 1L: 0L);
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, Message entity) {
        stmt.clearBindings();
 
        Long M_ID = entity.getM_ID();
        if (M_ID != null) {
            stmt.bindLong(1, M_ID);
        }
 
        String M_PostMessages = entity.getM_PostMessages();
        if (M_PostMessages != null) {
            stmt.bindString(2, M_PostMessages);
        }
        stmt.bindLong(3, entity.getM_status());
 
        String M_Time = entity.getM_Time();
        if (M_Time != null) {
            stmt.bindString(4, M_Time);
        }
        stmt.bindLong(5, entity.getM_MessagesTypeID());
        stmt.bindLong(6, entity.getM_ToUserID());
        stmt.bindLong(7, entity.getM_FromUserID());
        stmt.bindLong(8, entity.getFlag());
        stmt.bindLong(9, entity.getIsNew() ? 1L: 0L);
        stmt.bindLong(10, entity.getIsRead() ? 1L: 0L);
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public Message readEntity(Cursor cursor, int offset) {
        Message entity = new Message( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // M_ID
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // M_PostMessages
            cursor.getInt(offset + 2), // M_status
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // M_Time
            cursor.getInt(offset + 4), // M_MessagesTypeID
            cursor.getLong(offset + 5), // M_ToUserID
            cursor.getLong(offset + 6), // M_FromUserID
            cursor.getLong(offset + 7), // flag
            cursor.getShort(offset + 8) != 0, // isNew
            cursor.getShort(offset + 9) != 0 // isRead
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, Message entity, int offset) {
        entity.setM_ID(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setM_PostMessages(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setM_status(cursor.getInt(offset + 2));
        entity.setM_Time(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setM_MessagesTypeID(cursor.getInt(offset + 4));
        entity.setM_ToUserID(cursor.getLong(offset + 5));
        entity.setM_FromUserID(cursor.getLong(offset + 6));
        entity.setFlag(cursor.getLong(offset + 7));
        entity.setIsNew(cursor.getShort(offset + 8) != 0);
        entity.setIsRead(cursor.getShort(offset + 9) != 0);
     }
    
    @Override
    protected final Long updateKeyAfterInsert(Message entity, long rowId) {
        entity.setM_ID(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(Message entity) {
        if(entity != null) {
            return entity.getM_ID();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(Message entity) {
        return entity.getM_ID() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}