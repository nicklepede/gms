package com.google.android.gms.mdm.services;

import android.content.Intent;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import defpackage.apsb;
import defpackage.asxb;
import defpackage.asxc;
import defpackage.aumn;
import defpackage.aura;
import defpackage.aury;
import defpackage.cbot;
import defpackage.cfcf;
import defpackage.cfci;
import defpackage.cfcw;
import defpackage.cfde;
import defpackage.cfdn;
import defpackage.cfjf;
import defpackage.cfjj;
import defpackage.eqcq;
import defpackage.eqcy;
import defpackage.eqdv;
import defpackage.eqex;
import defpackage.fgqp;
import defpackage.fgrc;
import defpackage.fgri;
import defpackage.fhtn;
import defpackage.fhto;
import defpackage.fhtq;
import defpackage.fkxq;
import defpackage.fkyc;
import defpackage.fkyd;
import defpackage.fkye;
import defpackage.flpw;
import defpackage.flpx;
import defpackage.funx;
import defpackage.fwpk;
import defpackage.fwsz;
import defpackage.fwtb;
import defpackage.fwtc;
import defpackage.fwty;
import defpackage.fwue;
import defpackage.fxnl;
import defpackage.fxnm;
import defpackage.fxnz;
import defpackage.thb;
import defpackage.thh;
import j$.time.Instant;
import java.io.IOException;
import java.util.concurrent.ExecutionException;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class SitrepChimeraService extends cfdn {
    private int a;
    private String b;
    private Boolean c;
    private Boolean d;
    private fkyc e = fkyc.UNKNOWN;

    final void d(Throwable th) {
        if (th == null) {
            cfjj.a("Permanent error sending sitrep and do not retry.", new Object[0]);
            return;
        }
        while ((th instanceof ExecutionException) && th.getCause() != null) {
            th = th.getCause();
        }
        if ((th instanceof fwue) && ((fwue) th).a.t != fwty.UNAVAILABLE) {
            cfjj.a("Permanent error sending sitrep and do not retry.", new Object[0]);
            return;
        }
        cfcw.i.d(Integer.valueOf(this.e.o));
        thh thhVar = cfcw.k;
        thhVar.d(Integer.valueOf(((Integer) thhVar.c()).intValue() + 1));
        cfjj.d("Transient error sending sitrep, set up retry.", new Object[0]);
        cfde.c(this, Instant.now().plusMillis((long) ((Math.random() * 3600000.0d) + 1000.0d)).toEpochMilli());
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (aury.c(this) || intent == null) {
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
        fkyc a = SitrepHelperIntentOperation.a(intent, "retry_reason");
        long e = aura.e(this);
        String str = null;
        if (e == 0) {
            cfjj.a("Android ID == 0, not sending sitrep", new Object[0]);
            d(null);
            return;
        }
        TelephonyManager telephonyManager = (TelephonyManager) getSystemService("phone");
        try {
            str = apsb.b(this);
        } catch (asxb e2) {
            cfjj.b(e2, "Error getting device data version info.", new Object[0]);
        } catch (asxc e3) {
            cfjj.b(e3, "Error getting device data version info.", new Object[0]);
        } catch (IOException e4) {
            cfjj.b(e4, "Error getting device data version info.", new Object[0]);
        }
        int phoneType = telephonyManager.getPhoneType();
        cfci a2 = cfcf.a();
        int i = this.a;
        String str2 = this.b;
        Boolean bool = this.c;
        fkyc fkycVar = this.e;
        Boolean bool2 = this.d;
        cfjj.c("Sending sitrep with xrpc: [%s, %s]", fkycVar, a);
        fkyd fkydVar = fkyd.a;
        fgrc v = fkydVar.v();
        if (!v.b.L()) {
            v.U();
        }
        fgri fgriVar = v.b;
        fkyd fkydVar2 = (fkyd) fgriVar;
        fkydVar2.h = fkycVar.o;
        fkydVar2.b |= 64;
        if (!fgriVar.L()) {
            v.U();
        }
        fgri fgriVar2 = v.b;
        fkyd fkydVar3 = (fkyd) fgriVar2;
        fkydVar3.i = a.o;
        fkydVar3.b |= 128;
        if (!fgriVar2.L()) {
            v.U();
        }
        fkyd fkydVar4 = (fkyd) v.b;
        fkydVar4.b |= 1;
        fkydVar4.c = e;
        int i2 = Build.VERSION.SDK_INT;
        if (!v.b.L()) {
            v.U();
        }
        fgri fgriVar3 = v.b;
        fkyd fkydVar5 = (fkyd) fgriVar3;
        fkydVar5.b |= 4;
        fkydVar5.e = i2;
        if (!fgriVar3.L()) {
            v.U();
        }
        fgri fgriVar4 = v.b;
        fkyd fkydVar6 = (fkyd) fgriVar4;
        fkydVar6.b |= 256;
        fkydVar6.j = phoneType;
        if (i > 0) {
            if (!fgriVar4.L()) {
                v.U();
            }
            fkyd fkydVar7 = (fkyd) v.b;
            fkydVar7.b |= 2;
            fkydVar7.d = i;
        }
        if (!TextUtils.isEmpty(str2)) {
            if (!v.b.L()) {
                v.U();
            }
            fkyd fkydVar8 = (fkyd) v.b;
            str2.getClass();
            fkydVar8.b |= 16;
            fkydVar8.f = str2;
        }
        if (bool != null) {
            fgrc v2 = fkxq.a.v();
            boolean booleanValue = bool.booleanValue();
            if (!v2.b.L()) {
                v2.U();
            }
            fkxq fkxqVar = (fkxq) v2.b;
            fkxqVar.b |= 1;
            fkxqVar.c = booleanValue;
            boolean booleanValue2 = bool.booleanValue();
            if (!v2.b.L()) {
                v2.U();
            }
            fkxq fkxqVar2 = (fkxq) v2.b;
            fkxqVar2.b |= 2;
            fkxqVar2.d = booleanValue2;
            boolean booleanValue3 = bool.booleanValue();
            if (!v2.b.L()) {
                v2.U();
            }
            fkxq fkxqVar3 = (fkxq) v2.b;
            fkxqVar3.b |= 4;
            fkxqVar3.e = booleanValue3;
            if (!v.b.L()) {
                v.U();
            }
            fkyd fkydVar9 = (fkyd) v.b;
            fkxq fkxqVar4 = (fkxq) v2.Q();
            fkxqVar4.getClass();
            fkydVar9.g = fkxqVar4;
            fkydVar9.b |= 32;
        }
        if (str != null) {
            if (!v.b.L()) {
                v.U();
            }
            fkyd fkydVar10 = (fkyd) v.b;
            fkydVar10.b |= 512;
            fkydVar10.k = str;
        }
        if (bool2 != null) {
            boolean booleanValue4 = bool2.booleanValue();
            if (!v.b.L()) {
                v.U();
            }
            fkyd fkydVar11 = (fkyd) v.b;
            fkydVar11.b |= 1024;
            fkydVar11.l = booleanValue4;
        }
        if (funx.n()) {
            cfjj.c("sendSitrepData %s", Base64.encodeToString(((fkyd) v.Q()).r(), 2));
        }
        fgrc v3 = fhto.a.v();
        fhtn fhtnVar = fhtn.SITREP_REQUEST_ISSUED;
        if (!v3.b.L()) {
            v3.U();
        }
        fhto fhtoVar = (fhto) v3.b;
        fhtoVar.c = fhtnVar.eM;
        fhtoVar.b |= 2;
        fgrc v4 = fhtq.a.v();
        if (!v4.b.L()) {
            v4.U();
        }
        fhtq fhtqVar = (fhtq) v4.b;
        fhtqVar.e = 1;
        fhtqVar.b = 1 | fhtqVar.b;
        String l = Long.toString(e);
        if (!v4.b.L()) {
            v4.U();
        }
        fhtq fhtqVar2 = (fhtq) v4.b;
        l.getClass();
        fhtqVar2.c = 2;
        fhtqVar2.d = l;
        if (!v3.b.L()) {
            v3.U();
        }
        fhto fhtoVar2 = (fhto) v3.b;
        fhtq fhtqVar3 = (fhtq) v4.Q();
        fhtqVar3.getClass();
        fhtoVar2.g = fhtqVar3;
        fhtoVar2.b |= 32;
        cfjf.c(v3);
        flpw flpwVar = (flpw) a2.c.o(cbot.a, a2.b);
        fkyd fkydVar12 = (fkyd) v.Q();
        fwpk fwpkVar = flpwVar.a;
        fwtc fwtcVar = flpx.a;
        if (fwtcVar == null) {
            synchronized (flpx.class) {
                fwtcVar = flpx.a;
                if (fwtcVar == null) {
                    fwsz a3 = fwtc.a();
                    a3.c = fwtb.UNARY;
                    a3.d = fwtc.c("google.internal.fmd.FmdApiService", "ProcessSitrep");
                    a3.b();
                    fgqp fgqpVar = fxnm.a;
                    a3.a = new fxnl(fkydVar);
                    a3.b = new fxnl(fkye.a);
                    fwtc a4 = a3.a();
                    flpx.a = a4;
                    fwtcVar = a4;
                }
            }
        }
        try {
            ((eqcy) eqcq.g(fxnz.a(fwpkVar.a(fwtcVar, flpwVar.b), fkydVar12), Exception.class, new eqdv() { // from class: cfcg
                @Override // defpackage.eqdv
                public final eqgl a(Object obj) {
                    Exception exc = (Exception) obj;
                    cfci.b("processSitrep", exc);
                    throw exc;
                }
            }, eqex.a)).u();
            cfjj.c("Sitrep successful", new Object[0]);
            String str3 = this.b;
            int i3 = thb.a;
            String valueOf = String.valueOf(str3);
            if (str3 != null && !TextUtils.isEmpty(valueOf)) {
                thb.f(valueOf.getBytes());
            }
            if (this.a > 0) {
                cfcw.b.d(Integer.valueOf(this.a));
            }
            if (this.b != null) {
                cfcw.c.d(this.b);
            }
            if (this.c != null) {
                cfcw.d.d(this.c);
            }
            if (this.d != null) {
                cfcw.e.d(this.d);
            }
            cfde.b(this, new aumn(this));
            cfcw.i.e();
            cfcw.j.e();
            cfcw.k.e();
        } catch (InterruptedException e5) {
            Thread.currentThread().interrupt();
            d(e5);
        } catch (ExecutionException e6) {
            d(e6);
        }
    }
}
