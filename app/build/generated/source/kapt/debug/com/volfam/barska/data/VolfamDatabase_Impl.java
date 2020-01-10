package com.volfam.barska.data;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class VolfamDatabase_Impl extends VolfamDatabase {
  private volatile TrainingDao _trainingDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `volfam_training_table` (`volfam_training_column_id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `volfam_training_column_group` TEXT NOT NULL, `volfam_training_column_trainer` TEXT NOT NULL, `volfam_training_column_place` TEXT NOT NULL, `volfam_training_column_date` INTEGER NOT NULL, `volfam_training_column_price` INTEGER NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'f1e2cfdb40cf85aa1d77e09e2f9d4f81')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `volfam_training_table`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsVolfamTrainingTable = new HashMap<String, TableInfo.Column>(6);
        _columnsVolfamTrainingTable.put("volfam_training_column_id", new TableInfo.Column("volfam_training_column_id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsVolfamTrainingTable.put("volfam_training_column_group", new TableInfo.Column("volfam_training_column_group", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsVolfamTrainingTable.put("volfam_training_column_trainer", new TableInfo.Column("volfam_training_column_trainer", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsVolfamTrainingTable.put("volfam_training_column_place", new TableInfo.Column("volfam_training_column_place", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsVolfamTrainingTable.put("volfam_training_column_date", new TableInfo.Column("volfam_training_column_date", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsVolfamTrainingTable.put("volfam_training_column_price", new TableInfo.Column("volfam_training_column_price", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysVolfamTrainingTable = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesVolfamTrainingTable = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoVolfamTrainingTable = new TableInfo("volfam_training_table", _columnsVolfamTrainingTable, _foreignKeysVolfamTrainingTable, _indicesVolfamTrainingTable);
        final TableInfo _existingVolfamTrainingTable = TableInfo.read(_db, "volfam_training_table");
        if (! _infoVolfamTrainingTable.equals(_existingVolfamTrainingTable)) {
          return new RoomOpenHelper.ValidationResult(false, "volfam_training_table(com.volfam.barska.data.Training).\n"
                  + " Expected:\n" + _infoVolfamTrainingTable + "\n"
                  + " Found:\n" + _existingVolfamTrainingTable);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "f1e2cfdb40cf85aa1d77e09e2f9d4f81", "8e9fa18fe12451c1640153dc47095e27");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "volfam_training_table");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `volfam_training_table`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public TrainingDao getTrainingDao() {
    if (_trainingDao != null) {
      return _trainingDao;
    } else {
      synchronized(this) {
        if(_trainingDao == null) {
          _trainingDao = new TrainingDao_Impl(this);
        }
        return _trainingDao;
      }
    }
  }
}
