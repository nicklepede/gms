package com.google.android.gms.config;

import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteStatement;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.chimera.Service;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.config.ConfigChimeraService;
import com.google.android.gms.config.internal.ConfigExperimentPayload;
import com.google.android.gms.config.internal.FetchConfigIpcResponse;
import com.google.android.gms.config.internal.PackageConfigTable;
import defpackage.a;
import defpackage.aquo;
import defpackage.arnx;
import defpackage.arnz;
import defpackage.asoe;
import defpackage.astk;
import defpackage.asto;
import defpackage.astq;
import defpackage.asud;
import defpackage.asue;
import defpackage.bxhk;
import defpackage.bxhl;
import defpackage.deqr;
import defpackage.ejck;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class ConfigChimeraService extends Service {
    public static final /* synthetic */ int l = 0;
    public final Object b = new Object();
    public Map c = null;
    public Map d = null;
    public Map e = null;
    public Map f = null;
    public final Object g = new Object();
    public Set h = null;
    public boolean i = false;
    public asto j;
    public asue k;
    private PackageManager n;
    static final Charset a = Charset.forName("UTF-8");
    private static final char[] m = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static String d(List list) {
        if (list == null || list.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i));
            if (i != list.size() - 1) {
                sb.append(",");
            }
        }
        return sb.toString();
    }

    public static List e(List list, long j, int i) {
        ArrayList arrayList = list == null ? new ArrayList() : new ArrayList(list);
        arrayList.add(0, Long.valueOf(j));
        return arrayList.size() > i ? arrayList.subList(0, i) : arrayList;
    }

    static List f(String str) {
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str)) {
            for (String str2 : str.split(",")) {
                try {
                    arrayList.add(Long.valueOf(Long.parseLong(str2)));
                } catch (NumberFormatException e) {
                    Log.e("ConfigChimeraService", "Cannot parse fetch metadata timestamp ".concat(String.valueOf(str2)), e);
                }
            }
        }
        return arrayList;
    }

    public static final byte[] k(String str, Map map) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update((byte) 0);
            Charset charset = a;
            messageDigest.update(str.getBytes(charset));
            messageDigest.update((byte) 0);
            for (Map.Entry entry : map.entrySet()) {
                messageDigest.update(((String) entry.getKey()).getBytes(charset));
                messageDigest.update((byte) 0);
                messageDigest.update(((String) entry.getValue()).getBytes(charset));
                messageDigest.update((byte) 0);
            }
            return messageDigest.digest();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    public static final DataHolder l(List list) {
        String[] strArr = arnx.b;
        Parcelable.Creator creator = DataHolder.CREATOR;
        arnz arnzVar = new arnz(strArr);
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arnx.f(arnzVar, new ConfigExperimentPayload((byte[]) it.next()));
            }
        }
        return new DataHolder(arnzVar, 0);
    }

    public static final DataHolder m(Map map) {
        Bundle bundle = new Bundle();
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                Bundle bundle2 = new Bundle();
                for (Map.Entry entry2 : ((TreeMap) entry.getValue()).entrySet()) {
                    bundle2.putByteArray((String) entry2.getKey(), (byte[]) entry2.getValue());
                }
                bundle.putBundle((String) entry.getKey(), bundle2);
            }
        }
        PackageConfigTable packageConfigTable = new PackageConfigTable(bundle);
        String[] strArr = arnx.b;
        Parcelable.Creator creator = DataHolder.CREATOR;
        arnz arnzVar = new arnz(strArr);
        arnx.f(arnzVar, packageConfigTable);
        return new DataHolder(arnzVar, 0);
    }

    public static final void o(deqr deqrVar) {
        if (deqrVar.l()) {
            deqrVar.g();
        }
    }

    public static final void p(Map map, String str) {
        if (map == null) {
            return;
        }
        map.remove(String.valueOf(str).concat(":http_read_timeout_millis"));
        map.remove(String.valueOf(str).concat(":http_connection_timeout_millis"));
        map.remove(String.valueOf(str).concat(":throttling_failure_interval_seconds"));
        map.remove(String.valueOf(str).concat(":throttling_success_interval_seconds"));
        map.remove(String.valueOf(str).concat(":throttling_failure_rate"));
        map.remove(String.valueOf(str).concat(":throttling_success_rate"));
    }

    public static final void q(asud asudVar, int i) {
        DataHolder m2 = m(null);
        DataHolder l2 = l(null);
        asudVar.a(Status.b, new FetchConfigIpcResponse(i, m2, l2));
        if (!m2.g()) {
            m2.close();
        }
        if (l2.g()) {
            return;
        }
        l2.close();
    }

    private final void r(String str, String str2, Map map) {
        Cursor rawQuery = this.j.getReadableDatabase().rawQuery(a.a(str, "SELECT namespace, key, value FROM ", " WHERE package = ?"), new String[]{str2});
        while (rawQuery.moveToNext()) {
            try {
                String string = rawQuery.getString(0);
                String string2 = rawQuery.getString(1);
                byte[] blob = !rawQuery.isNull(2) ? rawQuery.getBlob(2) : null;
                "experiment".equals(str);
                if (string != null && string2 != null) {
                    TreeMap treeMap = (TreeMap) map.get(string);
                    if (blob != null) {
                        if (treeMap == null) {
                            treeMap = new TreeMap();
                            map.put(string, treeMap);
                        }
                        treeMap.put(string2, blob);
                    } else if (treeMap != null) {
                        treeMap.remove(string2);
                    }
                }
            } finally {
                rawQuery.close();
            }
        }
    }

    private static final void s(SQLiteDatabase sQLiteDatabase, String str, Map map) {
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT package, namespace, key, value FROM ".concat(str), null);
        while (rawQuery.moveToNext()) {
            try {
                String string = rawQuery.getString(0);
                String string2 = rawQuery.getString(1);
                String string3 = rawQuery.getString(2);
                byte[] blob = !rawQuery.isNull(3) ? rawQuery.getBlob(3) : null;
                if (string != null && string2 != null && string3 != null) {
                    HashMap hashMap = (HashMap) map.get(string);
                    if (hashMap == null) {
                        hashMap = new HashMap();
                        map.put(string, hashMap);
                    }
                    TreeMap treeMap = (TreeMap) hashMap.get(string2);
                    if (treeMap == null) {
                        treeMap = new TreeMap();
                        hashMap.put(string2, treeMap);
                    }
                    if (blob == null) {
                        treeMap.remove(string3);
                    } else {
                        treeMap.put(string3, blob);
                    }
                }
            } finally {
                rawQuery.close();
            }
        }
    }

    public final int a(String str, String str2, int i, int i2, int i3) {
        HashMap hashMap;
        synchronized (this.b) {
            Map map = this.e;
            hashMap = map != null ? new HashMap(map) : null;
        }
        if (hashMap == null || hashMap.isEmpty()) {
            return i;
        }
        if (!hashMap.isEmpty()) {
            String concat = "all_packages:".concat(str2);
            if (hashMap.get(concat) != null) {
                try {
                    i = Integer.parseInt(new String((byte[]) hashMap.get(concat), a));
                } catch (NumberFormatException e) {
                    Log.w("ConfigChimeraService", "metadata not in the right format", e);
                }
            }
            String p = a.p(str2, str, ":");
            if (hashMap.get(p) != null) {
                try {
                    i = Integer.parseInt(new String((byte[]) hashMap.get(p), a));
                } catch (NumberFormatException e2) {
                    Log.w("ConfigChimeraService", "metadata not in the right format", e2);
                }
            }
        }
        return i <= i3 ? i >= i2 ? i : i2 : i3;
    }

    public final int b(String str) {
        return a(str, "throttling_failure_rate", 5, 1, 20);
    }

    public final int c(String str) {
        return a(str, "throttling_success_rate", 5, 1, 20);
    }

    @Override // com.google.android.chimera.Service
    protected final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String a2;
        if ("userdebug".equals(Build.TYPE) || "eng".equals(Build.TYPE)) {
            printWriter.print("=== dumping config for all packages\n");
            synchronized (this.b) {
                for (Map.Entry entry : this.c.entrySet()) {
                    printWriter.print("  -- package " + ((String) entry.getKey()) + "\n");
                    for (Map.Entry entry2 : ((HashMap) entry.getValue()).entrySet()) {
                        printWriter.print("    -- namespace " + ((String) entry2.getKey()) + "\n");
                        for (Map.Entry entry3 : ((TreeMap) entry2.getValue()).entrySet()) {
                            if (entry3.getValue() != null) {
                                String str = (String) entry3.getKey();
                                byte[] bArr = (byte[]) entry3.getValue();
                                if (bArr == null) {
                                    a2 = "null";
                                } else {
                                    Charset charset = a;
                                    String str2 = new String(bArr, charset);
                                    if (Arrays.equals(bArr, str2.getBytes(charset))) {
                                        a2 = a.a(str2, "\"", "\"");
                                    } else {
                                        StringBuilder sb = new StringBuilder();
                                        for (byte b : bArr) {
                                            char[] cArr = m;
                                            sb.append(cArr[(b >> 4) & 15]);
                                            sb.append(cArr[b & 15]);
                                        }
                                        a2 = a.a(sb.toString(), "<", ">");
                                    }
                                }
                                printWriter.print(a.d(a2, str, "      ", " = ", "\n"));
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Finally extract failed */
    public final void g() {
        int i;
        int i2;
        HashMap hashMap;
        try {
            SQLiteDatabase readableDatabase = this.j.getReadableDatabase();
            HashMap hashMap2 = new HashMap();
            Cursor rawQuery = readableDatabase.rawQuery("SELECT package, namespace, key, value FROM main ORDER BY package, namespace, key", null);
            Object obj = null;
            Object obj2 = null;
            HashMap hashMap3 = null;
            TreeMap treeMap = null;
            while (true) {
                try {
                    i = 3;
                    i2 = 1;
                    if (!rawQuery.moveToNext()) {
                        break;
                    }
                    String string = rawQuery.getString(0);
                    String string2 = rawQuery.getString(1);
                    String string3 = rawQuery.getString(2);
                    byte[] blob = rawQuery.getBlob(3);
                    if (string != null && string2 != null && string3 != null && blob != null) {
                        if (!string.equals(obj)) {
                            treeMap = new TreeMap();
                            HashMap hashMap4 = new HashMap();
                            hashMap4.put(string2, treeMap);
                            hashMap2.put(string, hashMap4);
                            hashMap3 = hashMap4;
                            obj = string;
                            obj2 = string2;
                        }
                        if (!string2.equals(obj2)) {
                            TreeMap treeMap2 = new TreeMap();
                            hashMap3.put(string2, treeMap2);
                            treeMap = treeMap2;
                            obj2 = string2;
                        }
                        treeMap.put(string3, blob);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            rawQuery.close();
            if (this.j.c) {
                s(readableDatabase, "experiment", hashMap2);
            }
            if (this.j.a) {
                s(readableDatabase, "override", hashMap2);
            }
            HashMap hashMap5 = new HashMap();
            rawQuery = readableDatabase.rawQuery("SELECT package, namespace_digest, recent_success_times, recent_failure_times, device_context_digest, app_context_digest FROM fetch_metadata", null);
            while (rawQuery.moveToNext()) {
                try {
                    String string4 = rawQuery.getString(0);
                    String string5 = rawQuery.getString(i2);
                    String string6 = rawQuery.getString(2);
                    String string7 = rawQuery.getString(i);
                    byte[] blob2 = rawQuery.getBlob(4);
                    byte[] blob3 = rawQuery.getBlob(5);
                    List f = f(string6);
                    List f2 = f(string7);
                    if (TextUtils.isEmpty(string5)) {
                        hashMap = new HashMap();
                    } else {
                        HashMap hashMap6 = new HashMap();
                        String[] split = string5.split("##");
                        int length = split.length;
                        int i3 = 0;
                        while (i3 < length) {
                            int i4 = i2;
                            String[] split2 = split[i3].split("@@");
                            if (split2 != null && split2.length == 2) {
                                hashMap6.put(split2[0], split2[i4]);
                            }
                            i3++;
                            i2 = i4;
                        }
                        hashMap = hashMap6;
                    }
                    int i5 = i2;
                    hashMap5.put(string4, new astq(f, f2, hashMap, blob2, blob3));
                    i2 = i5;
                    i = 3;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            int i6 = i2;
            rawQuery.close();
            HashMap hashMap7 = new HashMap();
            rawQuery = readableDatabase.rawQuery("SELECT key, value FROM internal_metadata", null);
            while (rawQuery.moveToNext()) {
                try {
                    hashMap7.put(rawQuery.getString(0), rawQuery.getBlob(i6));
                    i6 = 1;
                } finally {
                }
            }
            rawQuery.close();
            HashMap hashMap8 = new HashMap();
            rawQuery = readableDatabase.rawQuery("SELECT package, payload FROM experiment_payload", null);
            while (rawQuery.moveToNext()) {
                try {
                    String string8 = rawQuery.getString(0);
                    byte[] blob4 = rawQuery.getBlob(1);
                    List list = (List) hashMap8.get(string8);
                    if (list == null) {
                        list = new ArrayList();
                        hashMap8.put(string8, list);
                    }
                    list.add(blob4);
                } finally {
                }
            }
            rawQuery.close();
            synchronized (this.b) {
                this.c = hashMap2;
                this.d = hashMap5;
                this.e = hashMap7;
                this.f = hashMap8;
            }
        } catch (Exception e) {
            Log.e("ConfigChimeraService", "Cannot open config database.", e);
        }
    }

    public final void h(String str, HashMap hashMap, astq astqVar, Map map, List list) {
        HashMap hashMap2;
        HashMap hashMap3 = hashMap;
        SQLiteDatabase sQLiteDatabase = null;
        try {
            sQLiteDatabase = this.j.getWritableDatabase();
        } catch (SQLiteException e) {
            Log.e("ConfigChimeraService", "Database cannot be opened for writing", e);
        } catch (IllegalStateException e2) {
            Log.e("ConfigChimeraService", "Database not in a state to be opened. We are probably being destroyed.", e2);
        }
        if (sQLiteDatabase == null) {
            return;
        }
        try {
            SQLiteStatement compileStatement = sQLiteDatabase.compileStatement("DELETE FROM main WHERE package = ?");
            SQLiteStatement compileStatement2 = sQLiteDatabase.compileStatement("INSERT INTO main (package, namespace, key, value) VALUES (?, ?, ?, ?)");
            SQLiteStatement compileStatement3 = sQLiteDatabase.compileStatement("DELETE FROM fetch_metadata WHERE package = ?");
            SQLiteStatement compileStatement4 = sQLiteDatabase.compileStatement("INSERT INTO fetch_metadata (package, namespace_digest, recent_success_times, recent_failure_times, device_context_digest, app_context_digest) VALUES (?, ?, ?, ?, ?, ?)");
            SQLiteStatement compileStatement5 = sQLiteDatabase.compileStatement("DELETE FROM internal_metadata");
            SQLiteStatement compileStatement6 = sQLiteDatabase.compileStatement("INSERT INTO internal_metadata (key, value) VALUES (?, ?)");
            SQLiteStatement compileStatement7 = sQLiteDatabase.compileStatement("DELETE FROM experiment_payload WHERE package = ?");
            SQLiteStatement compileStatement8 = sQLiteDatabase.compileStatement("INSERT INTO experiment_payload (package, payload) values (?, ?)");
            sQLiteDatabase.beginTransaction();
            try {
                try {
                    compileStatement.bindString(1, str);
                    compileStatement.execute();
                    if (hashMap3 != null) {
                        compileStatement2.bindString(1, str);
                        Iterator it = hashMap3.keySet().iterator();
                        while (it.hasNext()) {
                            Iterator it2 = it;
                            String str2 = (String) it.next();
                            TreeMap treeMap = (TreeMap) hashMap3.get(str2);
                            if (treeMap != null) {
                                compileStatement2.bindString(2, str2);
                                for (Iterator it3 = treeMap.entrySet().iterator(); it3.hasNext(); it3 = it3) {
                                    Map.Entry entry = (Map.Entry) it3.next();
                                    compileStatement2.bindString(3, (String) entry.getKey());
                                    compileStatement2.bindBlob(4, (byte[]) entry.getValue());
                                    compileStatement2.execute();
                                }
                            }
                            hashMap3 = hashMap;
                            it = it2;
                        }
                    }
                    compileStatement3.bindString(1, str);
                    compileStatement3.execute();
                    if (astqVar != null) {
                        compileStatement4.bindString(1, str);
                        compileStatement4.bindString(2, astqVar.c());
                        compileStatement4.bindString(3, d(astqVar.d));
                        compileStatement4.bindString(4, astqVar.d());
                        byte[] bArr = astqVar.b;
                        if (bArr == null) {
                            compileStatement4.bindNull(5);
                        } else {
                            compileStatement4.bindBlob(5, bArr);
                        }
                        byte[] bArr2 = astqVar.c;
                        if (bArr2 == null) {
                            compileStatement4.bindNull(6);
                        } else {
                            compileStatement4.bindBlob(6, bArr2);
                        }
                        compileStatement4.execute();
                    }
                    compileStatement5.execute();
                    if (map != null) {
                        for (Iterator it4 = map.entrySet().iterator(); it4.hasNext(); it4 = it4) {
                            Map.Entry entry2 = (Map.Entry) it4.next();
                            compileStatement6.bindString(1, (String) entry2.getKey());
                            compileStatement6.bindBlob(2, (byte[]) entry2.getValue());
                            compileStatement6.execute();
                        }
                    }
                    compileStatement7.bindString(1, str);
                    compileStatement7.execute();
                    if (list != null && !list.isEmpty()) {
                        for (Iterator it5 = list.iterator(); it5.hasNext(); it5 = it5) {
                            byte[] bArr3 = (byte[]) it5.next();
                            compileStatement8.bindString(1, str);
                            compileStatement8.bindBlob(2, bArr3);
                            compileStatement8.execute();
                        }
                    }
                    sQLiteDatabase.setTransactionSuccessful();
                    if (this.j.c) {
                        hashMap2 = hashMap == null ? new HashMap() : hashMap;
                        r("experiment", str, hashMap2);
                    } else {
                        hashMap2 = hashMap;
                    }
                    if (this.j.a) {
                        if (hashMap2 == null) {
                            hashMap2 = new HashMap();
                        }
                        r("override", str, hashMap2);
                    }
                    synchronized (this.b) {
                        Map map2 = this.c;
                        if (map2 != null) {
                            if (hashMap2 == null) {
                                map2.remove(str);
                            } else {
                                map2.put(str, hashMap2);
                            }
                        }
                        Map map3 = this.d;
                        if (map3 != null) {
                            if (astqVar == null) {
                                map3.remove(str);
                            } else {
                                map3.put(str, astqVar);
                            }
                        }
                        Map map4 = this.e;
                        if (map4 != null) {
                            map4.clear();
                            if (map != null) {
                                this.e.putAll(map);
                            }
                        }
                        Map map5 = this.f;
                        if (map5 != null) {
                            if (list == null) {
                                map5.remove(str);
                            } else {
                                map5.put(str, list);
                            }
                        }
                    }
                } finally {
                    compileStatement.close();
                    compileStatement2.close();
                    compileStatement3.close();
                    compileStatement4.close();
                    compileStatement5.close();
                    compileStatement6.close();
                    compileStatement7.close();
                    compileStatement8.close();
                    sQLiteDatabase.endTransaction();
                }
            } catch (IllegalStateException e3) {
                Log.e("ConfigChimeraService", "Exception while ending the db transaction.", e3);
            }
        } catch (IllegalStateException e4) {
            Log.e("ConfigChimeraService", "Couldn't compile db statements.", e4);
        }
    }

    final void i() {
        try {
            synchronized (this.j) {
                while (this.i) {
                    this.j.wait();
                }
            }
        } catch (InterruptedException e) {
            Log.e("ConfigChimeraService", "interrupted during initial load", e);
        }
    }

    public final boolean j(int i, String str) {
        int i2 = -1;
        try {
            ApplicationInfo applicationInfo = this.n.getApplicationInfo(str, 0);
            if (applicationInfo != null) {
                i2 = applicationInfo.uid;
            }
        } catch (PackageManager.NameNotFoundException e) {
            Log.w("ConfigChimeraService", "no such package to check permission for", e);
        }
        return i == i2;
    }

    final boolean n(String str) {
        PackageInfo packageInfo;
        if (str == null) {
            Log.w("ConfigChimeraService", "specify package to override in __package__ extra");
            return false;
        }
        if ("all_packages".equals(str)) {
            packageInfo = null;
        } else {
            try {
                packageInfo = this.n.getPackageInfo(str, 64);
                if (packageInfo == null) {
                    Log.w("ConfigChimeraService", "failed to get target package info");
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("ConfigChimeraService", "target package not installed");
                return false;
            }
        }
        if (!asoe.o() && aquo.h(this)) {
            Log.w("ConfigChimeraService", "non-user-build device with test-keys GmsCore; override allowed");
            return true;
        }
        try {
            PackageInfo packageInfo2 = this.n.getPackageInfo("com.google.android.gms.config.override", 64);
            if (packageInfo2 == null) {
                Log.w("ConfigChimeraService", "failed to get signal package info");
                return false;
            }
            if (packageInfo2.sharedUserId != null) {
                Log.w("ConfigChimeraService", "signal package may not have a shared user id");
                return false;
            }
            HashSet hashSet = new HashSet();
            for (Signature signature : packageInfo2.signatures) {
                hashSet.add(signature);
            }
            for (Signature signature2 : packageInfo.signatures) {
                if (!hashSet.contains(signature2)) {
                    Log.w("ConfigChimeraService", "signatures aren't compatible; override disallowed");
                    return false;
                }
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused2) {
            Log.w("ConfigChimeraService", "signal package not installed");
            return false;
        }
    }

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        if (!"com.google.android.gms.config.START".equals(intent.getAction())) {
            return null;
        }
        i();
        return new bxhl(this, 64, ejck.a, 3, new bxhk() { // from class: astj
            @Override // defpackage.bxhk
            public final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
                bxgjVar.c(ConfigChimeraService.this.k);
            }
        });
    }

    @Override // com.google.android.chimera.Service
    public final void onCreate() {
        super.onCreate();
        this.k = new asue(this);
        this.n = getPackageManager();
        this.j = new asto(this);
        synchronized (this.g) {
            this.h = new HashSet();
        }
        this.i = true;
        new Thread(new astk(this)).start();
    }

    @Override // com.google.android.chimera.Service
    public final void onDestroy() {
        super.onDestroy();
        i();
        this.j.close();
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x010f A[Catch: all -> 0x01d1, TryCatch #1 {all -> 0x01d1, blocks: (B:12:0x004c, B:13:0x0058, B:15:0x005e, B:18:0x0066, B:21:0x006e, B:24:0x0076, B:76:0x007e, B:27:0x008e, B:73:0x0092, B:30:0x00aa, B:32:0x00ae, B:36:0x010f, B:40:0x0122, B:41:0x00bb, B:42:0x00c2, B:44:0x00c8, B:48:0x00d4, B:49:0x00ec, B:51:0x00f0, B:53:0x0108, B:54:0x00fe, B:60:0x00df, B:65:0x00ea, B:69:0x0130, B:71:0x0134, B:82:0x0146), top: B:11:0x004c }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0122 A[Catch: all -> 0x01d1, TryCatch #1 {all -> 0x01d1, blocks: (B:12:0x004c, B:13:0x0058, B:15:0x005e, B:18:0x0066, B:21:0x006e, B:24:0x0076, B:76:0x007e, B:27:0x008e, B:73:0x0092, B:30:0x00aa, B:32:0x00ae, B:36:0x010f, B:40:0x0122, B:41:0x00bb, B:42:0x00c2, B:44:0x00c8, B:48:0x00d4, B:49:0x00ec, B:51:0x00f0, B:53:0x0108, B:54:0x00fe, B:60:0x00df, B:65:0x00ea, B:69:0x0130, B:71:0x0134, B:82:0x0146), top: B:11:0x004c }] */
    @Override // com.google.android.chimera.Service
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int onStartCommand(android.content.Intent r18, int r19, int r20) {
        /*
            Method dump skipped, instructions count: 813
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.config.ConfigChimeraService.onStartCommand(android.content.Intent, int, int):int");
    }
}
