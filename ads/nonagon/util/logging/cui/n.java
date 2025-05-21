package com.google.android.gms.ads.nonagon.util.logging.cui;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.nonagon.load.service.t;
import defpackage.aqtp;
import defpackage.aquo;
import defpackage.assx;
import defpackage.eitj;
import defpackage.ejcb;
import defpackage.feab;
import defpackage.fecj;
import defpackage.fecp;
import defpackage.fedb;
import defpackage.fedh;
import defpackage.feeq;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class n implements Runnable {
    public static final Object a = new Object();
    public static final Object b = new Object();
    public static final Object c = new Object();
    public static Boolean d;
    public final Context e;
    public final VersionInfoParcel f;
    public int h;
    public final com.google.android.gms.ads.nonagon.adapter.b i;
    public final List j;
    public final fecj l = r.a.v();
    public String g = "";
    public boolean k = false;

    public n(Context context, VersionInfoParcel versionInfoParcel, com.google.android.gms.ads.nonagon.adapter.b bVar) {
        this.e = context;
        this.f = versionInfoParcel;
        this.i = bVar;
        if (((Boolean) com.google.android.gms.ads.internal.config.p.bo.g()).booleanValue()) {
            this.j = com.google.android.gms.ads.internal.util.m.b();
        } else {
            int i = eitj.d;
            this.j = ejcb.a;
        }
    }

    public static boolean a() {
        boolean booleanValue;
        synchronized (a) {
            if (d == null) {
                if (((Boolean) com.google.android.gms.ads.internal.flag.h.b.d()).booleanValue()) {
                    d = Boolean.valueOf(Math.random() < ((Double) com.google.android.gms.ads.internal.flag.h.a.d()).doubleValue());
                } else {
                    d = false;
                }
            }
            booleanValue = d.booleanValue();
        }
        return booleanValue;
    }

    public final void b(final e eVar) {
        com.google.android.gms.ads.internal.util.future.e.a.submit(new Runnable() { // from class: com.google.android.gms.ads.nonagon.util.logging.cui.m
            @Override // java.lang.Runnable
            public final void run() {
                Bundle bundle;
                String string;
                e eVar2;
                Object obj = n.c;
                n nVar = n.this;
                synchronized (obj) {
                    if (!nVar.k) {
                        nVar.k = true;
                        if (n.a()) {
                            try {
                                com.google.android.gms.ads.internal.c.e();
                                Context context = nVar.e;
                                if (context.getApplicationContext() != null) {
                                    context = context.getApplicationContext();
                                }
                                try {
                                    bundle = assx.b(context).e(context.getPackageName(), 128).metaData;
                                } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
                                    bundle = null;
                                }
                                if (bundle == null) {
                                    string = "";
                                } else {
                                    string = bundle.getString("com.google.android.gms.ads.APPLICATION_ID");
                                    if (TextUtils.isEmpty(string)) {
                                        string = "";
                                    } else if (!string.matches("^ca-app-pub-[0-9]{16}~[0-9]{10}$") && !string.matches("^/\\d+~.+$")) {
                                        string = "";
                                    }
                                }
                                nVar.g = string;
                            } catch (RemoteException | RuntimeException e) {
                                com.google.android.gms.ads.internal.c.d().d(e, "CuiMonitor.gettingAppIdFromManifest");
                            }
                            int i = aqtp.c;
                            nVar.h = aquo.a(nVar.e);
                            int intValue = ((Integer) com.google.android.gms.ads.internal.config.p.bk.g()).intValue();
                            if (((Boolean) com.google.android.gms.ads.internal.config.p.bR.g()).booleanValue()) {
                                long j = intValue;
                                com.google.android.gms.ads.internal.util.future.e.b.scheduleWithFixedDelay(nVar, j, j, TimeUnit.MILLISECONDS);
                            } else {
                                long j2 = intValue;
                                com.google.android.gms.ads.internal.util.future.e.b.scheduleAtFixedRate(nVar, j2, j2, TimeUnit.MILLISECONDS);
                            }
                        }
                    }
                }
                if (n.a() && (eVar2 = eVar) != null) {
                    synchronized (n.b) {
                        fecj fecjVar = nVar.l;
                        if (((r) fecjVar.b).b.size() >= ((Integer) com.google.android.gms.ads.internal.config.p.bl.g()).intValue()) {
                            return;
                        }
                        fecj v = p.a.v();
                        int i2 = eVar2.m;
                        if (!v.b.L()) {
                            v.U();
                        }
                        fecp fecpVar = v.b;
                        ((p) fecpVar).b = i2 - 2;
                        boolean z = eVar2.b;
                        if (!fecpVar.L()) {
                            v.U();
                        }
                        fecp fecpVar2 = v.b;
                        ((p) fecpVar2).c = z;
                        long j3 = eVar2.a;
                        if (!fecpVar2.L()) {
                            v.U();
                        }
                        fecp fecpVar3 = v.b;
                        ((p) fecpVar3).d = j3;
                        if (!fecpVar3.L()) {
                            v.U();
                        }
                        fecp fecpVar4 = v.b;
                        ((p) fecpVar4).f = 1;
                        String str = nVar.f.a;
                        if (!fecpVar4.L()) {
                            v.U();
                        }
                        fecp fecpVar5 = v.b;
                        str.getClass();
                        ((p) fecpVar5).g = str;
                        String str2 = nVar.g;
                        if (!fecpVar5.L()) {
                            v.U();
                        }
                        p pVar = (p) v.b;
                        str2.getClass();
                        pVar.h = str2;
                        String str3 = Build.VERSION.RELEASE;
                        if (!v.b.L()) {
                            v.U();
                        }
                        p pVar2 = (p) v.b;
                        str3.getClass();
                        pVar2.i = str3;
                        int i3 = Build.VERSION.SDK_INT;
                        if (!v.b.L()) {
                            v.U();
                        }
                        fecp fecpVar6 = v.b;
                        ((p) fecpVar6).j = i3;
                        int i4 = eVar2.o;
                        if (!fecpVar6.L()) {
                            v.U();
                        }
                        fecp fecpVar7 = v.b;
                        p pVar3 = (p) fecpVar7;
                        if (i4 == 1) {
                            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
                        }
                        pVar3.l = i4 - 2;
                        int i5 = eVar2.c;
                        if (!fecpVar7.L()) {
                            v.U();
                        }
                        fecp fecpVar8 = v.b;
                        ((p) fecpVar8).m = i5;
                        long j4 = nVar.h;
                        if (!fecpVar8.L()) {
                            v.U();
                        }
                        fecp fecpVar9 = v.b;
                        ((p) fecpVar9).n = j4;
                        int i6 = eVar2.n;
                        if (!fecpVar9.L()) {
                            v.U();
                        }
                        fecp fecpVar10 = v.b;
                        p pVar4 = (p) fecpVar10;
                        if (i6 == 1) {
                            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
                        }
                        pVar4.o = i6 - 2;
                        String str4 = eVar2.d;
                        if (!fecpVar10.L()) {
                            v.U();
                        }
                        fecp fecpVar11 = v.b;
                        ((p) fecpVar11).p = str4;
                        String str5 = eVar2.e;
                        if (!fecpVar11.L()) {
                            v.U();
                        }
                        fecp fecpVar12 = v.b;
                        ((p) fecpVar12).q = str5;
                        String str6 = eVar2.f;
                        if (!fecpVar12.L()) {
                            v.U();
                        }
                        p pVar5 = (p) v.b;
                        str6.getClass();
                        pVar5.r = str6;
                        nVar.i.a(str6);
                        if (!v.b.L()) {
                            v.U();
                        }
                        fecp fecpVar13 = v.b;
                        ((p) fecpVar13).s = "";
                        String str7 = eVar2.g;
                        if (!fecpVar13.L()) {
                            v.U();
                        }
                        fecp fecpVar14 = v.b;
                        str7.getClass();
                        ((p) fecpVar14).t = str7;
                        o oVar = eVar2.h;
                        if (!fecpVar14.L()) {
                            v.U();
                        }
                        ((p) v.b).x = oVar.a();
                        String str8 = eVar2.k;
                        if (!v.b.L()) {
                            v.U();
                        }
                        fecp fecpVar15 = v.b;
                        str8.getClass();
                        ((p) fecpVar15).w = str8;
                        String str9 = eVar2.i;
                        if (!fecpVar15.L()) {
                            v.U();
                        }
                        fecp fecpVar16 = v.b;
                        str9.getClass();
                        ((p) fecpVar16).u = str9;
                        String str10 = eVar2.j;
                        if (!fecpVar16.L()) {
                            v.U();
                        }
                        fecp fecpVar17 = v.b;
                        str10.getClass();
                        ((p) fecpVar17).v = str10;
                        long j5 = eVar2.l;
                        if (!fecpVar17.L()) {
                            v.U();
                        }
                        ((p) v.b).e = j5;
                        if (((Boolean) com.google.android.gms.ads.internal.config.p.bo.g()).booleanValue()) {
                            List list = nVar.j;
                            if (!v.b.L()) {
                                v.U();
                            }
                            p pVar6 = (p) v.b;
                            fedb fedbVar = pVar6.k;
                            if (!fedbVar.c()) {
                                pVar6.k = fecp.D(fedbVar);
                            }
                            feab.E(list, pVar6.k);
                        }
                        fecj v2 = q.a.v();
                        if (!v2.b.L()) {
                            v2.U();
                        }
                        q qVar = (q) v2.b;
                        p pVar7 = (p) v.Q();
                        pVar7.getClass();
                        qVar.c = pVar7;
                        qVar.b |= 1;
                        if (!fecjVar.b.L()) {
                            fecjVar.U();
                        }
                        r rVar = (r) fecjVar.b;
                        q qVar2 = (q) v2.Q();
                        qVar2.getClass();
                        fedh fedhVar = rVar.b;
                        if (!fedhVar.c()) {
                            rVar.b = fecp.E(fedhVar);
                        }
                        rVar.b.add(qVar2);
                    }
                }
            }
        });
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte[] r;
        if (a()) {
            Object obj = b;
            synchronized (obj) {
                if (((r) this.l.b).b.size() == 0) {
                    return;
                }
                try {
                    synchronized (obj) {
                        fecj fecjVar = this.l;
                        r = ((r) fecjVar.Q()).r();
                        if (!fecjVar.b.L()) {
                            fecjVar.U();
                        }
                        ((r) fecjVar.b).b = feeq.a;
                    }
                    new t(this.e, this.f.a, Binder.getCallingUid()).a(new com.google.android.gms.ads.nonagon.load.service.r((String) com.google.android.gms.ads.internal.config.p.bj.g(), 60000, new HashMap(), r, "application/x-protobuf"));
                } catch (Exception e) {
                    if ((e instanceof com.google.android.gms.ads.nonagon.load.a) && ((com.google.android.gms.ads.nonagon.load.a) e).a == 3) {
                        return;
                    }
                    com.google.android.gms.ads.internal.c.d().c(e, "CuiMonitor.sendCuiPing");
                }
            }
        }
    }
}
