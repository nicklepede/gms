package com.google.android.gms.backup.settings.backupnow;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.backup.settings.backupnow.RunCustomBackupsIntentOperation;
import defpackage.ahsw;
import defpackage.ahwd;
import defpackage.ajix;
import defpackage.ajiy;
import defpackage.ajiz;
import defpackage.ajje;
import defpackage.ajjf;
import defpackage.ajkb;
import defpackage.arxo;
import defpackage.asmf;
import defpackage.eijr;
import defpackage.eijy;
import defpackage.fllt;
import defpackage.flnr;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class RunCustomBackupsIntentOperation extends IntentOperation {
    private static final arxo a = ahwd.a("RunCustomBackupsIO");
    private final eijr b = eijy.a(new eijr() { // from class: ajkf
        @Override // defpackage.eijr
        public final Object a() {
            return new ajiy(RunCustomBackupsIntentOperation.this, false);
        }
    });

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (!flnr.a.a().d()) {
            a.j("Disabled by flag", new Object[0]);
            return;
        }
        if (intent == null || intent.getAction() == null || !Objects.equals(intent.getAction(), "com.google.android.gms.backup.RUN_CUSTOM_BACKUPS")) {
            a.m("Unsupported action", new Object[0]);
            return;
        }
        arxo arxoVar = a;
        arxoVar.j("Running", new Object[0]);
        boolean booleanExtra = intent.getBooleanExtra("require_unmetered_network", true);
        arxoVar.j("Creating CustomBackupsManager with requiredUnmetered=%b", Boolean.valueOf(booleanExtra));
        ajix ajixVar = new ajix(this, new eijr() { // from class: ajjy
            @Override // defpackage.eijr
            public final Object a() {
                return new ConcurrentHashMap();
            }
        }, new eijr() { // from class: ajjy
            @Override // defpackage.eijr
            public final Object a() {
                return new ConcurrentHashMap();
            }
        });
        asmf asmfVar = new asmf(1, 9);
        arxo arxoVar2 = ahsw.a;
        new ajkb(this, booleanExtra, false, ajixVar, ahsw.f(this, asmfVar, true), new ajiz() { // from class: ajjz
            @Override // defpackage.ajiz
            public final ConnectivityManager a(Context context) {
                int i = ajkb.d;
                return (ConnectivityManager) context.getSystemService(ConnectivityManager.class);
            }
        }, fllt.a.a().w().b).a((ajiy) this.b.a(), new ajje(), new ajjf());
        arxoVar.j("Finished running", new Object[0]);
    }
}
