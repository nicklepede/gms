package com.google.android.gms.backup.g1.restore.mms;

import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.os.Looper;
import android.widget.Toast;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.R;
import com.google.android.gms.backup.g1.restore.mms.StartMmsRestoreIntentOperation;
import defpackage.ajwt;
import defpackage.ajwz;
import defpackage.akeu;
import defpackage.alhn;
import defpackage.caqj;
import defpackage.casd;
import defpackage.catb;
import defpackage.emuw;
import defpackage.emux;
import defpackage.enab;
import defpackage.fgrc;
import defpackage.fodw;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class StartMmsRestoreIntentOperation extends IntentOperation {
    private static final ajwt b = new ajwt("StartMmsRestoreIntentOperation");
    public akeu a;

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        List<ResolveInfo> queryIntentServices;
        alhn alhnVar = alhn.a;
        if (this.a == null) {
            this.a = new akeu(this);
        }
        akeu akeuVar = this.a;
        fgrc c = ajwz.c();
        fgrc v = enab.a.v();
        if (!v.b.L()) {
            v.U();
        }
        enab enabVar = (enab) v.b;
        enabVar.c = 1;
        enabVar.b |= 1;
        if (!c.b.L()) {
            c.U();
        }
        emux emuxVar = (emux) c.b;
        enab enabVar2 = (enab) v.Q();
        emux emuxVar2 = emux.a;
        enabVar2.getClass();
        emuxVar.N = enabVar2;
        emuxVar.c |= 4096;
        int a = ajwz.a();
        akeuVar.d = a;
        akeuVar.z(c, emuw.MMS_RESTORE, a);
        if (alhn.j(this) != 1) {
            b.j("MMS restore not enabled by user", new Object[0]);
            this.a.n(2);
            return;
        }
        if (alhn.l(this)) {
            b.j("MMS restore has already been finished", new Object[0]);
            this.a.n(3);
            return;
        }
        if (Build.VERSION.SDK_INT < 27 && ((queryIntentServices = getPackageManager().queryIntentServices(new Intent(fodw.n()).setPackage(fodw.o()), 0)) == null || queryIntentServices.isEmpty())) {
            new caqj(Looper.getMainLooper()).post(new Runnable() { // from class: alej
                @Override // java.lang.Runnable
                public final void run() {
                    StartMmsRestoreIntentOperation startMmsRestoreIntentOperation = StartMmsRestoreIntentOperation.this;
                    Toast.makeText(startMmsRestoreIntentOperation, R.string.g1_restore_failed, 1).show();
                    startMmsRestoreIntentOperation.a.n(7);
                }
            });
            return;
        }
        alhnVar.d(this, true);
        Intent intent2 = new Intent();
        intent2.setClassName(this, "com.google.android.gms.backup.mms.MmsRestoreService");
        startService(intent2);
        catb catbVar = new catb();
        catbVar.j = "com.google.android.gms.backup.g1.restore.RestoreRevivalGcmTaskService";
        catbVar.e(fodw.f(), fodw.e());
        catbVar.t("com.google.android.gms.backup.g1.restore.REVIVE_SERVICE");
        catbVar.p = true;
        casd.a(this).f(catbVar.b());
    }
}
