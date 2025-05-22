package com.google.android.gms.reminders.provider;

import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteQueryBuilder;
import android.net.Uri;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.reminders.model.CustomizedSnoozePreset;
import com.google.android.gms.reminders.model.CustomizedSnoozePresetEntity;
import defpackage.a;
import defpackage.atzb;
import defpackage.auid;
import defpackage.aujm;
import defpackage.aujn;
import defpackage.aupz;
import defpackage.ausn;
import defpackage.bsj;
import defpackage.bsk;
import defpackage.bsl;
import defpackage.bsup;
import defpackage.czmy;
import defpackage.cznc;
import defpackage.cznh;
import defpackage.cznj;
import defpackage.cznl;
import defpackage.cznq;
import defpackage.cznr;
import defpackage.cznu;
import defpackage.cznv;
import defpackage.czow;
import defpackage.czoy;
import defpackage.czqz;
import defpackage.czra;
import defpackage.czrb;
import defpackage.czrc;
import defpackage.eluo;
import defpackage.fulw;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class RemindersChimeraProvider extends aujm {
    private static final ausn b = ausn.b("RemindersProvider", auid.REMINDERS);
    private static final UriMatcher c;
    private static final Map d;
    private static final Map e;
    private static final Map f;
    private static final Map g;
    private static final Map h;
    private static final Map i;
    private static final Map j;
    private static final String[] k;
    private SQLiteDatabase l;
    private bsup m;
    private cznc n;
    private boolean r;
    private boolean s;
    private final ArrayList o = new ArrayList();
    private final ArrayList p = new ArrayList();
    private final ArrayList q = new ArrayList();
    private final ThreadPoolExecutor t = new aupz(1, 9);

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        c = uriMatcher;
        d = new HashMap();
        e = new HashMap();
        f = new HashMap();
        g = new HashMap();
        h = new HashMap();
        i = new HashMap();
        j = new HashMap();
        uriMatcher.addURI("com.google.android.gms.reminders", "account", 100);
        uriMatcher.addURI("com.google.android.gms.reminders", "account/#", 101);
        uriMatcher.addURI("com.google.android.gms.reminders", "reminders", 200);
        uriMatcher.addURI("com.google.android.gms.reminders", "reminders/#", 201);
        uriMatcher.addURI("com.google.android.gms.reminders", "reminders/upsert", 202);
        uriMatcher.addURI("com.google.android.gms.reminders", "reminders/refresh_due_date", 203);
        uriMatcher.addURI("com.google.android.gms.reminders", "reminders/mark_exceptional", 204);
        uriMatcher.addURI("com.google.android.gms.reminders", "reminders/update_fired/#", 205);
        uriMatcher.addURI("com.google.android.gms.reminders", "reminders/update_bumped", 206);
        uriMatcher.addURI("com.google.android.gms.reminders", "notification", 300);
        uriMatcher.addURI("com.google.android.gms.reminders", "notification/#", 301);
        uriMatcher.addURI("com.google.android.gms.reminders", "reminder_notifications", 302);
        uriMatcher.addURI("com.google.android.gms.reminders", "reminder_events", 400);
        uriMatcher.addURI("com.google.android.gms.reminders", "operations", 600);
        uriMatcher.addURI("com.google.android.gms.reminders", "operations/#", 601);
        uriMatcher.addURI("com.google.android.gms.reminders", "place_aliases", 700);
        uriMatcher.addURI("com.google.android.gms.reminders", "place_aliases/#", 701);
        String[] strArr = {"_id", "account_name", "storage_version", "sync_status", "morning_customized_time", "afternoon_customized_time", "evening_customized_time", "account_state", "need_sync_snooze_preset", "was_last_sync_error"};
        for (int i2 = 0; i2 < 10; i2++) {
            String str = strArr[i2];
            d.put(str, "account.".concat(String.valueOf(str)));
        }
        String[] strArr2 = {"_id", "account_id", "reminder_type", "client_assigned_id", "server_assigned_id", "client_assigned_thread_id", "task_list", "title", "created_time_millis", "archived_time_ms", "archived", "deleted", "pinned", "snoozed", "snoozed_time_millis", "location_snoozed_until_ms", "due_date_year", "due_date_month", "due_date_day", "due_date_hour", "due_date_minute", "due_date_second", "due_date_period", "due_date_absolute_time_ms", "due_date_date_range", "due_date_unspecified_future_time", "due_date_all_day", "due_date_millis", "event_date_year", "event_date_month", "event_date_day", "event_date_hour", "event_date_minute", "event_date_second", "event_date_period", "event_date_absolute_time_ms", "event_date_date_range", "event_date_unspecified_future_time", "event_date_all_day", "lat", "lng", "name", "radius_meters", "location_type", "display_address", "address_country", "address_locality", "address_region", "address_street_address", "address_street_number", "address_street_name", "address_postal_code", "address_name", "location_cell_id", "location_fprint", "location_alias_id", "location_query", "location_query_type", "chain_id_cell_id", "chain_id_fprint", "chain_name", "category_id", "display_name", "recurrence_id", "recurrence_master", "recurrence_exceptional", "recurrence_frequency", "recurrence_every", "recurrence_start_year", "recurrence_start_month", "recurrence_start_day", "recurrence_start_hour", "recurrence_start_minute", "recurrence_start_second", "recurrence_start_period", "recurrence_start_absolute_time_ms", "recurrence_start_date_range", "recurrence_start_unspecified_future_time", "recurrence_start_all_day", "recurrence_end_year", "recurrence_end_month", "recurrence_end_day", "recurrence_end_hour", "recurrence_end_minute", "recurrence_end_second", "recurrence_end_period", "recurrence_end_absolute_time_ms", "recurrence_end_date_range", "recurrence_end_unspecified_future_time", "recurrence_end_all_day", "recurrence_end_num_occurrences", "recurrence_end_auto_renew", "recurrence_end_auto_renew_until_year", "recurrence_end_auto_renew_until_month", "recurrence_end_auto_renew_until_day", "recurrence_end_auto_renew_until_hour", "recurrence_end_auto_renew_until_minute", "recurrence_end_auto_renew_until_second", "recurrence_end_auto_renew_until_period", "recurrence_end_auto_renew_until_absolute_time_ms", "recurrence_end_auto_renew_until_date_range", "recurrence_end_auto_renew_until_unspecified_future_time", "recurrence_end_auto_renew_until_all_day", "daily_pattern_hour", "daily_pattern_minute", "daily_pattern_second", "daily_pattern_period", "daily_pattern_all_day", "weekly_pattern_weekday", "monthly_pattern_month_day", "monthly_pattern_week_day", "monthly_pattern_week_day_number", "yearly_pattern_year_month", "yearly_pattern_monthly_pattern_month_day", "yearly_pattern_monthly_pattern_week_day", "yearly_pattern_monthly_pattern_week_day_number", "experiment", "extensions", "assistance", "link_application", "link_id", "fired_time_millis", "dirty_sync_bit", "place_types"};
        k = strArr2;
        for (int i3 = 0; i3 < 124; i3++) {
            String str2 = strArr2[i3];
            e.put(str2, "reminders.".concat(String.valueOf(str2)));
        }
        e.put("_count", "COUNT(*)");
        String[] strArr3 = {"_id", "trigger_time", "create_time", "schedule_time", "fire_time", "snooze_time", "dismiss_time"};
        for (int i4 = 0; i4 < 7; i4++) {
            String str3 = strArr3[i4];
            f.put(str3, "notification.".concat(String.valueOf(str3)));
        }
        String[] strArr4 = k;
        int length = strArr4.length;
        for (int i5 = 0; i5 < 124; i5++) {
            String str4 = strArr4[i5];
            g.put(str4, "reminders.".concat(String.valueOf(str4)));
        }
        g.putAll(f);
        Map map = h;
        map.putAll(e);
        map.put("_id", "reminders._id");
        map.put("account_name", "account.account_name");
        Map map2 = i;
        map2.put("_id", "operation._id");
        map2.put("operation_api", "operation.operation_api");
        map2.put("operation_request", "operation.operation_request");
        map2.put("error_count", "operation.error_count");
        Map map3 = j;
        map3.put("_id", "place_alias._id");
        map3.put("account_id", "place_alias.account_id");
        map3.put("alias_id", "place_alias.alias_id");
        map3.put("alias_name", "place_alias.alias_name");
        map3.put("place_id", "place_alias.place_id");
    }

    private final int l(ContentValues contentValues, String str, String[] strArr) {
        t(contentValues);
        Cursor query = this.l.query("reminders", new String[]{"_id"}, str, strArr, null, null, null);
        int i2 = 0;
        if (query != null) {
            while (query.moveToNext()) {
                try {
                    this.o.add(Long.valueOf(query.getLong(0)));
                } finally {
                    query.close();
                }
            }
        }
        Cursor query2 = this.l.query(true, "reminders", new String[]{"account_id"}, str, strArr, null, null, null, null);
        if (query2 == null) {
            return 0;
        }
        bsl bslVar = new bsl();
        while (query2.moveToNext()) {
            try {
                bslVar.add(Integer.valueOf(query2.getInt(0)));
            } catch (Throwable th) {
                query2.close();
                throw th;
            }
        }
        query2.close();
        bsk bskVar = new bsk(bslVar);
        while (bskVar.hasNext()) {
            Integer num = (Integer) bskVar.next();
            int intValue = num.intValue();
            contentValues.remove("due_date_millis");
            r(num, contentValues);
            String a = czrb.a(str, a.j(intValue, "account_id="));
            if (Boolean.TRUE.equals(contentValues.getAsBoolean("archived")) && contentValues.getAsLong("archived_time_ms") == null) {
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("archived_time_ms", Long.valueOf(System.currentTimeMillis()));
                this.l.update("reminders", contentValues2, czrb.a(a, "archived=0"), strArr);
                contentValues.remove("archived_time_ms");
            }
            i2 += this.l.update("reminders", contentValues, a, strArr);
        }
        return i2;
    }

    private final int m(String str, String[] strArr) {
        czrc.a();
        Cursor query = this.l.query("reminders", new String[]{"recurrence_id", "recurrence_exceptional", "due_date_millis", "account_id"}, str, strArr, null, null, null);
        if (query != null) {
            while (true) {
                try {
                    if (!query.moveToNext()) {
                        break;
                    }
                    String string = query.getString(0);
                    if (string == null) {
                        czrc.a();
                        break;
                    }
                    if (query.getInt(1) == 1) {
                        czrc.a();
                        break;
                    }
                    long j2 = query.getLong(2);
                    String string2 = query.getString(3);
                    czrc.a();
                    String[] strArr2 = {string, string2};
                    Cursor query2 = this.l.query("reminders", new String[]{"due_date_year", "due_date_month", "due_date_day", "due_date_hour", "due_date_minute", "due_date_second", "due_date_period", "due_date_absolute_time_ms"}, czrb.a(czrb.a("recurrence_id=? AND account_id=?", a.C(j2, "due_date_millis>")), "recurrence_exceptional IS NULL OR recurrence_exceptional!=1"), strArr2, null, null, "due_date_millis ASC", "1");
                    if (query2 == null) {
                        czrc.a();
                    } else {
                        try {
                            if (query2.moveToFirst()) {
                                query2.moveToFirst();
                                czrc.a();
                                ContentValues contentValues = new ContentValues();
                                contentValues.put("due_date_year", czra.a(query2, 0));
                                contentValues.put("due_date_month", czra.a(query2, 1));
                                contentValues.put("due_date_day", czra.a(query2, 2));
                                contentValues.put("due_date_hour", czra.a(query2, 3));
                                contentValues.put("due_date_minute", czra.a(query2, 4));
                                contentValues.put("due_date_second", czra.a(query2, 5));
                                contentValues.put("due_date_period", czra.a(query2, 6));
                                contentValues.put("due_date_absolute_time_ms", czra.b(query2, 7));
                                if (l(contentValues, czrb.a("recurrence_id=? AND account_id=?", "recurrence_master=1"), strArr2) != 1) {
                                    czrc.a();
                                }
                            } else {
                                czrc.a();
                            }
                        } finally {
                            query2.close();
                        }
                    }
                } finally {
                    query.close();
                }
            }
        } else {
            ((eluo) ((eluo) b.i()).ai((char) 9043)).B("Fired reminders not found in the provider. %s", czrc.a());
        }
        czrc.a();
        ContentValues contentValues2 = new ContentValues();
        contentValues2.put("snoozed", (Boolean) false);
        contentValues2.put("pinned", (Boolean) true);
        contentValues2.put("fired_time_millis", Long.valueOf(System.currentTimeMillis()));
        return l(contentValues2, str, strArr);
    }

    private final Uri n(ContentValues contentValues) {
        t(contentValues);
        Integer asInteger = contentValues.getAsInteger("account_id");
        if (asInteger == null) {
            throw new IllegalStateException("Missing accountId when creating reminders");
        }
        r(asInteger, contentValues);
        if (contentValues.getAsLong("created_time_millis") == null) {
            contentValues.put("created_time_millis", Long.valueOf(System.currentTimeMillis()));
        }
        Uri o = o("reminders", cznv.a, contentValues);
        if (o != null) {
            this.o.add(Long.valueOf(ContentUris.parseId(o)));
        }
        return o;
    }

    private final Uri o(String str, Uri uri, ContentValues contentValues) {
        long insert = this.l.insert(str, null, contentValues);
        if (insert == -1) {
            return null;
        }
        return ContentUris.withAppendedId(uri, insert);
    }

    private final bsj p() {
        Cursor query = this.l.query("account", new String[]{"_id", "morning_customized_time", "afternoon_customized_time", "evening_customized_time"}, null, null, null, null, null);
        bsj bsjVar = new bsj();
        if (query == null) {
            return bsjVar;
        }
        while (query.moveToNext()) {
            try {
                bsjVar.put(Integer.valueOf(query.getInt(0)), new CustomizedSnoozePresetEntity(czmy.b(query.getLong(1)), czmy.b(query.getLong(2)), czmy.b(query.getLong(3))));
            } finally {
                query.close();
            }
        }
        return bsjVar;
    }

    private final void q(ContentValues contentValues) {
        if (contentValues != null && contentValues.containsKey("silent_change")) {
            if (Boolean.TRUE.equals(contentValues.getAsBoolean("silent_change"))) {
                this.r = true;
            }
            contentValues.remove("silent_change");
        }
        if (fulw.k() && fulw.a.lK().F()) {
            this.r = true;
        }
        if (this.r) {
            czrc.a();
        }
    }

    private final void r(Integer num, ContentValues contentValues) {
        if (contentValues.containsKey("due_date_year") || contentValues.containsKey("due_date_month") || contentValues.containsKey("due_date_day") || contentValues.containsKey("due_date_hour") || contentValues.containsKey("due_date_minute") || contentValues.containsKey("due_date_second") || contentValues.containsKey("due_date_period") || contentValues.containsKey("due_date_absolute_time_ms")) {
            Long d2 = czqz.d(getContext(), contentValues.getAsInteger("due_date_year"), contentValues.getAsInteger("due_date_month"), contentValues.getAsInteger("due_date_day"), contentValues.getAsInteger("due_date_hour"), contentValues.getAsInteger("due_date_minute"), contentValues.getAsInteger("due_date_second"), contentValues.getAsInteger("due_date_period"), contentValues.getAsLong("due_date_absolute_time_ms"), (CustomizedSnoozePreset) p().get(num));
            if (d2 == null) {
                contentValues.putNull("due_date_millis");
            } else {
                contentValues.put("due_date_millis", d2);
            }
        }
    }

    private static final void s(ContentValues contentValues, String str) {
        if (contentValues.getAsInteger(str) == null) {
            contentValues.put(str, (Integer) 0);
        }
    }

    private static final void t(ContentValues contentValues) {
        if (contentValues.getAsInteger("due_date_hour") != null || contentValues.getAsInteger("due_date_minute") != null || contentValues.getAsInteger("due_date_second") != null) {
            s(contentValues, "due_date_hour");
            s(contentValues, "due_date_minute");
            s(contentValues, "due_date_second");
        }
        if (contentValues.getAsInteger("event_date_hour") == null && contentValues.getAsInteger("event_date_minute") == null && contentValues.getAsInteger("event_date_second") == null) {
            return;
        }
        s(contentValues, "event_date_hour");
        s(contentValues, "event_date_minute");
        s(contentValues, "event_date_second");
    }

    @Override // defpackage.aujm
    protected final int a(SQLiteDatabase sQLiteDatabase, Uri uri, String str, String[] strArr) {
        this.l = sQLiteDatabase;
        int match = c.match(uri);
        if (match == 100 || match == 101) {
            if (match == 101) {
                strArr = new String[]{uri.getLastPathSegment()};
                str = "_id=?";
            }
            return this.l.delete("account", str, strArr);
        }
        if (match == 200 || match == 201) {
            if (match == 201) {
                strArr = new String[]{uri.getLastPathSegment()};
                str = "_id=?";
            }
            atzb.t(str, "Cannot delete reminders with null selection");
            return this.l.delete("reminders", str, strArr);
        }
        if (match == 300 || match == 301) {
            if (match == 301) {
                strArr = new String[]{uri.getLastPathSegment()};
                str = "_id=?";
            }
            return this.l.delete("notification", str, strArr);
        }
        if (match == 600 || match == 601) {
            if (match == 601) {
                strArr = new String[]{uri.getLastPathSegment()};
                str = "_id=?";
            }
            return this.l.delete("operation", str, strArr);
        }
        if (match != 700 && match != 701) {
            return 0;
        }
        if (match == 701) {
            strArr = new String[]{uri.getLastPathSegment()};
            str = "_id=?";
        }
        return this.l.delete("place_alias", str, strArr);
    }

    @Override // defpackage.aujm
    protected final int b(SQLiteDatabase sQLiteDatabase, Uri uri, ContentValues contentValues, String str, String[] strArr) {
        String str2;
        String[] strArr2;
        Cursor query;
        String[] strArr3;
        int i2;
        String[] strArr4;
        String[] strArr5;
        Long asLong;
        byte[] asByteArray;
        String str3 = str;
        this.l = sQLiteDatabase;
        q(contentValues);
        int match = c.match(uri);
        boolean z = true;
        if (match == 100 || match == 101) {
            if (match == 101) {
                strArr2 = new String[]{uri.getLastPathSegment()};
                str2 = "_id=?";
            } else {
                str2 = str3;
                strArr2 = strArr;
            }
            int update = this.l.update("account", contentValues, str2, strArr2);
            if ((contentValues.containsKey("morning_customized_time") || contentValues.containsKey("afternoon_customized_time") || contentValues.containsKey("evening_customized_time")) && (query = this.l.query("account", new String[]{"_id"}, str2, strArr2, null, null, null)) != null) {
                ArrayList arrayList = new ArrayList();
                while (query.moveToNext()) {
                    try {
                        arrayList.add(Long.valueOf(query.getLong(0)));
                    } finally {
                    }
                }
                query.close();
                if (!arrayList.isEmpty()) {
                    this.q.addAll(arrayList);
                }
            }
            return update;
        }
        if (match == 200 || match == 201) {
            if (match == 201) {
                strArr3 = new String[]{uri.getLastPathSegment()};
                str3 = "_id=?";
            } else {
                strArr3 = strArr;
            }
            return l(contentValues, str3, strArr3);
        }
        if (match == 300 || match == 301) {
            if (match == 301) {
                i2 = 0;
                strArr4 = new String[]{uri.getLastPathSegment()};
                str3 = "_id=?";
            } else {
                i2 = 0;
                strArr4 = strArr;
            }
            if (contentValues.containsKey("state")) {
                contentValues.remove("state");
            }
            return contentValues.size() == 0 ? i2 : this.l.update("notification", contentValues, str3, strArr4);
        }
        if (match == 600 || match == 601) {
            if (match == 601) {
                strArr5 = new String[]{uri.getLastPathSegment()};
                str3 = "_id=?";
            } else {
                strArr5 = strArr;
            }
            return this.l.update("operation", contentValues, str3, strArr5);
        }
        switch (match) {
            case 203:
                int i3 = 0;
                this.s = true;
                query = this.l.query("reminders", new String[]{"_id", "account_id", "due_date_year", "due_date_month", "due_date_day", "due_date_hour", "due_date_minute", "due_date_second", "due_date_period", "due_date_absolute_time_ms"}, null, null, null, null, null);
                if (query == null) {
                    return 0;
                }
                bsj p = p();
                int i4 = 0;
                while (query.moveToNext()) {
                    try {
                        long j2 = query.getLong(i3);
                        Long d2 = czqz.d(getContext(), czra.a(query, 2), czra.a(query, 3), czra.a(query, 4), czra.a(query, 5), czra.a(query, 6), czra.a(query, 7), czra.a(query, 8), czra.b(query, 9), (CustomizedSnoozePreset) p.get(Integer.valueOf(query.getInt(1))));
                        ContentValues contentValues2 = new ContentValues();
                        if (d2 == null) {
                            contentValues2.putNull("due_date_millis");
                        } else {
                            contentValues2.put("due_date_millis", d2);
                        }
                        czrc.a();
                        i4 += this.l.update("reminders", contentValues2, "_id=?", new String[]{String.valueOf(j2)});
                        i3 = 0;
                    } finally {
                    }
                }
                return i4;
            case 204:
                Boolean asBoolean = contentValues.getAsBoolean("recurrence_exceptional");
                if ((asBoolean == null || !asBoolean.booleanValue()) && (query = this.l.query("reminders", null, str3, strArr, null, null, null)) != null) {
                    try {
                        if (query.getCount() == 1) {
                            query.moveToFirst();
                            if (query.getInt(query.getColumnIndex("recurrence_exceptional")) != 1 && query.getString(query.getColumnIndex("recurrence_id")) != null && query.getInt(query.getColumnIndex("recurrence_master")) != 1) {
                                Boolean asBoolean2 = contentValues.getAsBoolean("due_date_unspecified_future_time");
                                if ((asBoolean2 == null || !asBoolean2.booleanValue()) && ((asLong = contentValues.getAsLong("due_date_millis")) == null || asLong.longValue() < System.currentTimeMillis())) {
                                    String[] strArr6 = k;
                                    int length = strArr6.length;
                                    for (int i5 = 0; i5 < 124; i5++) {
                                        String str4 = strArr6[i5];
                                        if (!str4.equals("recurrence_exceptional") && !str4.equals("recurrence_id") && !str4.equals("recurrence_master") && !str4.equals("archived") && !str4.equals("archived_time_ms") && !str4.equals("deleted")) {
                                            int columnIndex = query.getColumnIndex(str4);
                                            int type = query.getType(columnIndex);
                                            if (type != 0) {
                                                if (type == 1) {
                                                    Object obj = contentValues.get(str4);
                                                    Long asLong2 = (obj == null || !(obj instanceof Boolean)) ? contentValues.getAsLong(str4) : Long.valueOf(true != ((Boolean) obj).booleanValue() ? 0L : 1L);
                                                    if (asLong2 != null && !asLong2.equals(Long.valueOf(query.getLong(columnIndex)))) {
                                                    }
                                                } else if (type == 2) {
                                                    Float asFloat = contentValues.getAsFloat(str4);
                                                    if (asFloat != null && !asFloat.equals(Float.valueOf(query.getFloat(columnIndex)))) {
                                                    }
                                                } else if (type == 3) {
                                                    String asString = contentValues.getAsString(str4);
                                                    if (asString != null && !asString.equals(query.getString(columnIndex))) {
                                                    }
                                                } else if (type == 4 && (asByteArray = contentValues.getAsByteArray(str4)) != null && Arrays.equals(asByteArray, query.getBlob(columnIndex))) {
                                                }
                                            } else if (contentValues.get(str4) != null) {
                                            }
                                        }
                                    }
                                }
                                contentValues.put("recurrence_exceptional", (Boolean) true);
                            }
                        }
                    } finally {
                    }
                }
                return l(contentValues, str3, strArr);
            case 205:
                String lastPathSegment = uri.getLastPathSegment();
                query = this.l.query("reminders LEFT OUTER JOIN notification ON reminders._id = notification._id", new String[]{"state"}, "notification._id=?", new String[]{lastPathSegment}, null, null, null);
                if (query != null) {
                    try {
                        if (query.moveToFirst()) {
                            Integer a = czra.a(query, 0);
                            if (a != null) {
                                if (a.intValue() == 2) {
                                    z = false;
                                }
                            }
                            if (z) {
                                String[] strArr7 = {lastPathSegment};
                                ContentValues contentValues3 = new ContentValues();
                                contentValues3.put("state", (Integer) 2);
                                contentValues3.put("fire_time", Long.valueOf(System.currentTimeMillis()));
                                this.l.update("notification", contentValues3, "_id=?", strArr7);
                                this.p.add(Long.valueOf(lastPathSegment));
                                return m("_id=?", strArr7);
                            }
                        }
                    } finally {
                    }
                }
                ((eluo) ((eluo) b.j()).ai(9034)).P("Asked to fire a reminder that should not be fired, id=%s %s", lastPathSegment, czrc.a());
                return 0;
            case 206:
                return m(str3, strArr);
            default:
                return 0;
        }
    }

    @Override // defpackage.aujm
    public final Cursor c(SQLiteDatabase sQLiteDatabase, Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        String str3;
        String[] strArr3;
        String str4;
        String[] strArr4;
        String str5;
        String[] strArr5;
        String str6;
        String[] strArr6;
        String str7;
        String[] strArr7;
        int match = c.match(uri);
        SQLiteQueryBuilder sQLiteQueryBuilder = new SQLiteQueryBuilder();
        sQLiteQueryBuilder.setStrict(true);
        if (match == 100 || match == 101) {
            if (match == 101) {
                str3 = "_id=?";
                strArr3 = new String[]{uri.getLastPathSegment()};
            } else {
                str3 = str;
                strArr3 = strArr2;
            }
            sQLiteQueryBuilder.setTables("account");
            sQLiteQueryBuilder.setProjectionMap(d);
            return sQLiteQueryBuilder.query(sQLiteDatabase, strArr, str3, strArr3, null, null, str2);
        }
        if (match == 200 || match == 201) {
            if (match == 201) {
                str4 = "reminders._id=?";
                strArr4 = new String[]{uri.getLastPathSegment()};
            } else {
                str4 = str;
                strArr4 = strArr2;
            }
            sQLiteQueryBuilder.setTables("reminders");
            sQLiteQueryBuilder.setProjectionMap(e);
            return sQLiteQueryBuilder.query(sQLiteDatabase, strArr, str4, strArr4, null, null, str2);
        }
        if (match == 400) {
            sQLiteQueryBuilder.setTables("reminders LEFT OUTER JOIN account ON reminders.account_id = account._id");
            sQLiteQueryBuilder.setProjectionMap(h);
            return sQLiteQueryBuilder.query(sQLiteDatabase, strArr, str, strArr2, null, null, null);
        }
        if (match == 600 || match == 601) {
            if (match == 601) {
                str5 = "_id=?";
                strArr5 = new String[]{uri.getLastPathSegment()};
            } else {
                str5 = str;
                strArr5 = strArr2;
            }
            sQLiteQueryBuilder.setTables("operation");
            sQLiteQueryBuilder.setProjectionMap(i);
            return sQLiteQueryBuilder.query(sQLiteDatabase, strArr, str5, strArr5, null, null, str2);
        }
        if (match == 700 || match == 701) {
            if (match == 701) {
                str6 = "_id=?";
                strArr6 = new String[]{uri.getLastPathSegment()};
            } else {
                str6 = str;
                strArr6 = strArr2;
            }
            sQLiteQueryBuilder.setTables("place_alias");
            sQLiteQueryBuilder.setProjectionMap(j);
            return sQLiteQueryBuilder.query(sQLiteDatabase, strArr, str6, strArr6, null, null, str2);
        }
        switch (match) {
            case 300:
            case 301:
                if (match == 301) {
                    str7 = "notification._id=?";
                    strArr7 = new String[]{uri.getLastPathSegment()};
                } else {
                    str7 = str;
                    strArr7 = strArr2;
                }
                sQLiteQueryBuilder.setTables("notification");
                sQLiteQueryBuilder.setProjectionMap(f);
                return sQLiteQueryBuilder.query(sQLiteDatabase, strArr, str7, strArr7, null, null, str2);
            case 302:
                sQLiteQueryBuilder.setTables("reminders LEFT OUTER JOIN notification ON reminders._id = notification._id");
                sQLiteQueryBuilder.setProjectionMap(g);
                return sQLiteQueryBuilder.query(sQLiteDatabase, strArr, str, strArr2, null, null, str2);
            default:
                return null;
        }
    }

    @Override // defpackage.aujm
    protected final Uri d(SQLiteDatabase sQLiteDatabase, Uri uri, ContentValues contentValues) {
        Uri withAppendedId;
        this.l = sQLiteDatabase;
        q(contentValues);
        int match = c.match(uri);
        if (match == 100) {
            return o("account", uri, contentValues);
        }
        if (match == 200) {
            return n(contentValues);
        }
        if (match != 202) {
            if (match != 600) {
                return null;
            }
            return o("operation", uri, contentValues);
        }
        atzb.c(contentValues.containsKey("account_id"), "Missing account_id when upserting reminder");
        atzb.c(contentValues.containsKey("client_assigned_id"), "Missing client_assigned_id when upserting reminder");
        Cursor query = this.l.query("reminders", new String[]{"_id"}, "client_assigned_id=? AND account_id=?", new String[]{contentValues.getAsString("client_assigned_id"), String.valueOf(contentValues.getAsInteger("account_id"))}, null, null, null);
        if (query != null) {
            try {
                if (query.getCount() != 0) {
                    query.moveToFirst();
                    long j2 = query.getLong(0);
                    l(contentValues, "_id=?", new String[]{String.valueOf(j2)});
                    withAppendedId = ContentUris.withAppendedId(cznv.a, j2);
                    return withAppendedId;
                }
            } finally {
                query.close();
            }
        }
        withAppendedId = n(contentValues);
        return withAppendedId;
    }

    @Override // defpackage.aujm
    protected final void e() {
        czow czowVar;
        cznl cznlVar;
        Context context = getContext();
        if (this.s) {
            czowVar = new czow(context, context.getContentResolver().query(cznr.b, czow.b, czrb.b(), null, null));
            cznlVar = !this.r ? new cznl(context, aujn.d(context, cznu.a, null, czrb.b(), null, null)) : null;
        } else {
            ArrayList arrayList = this.o;
            if (arrayList.isEmpty()) {
                czowVar = null;
                cznlVar = null;
            } else {
                czow czowVar2 = new czow(context, context.getContentResolver().query(cznr.b, czow.b, a.al(arrayList, "reminders._id IN (", ",", ")"), null, null));
                cznlVar = !this.r ? new cznl(context, aujn.d(context, cznu.a, null, a.a(czqz.h(arrayList), "reminders._id IN (", ")"), null, null)) : null;
                czowVar = czowVar2;
            }
        }
        if (czowVar != null) {
            this.t.execute(czowVar);
        }
        if (cznlVar != null) {
            this.t.execute(cznlVar);
        }
        if (!this.r) {
            ArrayList arrayList2 = this.p;
            if (arrayList2.size() > 1) {
                ((eluo) ((eluo) b.i()).ai((char) 9031)).B("Firing more than one task in a single transaction. %s", czrc.a());
            }
            if (!arrayList2.isEmpty()) {
                ArrayList arrayList3 = new ArrayList();
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList3.add(aujn.d(context, cznu.a, null, "reminders._id=?", new String[]{String.valueOf((Long) it.next())}, null));
                }
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    this.t.execute(new cznj(context, (DataHolder) it2.next()));
                }
            }
        }
        if (!this.r) {
            ArrayList arrayList4 = this.q;
            if (!arrayList4.isEmpty()) {
                this.t.execute(new cznh(context, aujn.d(context, cznq.a, new String[]{"account_name", "morning_customized_time", "afternoon_customized_time", "evening_customized_time"}, a.a(czqz.h(arrayList4), "account._id IN (", ")"), null, null)));
            }
        }
        ArrayList arrayList5 = this.o;
        if (!arrayList5.isEmpty()) {
            a(this.l, cznv.a, "deleted=1", null);
        }
        arrayList5.size();
        this.p.size();
        this.q.size();
        czrc.a();
    }

    @Override // defpackage.aujm
    protected final void g() {
        czrc.a();
        this.o.clear();
        this.p.clear();
        this.q.clear();
        this.r = false;
        this.s = false;
    }

    @Override // com.google.android.chimera.ContentProvider
    public final String getType(Uri uri) {
        return null;
    }

    @Override // defpackage.aujm
    protected final String i() {
        return "reminders.db";
    }

    @Override // defpackage.aujm
    protected final SQLiteOpenHelper j() {
        return czoy.c(getContext());
    }

    @Override // defpackage.aujm, com.google.android.chimera.ContentProvider
    public final boolean onCreate() {
        setShutdownAllowed(true);
        Context context = getContext();
        this.m = bsup.b(context);
        cznc czncVar = new cznc(context);
        this.n = czncVar;
        this.m.f(czncVar, null, true);
        return true;
    }

    @Override // com.google.android.chimera.ContentProvider
    public final void shutdown() {
        this.m.i(this.n);
        czoy.c(getContext()).close();
    }

    @Override // defpackage.aujm
    protected final void f() {
    }

    @Override // defpackage.aujm
    protected final void k() {
    }
}
