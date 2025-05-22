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
import defpackage.aswe;
import defpackage.asxd;
import defpackage.auwr;
import defpackage.elgo;
import defpackage.elpg;
import defpackage.fgou;
import defpackage.fgrc;
import defpackage.fgri;
import defpackage.fgru;
import defpackage.fgsa;
import defpackage.fgtj;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
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
    public final fgrc l = r.a.v();
    public String g = "";
    public boolean k = false;

    public n(Context context, VersionInfoParcel versionInfoParcel, com.google.android.gms.ads.nonagon.adapter.b bVar) {
        this.e = context;
        this.f = versionInfoParcel;
        this.i = bVar;
        if (((Boolean) com.google.android.gms.ads.internal.config.p.bp.g()).booleanValue()) {
            this.j = com.google.android.gms.ads.internal.util.m.b();
        } else {
            int i = elgo.d;
            this.j = elpg.a;
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
                                    bundle = auwr.b(context).e(context.getPackageName(), 128).metaData;
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
                            int i = aswe.c;
                            nVar.h = asxd.a(nVar.e);
                            int intValue = ((Integer) com.google.android.gms.ads.internal.config.p.bl.g()).intValue();
                            if (((Boolean) com.google.android.gms.ads.internal.config.p.bS.g()).booleanValue()) {
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
                        fgrc fgrcVar = nVar.l;
                        if (((r) fgrcVar.b).b.size() >= ((Integer) com.google.android.gms.ads.internal.config.p.bm.g()).intValue()) {
                            return;
                        }
                        fgrc v = p.a.v();
                        int i2 = eVar2.m;
                        if (!v.b.L()) {
                            v.U();
                        }
                        fgri fgriVar = v.b;
                        ((p) fgriVar).b = i2 - 2;
                        boolean z = eVar2.b;
                        if (!fgriVar.L()) {
                            v.U();
                        }
                        fgri fgriVar2 = v.b;
                        ((p) fgriVar2).c = z;
                        long j3 = eVar2.a;
                        if (!fgriVar2.L()) {
                            v.U();
                        }
                        fgri fgriVar3 = v.b;
                        ((p) fgriVar3).d = j3;
                        if (!fgriVar3.L()) {
                            v.U();
                        }
                        fgri fgriVar4 = v.b;
                        ((p) fgriVar4).f = 1;
                        String str = nVar.f.a;
                        if (!fgriVar4.L()) {
                            v.U();
                        }
                        fgri fgriVar5 = v.b;
                        str.getClass();
                        ((p) fgriVar5).g = str;
                        String str2 = nVar.g;
                        if (!fgriVar5.L()) {
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
                        fgri fgriVar6 = v.b;
                        ((p) fgriVar6).j = i3;
                        int i4 = eVar2.o;
                        if (!fgriVar6.L()) {
                            v.U();
                        }
                        fgri fgriVar7 = v.b;
                        p pVar3 = (p) fgriVar7;
                        if (i4 == 1) {
                            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
                        }
                        pVar3.l = i4 - 2;
                        int i5 = eVar2.c;
                        if (!fgriVar7.L()) {
                            v.U();
                        }
                        fgri fgriVar8 = v.b;
                        ((p) fgriVar8).m = i5;
                        long j4 = nVar.h;
                        if (!fgriVar8.L()) {
                            v.U();
                        }
                        fgri fgriVar9 = v.b;
                        ((p) fgriVar9).n = j4;
                        int i6 = eVar2.n;
                        if (!fgriVar9.L()) {
                            v.U();
                        }
                        fgri fgriVar10 = v.b;
                        p pVar4 = (p) fgriVar10;
                        if (i6 == 1) {
                            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
                        }
                        pVar4.o = i6 - 2;
                        String str4 = eVar2.d;
                        if (!fgriVar10.L()) {
                            v.U();
                        }
                        fgri fgriVar11 = v.b;
                        ((p) fgriVar11).p = str4;
                        String str5 = eVar2.e;
                        if (!fgriVar11.L()) {
                            v.U();
                        }
                        fgri fgriVar12 = v.b;
                        ((p) fgriVar12).q = str5;
                        String str6 = eVar2.f;
                        if (!fgriVar12.L()) {
                            v.U();
                        }
                        p pVar5 = (p) v.b;
                        str6.getClass();
                        pVar5.r = str6;
                        nVar.i.a(str6);
                        if (!v.b.L()) {
                            v.U();
                        }
                        fgri fgriVar13 = v.b;
                        ((p) fgriVar13).s = "";
                        String str7 = eVar2.g;
                        if (!fgriVar13.L()) {
                            v.U();
                        }
                        fgri fgriVar14 = v.b;
                        str7.getClass();
                        ((p) fgriVar14).t = str7;
                        o oVar = eVar2.h;
                        if (!fgriVar14.L()) {
                            v.U();
                        }
                        ((p) v.b).x = oVar.a();
                        String str8 = eVar2.k;
                        if (!v.b.L()) {
                            v.U();
                        }
                        fgri fgriVar15 = v.b;
                        str8.getClass();
                        ((p) fgriVar15).w = str8;
                        String str9 = eVar2.i;
                        if (!fgriVar15.L()) {
                            v.U();
                        }
                        fgri fgriVar16 = v.b;
                        str9.getClass();
                        ((p) fgriVar16).u = str9;
                        String str10 = eVar2.j;
                        if (!fgriVar16.L()) {
                            v.U();
                        }
                        fgri fgriVar17 = v.b;
                        str10.getClass();
                        ((p) fgriVar17).v = str10;
                        long j5 = eVar2.l;
                        if (!fgriVar17.L()) {
                            v.U();
                        }
                        ((p) v.b).e = j5;
                        if (((Boolean) com.google.android.gms.ads.internal.config.p.bp.g()).booleanValue()) {
                            List list = nVar.j;
                            if (!v.b.L()) {
                                v.U();
                            }
                            p pVar6 = (p) v.b;
                            fgru fgruVar = pVar6.k;
                            if (!fgruVar.c()) {
                                pVar6.k = fgri.D(fgruVar);
                            }
                            fgou.E(list, pVar6.k);
                        }
                        fgrc v2 = q.a.v();
                        if (!v2.b.L()) {
                            v2.U();
                        }
                        q qVar = (q) v2.b;
                        p pVar7 = (p) v.Q();
                        pVar7.getClass();
                        qVar.c = pVar7;
                        qVar.b |= 1;
                        if (!fgrcVar.b.L()) {
                            fgrcVar.U();
                        }
                        r rVar = (r) fgrcVar.b;
                        q qVar2 = (q) v2.Q();
                        qVar2.getClass();
                        fgsa fgsaVar = rVar.b;
                        if (!fgsaVar.c()) {
                            rVar.b = fgri.E(fgsaVar);
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
                        fgrc fgrcVar = this.l;
                        r = ((r) fgrcVar.Q()).r();
                        if (!fgrcVar.b.L()) {
                            fgrcVar.U();
                        }
                        ((r) fgrcVar.b).b = fgtj.a;
                    }
                    new t(this.e, this.f.a, Binder.getCallingUid()).a(new com.google.android.gms.ads.nonagon.load.service.r((String) com.google.android.gms.ads.internal.config.p.bk.g(), 60000, new HashMap(), r, "application/x-protobuf"));
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
