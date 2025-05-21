package com.google.android.gms.wallet.service;

import android.accounts.Account;
import android.content.Context;
import android.util.Log;
import com.google.android.gms.libs.scheduler.GmsTaskChimeraService;
import defpackage.asng;
import defpackage.bqna;
import defpackage.byjl;
import defpackage.byki;
import defpackage.bykm;
import defpackage.byko;
import defpackage.bykv;
import defpackage.byln;
import defpackage.dikh;
import defpackage.diuk;
import defpackage.diul;
import defpackage.diyk;
import defpackage.diyo;
import defpackage.djbu;
import defpackage.edna;
import defpackage.eitj;
import defpackage.ejcb;
import defpackage.fecj;
import defpackage.fehj;
import defpackage.fehm;
import defpackage.fnck;
import defpackage.fnde;
import defpackage.fter;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class WalletGcmTaskChimeraService extends GmsTaskChimeraService {
    private edna a;

    public static void d(Context context) {
        asng.H(context, "com.google.android.gms.wallet.service.WalletGcmTaskService", true);
        eitj eitjVar = diyo.a;
        djbu djbuVar = new djbu(context);
        byjl a = byjl.a(context);
        if (!diyo.c()) {
            eitj eitjVar2 = diyo.a;
            int i = ((ejcb) eitjVar2).c;
            for (int i2 = 0; i2 < i; i2++) {
                a.d((String) eitjVar2.get(i2), "com.google.android.gms.wallet.service.WalletGcmTaskService");
            }
            for (Account account : bqna.b(context).p("com.google")) {
                fehm c = djbuVar.c(1, account);
                if (c != null) {
                    fecj fecjVar = (fecj) c.iB(5, null);
                    fecjVar.X(c);
                    fehj fehjVar = (fehj) fecjVar;
                    if (!fehjVar.b.L()) {
                        fehjVar.U();
                    }
                    fehm fehmVar = (fehm) fehjVar.b;
                    fehmVar.e = null;
                    fehmVar.b &= -9;
                    djbuVar.f(1, account, (fehm) fehjVar.Q());
                }
            }
        } else if (fnck.m()) {
            byko bykoVar = new byko();
            bykoVar.j = "com.google.android.gms.wallet.service.WalletGcmTaskService";
            bykoVar.q("INSTANTBUY_SYNC_GCM_TASK_STEP_1");
            bykoVar.v(2);
            bykoVar.l(true);
            bykoVar.a = bykv.j;
            bykoVar.e();
            a.f(bykoVar.b());
        } else {
            bykm bykmVar = new bykm();
            bykmVar.j = "com.google.android.gms.wallet.service.WalletGcmTaskService";
            bykmVar.y(0, 1);
            bykmVar.x(1, 1);
            bykmVar.q("INSTANTBUY_SYNC_GCM_TASK_STEP_1");
            bykmVar.a = TimeUnit.HOURS.toSeconds(24L);
            bykmVar.b = TimeUnit.HOURS.toSeconds(1L);
            bykmVar.v(0);
            if (fnde.k()) {
                bykmVar.j(byki.EVERY_DAY);
            } else {
                bykmVar.a = TimeUnit.HOURS.toSeconds(24L);
                bykmVar.b = TimeUnit.HOURS.toSeconds(1L);
            }
            a.f(bykmVar.b());
        }
        byjl a2 = byjl.a(context);
        if (!fter.a.a().a()) {
            a2.d("WALLET_STORAGE_CLEAN_UP", "com.google.android.gms.wallet.service.WalletGcmTaskService");
            return;
        }
        if (fnck.m()) {
            byko bykoVar2 = new byko();
            bykoVar2.j = "com.google.android.gms.wallet.service.WalletGcmTaskService";
            bykoVar2.q("WALLET_STORAGE_CLEAN_UP");
            bykoVar2.v(2);
            bykoVar2.l(false);
            bykoVar2.a = bykv.j;
            bykoVar2.e();
            a2.f(bykoVar2.b());
            return;
        }
        bykm bykmVar2 = new bykm();
        bykmVar2.j = "com.google.android.gms.wallet.service.WalletGcmTaskService";
        bykmVar2.y(2, 2);
        bykmVar2.x(1, 1);
        bykmVar2.q("WALLET_STORAGE_CLEAN_UP");
        bykmVar2.v(0);
        if (fnde.k()) {
            bykmVar2.j(byki.EVERY_DAY);
        } else {
            bykmVar2.a = TimeUnit.HOURS.toSeconds(24L);
            bykmVar2.b = TimeUnit.HOURS.toSeconds(1L);
        }
        a2.f(bykmVar2.b());
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(byln bylnVar) {
        diul diulVar;
        try {
            if (Log.isLoggable("WalletGcmTaskService", 4)) {
                Log.i("WalletGcmTaskService", String.format(Locale.US, "Running GcmTask w/ tag %s", bylnVar.a));
            }
            String str = bylnVar.a;
            if (str.equals("INSTANTBUY_REFRESH_INSTRUMENT_AVAILABILITY")) {
                diulVar = new diyk(this, this.a);
            } else if (diyo.a.contains(str)) {
                diulVar = new diyo(this, this.a);
            } else if (str.equals("WALLET_STORAGE_CLEAN_UP")) {
                diulVar = new diuk(this);
            } else {
                Log.w("WalletGcmTaskService", String.format(Locale.US, "No GcmTask corresponding to tag %s", str));
                diulVar = null;
            }
            if (diulVar != null) {
                return diulVar.a(bylnVar);
            }
        } catch (Throwable unused) {
        }
        return 2;
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final void fR() {
        d(this);
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.chimera.Service
    public final void onCreate() {
        super.onCreate();
        this.a = dikh.a(getApplicationContext());
    }
}
