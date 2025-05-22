package com.google.android.gms.common.stats.net.contentprovider;

import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import com.google.android.chimera.ContentProvider;
import defpackage.a;
import defpackage.auid;
import defpackage.aumq;
import defpackage.auof;
import defpackage.auog;
import defpackage.ausn;
import defpackage.ausv;
import defpackage.auub;
import defpackage.eluo;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class NetworkUsageChimeraContentProvider extends ContentProvider {
    private static final ausn a = ausn.b("NetworkUsageCP", auid.CORE);
    private static final Uri b;
    private static final UriMatcher c;
    private ausv d;

    static {
        Uri parse = Uri.parse("content://com.google.android.gms.common.stats.net.contentprovider");
        b = parse;
        Uri.withAppendedPath(parse, "networkrawreport");
        Uri.withAppendedPath(parse, "networkrawreportAndroidN");
        Uri.withAppendedPath(parse, "networksummaryrangereport");
        Uri.withAppendedPath(parse, "networkentriessummaryreport");
        Uri.withAppendedPath(parse, "networkentriessummaryreportAndroidN");
        Uri.withAppendedPath(parse, "networktypefortags");
        Uri.withAppendedPath(parse, "networktypefortagsAndroidN");
        Uri.withAppendedPath(parse, "insertorupdatebulk");
        Uri.withAppendedPath(parse, "insertorupdatebulkAndroidN");
        Uri.withAppendedPath(parse, "groupusageinrange");
        Uri.withAppendedPath(parse, "groupusageinrangeAndroidN");
        UriMatcher uriMatcher = new UriMatcher(-1);
        c = uriMatcher;
        uriMatcher.addURI("com.google.android.gms.common.stats.net.contentprovider", "networkrawreport", 10);
        uriMatcher.addURI("com.google.android.gms.common.stats.net.contentprovider", "networkrawreportAndroidN", 11);
        uriMatcher.addURI("com.google.android.gms.common.stats.net.contentprovider", "networksummaryrangereport", 20);
        uriMatcher.addURI("com.google.android.gms.common.stats.net.contentprovider", "networkentriessummaryreport", 30);
        uriMatcher.addURI("com.google.android.gms.common.stats.net.contentprovider", "networkentriessummaryreportAndroidN", 31);
        uriMatcher.addURI("com.google.android.gms.common.stats.net.contentprovider", "networktypefortags", 40);
        uriMatcher.addURI("com.google.android.gms.common.stats.net.contentprovider", "networktypefortagsAndroidN", 41);
        uriMatcher.addURI("com.google.android.gms.common.stats.net.contentprovider", "insertorupdatebulk", 60);
        uriMatcher.addURI("com.google.android.gms.common.stats.net.contentprovider", "insertorupdatebulkAndroidN", 61);
        uriMatcher.addURI("com.google.android.gms.common.stats.net.contentprovider", "groupusageinrange", 70);
        uriMatcher.addURI("com.google.android.gms.common.stats.net.contentprovider", "groupusageinrangeAndroidN", 71);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00ee  */
    @Override // com.google.android.chimera.ContentProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int bulkInsert(android.net.Uri r19, android.content.ContentValues[] r20) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.stats.net.contentprovider.NetworkUsageChimeraContentProvider.bulkInsert(android.net.Uri, android.content.ContentValues[]):int");
    }

    @Override // com.google.android.chimera.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        String str2;
        SQLiteDatabase writableDatabase;
        int match = c.match(uri);
        try {
            if (match != 10) {
                if (match != 11) {
                    throw new IllegalArgumentException(String.format(a.N(uri, "Unknown URI: "), new Object[0]));
                }
                if (auub.a() && ((Boolean) aumq.a.b()).booleanValue()) {
                    str2 = "network_raw_entry_androidN";
                    writableDatabase = this.d.getWritableDatabase();
                }
                return -1;
            }
            str2 = "network_raw_entry";
            writableDatabase = this.d.getWritableDatabase();
            int delete = writableDatabase.delete(str2, str, strArr);
            getContext().getContentResolver().notifyChange(uri, null);
            return delete;
        } catch (SQLiteException e) {
            ((eluo) ((eluo) a.i()).s(e)).x("ContentProvider delete exception.");
            return -1;
        }
    }

    @Override // com.google.android.chimera.ContentProvider
    public final String getType(Uri uri) {
        return null;
    }

    @Override // com.google.android.chimera.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        if (auub.a() && ((Boolean) aumq.a.b()).booleanValue()) {
            return null;
        }
        if (c.match(uri) != 10) {
            throw new IllegalArgumentException(String.format("Unknown URI: ".concat(String.valueOf(String.valueOf(uri))), new Object[0]));
        }
        try {
            long insert = this.d.getWritableDatabase().insert("network_raw_entry", null, contentValues);
            getContext().getContentResolver().notifyChange(uri, null);
            return Uri.parse("networkrawreport/" + insert);
        } catch (SQLiteException e) {
            ((eluo) ((eluo) a.i()).s(e)).x("ContentProvider insert exception.");
            return null;
        }
    }

    @Override // com.google.android.chimera.ContentProvider
    public final boolean onCreate() {
        if (auub.a() && ((Boolean) aumq.a.b()).booleanValue()) {
            this.d = new auof(getContext());
            return true;
        }
        this.d = new auog(getContext());
        return true;
    }

    @Override // com.google.android.chimera.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int match = c.match(uri);
        try {
            if (match == 10) {
                Cursor query = this.d.getWritableDatabase().query("network_raw_entry", strArr, str, strArr2, null, null, str2);
                query.setNotificationUri(getContext().getContentResolver(), uri);
                return query;
            }
            if (match == 11) {
                if (auub.a() && ((Boolean) aumq.a.b()).booleanValue()) {
                    Cursor query2 = this.d.getWritableDatabase().query("network_raw_entry_androidN", strArr, str, strArr2, null, null, str2);
                    query2.setNotificationUri(getContext().getContentResolver(), uri);
                    return query2;
                }
                return null;
            }
            if (match == 20) {
                Cursor rawQuery = this.d.getWritableDatabase().rawQuery("SELECT MAX(_id) AS _id, SUM(rxbytes) AS rxbytes, SUM(rxpackets) AS rxpackets, SUM(txbytes) AS txbytes, SUM(txpackets) AS txpackets FROM network_raw_entry WHERE datetime_updated BETWEEN ? AND ? AND iface = ? AND tag = ? AND uid = ? AND counter_set = ? AND device_state = ? AND transport_type = ? GROUP BY iface, transport_type, tag, uid", strArr2);
                rawQuery.setNotificationUri(getContext().getContentResolver(), uri);
                return rawQuery;
            }
            if (match == 30) {
                Cursor rawQuery2 = this.d.getWritableDatabase().rawQuery("SELECT MAX(_id) AS _id, iface, tag, uid, device_state, transport_type, MIN(datetime_updated) AS from_datetime_updated, MAX(datetime_updated) AS to_datetime_updated, TOTAL(CASE WHEN counter_set = 0 THEN rxbytes ELSE 0 END) AS background_rxbytes, TOTAL(CASE WHEN counter_set = 0 THEN rxpackets ELSE 0 END) AS background_rxpackets, TOTAL(CASE WHEN counter_set = 0 THEN txbytes ELSE 0 END) AS background_txbytes, TOTAL(CASE WHEN counter_set = 0 THEN txpackets ELSE 0 END) AS background_txpackets, TOTAL(CASE WHEN counter_set = 1 THEN rxbytes ELSE 0 END) AS foreground_rxbytes, TOTAL(CASE WHEN counter_set = 1 THEN rxpackets ELSE 0 END) AS foreground_rxpackets, TOTAL(CASE WHEN counter_set = 1 THEN txbytes ELSE 0 END) AS foreground_txbytes, TOTAL(CASE WHEN counter_set = 1 THEN txpackets ELSE 0 END) AS foreground_txpackets, TOTAL(rxbytes + txbytes) AS total_bytes FROM network_raw_entry WHERE datetime_updated BETWEEN ? AND ? GROUP BY iface, tag, uid, device_state, transport_type ORDER BY total_bytes DESC , tag DESC", strArr2);
                rawQuery2.setNotificationUri(getContext().getContentResolver(), uri);
                return rawQuery2;
            }
            if (match == 31) {
                if (auub.a() && ((Boolean) aumq.a.b()).booleanValue()) {
                    Cursor rawQuery3 = this.d.getWritableDatabase().rawQuery("SELECT MAX(_id) AS _id, tag_androidN, uid_androidN, device_state_androidN, transport_type_androidN, MAX(datetime_updated_androidN) AS datetime_updated_androidN, from_datetime_updated_androidN, to_datetime_updated_androidN, rxbytes_androidN, txbytes_androidN, rxpackets_androidN, txpackets_androidN, TOTAL(rxbytes_androidN + txbytes_androidN) AS total_bytes_androidN, rxpackets_androidN, txpackets_androidN FROM network_raw_entry_androidN WHERE from_datetime_updated_androidN >= ? AND to_datetime_updated_androidN <= ? GROUP BY tag_androidN, uid_androidN, device_state_androidN, transport_type_androidN ORDER BY total_bytes_androidN DESC , tag_androidN DESC", strArr2);
                    rawQuery3.setNotificationUri(getContext().getContentResolver(), uri);
                    return rawQuery3;
                }
                return null;
            }
            if (match == 40) {
                Cursor rawQuery4 = this.d.getWritableDatabase().rawQuery("SELECT MAX(_id) AS _id, transport_type, tag, uid, device_state, MIN(datetime_updated) AS from_datetime_updated, MAX(datetime_updated) AS to_datetime_updated, TOTAL(CASE WHEN counter_set = 0 THEN rxbytes ELSE 0 END) AS background_rxbytes, TOTAL(CASE WHEN counter_set = 0 THEN rxpackets ELSE 0 END) AS background_rxpackets, TOTAL(CASE WHEN counter_set = 0 THEN txbytes ELSE 0 END) AS background_txbytes, TOTAL(CASE WHEN counter_set = 0 THEN txpackets ELSE 0 END) AS background_txpackets, TOTAL(CASE WHEN counter_set = 1 THEN rxbytes ELSE 0 END) AS foreground_rxbytes, TOTAL(CASE WHEN counter_set = 1 THEN rxpackets ELSE 0 END) AS foreground_rxpackets, TOTAL(CASE WHEN counter_set = 1 THEN txbytes ELSE 0 END) AS foreground_txbytes, TOTAL(CASE WHEN counter_set = 1 THEN txpackets ELSE 0 END) AS foreground_txpackets, TOTAL(rxbytes + txbytes) AS total_bytes FROM network_raw_entry WHERE datetime_updated BETWEEN ? AND ? AND transport_type = ? AND tag != 0 GROUP BY transport_type, tag ORDER BY total_bytes DESC , tag DESC", strArr2);
                rawQuery4.setNotificationUri(getContext().getContentResolver(), uri);
                return rawQuery4;
            }
            if (match == 41) {
                if (auub.a() && ((Boolean) aumq.a.b()).booleanValue()) {
                    Cursor rawQuery5 = this.d.getWritableDatabase().rawQuery("SELECT MAX(_id) AS _id, transport_type_androidN, tag_androidN, uid_androidN, device_state_androidN, MAX(datetime_updated_androidN) AS datetime_updated_androidN, from_datetime_updated_androidN, to_datetime_updated_androidN, rxbytes_androidN, txbytes_androidN, TOTAL(rxbytes_androidN + txbytes_androidN) AS total_bytes_androidN, rxpackets_androidN, txpackets_androidN FROM network_raw_entry_androidN WHERE from_datetime_updated_androidN >= ? AND to_datetime_updated_androidN <= ? AND transport_type_androidN = ? AND tag_androidN != 0 GROUP BY transport_type_androidN, tag_androidN ORDER BY total_bytes_androidN DESC , tag_androidN DESC", strArr2);
                    rawQuery5.setNotificationUri(getContext().getContentResolver(), uri);
                    return rawQuery5;
                }
                return null;
            }
            if (match == 70) {
                Cursor rawQuery6 = this.d.getWritableDatabase().rawQuery("SELECT MAX(_id) AS _id, iface, tag, uid, counter_set, device_state, transport_type, MAX(datetime_updated) AS datetime_updated, COUNT(*) AS row_group_count, SUM(rxbytes) AS rxbytes, SUM(rxpackets) AS rxpackets, SUM(txbytes) AS txbytes, SUM(txpackets) AS txpackets FROM network_raw_entry WHERE datetime_updated BETWEEN ? AND ? GROUP BY iface, tag, uid, counter_set, device_state, transport_type ORDER BY datetime_updated DESC ", strArr2);
                rawQuery6.setNotificationUri(getContext().getContentResolver(), uri);
                return rawQuery6;
            }
            if (match != 71) {
                throw new IllegalArgumentException(String.format(a.N(uri, "Unknown URI: "), new Object[0]));
            }
            if (auub.a() && ((Boolean) aumq.a.b()).booleanValue()) {
                Cursor rawQuery7 = this.d.getWritableDatabase().rawQuery("SELECT MAX(_id) AS _id, tag_androidN, uid_androidN, device_state_androidN, transport_type_androidN, MAX(datetime_updated_androidN) AS datetime_updated_androidN, from_datetime_updated_androidN, to_datetime_updated_androidN, COUNT(*) AS row_group_count_AndroidN, SUM(rxbytes_androidN) AS rxbytes_androidN, SUM(rxpackets_androidN) AS rxpackets_androidN, SUM(txbytes_androidN) AS txbytes_androidN, SUM(txpackets_androidN) AS txpackets_androidN FROM network_raw_entry_androidN WHERE from_datetime_updated_androidN >= ? AND to_datetime_updated_androidN <= ? GROUP BY tag_androidN, uid_androidN, device_state_androidN, transport_type_androidN ORDER BY datetime_updated_androidN DESC ", strArr2);
                rawQuery7.setNotificationUri(getContext().getContentResolver(), uri);
                return rawQuery7;
            }
            return null;
        } catch (SQLiteException e) {
            ((eluo) ((eluo) a.i()).s(e)).x("ContentProvider query exception.");
            return null;
        }
    }

    @Override // com.google.android.chimera.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        if (auub.a() && ((Boolean) aumq.a.b()).booleanValue()) {
            return -1;
        }
        if (c.match(uri) != 10) {
            throw new IllegalArgumentException(String.format("Unknown URI: ".concat(String.valueOf(String.valueOf(uri))), new Object[0]));
        }
        try {
            int update = this.d.getWritableDatabase().update("network_raw_entry", contentValues, str, strArr);
            getContext().getContentResolver().notifyChange(uri, null);
            return update;
        } catch (SQLiteException e) {
            ((eluo) ((eluo) a.i()).s(e)).x("ContentProvider update exception.");
            return -1;
        }
    }
}
