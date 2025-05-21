package com.google.android.gms.auth.folsom.service;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.auth.folsom.operation.KeySyncIntentOperation;
import com.google.android.gms.libs.scheduler.GmsTaskChimeraService;
import defpackage.abbt;
import defpackage.abnb;
import defpackage.abng;
import defpackage.arxo;
import defpackage.asng;
import defpackage.asni;
import defpackage.aspj;
import defpackage.bqna;
import defpackage.byjl;
import defpackage.byki;
import defpackage.bykj;
import defpackage.bykm;
import defpackage.byko;
import defpackage.bykv;
import defpackage.bykx;
import defpackage.byky;
import defpackage.fkyk;
import defpackage.fnck;
import defpackage.fncn;
import defpackage.fnde;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class FolsomGcmTaskChimeraService extends GmsTaskChimeraService {
    public static final arxo a = abng.a("RecoverableKeyStoreGmsGcmTaskChimeraService");

    public static byky d() {
        return bykx.a(0, (int) fkyk.a.a().n(), (int) fkyk.a.a().o());
    }

    public static void e(Context context) {
        a.d("initializePeriodicCertUpdate", new Object[0]);
        if (fnck.a.a().n()) {
            byjl a2 = byjl.a(context);
            byko bykoVar = new byko();
            bykoVar.j = "com.google.android.gms.auth.folsom.service.FolsomPublicKeyUpdateService";
            bykoVar.q("com.google.android.gms.auth.folsom.PERIODIC_CERT_UPDATE");
            bykoVar.v(2);
            bykoVar.l(true);
            bykoVar.a = bykv.e((int) fkyk.a.a().f());
            a2.f(bykoVar.b());
            return;
        }
        bykm bykmVar = new bykm();
        bykmVar.j = "com.google.android.gms.auth.folsom.service.FolsomPublicKeyUpdateService";
        bykmVar.t("com.google.android.gms.auth.folsom.PERIODIC_CERT_UPDATE");
        bykmVar.y(0, 1);
        bykmVar.x(0, 1);
        bykmVar.p = true;
        bykmVar.v(2);
        bykmVar.t = byky.a;
        long h = fkyk.a.a().h();
        long g = fkyk.a.a().g();
        if (fnde.d()) {
            bykmVar.j(byki.a(h));
        } else {
            bykmVar.a = h;
            bykmVar.b = g;
        }
        byjl.a(context).f(bykmVar.b());
    }

    public static void f(Context context) {
        a.d("initializePeriodicKeySyncCheck", new Object[0]);
        if (fncn.k()) {
            byjl a2 = byjl.a(context);
            byko bykoVar = new byko();
            bykoVar.j = "com.google.android.gms.auth.folsom.service.FolsomPublicKeyUpdateService";
            bykoVar.q("com.google.android.gms.auth.folsom.KEY_SYNC_FOR_BACKUP_ACCOUNT_IF_NEEDED");
            bykoVar.v(2);
            bykoVar.p = true;
            bykoVar.l(true);
            bykoVar.a = bykv.j;
            a2.f(bykoVar.b());
            return;
        }
        bykm bykmVar = new bykm();
        bykmVar.j = "com.google.android.gms.auth.folsom.service.FolsomPublicKeyUpdateService";
        bykmVar.t("com.google.android.gms.auth.folsom.KEY_SYNC_FOR_BACKUP_ACCOUNT_IF_NEEDED");
        bykmVar.g(0);
        bykmVar.p = true;
        bykmVar.v(2);
        bykmVar.t = d();
        long j = fkyk.a.a().j();
        long i = fkyk.a.a().i();
        if (fnde.d()) {
            bykmVar.j(byki.a(j));
        } else {
            bykmVar.a = j;
            bykmVar.b = i;
        }
        byjl.a(context).f(bykmVar.b());
    }

    public static void g(Context context, String str) {
        h(context, str, 1L, 2L);
    }

    public static void h(Context context, String str, long j, long j2) {
        a.d("scheduleKeySync to happen in %d~%d s.", Long.valueOf(j), Long.valueOf(j2));
        Bundle bundle = new Bundle();
        bundle.putString("com.google.android.gms.auth.folsom.EXTRA_ACCOUNT_NAME", str);
        bykj bykjVar = new bykj();
        bykjVar.j = "com.google.android.gms.auth.folsom.service.FolsomPublicKeyUpdateService";
        String concat = "com.google.android.gms.auth.folsom.SYNC_".concat(aspj.b(asng.Z(str, "SHA-256")));
        if (concat.length() > 90) {
            concat = concat.substring(0, 90);
        }
        bykjVar.t(concat);
        bykjVar.p = true;
        bykjVar.e(j, j2);
        bykjVar.t = d();
        bykjVar.g(0);
        bykjVar.v(2);
        bykjVar.u = bundle;
        byjl.a(context).f(bykjVar.b());
    }

    private static int j(Context context, Account account) {
        arxo arxoVar = KeySyncIntentOperation.a;
        if (account == null) {
            KeySyncIntentOperation.a.f("Cannot sync keys. No backup account set.", new Object[0]);
        } else if (!asni.e(bqna.b(context).o(), account)) {
            KeySyncIntentOperation.a.d("Cannot sync keys for removed account", new Object[0]);
        } else if (KeySyncIntentOperation.c(account, 9) != 2) {
            return 1;
        }
        return 0;
    }

    private static int k(Context context, int i, String str) {
        if (!abnb.b) {
            a.d("Cert update is running on pre P device", new Object[0]);
            return 0;
        }
        int b = new abbt(str).b(context, false, i);
        a.h("Cert download and update status=[%s]", b != 1 ? b != 2 ? b != 3 ? "INIT_RECOVERY_SERVICE_SUCCESS" : "INIT_RECOVERY_SERVICE_FAILED" : "SIG_DOWNLOAD_FAILED" : "CERT_DOWNLOAD_FAILED");
        return b + (-1) != 3 ? 1 : 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:214:0x06e1  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x06f0  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0701  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0741  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x075a  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0779  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x077c A[SYNTHETIC] */
    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(defpackage.byln r36) {
        /*
            Method dump skipped, instructions count: 1978
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.folsom.service.FolsomGcmTaskChimeraService.a(byln):int");
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final void fR() {
        a.d("onInitializeTasks", new Object[0]);
        Context baseContext = getBaseContext();
        f(baseContext);
        if (abnb.b) {
            e(baseContext);
        }
    }
}
