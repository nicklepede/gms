package com.google.android.gms.backup.g1.module;

import android.content.Intent;
import android.os.Build;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.backup.g1.notifications.SettingsCollectionSchedulerChimeraService;
import com.google.android.gms.backup.g1.restore.VerifyAutoRestoreIntentOperation;
import defpackage.ahwd;
import defpackage.aieb;
import defpackage.ajgv;
import defpackage.anya;
import defpackage.asng;
import defpackage.asqg;
import defpackage.byjl;
import defpackage.fllt;
import defpackage.flly;
import defpackage.flmm;
import defpackage.flon;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class G1ModuleInitIntentOperation extends anya {
    private static final ahwd a = new ahwd("G1ModuleInitIntentOperation");
    private static final String b = asqg.f("com.google.android.gms.backup");

    private final void e() {
        if (!flly.g()) {
            a.j("BbG1 notifications disabled by flag", new Object[0]);
        } else if (Build.VERSION.SDK_INT >= 26) {
            aieb.e(this, "com.google.android.gms.backup.g1.featureupdates.notification.channel.id");
            aieb.e(this, "com.google.android.gms.backup.g1.statusalerts.notification.channel.id");
            aieb.e(this, "com.google.android.gms.backup.g1.storagealerts.notification.channel.id");
        }
    }

    private final void f() {
        if (flmm.Q() && flmm.B()) {
            a.m("Mms restore invoke attempt via legacy interface", new Object[0]);
            return;
        }
        if (!fllt.a.a().X()) {
            a.j("Running restore operation is disabled by flag", new Object[0]);
            return;
        }
        if (flmm.a.a().aD()) {
            ajgv ajgvVar = ajgv.a;
            if (ajgv.l(this) || ajgv.m(this) || !ajgv.q(this)) {
                return;
            }
        }
        Intent startIntent = IntentOperation.getStartIntent(this, VerifyAutoRestoreIntentOperation.class, "com.google.android.gms.backup.g1.VERIFY_AUTO_RESTORE");
        if (startIntent != null) {
            startService(startIntent);
        }
    }

    @Override // defpackage.anya
    protected final void b(Intent intent, int i) {
        if (flon.f()) {
            SettingsCollectionSchedulerChimeraService.d(byjl.a(this));
        }
        e();
    }

    @Override // defpackage.anya
    protected final void c(Intent intent, boolean z) {
        asng.H(this, "com.google.android.gms.backup.mms.MmsRestoreService", true);
        f();
    }

    @Override // defpackage.anya, com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (!fllt.a.a().ak() || !"com.google.android.gms.backup".equals(intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME")) || (!"com.google.android.gms.phenotype.COMMITTED".equals(intent.getAction()) && !b.equals(intent.getAction()))) {
            super.onHandleIntent(intent);
            return;
        }
        a.j("Flags updated", new Object[0]);
        f();
        e();
    }
}
