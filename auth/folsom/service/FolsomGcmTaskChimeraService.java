package com.google.android.gms.auth.folsom.service;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.auth.folsom.operation.KeySyncIntentOperation;
import com.google.android.gms.libs.scheduler.GmsTaskChimeraService;
import defpackage.adbt;
import defpackage.adnb;
import defpackage.adng;
import defpackage.auad;
import defpackage.aura;
import defpackage.aurc;
import defpackage.autd;
import defpackage.bsup;
import defpackage.casd;
import defpackage.cata;
import defpackage.catb;
import defpackage.cate;
import defpackage.catg;
import defpackage.catn;
import defpackage.catp;
import defpackage.catq;
import defpackage.fnpr;
import defpackage.fpuj;
import defpackage.fpum;
import defpackage.fpvd;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class FolsomGcmTaskChimeraService extends GmsTaskChimeraService {
    public static final auad a = adng.a("RecoverableKeyStoreGmsGcmTaskChimeraService");

    public static catq d() {
        fnpr fnprVar = fnpr.a;
        return catp.a(0, (int) fnprVar.lK().n(), (int) fnprVar.lK().o());
    }

    public static void e(Context context) {
        a.d("initializePeriodicCertUpdate", new Object[0]);
        if (fpuj.a.lK().n()) {
            casd a2 = casd.a(context);
            catg catgVar = new catg();
            catgVar.j = "com.google.android.gms.auth.folsom.service.FolsomPublicKeyUpdateService";
            catgVar.q("com.google.android.gms.auth.folsom.PERIODIC_CERT_UPDATE");
            catgVar.v(2);
            catgVar.l(true);
            catgVar.a = catn.e((int) fnpr.a.lK().f());
            a2.f(catgVar.b());
            return;
        }
        cate cateVar = new cate();
        cateVar.j = "com.google.android.gms.auth.folsom.service.FolsomPublicKeyUpdateService";
        cateVar.t("com.google.android.gms.auth.folsom.PERIODIC_CERT_UPDATE");
        cateVar.y(0, 1);
        cateVar.x(0, 1);
        cateVar.p = true;
        cateVar.v(2);
        cateVar.t = catq.a;
        fnpr fnprVar = fnpr.a;
        long h = fnprVar.lK().h();
        long g = fnprVar.lK().g();
        if (fpvd.d()) {
            cateVar.j(cata.a(h));
        } else {
            cateVar.a = h;
            cateVar.b = g;
        }
        casd.a(context).f(cateVar.b());
    }

    public static void f(Context context) {
        a.d("initializePeriodicKeySyncCheck", new Object[0]);
        if (fpum.k()) {
            casd a2 = casd.a(context);
            catg catgVar = new catg();
            catgVar.j = "com.google.android.gms.auth.folsom.service.FolsomPublicKeyUpdateService";
            catgVar.q("com.google.android.gms.auth.folsom.KEY_SYNC_FOR_BACKUP_ACCOUNT_IF_NEEDED");
            catgVar.v(2);
            catgVar.p = true;
            catgVar.l(true);
            catgVar.a = catn.j;
            a2.f(catgVar.b());
            return;
        }
        cate cateVar = new cate();
        cateVar.j = "com.google.android.gms.auth.folsom.service.FolsomPublicKeyUpdateService";
        cateVar.t("com.google.android.gms.auth.folsom.KEY_SYNC_FOR_BACKUP_ACCOUNT_IF_NEEDED");
        cateVar.g(0);
        cateVar.p = true;
        cateVar.v(2);
        cateVar.t = d();
        fnpr fnprVar = fnpr.a;
        long j = fnprVar.lK().j();
        long i = fnprVar.lK().i();
        if (fpvd.d()) {
            cateVar.j(cata.a(j));
        } else {
            cateVar.a = j;
            cateVar.b = i;
        }
        casd.a(context).f(cateVar.b());
    }

    public static void g(Context context, String str) {
        h(context, str, 1L, 2L);
    }

    public static void h(Context context, String str, long j, long j2) {
        a.d("scheduleKeySync to happen in %d~%d s.", Long.valueOf(j), Long.valueOf(j2));
        Bundle bundle = new Bundle();
        bundle.putString("com.google.android.gms.auth.folsom.EXTRA_ACCOUNT_NAME", str);
        catb catbVar = new catb();
        catbVar.j = "com.google.android.gms.auth.folsom.service.FolsomPublicKeyUpdateService";
        String concat = "com.google.android.gms.auth.folsom.SYNC_".concat(autd.b(aura.Z(str, "SHA-256")));
        if (concat.length() > 90) {
            concat = concat.substring(0, 90);
        }
        catbVar.t(concat);
        catbVar.p = true;
        catbVar.e(j, j2);
        catbVar.t = d();
        catbVar.g(0);
        catbVar.v(2);
        catbVar.u = bundle;
        casd.a(context).f(catbVar.b());
    }

    private static int j(Context context, Account account) {
        auad auadVar = KeySyncIntentOperation.a;
        if (account == null) {
            KeySyncIntentOperation.a.f("Cannot sync keys. No backup account set.", new Object[0]);
        } else if (!aurc.e(bsup.b(context).o(), account)) {
            KeySyncIntentOperation.a.d("Cannot sync keys for removed account", new Object[0]);
        } else if (KeySyncIntentOperation.c(account, 9) != 2) {
            return 1;
        }
        return 0;
    }

    private static int k(Context context, int i, String str) {
        if (!adnb.b) {
            a.d("Cert update is running on pre P device", new Object[0]);
            return 0;
        }
        int b = new adbt(str).b(context, false, i);
        a.h("Cert download and update status=[%s]", b != 1 ? b != 2 ? b != 3 ? "INIT_RECOVERY_SERVICE_SUCCESS" : "INIT_RECOVERY_SERVICE_FAILED" : "SIG_DOWNLOAD_FAILED" : "CERT_DOWNLOAD_FAILED");
        return b + (-1) != 3 ? 1 : 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:214:0x06de  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x06ed  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x06fe  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x073e  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0757  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0776  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0779 A[SYNTHETIC] */
    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(defpackage.cauf r36) {
        /*
            Method dump skipped, instructions count: 1976
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.folsom.service.FolsomGcmTaskChimeraService.a(cauf):int");
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final void gf() {
        a.d("onInitializeTasks", new Object[0]);
        Context baseContext = getBaseContext();
        f(baseContext);
        if (adnb.b) {
            e(baseContext);
        }
    }
}
