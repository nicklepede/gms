package com.google.android.gms.smartdevice.d2d;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.libs.scheduler.GmsTaskChimeraService;
import com.google.android.gms.smartdevice.d2d.CleanSharedSecretChimeraService;
import com.google.android.gms.smartdevice.d2d.ManagedAccountSetupInfo;
import defpackage.asmf;
import defpackage.asoq;
import defpackage.bxdd;
import defpackage.bxdf;
import defpackage.bxdg;
import defpackage.byhr;
import defpackage.byjl;
import defpackage.bykj;
import defpackage.byln;
import defpackage.dcve;
import defpackage.dcxs;
import defpackage.dcyf;
import defpackage.ddkp;
import defpackage.ddkt;
import defpackage.ddqp;
import defpackage.dxob;
import defpackage.fsdz;
import defpackage.fsec;
import defpackage.fsfh;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class CleanSharedSecretChimeraService extends GmsTaskChimeraService {
    private static final Executor a = new asmf(1, 10);
    private static final asoq b = new asoq() { // from class: dcwo
        @Override // defpackage.asoq
        public final Object a(Object obj) {
            return byjl.a((Context) obj);
        }
    };

    public static void d(Context context) {
        Object a2 = b.a(context);
        long a3 = fsec.a.a().a();
        long seconds = TimeUnit.HOURS.toSeconds(12L) + a3;
        bykj bykjVar = new bykj();
        bykjVar.j = "com.google.android.gms.smartdevice.d2d.CleanSharedSecretService";
        bykjVar.t("cleanEsimActivation");
        bykjVar.e(a3, seconds);
        bykjVar.v(1);
        bykjVar.p = true;
        ((byjl) a2).f(bykjVar.b());
    }

    public static void e(Context context) {
        Object a2 = b.a(context);
        long a3 = fsdz.a.a().a();
        long seconds = TimeUnit.HOURS.toSeconds(12L) + a3;
        bykj bykjVar = new bykj();
        bykjVar.j = "com.google.android.gms.smartdevice.d2d.CleanSharedSecretService";
        bykjVar.t("cleanWorkProfile");
        bykjVar.e(a3, seconds);
        bykjVar.v(1);
        bykjVar.p = true;
        ((byjl) a2).f(bykjVar.b());
    }

    public static void f(Context context) {
        Object a2 = b.a(context);
        long o = fsfh.a.a().o();
        long seconds = TimeUnit.HOURS.toSeconds(1L) + o;
        bykj bykjVar = new bykj();
        bykjVar.j = "com.google.android.gms.smartdevice.d2d.CleanSharedSecretService";
        bykjVar.t("cleanSharedSecret");
        bykjVar.v(1);
        bykjVar.e(o, seconds);
        bykjVar.p = true;
        ((byjl) a2).f(bykjVar.b());
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(byln bylnVar) {
        dcve a2 = dcyf.a(this);
        String str = bylnVar.a;
        if ("cleanSharedSecret".equals(str)) {
            ddqp ddqpVar = new ddqp(this);
            bxdf bxdfVar = ddqpVar.b;
            long b2 = bxdg.b(bxdfVar, "session", 0L);
            bxdd c = bxdfVar.c();
            c.j("sharedSecret");
            c.j("session");
            bxdg.f(c);
            ddkt ddktVar = ddqpVar.c;
            ddktVar.d(3);
            ddktVar.c(b2);
            ddktVar.a();
        }
        if ("cleanWorkProfile".equals(str)) {
            bxdd c2 = new ddkp(this, new byhr(Looper.getMainLooper())).b.c();
            c2.d();
            if (bxdg.g(c2)) {
                ddkp.a.d("Managed account state cleared", new Object[0]);
            } else {
                ddkp.a.f("Failed to clear managed account state", new Object[0]);
            }
            ((dxob) a2.b.a()).b(new Object[0]);
        }
        if ("cleanEsimActivation".equals(str)) {
            bxdd c3 = new dcxs(this).a.c();
            c3.d();
            bxdg.f(c3);
        }
        return 0;
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final void fR() {
        a.execute(new Runnable() { // from class: dcwp
            @Override // java.lang.Runnable
            public final void run() {
                byhr byhrVar = new byhr(Looper.getMainLooper());
                final CleanSharedSecretChimeraService cleanSharedSecretChimeraService = CleanSharedSecretChimeraService.this;
                new ddkp(cleanSharedSecretChimeraService, byhrVar).c().z(new dfak() { // from class: dcwq
                    @Override // defpackage.dfak
                    public final void gn(Object obj) {
                        ManagedAccountSetupInfo managedAccountSetupInfo = (ManagedAccountSetupInfo) obj;
                        if (managedAccountSetupInfo == null || managedAccountSetupInfo.b == 0) {
                            return;
                        }
                        CleanSharedSecretChimeraService.e(CleanSharedSecretChimeraService.this);
                    }
                });
                new dcxs(cleanSharedSecretChimeraService).b().z(new dfak() { // from class: dcwr
                    @Override // defpackage.dfak
                    public final void gn(Object obj) {
                        ArrayList arrayList = (ArrayList) obj;
                        if (arrayList == null || arrayList.isEmpty()) {
                            return;
                        }
                        CleanSharedSecretChimeraService.d(CleanSharedSecretChimeraService.this);
                    }
                });
                if (new ddqp(cleanSharedSecretChimeraService).d() == null) {
                    return;
                }
                CleanSharedSecretChimeraService.f(cleanSharedSecretChimeraService);
            }
        });
    }
}
