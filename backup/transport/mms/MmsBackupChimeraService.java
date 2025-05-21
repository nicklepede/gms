package com.google.android.gms.backup.transport.mms;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.os.ResultReceiver;
import android.os.UserHandle;
import com.google.android.gms.R;
import com.google.autofill.detection.ml.AndroidInputTypeSignal;
import defpackage.ahhp;
import defpackage.ahpv;
import defpackage.ahur;
import defpackage.ahus;
import defpackage.ahwd;
import defpackage.ahwj;
import defpackage.aieb;
import defpackage.aiee;
import defpackage.aifj;
import defpackage.aixj;
import defpackage.ajgv;
import defpackage.akhs;
import defpackage.anxo;
import defpackage.arni;
import defpackage.aslt;
import defpackage.asmf;
import defpackage.asng;
import defpackage.assz;
import defpackage.dmng;
import defpackage.dvni;
import defpackage.eijr;
import defpackage.eijy;
import defpackage.eitj;
import defpackage.ekhk;
import defpackage.ekhl;
import defpackage.eklz;
import defpackage.ekmh;
import defpackage.fecj;
import defpackage.fecp;
import defpackage.fgur;
import defpackage.fguz;
import defpackage.flmm;
import defpackage.flmu;
import defpackage.unx;
import defpackage.vay;
import defpackage.vbf;
import defpackage.vbh;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class MmsBackupChimeraService extends aslt {
    public aiee g;
    public static final ahwd a = new ahwd("MmsBackupService");
    private static final String h = dmng.a("googleone");
    static final String b = dmng.a("g1phonebackup");
    public static final String c = dmng.a("uca");
    public static final String d = dmng.a("HOSTED");
    public static boolean e = false;
    private final ajgv i = ajgv.a;
    public final ExecutorService f = new asmf(1, 10);

    private final Notification g(boolean z) {
        Notification.Builder progress = aieb.a(this).setProgress(0, 0, true);
        if (z) {
            progress.setContentTitle(getResources().getString(R.string.mms_backup_foreground_notification_title));
        }
        progress.setSmallIcon(anxo.a(this, R.drawable.g1_notification_logo_24));
        return progress.build();
    }

    private static final void h(Intent intent) {
        ResultReceiver resultReceiver = (ResultReceiver) intent.getParcelableExtra("resultReceiver");
        if (resultReceiver != null) {
            resultReceiver.send(0, null);
        }
    }

    public final void a() {
        try {
            if (c(b)) {
                startForeground(9921, g(false));
                akhs akhsVar = new akhs(this);
                try {
                    Context context = akhsVar.i;
                    if (new arni(context, "g1_shared_prefs", true).getBoolean("mms_data_deleted", false)) {
                        return;
                    }
                    ahus ahusVar = akhsVar.m;
                    fecj v = fguz.a.v();
                    long e2 = asng.e(context);
                    if (!v.b.L()) {
                        v.U();
                    }
                    ((fguz) v.b).d = e2;
                    fecj a2 = ahur.a(context);
                    if (!v.b.L()) {
                        v.U();
                    }
                    fguz fguzVar = (fguz) v.b;
                    fgur fgurVar = (fgur) a2.Q();
                    fgurVar.getClass();
                    fguzVar.c = fgurVar;
                    fguzVar.b |= 1;
                    ahusVar.h((fguz) v.Q());
                    akhsVar.c(true);
                } catch (FileNotFoundException unused) {
                    akhs.a.d("No backup available to delete", new Object[0]);
                    akhsVar.c(true);
                } catch (Exception e3) {
                    akhs.a.n("Error trying to delete backup", e3, new Object[0]);
                }
            }
        } catch (IOException | unx e4) {
            a.n("Error retrieving account state", e4, new Object[0]);
        }
    }

    @Override // defpackage.aslt
    protected final void b(Intent intent) {
        if (this.g == null) {
            this.g = new aiee(this);
        }
        if (!d()) {
            this.g.k(3);
            if (flmm.w()) {
                a();
            }
            a.h("Android Backup is not enabled, skip Mms backup", new Object[0]);
            h(intent);
            return;
        }
        if (!e()) {
            this.g.k(2);
            if (flmm.x()) {
                a();
            }
            a.h("User has not enabled MMS Backup", new Object[0]);
            h(intent);
            return;
        }
        if (Build.VERSION.SDK_INT < 24) {
            this.g.k(4);
            a.m("SDK below N, disabling MMS backup", new Object[0]);
            ajgv.a.a(this, false);
            h(intent);
            return;
        }
        if (flmm.a.a().H()) {
            try {
                if (!c(h)) {
                    this.g.k(5);
                    a.m("User is not a G1 member which is required for mms backup, disabling backup", new Object[0]);
                    ajgv.a.a(this, false);
                    h(intent);
                    return;
                }
            } catch (IOException | unx e2) {
                this.g.k(8);
                a.n("Error retrieving account state", e2, new Object[0]);
                h(intent);
                return;
            }
        }
        if (!flmm.s()) {
            try {
                if (c(d)) {
                    this.g.k(6);
                    a.m("User is a dasher account which is not supported", new Object[0]);
                    h(intent);
                    return;
                }
            } catch (IOException | unx e3) {
                this.g.k(8);
                a.n("Error retrieving account state", e3, new Object[0]);
                h(intent);
                return;
            }
        }
        if (!flmm.t()) {
            try {
                if (c(c)) {
                    this.g.k(7);
                    a.m("User is a unicorn account which is not supported", new Object[0]);
                    h(intent);
                    return;
                }
            } catch (IOException | unx e4) {
                this.g.k(8);
                a.n("Error retrieving account state", e4, new Object[0]);
                h(intent);
                return;
            }
        }
        if (f()) {
            this.g.k(21);
            a.m("Account is work profile, skip Mms backup", new Object[0]);
            h(intent);
            return;
        }
        startForeground(9921, g(true));
        akhs akhsVar = new akhs(this);
        if (flmm.G()) {
            if (e) {
                h(intent);
                this.g.k(11);
                return;
            }
            e = true;
        }
        boolean d2 = akhsVar.d();
        if (flmm.G()) {
            e = false;
        }
        if (flmu.a.a().a() && !d2) {
            h(intent);
            return;
        }
        ResultReceiver resultReceiver = (ResultReceiver) intent.getParcelableExtra("resultReceiver");
        if (resultReceiver != null) {
            resultReceiver.send(-1, null);
        }
    }

    public final boolean c(String str) {
        eijr a2 = eijy.a(new vbf());
        dvni.f(this);
        return eitj.k(vbh.b(this, new String[]{str}, new vay(this), a2)).contains(new ahhp(this).a());
    }

    public final boolean d() {
        return new ahpv(this).k();
    }

    public final boolean e() {
        return this.i.h(this);
    }

    public final boolean f() {
        if (!flmm.a.a().an()) {
            return !aifj.a();
        }
        assz c2 = assz.c();
        int i = (c2.e(this) != null ? 2 : c2.f(this) != null ? c2.h(this) ? 4 : 3 : 1) - 1;
        boolean z = i == 2 || i == 3;
        aiee aieeVar = this.g;
        int myUserId = UserHandle.myUserId();
        fecj c3 = ahwj.c();
        fecj v = ekmh.a.v();
        if (!v.b.L()) {
            v.U();
        }
        ekmh ekmhVar = (ekmh) v.b;
        ekmhVar.c = 15;
        ekmhVar.b |= 1;
        fecj v2 = eklz.a.v();
        if (!v2.b.L()) {
            v2.U();
        }
        fecp fecpVar = v2.b;
        eklz eklzVar = (eklz) fecpVar;
        eklzVar.b |= 1;
        eklzVar.c = myUserId;
        if (!fecpVar.L()) {
            v2.U();
        }
        eklz eklzVar2 = (eklz) v2.b;
        eklzVar2.b = 2 | eklzVar2.b;
        eklzVar2.d = i;
        if (!v.b.L()) {
            v.U();
        }
        ekmh ekmhVar2 = (ekmh) v.b;
        eklz eklzVar3 = (eklz) v2.Q();
        eklzVar3.getClass();
        ekmhVar2.r = eklzVar3;
        ekmhVar2.b |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
        if (!c3.b.L()) {
            c3.U();
        }
        ekhl ekhlVar = (ekhl) c3.b;
        ekmh ekmhVar3 = (ekmh) v.Q();
        ekhl ekhlVar2 = ekhl.a;
        ekmhVar3.getClass();
        ekhlVar.L = ekmhVar3;
        ekhlVar.c |= 1024;
        aieeVar.z(c3, ekhk.MMS_BACKUP, aieeVar.c);
        return !aifj.a() || z;
    }

    @Override // defpackage.aslt, com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        if (flmm.P()) {
            return new aixj(this);
        }
        return null;
    }
}
