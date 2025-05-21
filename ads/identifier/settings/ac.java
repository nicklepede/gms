package com.google.android.gms.ads.identifier.settings;

import android.app.KeyguardManager;
import android.content.Context;
import android.os.Build;
import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.VerifiedMotionEvent;
import defpackage.cyqr;
import defpackage.egjy;
import defpackage.egmm;
import defpackage.enyl;
import defpackage.enyo;
import defpackage.enyp;
import defpackage.enys;
import defpackage.enyt;
import defpackage.enyv;
import defpackage.eoca;
import defpackage.feay;
import defpackage.febe;
import defpackage.febf;
import defpackage.febw;
import defpackage.fecj;
import defpackage.fecp;
import defpackage.fedk;
import defpackage.feep;
import defpackage.feex;
import defpackage.fefm;
import defpackage.fjzz;
import defpackage.fkah;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.UUID;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class ac {
    private static ac b;
    public final Context a;
    private final b c;
    private final u d;
    private final o e;
    private final s f;
    private final PowerManager g;
    private final KeyguardManager h;
    private final Object i = new Object();
    private final ad j = new ad(fjzz.a.a().h(), fjzz.a.a().g());

    private ac(Context context) {
        Context applicationContext = context.getApplicationContext();
        context = applicationContext != null ? applicationContext : context;
        this.a = context;
        this.c = b.c(context);
        this.d = u.a(context);
        this.e = o.a(context);
        this.f = new s(context);
        this.g = (PowerManager) context.getSystemService("power");
        this.h = (KeyguardManager) context.getSystemService("keyguard");
    }

    public static synchronized ac a(Context context) {
        ac acVar;
        synchronized (ac.class) {
            if (b == null) {
                b = new ac(context);
            }
            acVar = b;
        }
        return acVar;
    }

    public static boolean c(byte[] bArr) {
        return bArr == null || bArr.length == 0;
    }

    public static fecj h(MotionEvent motionEvent) {
        fecj v = enyt.a.v();
        int deviceId = motionEvent.getDeviceId();
        if (!v.b.L()) {
            v.U();
        }
        enyt enytVar = (enyt) v.b;
        enytVar.b |= 1;
        enytVar.c = deviceId;
        int source = motionEvent.getSource();
        if (!v.b.L()) {
            v.U();
        }
        enyt enytVar2 = (enyt) v.b;
        enytVar2.b |= 4;
        enytVar2.e = source;
        long eventTime = motionEvent.getEventTime();
        if (!v.b.L()) {
            v.U();
        }
        enyt enytVar3 = (enyt) v.b;
        enytVar3.b |= 512;
        enytVar3.l = eventTime;
        int actionMasked = motionEvent.getActionMasked();
        if (!v.b.L()) {
            v.U();
        }
        enyt enytVar4 = (enyt) v.b;
        enytVar4.b |= 8;
        enytVar4.f = actionMasked;
        int buttonState = motionEvent.getButtonState();
        if (!v.b.L()) {
            v.U();
        }
        enyt enytVar5 = (enyt) v.b;
        enytVar5.b |= 16;
        enytVar5.g = buttonState;
        int flags = motionEvent.getFlags();
        if (!v.b.L()) {
            v.U();
        }
        enyt enytVar6 = (enyt) v.b;
        enytVar6.b |= 32;
        enytVar6.h = flags;
        int metaState = motionEvent.getMetaState();
        if (!v.b.L()) {
            v.U();
        }
        enyt enytVar7 = (enyt) v.b;
        enytVar7.b |= 64;
        enytVar7.i = metaState;
        float rawX = motionEvent.getRawX();
        if (!v.b.L()) {
            v.U();
        }
        enyt enytVar8 = (enyt) v.b;
        enytVar8.b |= 128;
        enytVar8.j = rawX;
        float rawY = motionEvent.getRawY();
        if (!v.b.L()) {
            v.U();
        }
        enyt enytVar9 = (enyt) v.b;
        enytVar9.b |= 256;
        enytVar9.k = rawY;
        if (motionEvent.getEventTime() != motionEvent.getDownTime()) {
            long downTime = motionEvent.getDownTime();
            if (!v.b.L()) {
                v.U();
            }
            enyt enytVar10 = (enyt) v.b;
            enytVar10.b |= 1024;
            enytVar10.m = downTime;
        }
        return v;
    }

    public static fecj i(VerifiedMotionEvent verifiedMotionEvent) {
        int deviceId;
        int displayId;
        int source;
        long eventTimeNanos;
        int actionMasked;
        int buttonState;
        int metaState;
        float rawX;
        float rawY;
        long eventTimeNanos2;
        long downTimeNanos;
        long downTimeNanos2;
        Boolean flag;
        fecj v = enyt.a.v();
        deviceId = verifiedMotionEvent.getDeviceId();
        if (!v.b.L()) {
            v.U();
        }
        enyt enytVar = (enyt) v.b;
        enytVar.b |= 1;
        enytVar.c = deviceId;
        displayId = verifiedMotionEvent.getDisplayId();
        if (!v.b.L()) {
            v.U();
        }
        enyt enytVar2 = (enyt) v.b;
        enytVar2.b |= 2;
        enytVar2.d = displayId;
        source = verifiedMotionEvent.getSource();
        if (!v.b.L()) {
            v.U();
        }
        enyt enytVar3 = (enyt) v.b;
        enytVar3.b |= 4;
        enytVar3.e = source;
        eventTimeNanos = verifiedMotionEvent.getEventTimeNanos();
        long j = eventTimeNanos / 1000000;
        if (!v.b.L()) {
            v.U();
        }
        enyt enytVar4 = (enyt) v.b;
        enytVar4.b |= 512;
        enytVar4.l = j;
        actionMasked = verifiedMotionEvent.getActionMasked();
        if (!v.b.L()) {
            v.U();
        }
        enyt enytVar5 = (enyt) v.b;
        enytVar5.b |= 8;
        enytVar5.f = actionMasked;
        buttonState = verifiedMotionEvent.getButtonState();
        if (!v.b.L()) {
            v.U();
        }
        enyt enytVar6 = (enyt) v.b;
        enytVar6.b |= 16;
        enytVar6.g = buttonState;
        int i = 0;
        for (int i2 = 0; i2 < 32; i2++) {
            int i3 = 1 << i2;
            flag = verifiedMotionEvent.getFlag(i3);
            if (flag != null) {
                i |= i3;
            }
        }
        if (!v.b.L()) {
            v.U();
        }
        enyt enytVar7 = (enyt) v.b;
        enytVar7.b = 32 | enytVar7.b;
        enytVar7.h = i;
        metaState = verifiedMotionEvent.getMetaState();
        if (!v.b.L()) {
            v.U();
        }
        enyt enytVar8 = (enyt) v.b;
        enytVar8.b |= 64;
        enytVar8.i = metaState;
        rawX = verifiedMotionEvent.getRawX();
        if (!v.b.L()) {
            v.U();
        }
        enyt enytVar9 = (enyt) v.b;
        enytVar9.b |= 128;
        enytVar9.j = rawX;
        rawY = verifiedMotionEvent.getRawY();
        if (!v.b.L()) {
            v.U();
        }
        enyt enytVar10 = (enyt) v.b;
        enytVar10.b |= 256;
        enytVar10.k = rawY;
        eventTimeNanos2 = verifiedMotionEvent.getEventTimeNanos();
        downTimeNanos = verifiedMotionEvent.getDownTimeNanos();
        if (eventTimeNanos2 != downTimeNanos) {
            downTimeNanos2 = verifiedMotionEvent.getDownTimeNanos();
            long j2 = downTimeNanos2 / 1000000;
            if (!v.b.L()) {
                v.U();
            }
            enyt enytVar11 = (enyt) v.b;
            enytVar11.b |= 1024;
            enytVar11.m = j2;
        }
        return v;
    }

    private final boolean j(UUID uuid, byte[] bArr) {
        try {
            return uuid.equals(cyqr.b(bArr));
        } catch (IllegalArgumentException | NullPointerException | GeneralSecurityException e) {
            d.c(this.a, "adidMatchPublicKey", e);
            return false;
        }
    }

    private final void k(fecj fecjVar, byte[] bArr, int i) {
        try {
            UUID fromString = UUID.fromString(this.c.f(i));
            if (fromString == null || j(fromString, bArr)) {
                return;
            }
            feay w = feay.w(d.e(fromString));
            if (!fecjVar.b.L()) {
                fecjVar.U();
            }
            enyp enypVar = (enyp) fecjVar.b;
            enyp enypVar2 = enyp.a;
            enypVar.b |= 2;
            enypVar.f = w;
        } catch (IllegalArgumentException | NullPointerException e) {
            d.c(this.a, "adidMatchPublicKey", e);
        }
    }

    public final String b(String str, int i) {
        if (fjzz.a.a().H()) {
            String[] packagesForUid = this.a.getPackageManager().getPackagesForUid(i);
            if (packagesForUid == null) {
                throw new t(1, "the packagename list fetched from uid is empty");
            }
            if (!Arrays.asList(packagesForUid).contains(str)) {
                throw new t(1, "forwarded packagename is not found in the packagename list fetched from uid");
            }
        } else if (i != Process.myUid()) {
            return this.a.getPackageManager().getNameForUid(i);
        }
        return str;
    }

    public final byte[] d(String str, String str2, ab abVar, int i) {
        byte[] bArr = null;
        if ((Build.VERSION.SDK_INT >= fjzz.c() && fjzz.a.a().J() && this.c.o(i)) || !s.b(str) || !fjzz.j()) {
            return null;
        }
        v vVar = new v(str2, this.a);
        try {
            egjy e = egmm.e("com/google/android/gms/ads/identifier/settings/SecureTokensBuilder", "getAttestationToken", 760, "getAttestationToken");
            try {
                synchronized (this.i) {
                    b bVar = this.c;
                    if (bVar.p() || fjzz.h()) {
                        u uVar = this.d;
                        byte[] e2 = uVar.e();
                        if (!c(e2)) {
                            fecj v = enyp.a.v();
                            long currentTimeMillis = System.currentTimeMillis();
                            if (!v.b.L()) {
                                v.U();
                            }
                            fecp fecpVar = v.b;
                            enyp enypVar = (enyp) fecpVar;
                            enypVar.b |= 4;
                            enypVar.g = currentTimeMillis;
                            if (!fecpVar.L()) {
                                v.U();
                            }
                            enyp enypVar2 = (enyp) v.b;
                            str.getClass();
                            enypVar2.b |= 32;
                            enypVar2.i = str;
                            abVar.a(v);
                            enys b2 = fkah.e() ? this.e.b() : uVar.b();
                            if (b2 != null) {
                                if (!v.b.L()) {
                                    v.U();
                                }
                                enyp enypVar3 = (enyp) v.b;
                                enypVar3.h = b2;
                                enypVar3.b |= 8;
                            } else {
                                feay w = feay.w(e2);
                                if (!v.b.L()) {
                                    v.U();
                                }
                                enyp enypVar4 = (enyp) v.b;
                                enypVar4.b |= 1;
                                enypVar4.e = w;
                            }
                            if (fjzz.h()) {
                                if (!fjzz.a.a().y() || !bVar.f(i).equals(b.a)) {
                                    k(v, e2, i);
                                }
                            }
                            byte[] r = ((enyp) v.Q()).r();
                            egjy e3 = egmm.e("com/google/android/gms/ads/identifier/settings/SecureTokensBuilder", "getAttestationToken", 808, "signByAdIdKey");
                            try {
                                feay w2 = feay.w(uVar.f(r));
                                e3.close();
                                fecj v2 = enys.a.v();
                                feay w3 = feay.w(r);
                                if (!v2.b.L()) {
                                    v2.U();
                                }
                                fecp fecpVar2 = v2.b;
                                enys enysVar = (enys) fecpVar2;
                                enysVar.b |= 1;
                                enysVar.c = w3;
                                if (!fecpVar2.L()) {
                                    v2.U();
                                }
                                enys enysVar2 = (enys) v2.b;
                                enysVar2.b |= 2;
                                enysVar2.d = w2;
                                byte[] r2 = ((enys) v2.Q()).r();
                                e3 = egmm.e("com/google/android/gms/ads/identifier/settings/SecureTokensBuilder", "encryptIfPublicKeyExists", 827, "encryptIfPublicKeyExists");
                                try {
                                    eoca a = this.f.a(str);
                                    if (a != null) {
                                        egjy e4 = egmm.e("com/google/android/gms/ads/identifier/settings/SecureTokensBuilder", "encryptIfPublicKeyExists", 837, "encrypt");
                                        try {
                                            byte[] a2 = a.a(r2, null);
                                            e4.close();
                                            e3.close();
                                            bArr = a2;
                                        } finally {
                                        }
                                    } else {
                                        if (!"doubleclick.net".equals(str)) {
                                            throw new IOException("Can not find key");
                                        }
                                        e3.close();
                                        bArr = r2;
                                    }
                                    vVar.d = "succeeded";
                                } finally {
                                }
                            } finally {
                            }
                        }
                    }
                }
                e.close();
                vVar.close();
                return bArr;
            } finally {
            }
        } finally {
        }
    }

    public final byte[] e(int i) {
        byte[] r;
        if (!fjzz.j() || !fjzz.a.a().M()) {
            throw new t(2, "deletion token not enabled");
        }
        v vVar = new v("GlobalDelete", this.a);
        try {
            egjy e = egmm.e("com/google/android/gms/ads/identifier/settings/SecureTokensBuilder", "getGlobalDeletionAttestationToken", 361, "GlobalDelete");
            try {
                synchronized (this.i) {
                    if (!this.c.p() && !fjzz.h()) {
                        throw new t(2, "no crypto hash ad id and migration not enabled");
                    }
                    try {
                        byte[] e2 = this.d.e();
                        if (c(e2)) {
                            throw new t(1, "public key is empty");
                        }
                        enys b2 = fkah.e() ? this.e.b() : this.d.b();
                        if (b2 == null) {
                            throw new t(3, "device integrity token is null.");
                        }
                        int i2 = b2.b;
                        if ((i2 & 1) == 0) {
                            throw new t(3, "device integrity token does not have content.");
                        }
                        if ((i2 & 2) == 0) {
                            throw new t(3, "device integrity token does not have signature.");
                        }
                        if (b2.d.d() != 64) {
                            throw new t(3, "device integrity token signature size is not matching.");
                        }
                        try {
                            feay feayVar = b2.c;
                            febw a = febw.a();
                            enyo enyoVar = enyo.a;
                            febe k = feayVar.k();
                            fecp x = enyoVar.x();
                            try {
                                feex b3 = feep.a.b(x);
                                b3.l(x, febf.p(k), a);
                                b3.g(x);
                                try {
                                    k.z(0);
                                    fecp.M(x);
                                    enyo enyoVar2 = (enyo) x;
                                    if (fkah.a.a().j() && (enyoVar2.c & 3) == 0) {
                                        throw new t(3, "Not real device.");
                                    }
                                    fecj v = enyp.a.v();
                                    long currentTimeMillis = System.currentTimeMillis();
                                    if (!v.b.L()) {
                                        v.U();
                                    }
                                    enyp enypVar = (enyp) v.b;
                                    enypVar.b |= 4;
                                    enypVar.g = currentTimeMillis;
                                    fecj v2 = enyv.a.v();
                                    if (!v2.b.L()) {
                                        v2.U();
                                    }
                                    enyv enyvVar = (enyv) v2.b;
                                    enyvVar.c = 1;
                                    enyvVar.b |= 1;
                                    enyv enyvVar2 = (enyv) v2.Q();
                                    if (!v.b.L()) {
                                        v.U();
                                    }
                                    fecp fecpVar = v.b;
                                    enyp enypVar2 = (enyp) fecpVar;
                                    enyvVar2.getClass();
                                    enypVar2.d = enyvVar2;
                                    enypVar2.c = 12;
                                    if (!fecpVar.L()) {
                                        v.U();
                                    }
                                    enyp enypVar3 = (enyp) v.b;
                                    enypVar3.h = b2;
                                    enypVar3.b |= 8;
                                    if (fjzz.h()) {
                                        k(v, e2, i);
                                    }
                                    byte[] r2 = ((enyp) v.Q()).r();
                                    try {
                                        byte[] f = this.d.f(r2);
                                        fecj v3 = enys.a.v();
                                        feay w = feay.w(r2);
                                        if (!v3.b.L()) {
                                            v3.U();
                                        }
                                        enys enysVar = (enys) v3.b;
                                        enysVar.b = 1 | enysVar.b;
                                        enysVar.c = w;
                                        feay w2 = feay.w(f);
                                        if (!v3.b.L()) {
                                            v3.U();
                                        }
                                        enys enysVar2 = (enys) v3.b;
                                        enysVar2.b = 2 | enysVar2.b;
                                        enysVar2.d = w2;
                                        r = ((enys) v3.Q()).r();
                                        vVar.d = "succeeded";
                                    } catch (IOException | GeneralSecurityException e3) {
                                        throw new t(1, "Failed to sign", e3);
                                    }
                                } catch (fedk e4) {
                                    throw e4;
                                }
                            } catch (fedk e5) {
                                if (e5.a) {
                                    throw new fedk(e5);
                                }
                                throw e5;
                            } catch (fefm e6) {
                                throw e6.a();
                            } catch (IOException e7) {
                                if (e7.getCause() instanceof fedk) {
                                    throw ((fedk) e7.getCause());
                                }
                                throw new fedk(e7);
                            } catch (RuntimeException e8) {
                                if (e8.getCause() instanceof fedk) {
                                    throw ((fedk) e8.getCause());
                                }
                                throw e8;
                            }
                        } catch (fedk e9) {
                            throw new t(3, "Protobuf error", e9);
                        }
                    } catch (IOException e10) {
                        e = e10;
                        throw new t(1, "failed to get key", e);
                    } catch (GeneralSecurityException e11) {
                        e = e11;
                        throw new t(1, "failed to get key", e);
                    }
                }
                e.close();
                vVar.close();
                return r;
            } finally {
            }
        } catch (Throwable th) {
            try {
                vVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final fecj f(String str, int i) {
        fecj v;
        ad adVar = this.j;
        enyl enylVar = (enyl) adVar.a(str);
        if (enylVar != null) {
            v = enyl.a.w(enylVar);
        } else if (TextUtils.isEmpty(str)) {
            v = enyl.a.v();
        } else {
            fecj g = g(str);
            adVar.b(str, (enyl) g.Q());
            v = g;
        }
        if (this.c.o(i)) {
            if (!v.b.L()) {
                v.U();
            }
            enyl enylVar2 = (enyl) v.b;
            enyl enylVar3 = enyl.a;
            enylVar2.b |= 1;
            enylVar2.c = true;
        } else {
            if (!v.b.L()) {
                v.U();
            }
            enyl enylVar4 = (enyl) v.b;
            enyl enylVar5 = enyl.a;
            enylVar4.b &= -2;
            enylVar4.c = false;
        }
        if (fjzz.a.a().F()) {
            int i2 = this.a.getResources().getConfiguration().orientation == 2 ? 4 : 0;
            if (this.h.isDeviceLocked()) {
                i2 |= 1;
            }
            if (this.g.isInteractive()) {
                i2 |= 2;
            }
            if (i2 != 0) {
                if (!v.b.L()) {
                    v.U();
                }
                enyl enylVar6 = (enyl) v.b;
                enylVar6.b |= 16;
                enylVar6.h = i2;
            }
        }
        return v;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0152  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.fecj g(java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 441
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.identifier.settings.ac.g(java.lang.String):fecj");
    }
}
