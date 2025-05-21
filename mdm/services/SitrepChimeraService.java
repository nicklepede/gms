package com.google.android.gms.mdm.services;

import android.content.Intent;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import defpackage.anqj;
import defpackage.aqum;
import defpackage.aqun;
import defpackage.asit;
import defpackage.asng;
import defpackage.asoe;
import defpackage.bzgc;
import defpackage.cctl;
import defpackage.ccto;
import defpackage.ccuc;
import defpackage.ccuk;
import defpackage.ccut;
import defpackage.cdaf;
import defpackage.cdaj;
import defpackage.enox;
import defpackage.enpf;
import defpackage.enqc;
import defpackage.enre;
import defpackage.febw;
import defpackage.fecj;
import defpackage.fecp;
import defpackage.ffep;
import defpackage.ffeq;
import defpackage.ffes;
import defpackage.fiht;
import defpackage.fiif;
import defpackage.fiig;
import defpackage.fiih;
import defpackage.fizz;
import defpackage.fjaa;
import defpackage.frte;
import defpackage.fttm;
import defpackage.ftxb;
import defpackage.ftxd;
import defpackage.ftxe;
import defpackage.ftya;
import defpackage.ftyg;
import defpackage.furn;
import defpackage.furo;
import defpackage.fusb;
import defpackage.rnx;
import defpackage.rod;
import j$.time.Instant;
import java.io.IOException;
import java.util.concurrent.ExecutionException;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class SitrepChimeraService extends ccut {
    private int a;
    private String b;
    private Boolean c;
    private Boolean d;
    private fiif e = fiif.UNKNOWN;

    final void d(Throwable th) {
        if (th == null) {
            cdaj.a("Permanent error sending sitrep and do not retry.", new Object[0]);
            return;
        }
        while ((th instanceof ExecutionException) && th.getCause() != null) {
            th = th.getCause();
        }
        if ((th instanceof ftyg) && ((ftyg) th).a.t != ftya.UNAVAILABLE) {
            cdaj.a("Permanent error sending sitrep and do not retry.", new Object[0]);
            return;
        }
        ccuc.i.d(Integer.valueOf(this.e.o));
        rod rodVar = ccuc.k;
        rodVar.d(Integer.valueOf(((Integer) rodVar.c()).intValue() + 1));
        cdaj.d("Transient error sending sitrep, set up retry.", new Object[0]);
        ccuk.c(this, Instant.now().plusMillis((long) ((Math.random() * 3600000.0d) + 1000.0d)).toEpochMilli());
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (asoe.c(this) || intent == null) {
            return;
        }
        this.e = SitrepHelperIntentOperation.a(intent, "reason");
        this.a = intent.getIntExtra("gms_core_version", 0);
        this.b = intent.getStringExtra("gcm_registration_id");
        if (intent.hasExtra("is_device_admin")) {
            this.c = Boolean.valueOf(intent.getBooleanExtra("is_device_admin", false));
        }
        if (intent.hasExtra("lockscreen_enabled")) {
            this.d = Boolean.valueOf(intent.getBooleanExtra("lockscreen_enabled", false));
        }
        fiif a = SitrepHelperIntentOperation.a(intent, "retry_reason");
        long e = asng.e(this);
        String str = null;
        if (e == 0) {
            cdaj.a("Android ID == 0, not sending sitrep", new Object[0]);
            d(null);
            return;
        }
        TelephonyManager telephonyManager = (TelephonyManager) getSystemService("phone");
        try {
            str = anqj.b(this);
        } catch (aqum e2) {
            cdaj.b(e2, "Error getting device data version info.", new Object[0]);
        } catch (aqun e3) {
            cdaj.b(e3, "Error getting device data version info.", new Object[0]);
        } catch (IOException e4) {
            cdaj.b(e4, "Error getting device data version info.", new Object[0]);
        }
        int phoneType = telephonyManager.getPhoneType();
        ccto a2 = cctl.a();
        int i = this.a;
        String str2 = this.b;
        Boolean bool = this.c;
        fiif fiifVar = this.e;
        Boolean bool2 = this.d;
        cdaj.c("Sending sitrep with xrpc: [%s, %s]", fiifVar, a);
        fiig fiigVar = fiig.a;
        fecj v = fiigVar.v();
        if (!v.b.L()) {
            v.U();
        }
        fecp fecpVar = v.b;
        fiig fiigVar2 = (fiig) fecpVar;
        fiigVar2.h = fiifVar.o;
        fiigVar2.b |= 64;
        if (!fecpVar.L()) {
            v.U();
        }
        fecp fecpVar2 = v.b;
        fiig fiigVar3 = (fiig) fecpVar2;
        fiigVar3.i = a.o;
        fiigVar3.b |= 128;
        if (!fecpVar2.L()) {
            v.U();
        }
        fiig fiigVar4 = (fiig) v.b;
        fiigVar4.b |= 1;
        fiigVar4.c = e;
        int i2 = Build.VERSION.SDK_INT;
        if (!v.b.L()) {
            v.U();
        }
        fecp fecpVar3 = v.b;
        fiig fiigVar5 = (fiig) fecpVar3;
        fiigVar5.b |= 4;
        fiigVar5.e = i2;
        if (!fecpVar3.L()) {
            v.U();
        }
        fecp fecpVar4 = v.b;
        fiig fiigVar6 = (fiig) fecpVar4;
        fiigVar6.b |= 256;
        fiigVar6.j = phoneType;
        if (i > 0) {
            if (!fecpVar4.L()) {
                v.U();
            }
            fiig fiigVar7 = (fiig) v.b;
            fiigVar7.b |= 2;
            fiigVar7.d = i;
        }
        if (!TextUtils.isEmpty(str2)) {
            if (!v.b.L()) {
                v.U();
            }
            fiig fiigVar8 = (fiig) v.b;
            str2.getClass();
            fiigVar8.b |= 16;
            fiigVar8.f = str2;
        }
        if (bool != null) {
            fecj v2 = fiht.a.v();
            boolean booleanValue = bool.booleanValue();
            if (!v2.b.L()) {
                v2.U();
            }
            fiht fihtVar = (fiht) v2.b;
            fihtVar.b |= 1;
            fihtVar.c = booleanValue;
            boolean booleanValue2 = bool.booleanValue();
            if (!v2.b.L()) {
                v2.U();
            }
            fiht fihtVar2 = (fiht) v2.b;
            fihtVar2.b |= 2;
            fihtVar2.d = booleanValue2;
            boolean booleanValue3 = bool.booleanValue();
            if (!v2.b.L()) {
                v2.U();
            }
            fiht fihtVar3 = (fiht) v2.b;
            fihtVar3.b |= 4;
            fihtVar3.e = booleanValue3;
            if (!v.b.L()) {
                v.U();
            }
            fiig fiigVar9 = (fiig) v.b;
            fiht fihtVar4 = (fiht) v2.Q();
            fihtVar4.getClass();
            fiigVar9.g = fihtVar4;
            fiigVar9.b |= 32;
        }
        if (str != null) {
            if (!v.b.L()) {
                v.U();
            }
            fiig fiigVar10 = (fiig) v.b;
            fiigVar10.b |= 512;
            fiigVar10.k = str;
        }
        if (bool2 != null) {
            boolean booleanValue4 = bool2.booleanValue();
            if (!v.b.L()) {
                v.U();
            }
            fiig fiigVar11 = (fiig) v.b;
            fiigVar11.b |= 1024;
            fiigVar11.l = booleanValue4;
        }
        if (frte.n()) {
            cdaj.c("sendSitrepData %s", Base64.encodeToString(((fiig) v.Q()).r(), 2));
        }
        fecj v3 = ffeq.a.v();
        ffep ffepVar = ffep.SITREP_REQUEST_ISSUED;
        if (!v3.b.L()) {
            v3.U();
        }
        ffeq ffeqVar = (ffeq) v3.b;
        ffeqVar.c = ffepVar.eK;
        ffeqVar.b |= 2;
        fecj v4 = ffes.a.v();
        if (!v4.b.L()) {
            v4.U();
        }
        ffes ffesVar = (ffes) v4.b;
        ffesVar.e = 1;
        ffesVar.b = 1 | ffesVar.b;
        String l = Long.toString(e);
        if (!v4.b.L()) {
            v4.U();
        }
        ffes ffesVar2 = (ffes) v4.b;
        l.getClass();
        ffesVar2.c = 2;
        ffesVar2.d = l;
        if (!v3.b.L()) {
            v3.U();
        }
        ffeq ffeqVar2 = (ffeq) v3.b;
        ffes ffesVar3 = (ffes) v4.Q();
        ffesVar3.getClass();
        ffeqVar2.g = ffesVar3;
        ffeqVar2.b |= 32;
        cdaf.c(v3);
        fizz fizzVar = (fizz) a2.c.o(bzgc.a, a2.b);
        fiig fiigVar12 = (fiig) v.Q();
        fttm fttmVar = fizzVar.a;
        ftxe ftxeVar = fjaa.a;
        if (ftxeVar == null) {
            synchronized (fjaa.class) {
                ftxeVar = fjaa.a;
                if (ftxeVar == null) {
                    ftxb a3 = ftxe.a();
                    a3.c = ftxd.UNARY;
                    a3.d = ftxe.c("google.internal.fmd.FmdApiService", "ProcessSitrep");
                    a3.b();
                    febw febwVar = furo.a;
                    a3.a = new furn(fiigVar);
                    a3.b = new furn(fiih.a);
                    ftxe a4 = a3.a();
                    fjaa.a = a4;
                    ftxeVar = a4;
                }
            }
        }
        try {
            ((enpf) enox.g(fusb.a(fttmVar.a(ftxeVar, fizzVar.b), fiigVar12), Exception.class, new enqc() { // from class: cctm
                @Override // defpackage.enqc
                public final enss a(Object obj) {
                    Exception exc = (Exception) obj;
                    ccto.b("processSitrep", exc);
                    throw exc;
                }
            }, enre.a)).u();
            cdaj.c("Sitrep successful", new Object[0]);
            String str3 = this.b;
            int i3 = rnx.a;
            String valueOf = String.valueOf(str3);
            if (str3 != null && !TextUtils.isEmpty(valueOf)) {
                rnx.f(valueOf.getBytes());
            }
            if (this.a > 0) {
                ccuc.b.d(Integer.valueOf(this.a));
            }
            if (this.b != null) {
                ccuc.c.d(this.b);
            }
            if (this.c != null) {
                ccuc.d.d(this.c);
            }
            if (this.d != null) {
                ccuc.e.d(this.d);
            }
            ccuk.b(this, new asit(this));
            ccuc.i.e();
            ccuc.j.e();
            ccuc.k.e();
        } catch (InterruptedException e5) {
            Thread.currentThread().interrupt();
            d(e5);
        } catch (ExecutionException e6) {
            d(e6);
        }
    }
}
