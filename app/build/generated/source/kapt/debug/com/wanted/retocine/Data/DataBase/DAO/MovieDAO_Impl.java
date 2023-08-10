package com.wanted.retocine.Data.DataBase.DAO;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.wanted.retocine.Data.DataBase.Entities.MovieEntity;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class MovieDAO_Impl implements MovieDAO {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<MovieEntity> __insertionAdapterOfMovieEntity;

  public MovieDAO_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfMovieEntity = new EntityInsertionAdapter<MovieEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `Movie_Table` (`MovieID`,`MovieModelName`,`MovieModelReleaseDate`,`MovieModelVoteAverage`,`MovieModelSynopsis`,`MovieModelCountry`,`MovieModelDirector`,`MovieModelPhoto`) VALUES (nullif(?, 0),?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, MovieEntity value) {
        stmt.bindLong(1, value.getMovieID());
        if (value.getMovieModelName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getMovieModelName());
        }
        if (value.getMovieModelReleaseDate() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getMovieModelReleaseDate());
        }
        if (value.getMovieModelVoteAverage() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getMovieModelVoteAverage());
        }
        if (value.getMovieModelSynopsis() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getMovieModelSynopsis());
        }
        if (value.getMovieModelCountry() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getMovieModelCountry());
        }
        if (value.getMovieModelDirector() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getMovieModelDirector());
        }
        if (value.getMovieModelPhoto() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getMovieModelPhoto());
        }
      }
    };
  }

  @Override
  public void insertAllMovies(final List<MovieEntity> movies) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfMovieEntity.insert(movies);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<MovieEntity> getAllMovies() {
    final String _sql = "SELECT * FROM Movie_Table";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfMovieID = CursorUtil.getColumnIndexOrThrow(_cursor, "MovieID");
      final int _cursorIndexOfMovieModelName = CursorUtil.getColumnIndexOrThrow(_cursor, "MovieModelName");
      final int _cursorIndexOfMovieModelReleaseDate = CursorUtil.getColumnIndexOrThrow(_cursor, "MovieModelReleaseDate");
      final int _cursorIndexOfMovieModelVoteAverage = CursorUtil.getColumnIndexOrThrow(_cursor, "MovieModelVoteAverage");
      final int _cursorIndexOfMovieModelSynopsis = CursorUtil.getColumnIndexOrThrow(_cursor, "MovieModelSynopsis");
      final int _cursorIndexOfMovieModelCountry = CursorUtil.getColumnIndexOrThrow(_cursor, "MovieModelCountry");
      final int _cursorIndexOfMovieModelDirector = CursorUtil.getColumnIndexOrThrow(_cursor, "MovieModelDirector");
      final int _cursorIndexOfMovieModelPhoto = CursorUtil.getColumnIndexOrThrow(_cursor, "MovieModelPhoto");
      final List<MovieEntity> _result = new ArrayList<MovieEntity>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final MovieEntity _item;
        final int _tmpMovieID;
        _tmpMovieID = _cursor.getInt(_cursorIndexOfMovieID);
        final String _tmpMovieModelName;
        if (_cursor.isNull(_cursorIndexOfMovieModelName)) {
          _tmpMovieModelName = null;
        } else {
          _tmpMovieModelName = _cursor.getString(_cursorIndexOfMovieModelName);
        }
        final String _tmpMovieModelReleaseDate;
        if (_cursor.isNull(_cursorIndexOfMovieModelReleaseDate)) {
          _tmpMovieModelReleaseDate = null;
        } else {
          _tmpMovieModelReleaseDate = _cursor.getString(_cursorIndexOfMovieModelReleaseDate);
        }
        final String _tmpMovieModelVoteAverage;
        if (_cursor.isNull(_cursorIndexOfMovieModelVoteAverage)) {
          _tmpMovieModelVoteAverage = null;
        } else {
          _tmpMovieModelVoteAverage = _cursor.getString(_cursorIndexOfMovieModelVoteAverage);
        }
        final String _tmpMovieModelSynopsis;
        if (_cursor.isNull(_cursorIndexOfMovieModelSynopsis)) {
          _tmpMovieModelSynopsis = null;
        } else {
          _tmpMovieModelSynopsis = _cursor.getString(_cursorIndexOfMovieModelSynopsis);
        }
        final String _tmpMovieModelCountry;
        if (_cursor.isNull(_cursorIndexOfMovieModelCountry)) {
          _tmpMovieModelCountry = null;
        } else {
          _tmpMovieModelCountry = _cursor.getString(_cursorIndexOfMovieModelCountry);
        }
        final String _tmpMovieModelDirector;
        if (_cursor.isNull(_cursorIndexOfMovieModelDirector)) {
          _tmpMovieModelDirector = null;
        } else {
          _tmpMovieModelDirector = _cursor.getString(_cursorIndexOfMovieModelDirector);
        }
        final String _tmpMovieModelPhoto;
        if (_cursor.isNull(_cursorIndexOfMovieModelPhoto)) {
          _tmpMovieModelPhoto = null;
        } else {
          _tmpMovieModelPhoto = _cursor.getString(_cursorIndexOfMovieModelPhoto);
        }
        _item = new MovieEntity(_tmpMovieID,_tmpMovieModelName,_tmpMovieModelReleaseDate,_tmpMovieModelVoteAverage,_tmpMovieModelSynopsis,_tmpMovieModelCountry,_tmpMovieModelDirector,_tmpMovieModelPhoto);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
