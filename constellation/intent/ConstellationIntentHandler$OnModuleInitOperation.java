package com.google.android.gms.constellation.intent;

import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteException;
import com.google.android.gms.constellation.storage.gaialifecycle.ConstellationRoomDatabase;
import defpackage.apzs;
import defpackage.aura;
import defpackage.avbi;
import defpackage.avbl;
import defpackage.avbm;
import defpackage.avcv;
import defpackage.avdm;
import defpackage.btdp;
import defpackage.fpcz;
import defpackage.fpeg;
import defpackage.fxxm;
import defpackage.mgc;
import defpackage.mhp;
import defpackage.mkd;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class ConstellationIntentHandler$OnModuleInitOperation extends apzs {
    private final void e() {
        try {
            avcv d = avcv.d(getBaseContext());
            try {
                synchronized (d) {
                    if (d.getWritableDatabase().getVersion() != avcv.c()) {
                        avbm.a.f("Failed to update database", new Object[0]);
                    }
                }
                if (d != null) {
                    d.close();
                }
                if (!fpcz.c()) {
                    avbm.a.f("c11n room database connot be created.", new Object[0]);
                    return;
                }
                avdm avdmVar = ConstellationRoomDatabase.m;
                Context baseContext = getBaseContext();
                fxxm.f(baseContext, "context");
                ConstellationRoomDatabase constellationRoomDatabase = ConstellationRoomDatabase.n;
                if (constellationRoomDatabase == null) {
                    synchronized (avdmVar) {
                        mhp a = btdp.a(baseContext.getApplicationContext(), ConstellationRoomDatabase.class, "constellation_room_database");
                        a.g(false);
                        constellationRoomDatabase = (ConstellationRoomDatabase) a.a();
                        ConstellationRoomDatabase.n = constellationRoomDatabase;
                        fxxm.c(constellationRoomDatabase);
                    }
                }
                mkd mkdVar = constellationRoomDatabase.h;
                mgc mgcVar = constellationRoomDatabase.l;
                if (mgcVar == null) {
                    fxxm.j("connectionManager");
                    mgcVar = null;
                }
                if (mgcVar.c()) {
                    avbm.a.d("c11n database is created and open", new Object[0]);
                } else {
                    avbm.a.f("c11n database exists, but database is not open.", new Object[0]);
                }
            } finally {
            }
        } catch (SQLiteException unused) {
        }
    }

    @Override // defpackage.apzs
    protected final void a(Intent intent, boolean z) {
        e();
        if (fpeg.g()) {
            avbl.c(getBaseContext()).g("MODULE_UPDATED_TRIGGER");
        }
    }

    @Override // defpackage.apzs
    protected final void b(Intent intent, int i) {
        avbm.a.h("on init with intent ".concat(String.valueOf(String.valueOf(intent))), new Object[0]);
        aura.H(this, "com.google.android.gms.constellation.checker.RefreshGcmTaskService", true);
        aura.H(this, "com.google.android.gms.constellation.ui.ConstellationSettingsActivity", true);
        aura.H(this, "com.google.android.gms.constellation.ui.ConstellationWebSettingsActivity", true);
        aura.H(this, "com.google.android.gms.constellation.ui.ConstellationDebugActivity", true);
        aura.H(this, "com.google.android.gms.constellation.GcmBroadcastReceiver", true);
        aura.H(this, "com.google.android.gms.constellation.ui.ApiConsentActivity", true);
        aura.H(this, "com.google.android.gms.constellation.ui.ConstellationOnDemandConsentActivity", true);
        aura.H(this, "com.google.android.gms.constellation.ui.ConstellationOnDemandConsentV2Activity", true);
        aura.M("com.google.android.gms.constellation.ui.deeplink.DeepLinkEntryPointActivity", 1);
    }

    @Override // defpackage.apzs
    protected final void c(Intent intent, boolean z) {
        e();
        if (fpeg.g()) {
            avbl.c(getBaseContext()).g("CONTAINER_UPDATED_TRIGGER");
        }
    }

    @Override // defpackage.apzs
    protected final void d(Intent intent) {
        avbm.a.h("Received onBootCompleted intent", new Object[0]);
        new avbi(getBaseContext()).a();
        if (fpeg.g()) {
            avbl.c(getBaseContext()).g("BOOT_COMPLETED_TRIGGER");
        }
    }
}
