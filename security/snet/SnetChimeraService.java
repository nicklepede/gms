package com.google.android.gms.security.snet;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import android.util.JsonReader;
import com.google.android.chimera.Service;
import defpackage.asej;
import defpackage.asmf;
import defpackage.asot;
import defpackage.bqux;
import defpackage.cxzr;
import defpackage.cyye;
import defpackage.cyyf;
import defpackage.cyyl;
import defpackage.czbp;
import defpackage.czbq;
import defpackage.czbu;
import defpackage.ejhf;
import defpackage.fmut;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.UUID;
import java.util.concurrent.ExecutorService;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class SnetChimeraService extends Service {
    private static final String j = "SnetChimeraService";
    private static final asot k = asot.b(j, asej.SECURITY);
    boolean a = false;
    public cyyf b;
    public cxzr c;
    public int d;
    public czbu e;
    public String f;
    ExecutorService g;
    public String h;
    public Bundle i;

    public final void a() {
        this.b = new cyyf(this, this.d);
        this.e = new czbu(this, this.d, this.b);
        String uuid = UUID.randomUUID().toString();
        this.f = uuid;
        this.e.f = uuid;
        this.h = "aaaaaaaa-aaaa-aaaa-aaaa-aaaaaaaaaaaa";
        if (!cyyl.d(this)) {
            this.h = cyyl.c(this);
        }
        if (TextUtils.isEmpty(this.h) || "aaaaaaaa-aaaa-aaaa-aaaa-aaaaaaaaaaaa".equals(this.h)) {
            this.h = cyyl.b(this);
        }
        this.e.g = this.h;
    }

    public final void b(boolean z) {
        if (z) {
            try {
                if (this.e != null) {
                    czbu.d = cxzr.d(this);
                    czbu.c = this.c.f();
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
            File file = fmut.i() ? new File(bqux.a.d(this.b.b, "installed/snet_flags")) : new File(this.b.b, "installed/snet_flags");
            cyyf cyyfVar = this.b;
            try {
                cyye cyyeVar = new cyye(fmut.i() ? new File(bqux.a.d(this.b.b, "installed/metadata_flags")) : new File(this.b.b, "installed/metadata_flags"));
                if (cyyeVar.b > cyyfVar.a()) {
                    if (!cyyf.b(file, cyyeVar, 2)) {
                        if (!cyyfVar.d || !cyyf.b(file, cyyeVar, 1)) {
                            return;
                        }
                        boolean z = czbu.a;
                        Context context = cyyfVar.a;
                        int i = cyyfVar.c;
                        czbu.b = true;
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
        this.g = new asmf(1, 10);
        try {
            i = getPackageManager().getPackageInfo(getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            i = -1;
        }
        this.d = i;
        this.c = new cxzr(this);
    }

    @Override // com.google.android.chimera.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        if (this.a) {
            ((ejhf) ((ejhf) k.i()).ah((char) 9576)).x("snet re-entered.");
            return 2;
        }
        try {
            this.a = true;
            String action = intent.getAction();
            if ("com.google.android.gms.security.snet.ACTION_EVENT_LOG_COLLECTOR".equals(action)) {
                this.g.execute(new czbp(this));
            } else if ("com.google.android.gms.security.snet.ACTION_IDLE_MODE".equals(action)) {
                this.g.execute(new czbq(this));
            } else {
                ((ejhf) ((ejhf) k.i()).ah(9575)).x("snet unknown action.");
                b(false);
            }
        } catch (Throwable th) {
            if (this.e != null) {
                czbu.a(th);
            }
            b(false);
        }
        return 2;
    }
}
