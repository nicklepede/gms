package com.google.android.gms.backup.settings.backupnow;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.backup.settings.backupnow.RunCustomBackupsIntentOperation;
import defpackage.ajtm;
import defpackage.ajwt;
import defpackage.aljp;
import defpackage.aljq;
import defpackage.aljr;
import defpackage.aljw;
import defpackage.aljx;
import defpackage.alkt;
import defpackage.auad;
import defpackage.aupz;
import defpackage.ekww;
import defpackage.ekxd;
import defpackage.fodd;
import defpackage.fofb;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class RunCustomBackupsIntentOperation extends IntentOperation {
    private static final auad a = ajwt.a("RunCustomBackupsIO");
    private final ekww b = ekxd.a(new ekww() { // from class: alkx
        @Override // defpackage.ekww
        public final Object lK() {
            return new aljq(RunCustomBackupsIntentOperation.this, false);
        }
    });

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (!fofb.a.lK().d()) {
            a.j("Disabled by flag", new Object[0]);
            return;
        }
        if (intent == null || intent.getAction() == null || !Objects.equals(intent.getAction(), "com.google.android.gms.backup.RUN_CUSTOM_BACKUPS")) {
            a.m("Unsupported action", new Object[0]);
            return;
        }
        auad auadVar = a;
        auadVar.j("Running", new Object[0]);
        boolean booleanExtra = intent.getBooleanExtra("require_unmetered_network", true);
        auadVar.j("Creating CustomBackupsManager with requiredUnmetered=%b", Boolean.valueOf(booleanExtra));
        aljp aljpVar = new aljp(this, new ekww() { // from class: alkq
            @Override // defpackage.ekww
            public final Object lK() {
                return new ConcurrentHashMap();
            }
        }, new ekww() { // from class: alkq
            @Override // defpackage.ekww
            public final Object lK() {
                return new ConcurrentHashMap();
            }
        });
        aupz aupzVar = new aupz(1, 9);
        auad auadVar2 = ajtm.a;
        new alkt(this, booleanExtra, false, aljpVar, ajtm.f(this, aupzVar, true), new aljr() { // from class: alkr
            @Override // defpackage.aljr
            public final ConnectivityManager a(Context context) {
                int i = alkt.d;
                return (ConnectivityManager) context.getSystemService(ConnectivityManager.class);
            }
        }, fodd.a.lK().w().b).a((aljq) this.b.lK(), new aljw(), new aljx());
        auadVar.j("Finished running", new Object[0]);
    }
}
