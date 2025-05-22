package com.google.android.gms.smartdevice.d2d;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.libs.scheduler.GmsTaskChimeraService;
import com.google.android.gms.smartdevice.d2d.CleanSharedSecretChimeraService;
import com.google.android.gms.smartdevice.d2d.ManagedAccountSetupInfo;
import defpackage.aupz;
import defpackage.ausk;
import defpackage.bzlt;
import defpackage.bzlv;
import defpackage.bzlw;
import defpackage.caqj;
import defpackage.casd;
import defpackage.catb;
import defpackage.cauf;
import defpackage.dfgj;
import defpackage.dfix;
import defpackage.dfjk;
import defpackage.dfvu;
import defpackage.dfvy;
import defpackage.dgbu;
import defpackage.eaab;
import defpackage.fuyw;
import defpackage.fuyz;
import defpackage.fvae;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class CleanSharedSecretChimeraService extends GmsTaskChimeraService {
    private static final Executor a = new aupz(1, 10);
    private static final ausk b = new ausk() { // from class: dfht
        @Override // defpackage.ausk
        public final Object a(Object obj) {
            return casd.a((Context) obj);
        }
    };

    public static void d(Context context) {
        Object a2 = b.a(context);
        long a3 = fuyz.a.lK().a();
        long seconds = TimeUnit.HOURS.toSeconds(12L) + a3;
        catb catbVar = new catb();
        catbVar.j = "com.google.android.gms.smartdevice.d2d.CleanSharedSecretService";
        catbVar.t("cleanEsimActivation");
        catbVar.e(a3, seconds);
        catbVar.v(1);
        catbVar.p = true;
        ((casd) a2).f(catbVar.b());
    }

    public static void e(Context context) {
        Object a2 = b.a(context);
        long a3 = fuyw.a.lK().a();
        long seconds = TimeUnit.HOURS.toSeconds(12L) + a3;
        catb catbVar = new catb();
        catbVar.j = "com.google.android.gms.smartdevice.d2d.CleanSharedSecretService";
        catbVar.t("cleanWorkProfile");
        catbVar.e(a3, seconds);
        catbVar.v(1);
        catbVar.p = true;
        ((casd) a2).f(catbVar.b());
    }

    public static void f(Context context) {
        Object a2 = b.a(context);
        long o = fvae.a.lK().o();
        long seconds = TimeUnit.HOURS.toSeconds(1L) + o;
        catb catbVar = new catb();
        catbVar.j = "com.google.android.gms.smartdevice.d2d.CleanSharedSecretService";
        catbVar.t("cleanSharedSecret");
        catbVar.v(1);
        catbVar.e(o, seconds);
        catbVar.p = true;
        ((casd) a2).f(catbVar.b());
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(cauf caufVar) {
        dfgj a2 = dfjk.a(this);
        String str = caufVar.a;
        if ("cleanSharedSecret".equals(str)) {
            dgbu dgbuVar = new dgbu(this);
            bzlv bzlvVar = dgbuVar.b;
            long b2 = bzlw.b(bzlvVar, "session", 0L);
            bzlt c = bzlvVar.c();
            c.j("sharedSecret");
            c.j("session");
            bzlw.f(c);
            dfvy dfvyVar = dgbuVar.c;
            dfvyVar.d(3);
            dfvyVar.c(b2);
            dfvyVar.a();
        }
        if ("cleanWorkProfile".equals(str)) {
            bzlt c2 = new dfvu(this, new caqj(Looper.getMainLooper())).b.c();
            c2.d();
            if (bzlw.g(c2)) {
                dfvu.a.d("Managed account state cleared", new Object[0]);
            } else {
                dfvu.a.f("Failed to clear managed account state", new Object[0]);
            }
            ((eaab) a2.b.lK()).b(new Object[0]);
        }
        if ("cleanEsimActivation".equals(str)) {
            bzlt c3 = new dfix(this).a.c();
            c3.d();
            bzlw.f(c3);
        }
        return 0;
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final void gf() {
        a.execute(new Runnable() { // from class: dfhu
            @Override // java.lang.Runnable
            public final void run() {
                caqj caqjVar = new caqj(Looper.getMainLooper());
                final CleanSharedSecretChimeraService cleanSharedSecretChimeraService = CleanSharedSecretChimeraService.this;
                new dfvu(cleanSharedSecretChimeraService, caqjVar).c().z(new dhlq() { // from class: dfhv
                    @Override // defpackage.dhlq
                    public final void gC(Object obj) {
                        ManagedAccountSetupInfo managedAccountSetupInfo = (ManagedAccountSetupInfo) obj;
                        if (managedAccountSetupInfo == null || managedAccountSetupInfo.b == 0) {
                            return;
                        }
                        CleanSharedSecretChimeraService.e(CleanSharedSecretChimeraService.this);
                    }
                });
                new dfix(cleanSharedSecretChimeraService).b().z(new dhlq() { // from class: dfhw
                    @Override // defpackage.dhlq
                    public final void gC(Object obj) {
                        ArrayList arrayList = (ArrayList) obj;
                        if (arrayList == null || arrayList.isEmpty()) {
                            return;
                        }
                        CleanSharedSecretChimeraService.d(CleanSharedSecretChimeraService.this);
                    }
                });
                if (new dgbu(cleanSharedSecretChimeraService).d() == null) {
                    return;
                }
                CleanSharedSecretChimeraService.f(cleanSharedSecretChimeraService);
            }
        });
    }
}
