package com.google.android.gms.backup.g1.module;

import android.content.Intent;
import android.os.Build;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.backup.g1.notifications.SettingsCollectionSchedulerChimeraService;
import com.google.android.gms.backup.g1.restore.VerifyAutoRestoreIntentOperation;
import defpackage.ajwt;
import defpackage.aker;
import defpackage.alhn;
import defpackage.apzs;
import defpackage.aura;
import defpackage.auua;
import defpackage.casd;
import defpackage.fodd;
import defpackage.fodi;
import defpackage.fodw;
import defpackage.fofx;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class G1ModuleInitIntentOperation extends apzs {
    private static final ajwt a = new ajwt("G1ModuleInitIntentOperation");
    private static final String b = auua.f("com.google.android.gms.backup");

    private final void e() {
        if (!fodi.g()) {
            a.j("BbG1 notifications disabled by flag", new Object[0]);
        } else if (Build.VERSION.SDK_INT >= 26) {
            aker.e(this, "com.google.android.gms.backup.g1.featureupdates.notification.channel.id");
            aker.e(this, "com.google.android.gms.backup.g1.statusalerts.notification.channel.id");
            aker.e(this, "com.google.android.gms.backup.g1.storagealerts.notification.channel.id");
        }
    }

    private final void f() {
        if (fodw.Q() && fodw.B()) {
            a.m("Mms restore invoke attempt via legacy interface", new Object[0]);
            return;
        }
        if (!fodd.a.lK().X()) {
            a.j("Running restore operation is disabled by flag", new Object[0]);
            return;
        }
        if (fodw.a.lK().aE()) {
            alhn alhnVar = alhn.a;
            if (alhn.l(this) || alhn.m(this) || !alhn.q(this)) {
                return;
            }
        }
        Intent startIntent = IntentOperation.getStartIntent(this, VerifyAutoRestoreIntentOperation.class, "com.google.android.gms.backup.g1.VERIFY_AUTO_RESTORE");
        if (startIntent != null) {
            startService(startIntent);
        }
    }

    @Override // defpackage.apzs
    protected final void b(Intent intent, int i) {
        if (fofx.f()) {
            SettingsCollectionSchedulerChimeraService.d(casd.a(this));
        }
        e();
    }

    @Override // defpackage.apzs
    protected final void c(Intent intent, boolean z) {
        aura.H(this, "com.google.android.gms.backup.mms.MmsRestoreService", true);
        f();
    }

    @Override // defpackage.apzs, com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (!fodd.a.lK().ak() || !"com.google.android.gms.backup".equals(intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME")) || (!"com.google.android.gms.phenotype.COMMITTED".equals(intent.getAction()) && !b.equals(intent.getAction()))) {
            super.onHandleIntent(intent);
            return;
        }
        a.j("Flags updated", new Object[0]);
        f();
        e();
    }
}
