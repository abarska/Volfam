package com.volfam.barska.data;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class TrainingDao_Impl implements TrainingDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Training> __insertionAdapterOfTraining;

  private final EntityDeletionOrUpdateAdapter<Training> __updateAdapterOfTraining;

  private final SharedSQLiteStatement __preparedStmtOfClearAll;

  private final SharedSQLiteStatement __preparedStmtOfDelete;

  public TrainingDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfTraining = new EntityInsertionAdapter<Training>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `volfam_training_table` (`volfam_training_column_id`,`volfam_training_column_group`,`volfam_training_column_trainer`,`volfam_training_column_place`,`volfam_training_column_date`,`volfam_training_column_price`) VALUES (nullif(?, 0),?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Training value) {
        stmt.bindLong(1, value.getTrainingId());
        if (value.getGroup() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getGroup());
        }
        if (value.getTrainer() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getTrainer());
        }
        if (value.getPlace() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getPlace());
        }
        stmt.bindLong(5, value.getDate());
        stmt.bindLong(6, value.getPrice());
      }
    };
    this.__updateAdapterOfTraining = new EntityDeletionOrUpdateAdapter<Training>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `volfam_training_table` SET `volfam_training_column_id` = ?,`volfam_training_column_group` = ?,`volfam_training_column_trainer` = ?,`volfam_training_column_place` = ?,`volfam_training_column_date` = ?,`volfam_training_column_price` = ? WHERE `volfam_training_column_id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Training value) {
        stmt.bindLong(1, value.getTrainingId());
        if (value.getGroup() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getGroup());
        }
        if (value.getTrainer() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getTrainer());
        }
        if (value.getPlace() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getPlace());
        }
        stmt.bindLong(5, value.getDate());
        stmt.bindLong(6, value.getPrice());
        stmt.bindLong(7, value.getTrainingId());
      }
    };
    this.__preparedStmtOfClearAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM volfam_training_table";
        return _query;
      }
    };
    this.__preparedStmtOfDelete = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM volfam_training_table WHERE volfam_training_column_id = ?";
        return _query;
      }
    };
  }

  @Override
  public Object insert(final Training training, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfTraining.insert(training);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object update(final Training training, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfTraining.handle(training);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object clearAll(final Continuation<? super Unit> p0) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfClearAll.acquire();
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfClearAll.release(_stmt);
        }
      }
    }, p0);
  }

  @Override
  public Object delete(final long key, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDelete.acquire();
        int _argIndex = 1;
        _stmt.bindLong(_argIndex, key);
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfDelete.release(_stmt);
        }
      }
    }, p1);
  }

  @Override
  public LiveData<Training> getTraining(final long key) {
    final String _sql = "SELECT * FROM volfam_training_table WHERE volfam_training_column_id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, key);
    return __db.getInvalidationTracker().createLiveData(new String[]{"volfam_training_table"}, false, new Callable<Training>() {
      @Override
      public Training call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfTrainingId = CursorUtil.getColumnIndexOrThrow(_cursor, "volfam_training_column_id");
          final int _cursorIndexOfGroup = CursorUtil.getColumnIndexOrThrow(_cursor, "volfam_training_column_group");
          final int _cursorIndexOfTrainer = CursorUtil.getColumnIndexOrThrow(_cursor, "volfam_training_column_trainer");
          final int _cursorIndexOfPlace = CursorUtil.getColumnIndexOrThrow(_cursor, "volfam_training_column_place");
          final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "volfam_training_column_date");
          final int _cursorIndexOfPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "volfam_training_column_price");
          final Training _result;
          if(_cursor.moveToFirst()) {
            final long _tmpTrainingId;
            _tmpTrainingId = _cursor.getLong(_cursorIndexOfTrainingId);
            final String _tmpGroup;
            _tmpGroup = _cursor.getString(_cursorIndexOfGroup);
            final String _tmpTrainer;
            _tmpTrainer = _cursor.getString(_cursorIndexOfTrainer);
            final String _tmpPlace;
            _tmpPlace = _cursor.getString(_cursorIndexOfPlace);
            final long _tmpDate;
            _tmpDate = _cursor.getLong(_cursorIndexOfDate);
            final int _tmpPrice;
            _tmpPrice = _cursor.getInt(_cursorIndexOfPrice);
            _result = new Training(_tmpTrainingId,_tmpGroup,_tmpTrainer,_tmpPlace,_tmpDate,_tmpPrice);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public LiveData<List<Training>> getAllTrainings() {
    final String _sql = "SELECT * FROM volfam_training_table ORDER BY volfam_training_column_date DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"volfam_training_table"}, false, new Callable<List<Training>>() {
      @Override
      public List<Training> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfTrainingId = CursorUtil.getColumnIndexOrThrow(_cursor, "volfam_training_column_id");
          final int _cursorIndexOfGroup = CursorUtil.getColumnIndexOrThrow(_cursor, "volfam_training_column_group");
          final int _cursorIndexOfTrainer = CursorUtil.getColumnIndexOrThrow(_cursor, "volfam_training_column_trainer");
          final int _cursorIndexOfPlace = CursorUtil.getColumnIndexOrThrow(_cursor, "volfam_training_column_place");
          final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "volfam_training_column_date");
          final int _cursorIndexOfPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "volfam_training_column_price");
          final List<Training> _result = new ArrayList<Training>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Training _item;
            final long _tmpTrainingId;
            _tmpTrainingId = _cursor.getLong(_cursorIndexOfTrainingId);
            final String _tmpGroup;
            _tmpGroup = _cursor.getString(_cursorIndexOfGroup);
            final String _tmpTrainer;
            _tmpTrainer = _cursor.getString(_cursorIndexOfTrainer);
            final String _tmpPlace;
            _tmpPlace = _cursor.getString(_cursorIndexOfPlace);
            final long _tmpDate;
            _tmpDate = _cursor.getLong(_cursorIndexOfDate);
            final int _tmpPrice;
            _tmpPrice = _cursor.getInt(_cursorIndexOfPrice);
            _item = new Training(_tmpTrainingId,_tmpGroup,_tmpTrainer,_tmpPlace,_tmpDate,_tmpPrice);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public LiveData<List<Training>> getFilteredTrainings(final List<String> groups,
      final List<String> trainers, final List<String> places, final int minPrice,
      final int maxPrice, final long startDate, final long endDate) {
    StringBuilder _stringBuilder = StringUtil.newStringBuilder();
    _stringBuilder.append("SELECT ");
    _stringBuilder.append("*");
    _stringBuilder.append(" FROM volfam_training_table WHERE volfam_training_column_group IN (");
    final int _inputSize = groups.size();
    StringUtil.appendPlaceholders(_stringBuilder, _inputSize);
    _stringBuilder.append(") AND volfam_training_column_trainer IN (");
    final int _inputSize_1 = trainers.size();
    StringUtil.appendPlaceholders(_stringBuilder, _inputSize_1);
    _stringBuilder.append(") AND volfam_training_column_place IN (");
    final int _inputSize_2 = places.size();
    StringUtil.appendPlaceholders(_stringBuilder, _inputSize_2);
    _stringBuilder.append(") AND volfam_training_column_price BETWEEN (");
    _stringBuilder.append("?");
    _stringBuilder.append(") AND (");
    _stringBuilder.append("?");
    _stringBuilder.append(")AND volfam_training_column_date BETWEEN (");
    _stringBuilder.append("?");
    _stringBuilder.append(") AND (");
    _stringBuilder.append("?");
    _stringBuilder.append(")ORDER BY volfam_training_column_date DESC");
    final String _sql = _stringBuilder.toString();
    final int _argCount = 4 + _inputSize + _inputSize_1 + _inputSize_2;
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, _argCount);
    int _argIndex = 1;
    for (String _item : groups) {
      if (_item == null) {
        _statement.bindNull(_argIndex);
      } else {
        _statement.bindString(_argIndex, _item);
      }
      _argIndex ++;
    }
    _argIndex = 1 + _inputSize;
    for (String _item_1 : trainers) {
      if (_item_1 == null) {
        _statement.bindNull(_argIndex);
      } else {
        _statement.bindString(_argIndex, _item_1);
      }
      _argIndex ++;
    }
    _argIndex = 1 + _inputSize + _inputSize_1;
    for (String _item_2 : places) {
      if (_item_2 == null) {
        _statement.bindNull(_argIndex);
      } else {
        _statement.bindString(_argIndex, _item_2);
      }
      _argIndex ++;
    }
    _argIndex = 1 + _inputSize + _inputSize_1 + _inputSize_2;
    _statement.bindLong(_argIndex, minPrice);
    _argIndex = 2 + _inputSize + _inputSize_1 + _inputSize_2;
    _statement.bindLong(_argIndex, maxPrice);
    _argIndex = 3 + _inputSize + _inputSize_1 + _inputSize_2;
    _statement.bindLong(_argIndex, startDate);
    _argIndex = 4 + _inputSize + _inputSize_1 + _inputSize_2;
    _statement.bindLong(_argIndex, endDate);
    return __db.getInvalidationTracker().createLiveData(new String[]{"volfam_training_table"}, false, new Callable<List<Training>>() {
      @Override
      public List<Training> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfTrainingId = CursorUtil.getColumnIndexOrThrow(_cursor, "volfam_training_column_id");
          final int _cursorIndexOfGroup = CursorUtil.getColumnIndexOrThrow(_cursor, "volfam_training_column_group");
          final int _cursorIndexOfTrainer = CursorUtil.getColumnIndexOrThrow(_cursor, "volfam_training_column_trainer");
          final int _cursorIndexOfPlace = CursorUtil.getColumnIndexOrThrow(_cursor, "volfam_training_column_place");
          final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "volfam_training_column_date");
          final int _cursorIndexOfPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "volfam_training_column_price");
          final List<Training> _result = new ArrayList<Training>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Training _item_3;
            final long _tmpTrainingId;
            _tmpTrainingId = _cursor.getLong(_cursorIndexOfTrainingId);
            final String _tmpGroup;
            _tmpGroup = _cursor.getString(_cursorIndexOfGroup);
            final String _tmpTrainer;
            _tmpTrainer = _cursor.getString(_cursorIndexOfTrainer);
            final String _tmpPlace;
            _tmpPlace = _cursor.getString(_cursorIndexOfPlace);
            final long _tmpDate;
            _tmpDate = _cursor.getLong(_cursorIndexOfDate);
            final int _tmpPrice;
            _tmpPrice = _cursor.getInt(_cursorIndexOfPrice);
            _item_3 = new Training(_tmpTrainingId,_tmpGroup,_tmpTrainer,_tmpPlace,_tmpDate,_tmpPrice);
            _result.add(_item_3);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Object getMaxPrice(final Continuation<? super Integer> p0) {
    final String _sql = "SELECT MAX (volfam_training_column_price) FROM volfam_training_table";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.execute(__db, false, new Callable<Integer>() {
      @Override
      public Integer call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final Integer _result;
          if(_cursor.moveToFirst()) {
            final Integer _tmp;
            if (_cursor.isNull(0)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getInt(0);
            }
            _result = _tmp;
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, p0);
  }
}
