package com.google.android.gms.wallet.service;

import android.accounts.Account;
import android.content.Context;
import android.util.Log;
import com.google.android.gms.libs.scheduler.GmsTaskChimeraService;
import defpackage.aura;
import defpackage.bsup;
import defpackage.casd;
import defpackage.cata;
import defpackage.cate;
import defpackage.catg;
import defpackage.catn;
import defpackage.cauf;
import defpackage.dkvs;
import defpackage.dlfv;
import defpackage.dlfw;
import defpackage.dlkd;
import defpackage.dlkh;
import defpackage.dlnn;
import defpackage.efzw;
import defpackage.elgo;
import defpackage.elpg;
import defpackage.fgrc;
import defpackage.fgwc;
import defpackage.fgwf;
import defpackage.fpuj;
import defpackage.fpvd;
import defpackage.fwaf;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class WalletGcmTaskChimeraService extends GmsTaskChimeraService {
    private efzw a;

    public static void d(Context context) {
        aura.H(context, "com.google.android.gms.wallet.service.WalletGcmTaskService", true);
        elgo elgoVar = dlkh.a;
        dlnn dlnnVar = new dlnn(context);
        casd a = casd.a(context);
        if (!dlkh.c()) {
            elgo elgoVar2 = dlkh.a;
            int i = ((elpg) elgoVar2).c;
            for (int i2 = 0; i2 < i; i2++) {
                a.d((String) elgoVar2.get(i2), "com.google.android.gms.wallet.service.WalletGcmTaskService");
            }
            for (Account account : bsup.b(context).p("com.google")) {
                fgwf c = dlnnVar.c(1, account);
                if (c != null) {
                    fgrc fgrcVar = (fgrc) c.iQ(5, null);
                    fgrcVar.X(c);
                    fgwc fgwcVar = (fgwc) fgrcVar;
                    if (!fgwcVar.b.L()) {
                        fgwcVar.U();
                    }
                    fgwf fgwfVar = (fgwf) fgwcVar.b;
                    fgwfVar.e = null;
                    fgwfVar.b &= -9;
                    dlnnVar.f(1, account, (fgwf) fgwcVar.Q());
                }
            }
        } else if (fpuj.m()) {
            catg catgVar = new catg();
            catgVar.j = "com.google.android.gms.wallet.service.WalletGcmTaskService";
            catgVar.q("INSTANTBUY_SYNC_GCM_TASK_STEP_1");
            catgVar.v(2);
            catgVar.l(true);
            catgVar.a = catn.j;
            catgVar.e();
            a.f(catgVar.b());
        } else {
            cate cateVar = new cate();
            cateVar.j = "com.google.android.gms.wallet.service.WalletGcmTaskService";
            cateVar.y(0, 1);
            cateVar.x(1, 1);
            cateVar.q("INSTANTBUY_SYNC_GCM_TASK_STEP_1");
            cateVar.a = TimeUnit.HOURS.toSeconds(24L);
            cateVar.b = TimeUnit.HOURS.toSeconds(1L);
            cateVar.v(0);
            if (fpvd.k()) {
                cateVar.j(cata.EVERY_DAY);
            } else {
                cateVar.a = TimeUnit.HOURS.toSeconds(24L);
                cateVar.b = TimeUnit.HOURS.toSeconds(1L);
            }
            a.f(cateVar.b());
        }
        casd a2 = casd.a(context);
        if (!fwaf.a.lK().a()) {
            a2.d("WALLET_STORAGE_CLEAN_UP", "com.google.android.gms.wallet.service.WalletGcmTaskService");
            return;
        }
        if (fpuj.m()) {
            catg catgVar2 = new catg();
            catgVar2.j = "com.google.android.gms.wallet.service.WalletGcmTaskService";
            catgVar2.q("WALLET_STORAGE_CLEAN_UP");
            catgVar2.v(2);
            catgVar2.l(false);
            catgVar2.a = catn.j;
            catgVar2.e();
            a2.f(catgVar2.b());
            return;
        }
        cate cateVar2 = new cate();
        cateVar2.j = "com.google.android.gms.wallet.service.WalletGcmTaskService";
        cateVar2.y(2, 2);
        cateVar2.x(1, 1);
        cateVar2.q("WALLET_STORAGE_CLEAN_UP");
        cateVar2.v(0);
        if (fpvd.k()) {
            cateVar2.j(cata.EVERY_DAY);
        } else {
            cateVar2.a = TimeUnit.HOURS.toSeconds(24L);
            cateVar2.b = TimeUnit.HOURS.toSeconds(1L);
        }
        a2.f(cateVar2.b());
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(cauf caufVar) {
        dlfw dlfwVar;
        try {
            if (Log.isLoggable("WalletGcmTaskService", 4)) {
                Log.i("WalletGcmTaskService", String.format(Locale.US, "Running GcmTask w/ tag %s", caufVar.a));
            }
            String str = caufVar.a;
            if (str.equals("INSTANTBUY_REFRESH_INSTRUMENT_AVAILABILITY")) {
                dlfwVar = new dlkd(this, this.a);
            } else if (dlkh.a.contains(str)) {
                dlfwVar = new dlkh(this, this.a);
            } else if (str.equals("WALLET_STORAGE_CLEAN_UP")) {
                dlfwVar = new dlfv(this);
            } else {
                Log.w("WalletGcmTaskService", String.format(Locale.US, "No GcmTask corresponding to tag %s", str));
                dlfwVar = null;
            }
            if (dlfwVar != null) {
                return dlfwVar.a(caufVar);
            }
        } catch (Throwable unused) {
        }
        return 2;
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final void gf() {
        d(this);
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.chimera.Service
    public final void onCreate() {
        super.onCreate();
        this.a = dkvs.a(getApplicationContext());
    }
}
