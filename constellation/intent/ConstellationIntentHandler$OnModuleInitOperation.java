package com.google.android.gms.constellation.intent;

import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteException;
import com.google.android.gms.constellation.storage.gaialifecycle.ConstellationRoomDatabase;
import defpackage.anya;
import defpackage.asng;
import defpackage.asxf;
import defpackage.asxi;
import defpackage.asxj;
import defpackage.asys;
import defpackage.aszj;
import defpackage.bqvy;
import defpackage.fmli;
import defpackage.fmml;
import defpackage.fvbo;
import defpackage.knr;
import defpackage.kpe;
import defpackage.kro;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class ConstellationIntentHandler$OnModuleInitOperation extends anya {
    private final void e() {
        try {
            asys d = asys.d(getBaseContext());
            try {
                synchronized (d) {
                    if (d.getWritableDatabase().getVersion() != asys.c()) {
                        asxj.a.f("Failed to update database", new Object[0]);
                    }
                }
                if (d != null) {
                    d.close();
                }
                if (!fmli.c()) {
                    asxj.a.f("c11n room database connot be created.", new Object[0]);
                    return;
                }
                aszj aszjVar = ConstellationRoomDatabase.l;
                Context baseContext = getBaseContext();
                fvbo.f(baseContext, "context");
                ConstellationRoomDatabase constellationRoomDatabase = ConstellationRoomDatabase.m;
                if (constellationRoomDatabase == null) {
                    synchronized (aszjVar) {
                        kpe a = bqvy.a(baseContext.getApplicationContext(), ConstellationRoomDatabase.class, "constellation_room_database");
                        a.g(false);
                        constellationRoomDatabase = (ConstellationRoomDatabase) a.a();
                        ConstellationRoomDatabase.m = constellationRoomDatabase;
                        fvbo.c(constellationRoomDatabase);
                    }
                }
                kro kroVar = constellationRoomDatabase.h;
                knr knrVar = constellationRoomDatabase.k;
                if (knrVar == null) {
                    fvbo.j("connectionManager");
                    knrVar = null;
                }
                if (knrVar.c()) {
                    asxj.a.d("c11n database is created and open", new Object[0]);
                } else {
                    asxj.a.f("c11n database exists, but database is not open.", new Object[0]);
                }
            } finally {
            }
        } catch (SQLiteException unused) {
        }
    }

    @Override // defpackage.anya
    protected final void a(Intent intent, boolean z) {
        e();
        if (fmml.g()) {
            asxi.c(getBaseContext()).g("MODULE_UPDATED_TRIGGER");
        }
    }

    @Override // defpackage.anya
    protected final void b(Intent intent, int i) {
        asxj.a.h("on init with intent ".concat(String.valueOf(String.valueOf(intent))), new Object[0]);
        asng.H(this, "com.google.android.gms.constellation.checker.RefreshGcmTaskService", true);
        asng.H(this, "com.google.android.gms.constellation.ui.ConstellationSettingsActivity", true);
        asng.H(this, "com.google.android.gms.constellation.ui.ConstellationWebSettingsActivity", true);
        asng.H(this, "com.google.android.gms.constellation.ui.ConstellationDebugActivity", true);
        asng.H(this, "com.google.android.gms.constellation.GcmBroadcastReceiver", true);
        asng.H(this, "com.google.android.gms.constellation.ui.ApiConsentActivity", true);
        asng.H(this, "com.google.android.gms.constellation.ui.ConstellationOnDemandConsentActivity", true);
        asng.H(this, "com.google.android.gms.constellation.ui.ConstellationOnDemandConsentV2Activity", true);
        asng.M("com.google.android.gms.constellation.ui.deeplink.DeepLinkEntryPointActivity", 1);
    }

    @Override // defpackage.anya
    protected final void c(Intent intent, boolean z) {
        e();
        if (fmml.g()) {
            asxi.c(getBaseContext()).g("CONTAINER_UPDATED_TRIGGER");
        }
    }

    @Override // defpackage.anya
    protected final void d(Intent intent) {
        asxj.a.h("Received onBootCompleted intent", new Object[0]);
        new asxf(getBaseContext()).a();
        if (fmml.g()) {
            asxi.c(getBaseContext()).g("BOOT_COMPLETED_TRIGGER");
        }
    }
}
