package com.google.android.gms.security.snet;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import android.util.JsonReader;
import com.google.android.chimera.Service;
import defpackage.auid;
import defpackage.aupz;
import defpackage.ausn;
import defpackage.btco;
import defpackage.dajo;
import defpackage.dbic;
import defpackage.dbid;
import defpackage.dbij;
import defpackage.dbln;
import defpackage.dblo;
import defpackage.dbls;
import defpackage.eluo;
import defpackage.fpmr;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.UUID;
import java.util.concurrent.ExecutorService;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class SnetChimeraService extends Service {
    private static final String j = "SnetChimeraService";
    private static final ausn k = ausn.b(j, auid.SECURITY);
    boolean a = false;
    public dbid b;
    public dajo c;
    public int d;
    public dbls e;
    public String f;
    ExecutorService g;
    public String h;
    public Bundle i;

    public final void a() {
        this.b = new dbid(this, this.d);
        this.e = new dbls(this, this.d, this.b);
        String uuid = UUID.randomUUID().toString();
        this.f = uuid;
        this.e.f = uuid;
        this.h = "aaaaaaaa-aaaa-aaaa-aaaa-aaaaaaaaaaaa";
        if (!dbij.d(this)) {
            this.h = dbij.c(this);
        }
        if (TextUtils.isEmpty(this.h) || "aaaaaaaa-aaaa-aaaa-aaaa-aaaaaaaaaaaa".equals(this.h)) {
            this.h = dbij.b(this);
        }
        this.e.g = this.h;
    }

    public final void b(boolean z) {
        if (z) {
            try {
                if (this.e != null) {
                    dbls.d = dajo.d(this);
                    dbls.c = this.c.f();
                    this.e.c(2);
                }
            } finally {
                this.a = false;
                stopSelf();
            }
        }
    }

    public final void c() {
        if (this.i == null) {
            File file = fpmr.i() ? new File(btco.a.d(this.b.b, "installed/snet_flags")) : new File(this.b.b, "installed/snet_flags");
            dbid dbidVar = this.b;
            try {
                dbic dbicVar = new dbic(fpmr.i() ? new File(btco.a.d(this.b.b, "installed/metadata_flags")) : new File(this.b.b, "installed/metadata_flags"));
                if (dbicVar.b > dbidVar.a()) {
                    if (!dbid.b(file, dbicVar, 2)) {
                        if (!dbidVar.d || !dbid.b(file, dbicVar, 1)) {
                            return;
                        }
                        boolean z = dbls.a;
                        Context context = dbidVar.a;
                        int i = dbidVar.c;
                        dbls.b = true;
                    }
                    JsonReader jsonReader = new JsonReader(new BufferedReader(new InputStreamReader(new FileInputStream(file), "US-ASCII")));
                    Bundle bundle = new Bundle();
                    try {
                        jsonReader.beginObject();
                        while (jsonReader.hasNext()) {
                            String nextName = jsonReader.nextName();
                            if ("url".equals(nextName)) {
                                bundle.putString(nextName, jsonReader.nextString());
                            } else if ("percent".equals(nextName)) {
                                bundle.putInt(nextName, jsonReader.nextInt());
                            } else {
                                bundle.putString(nextName, jsonReader.nextString());
                            }
                        }
                        jsonReader.endObject();
                        jsonReader.close();
                        this.i = bundle;
                    } catch (Throwable th) {
                        jsonReader.close();
                        throw th;
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    public final void d(int i) {
        this.e.h = i;
    }

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // com.google.android.chimera.Service
    public final void onCreate() {
        int i;
        super.onCreate();
        this.g = new aupz(1, 10);
        try {
            i = getPackageManager().getPackageInfo(getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            i = -1;
        }
        this.d = i;
        this.c = new dajo(this);
    }

    @Override // com.google.android.chimera.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        if (this.a) {
            ((eluo) ((eluo) k.i()).ai((char) 9578)).x("snet re-entered.");
            return 2;
        }
        try {
            this.a = true;
            String action = intent.getAction();
            if ("com.google.android.gms.security.snet.ACTION_EVENT_LOG_COLLECTOR".equals(action)) {
                this.g.execute(new dbln(this));
            } else if ("com.google.android.gms.security.snet.ACTION_IDLE_MODE".equals(action)) {
                this.g.execute(new dblo(this));
            } else {
                ((eluo) ((eluo) k.i()).ai(9577)).x("snet unknown action.");
                b(false);
            }
        } catch (Throwable th) {
            if (this.e != null) {
                dbls.a(th);
            }
            b(false);
        }
        return 2;
    }
}
