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
import defpackage.ajif;
import defpackage.ajql;
import defpackage.ajvh;
import defpackage.ajvi;
import defpackage.ajwt;
import defpackage.ajwz;
import defpackage.aker;
import defpackage.akeu;
import defpackage.akfz;
import defpackage.akxz;
import defpackage.alhn;
import defpackage.amit;
import defpackage.apzg;
import defpackage.atpx;
import defpackage.aupn;
import defpackage.aupz;
import defpackage.aura;
import defpackage.auwt;
import defpackage.doyu;
import defpackage.dxyi;
import defpackage.ekww;
import defpackage.ekxd;
import defpackage.elgo;
import defpackage.emuw;
import defpackage.emux;
import defpackage.emzl;
import defpackage.emzt;
import defpackage.fgrc;
import defpackage.fgri;
import defpackage.fjjs;
import defpackage.fjka;
import defpackage.fodw;
import defpackage.foee;
import defpackage.wjw;
import defpackage.wwy;
import defpackage.wxf;
import defpackage.wxh;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class MmsBackupChimeraService extends aupn {
    public akeu g;
    public static final ajwt a = new ajwt("MmsBackupService");
    private static final String h = doyu.a("googleone");
    static final String b = doyu.a("g1phonebackup");
    public static final String c = doyu.a("uca");
    public static final String d = doyu.a("HOSTED");
    public static boolean e = false;
    private final alhn i = alhn.a;
    public final ExecutorService f = new aupz(1, 10);

    private final Notification g(boolean z) {
        Notification.Builder progress = aker.a(this).setProgress(0, 0, true);
        if (z) {
            progress.setContentTitle(getResources().getString(R.string.mms_backup_foreground_notification_title));
        }
        progress.setSmallIcon(apzg.a(this, R.drawable.g1_notification_logo_24));
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
                amit amitVar = new amit(this);
                try {
                    Context context = amitVar.i;
                    if (new atpx(context, "g1_shared_prefs", true).getBoolean("mms_data_deleted", false)) {
                        return;
                    }
                    ajvi ajviVar = amitVar.m;
                    fgrc v = fjka.a.v();
                    long e2 = aura.e(context);
                    if (!v.b.L()) {
                        v.U();
                    }
                    ((fjka) v.b).d = e2;
                    fgrc a2 = ajvh.a(context);
                    if (!v.b.L()) {
                        v.U();
                    }
                    fjka fjkaVar = (fjka) v.b;
                    fjjs fjjsVar = (fjjs) a2.Q();
                    fjjsVar.getClass();
                    fjkaVar.c = fjjsVar;
                    fjkaVar.b |= 1;
                    ajviVar.h((fjka) v.Q());
                    amitVar.c(true);
                } catch (FileNotFoundException unused) {
                    amit.a.d("No backup available to delete", new Object[0]);
                    amitVar.c(true);
                } catch (Exception e3) {
                    amit.a.n("Error trying to delete backup", e3, new Object[0]);
                }
            }
        } catch (IOException | wjw e4) {
            a.n("Error retrieving account state", e4, new Object[0]);
        }
    }

    @Override // defpackage.aupn
    protected final void b(Intent intent) {
        if (this.g == null) {
            this.g = new akeu(this);
        }
        if (!d()) {
            this.g.k(3);
            if (fodw.w()) {
                a();
            }
            a.h("Android Backup is not enabled, skip Mms backup", new Object[0]);
            h(intent);
            return;
        }
        if (!e()) {
            this.g.k(2);
            if (fodw.x()) {
                a();
            }
            a.h("User has not enabled MMS Backup", new Object[0]);
            h(intent);
            return;
        }
        if (Build.VERSION.SDK_INT < 24) {
            this.g.k(4);
            a.m("SDK below N, disabling MMS backup", new Object[0]);
            alhn.a.a(this, false);
            h(intent);
            return;
        }
        if (fodw.a.lK().H()) {
            try {
                if (!c(h)) {
                    this.g.k(5);
                    a.m("User is not a G1 member which is required for mms backup, disabling backup", new Object[0]);
                    alhn.a.a(this, false);
                    h(intent);
                    return;
                }
            } catch (IOException | wjw e2) {
                this.g.k(8);
                a.n("Error retrieving account state", e2, new Object[0]);
                h(intent);
                return;
            }
        }
        if (!fodw.s()) {
            try {
                if (c(d)) {
                    this.g.k(6);
                    a.m("User is a dasher account which is not supported", new Object[0]);
                    h(intent);
                    return;
                }
            } catch (IOException | wjw e3) {
                this.g.k(8);
                a.n("Error retrieving account state", e3, new Object[0]);
                h(intent);
                return;
            }
        }
        if (!fodw.t()) {
            try {
                if (c(c)) {
                    this.g.k(7);
                    a.m("User is a unicorn account which is not supported", new Object[0]);
                    h(intent);
                    return;
                }
            } catch (IOException | wjw e4) {
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
        amit amitVar = new amit(this);
        if (fodw.G()) {
            if (e) {
                h(intent);
                this.g.k(11);
                return;
            }
            e = true;
        }
        boolean d2 = amitVar.d();
        if (fodw.G()) {
            e = false;
        }
        if (foee.a.lK().a() && !d2) {
            h(intent);
            return;
        }
        ResultReceiver resultReceiver = (ResultReceiver) intent.getParcelableExtra("resultReceiver");
        if (resultReceiver != null) {
            resultReceiver.send(-1, null);
        }
    }

    public final boolean c(String str) {
        ekww a2 = ekxd.a(new wxf());
        dxyi.f(this);
        return elgo.k(wxh.b(this, new String[]{str}, new wwy(this), a2)).contains(new ajif(this).a());
    }

    public final boolean d() {
        return new ajql(this).j();
    }

    public final boolean e() {
        return this.i.h(this);
    }

    public final boolean f() {
        if (!fodw.a.lK().ao()) {
            return !akfz.a();
        }
        auwt c2 = auwt.c();
        int i = (c2.e(this) != null ? 2 : c2.f(this) != null ? c2.h(this) ? 4 : 3 : 1) - 1;
        boolean z = i == 2 || i == 3;
        akeu akeuVar = this.g;
        int myUserId = UserHandle.myUserId();
        fgrc c3 = ajwz.c();
        fgrc v = emzt.a.v();
        if (!v.b.L()) {
            v.U();
        }
        emzt emztVar = (emzt) v.b;
        emztVar.c = 15;
        emztVar.b |= 1;
        fgrc v2 = emzl.a.v();
        if (!v2.b.L()) {
            v2.U();
        }
        fgri fgriVar = v2.b;
        emzl emzlVar = (emzl) fgriVar;
        emzlVar.b |= 1;
        emzlVar.c = myUserId;
        if (!fgriVar.L()) {
            v2.U();
        }
        emzl emzlVar2 = (emzl) v2.b;
        emzlVar2.b = 2 | emzlVar2.b;
        emzlVar2.d = i;
        if (!v.b.L()) {
            v.U();
        }
        emzt emztVar2 = (emzt) v.b;
        emzl emzlVar3 = (emzl) v2.Q();
        emzlVar3.getClass();
        emztVar2.r = emzlVar3;
        emztVar2.b |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
        if (!c3.b.L()) {
            c3.U();
        }
        emux emuxVar = (emux) c3.b;
        emzt emztVar3 = (emzt) v.Q();
        emux emuxVar2 = emux.a;
        emztVar3.getClass();
        emuxVar.L = emztVar3;
        emuxVar.c |= 1024;
        akeuVar.z(c3, emuw.MMS_BACKUP, akeuVar.c);
        return !akfz.a() || z;
    }

    @Override // defpackage.aupn, com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        if (fodw.P()) {
            return new akxz(this);
        }
        return null;
    }
}
