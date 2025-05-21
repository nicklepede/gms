package com.google.android.gms.backup.g1.restore.mms;

import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.os.Looper;
import android.widget.Toast;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.R;
import com.google.android.gms.backup.g1.restore.mms.StartMmsRestoreIntentOperation;
import defpackage.ahwd;
import defpackage.ahwj;
import defpackage.aiee;
import defpackage.ajgv;
import defpackage.byhr;
import defpackage.byjl;
import defpackage.bykj;
import defpackage.ekhk;
import defpackage.ekhl;
import defpackage.ekmp;
import defpackage.fecj;
import defpackage.flmm;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class StartMmsRestoreIntentOperation extends IntentOperation {
    private static final ahwd b = new ahwd("StartMmsRestoreIntentOperation");
    public aiee a;

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        List<ResolveInfo> queryIntentServices;
        ajgv ajgvVar = ajgv.a;
        if (this.a == null) {
            this.a = new aiee(this);
        }
        aiee aieeVar = this.a;
        fecj c = ahwj.c();
        fecj v = ekmp.a.v();
        if (!v.b.L()) {
            v.U();
        }
        ekmp ekmpVar = (ekmp) v.b;
        ekmpVar.c = 1;
        ekmpVar.b |= 1;
        if (!c.b.L()) {
            c.U();
        }
        ekhl ekhlVar = (ekhl) c.b;
        ekmp ekmpVar2 = (ekmp) v.Q();
        ekhl ekhlVar2 = ekhl.a;
        ekmpVar2.getClass();
        ekhlVar.N = ekmpVar2;
        ekhlVar.c |= 4096;
        int a = ahwj.a();
        aieeVar.d = a;
        aieeVar.z(c, ekhk.MMS_RESTORE, a);
        if (ajgv.j(this) != 1) {
            b.j("MMS restore not enabled by user", new Object[0]);
            this.a.n(2);
            return;
        }
        if (ajgv.l(this)) {
            b.j("MMS restore has already been finished", new Object[0]);
            this.a.n(3);
            return;
        }
        if (Build.VERSION.SDK_INT < 27 && ((queryIntentServices = getPackageManager().queryIntentServices(new Intent(flmm.n()).setPackage(flmm.o()), 0)) == null || queryIntentServices.isEmpty())) {
            new byhr(Looper.getMainLooper()).post(new Runnable() { // from class: ajdr
                @Override // java.lang.Runnable
                public final void run() {
                    StartMmsRestoreIntentOperation startMmsRestoreIntentOperation = StartMmsRestoreIntentOperation.this;
                    Toast.makeText(startMmsRestoreIntentOperation, R.string.g1_restore_failed, 1).show();
                    startMmsRestoreIntentOperation.a.n(7);
                }
            });
            return;
        }
        ajgvVar.d(this, true);
        Intent intent2 = new Intent();
        intent2.setClassName(this, "com.google.android.gms.backup.mms.MmsRestoreService");
        startService(intent2);
        bykj bykjVar = new bykj();
        bykjVar.j = "com.google.android.gms.backup.g1.restore.RestoreRevivalGcmTaskService";
        bykjVar.e(flmm.f(), flmm.e());
        bykjVar.t("com.google.android.gms.backup.g1.restore.REVIVE_SERVICE");
        bykjVar.p = true;
        byjl.a(this).f(bykjVar.b());
    }
}
