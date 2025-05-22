package com.google.android.gms.ads.identifier.settings;

import android.app.KeyguardManager;
import android.content.Context;
import android.os.Build;
import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.VerifiedMotionEvent;
import defpackage.dbap;
import defpackage.eixb;
import defpackage.eizp;
import defpackage.eqme;
import defpackage.eqmh;
import defpackage.eqmi;
import defpackage.eqml;
import defpackage.eqmm;
import defpackage.eqmo;
import defpackage.eqpt;
import defpackage.fgpr;
import defpackage.fgpx;
import defpackage.fgpy;
import defpackage.fgqp;
import defpackage.fgrc;
import defpackage.fgri;
import defpackage.fgsd;
import defpackage.fgti;
import defpackage.fgtq;
import defpackage.fguf;
import defpackage.fmqe;
import defpackage.fmqm;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.UUID;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
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
    private final ad j;

    private ac(Context context) {
        fmqe fmqeVar = fmqe.a;
        this.j = new ad(fmqeVar.lK().h(), fmqeVar.lK().g());
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

    public static fgrc h(MotionEvent motionEvent) {
        fgrc v = eqmm.a.v();
        int deviceId = motionEvent.getDeviceId();
        if (!v.b.L()) {
            v.U();
        }
        eqmm eqmmVar = (eqmm) v.b;
        eqmmVar.b |= 1;
        eqmmVar.c = deviceId;
        int source = motionEvent.getSource();
        if (!v.b.L()) {
            v.U();
        }
        eqmm eqmmVar2 = (eqmm) v.b;
        eqmmVar2.b |= 4;
        eqmmVar2.e = source;
        long eventTime = motionEvent.getEventTime();
        if (!v.b.L()) {
            v.U();
        }
        eqmm eqmmVar3 = (eqmm) v.b;
        eqmmVar3.b |= 512;
        eqmmVar3.l = eventTime;
        int actionMasked = motionEvent.getActionMasked();
        if (!v.b.L()) {
            v.U();
        }
        eqmm eqmmVar4 = (eqmm) v.b;
        eqmmVar4.b |= 8;
        eqmmVar4.f = actionMasked;
        int buttonState = motionEvent.getButtonState();
        if (!v.b.L()) {
            v.U();
        }
        eqmm eqmmVar5 = (eqmm) v.b;
        eqmmVar5.b |= 16;
        eqmmVar5.g = buttonState;
        int flags = motionEvent.getFlags();
        if (!v.b.L()) {
            v.U();
        }
        eqmm eqmmVar6 = (eqmm) v.b;
        eqmmVar6.b |= 32;
        eqmmVar6.h = flags;
        int metaState = motionEvent.getMetaState();
        if (!v.b.L()) {
            v.U();
        }
        eqmm eqmmVar7 = (eqmm) v.b;
        eqmmVar7.b |= 64;
        eqmmVar7.i = metaState;
        float rawX = motionEvent.getRawX();
        if (!v.b.L()) {
            v.U();
        }
        eqmm eqmmVar8 = (eqmm) v.b;
        eqmmVar8.b |= 128;
        eqmmVar8.j = rawX;
        float rawY = motionEvent.getRawY();
        if (!v.b.L()) {
            v.U();
        }
        eqmm eqmmVar9 = (eqmm) v.b;
        eqmmVar9.b |= 256;
        eqmmVar9.k = rawY;
        if (motionEvent.getEventTime() != motionEvent.getDownTime()) {
            long downTime = motionEvent.getDownTime();
            if (!v.b.L()) {
                v.U();
            }
            eqmm eqmmVar10 = (eqmm) v.b;
            eqmmVar10.b |= 1024;
            eqmmVar10.m = downTime;
        }
        return v;
    }

    public static fgrc i(VerifiedMotionEvent verifiedMotionEvent) {
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
        fgrc v = eqmm.a.v();
        deviceId = verifiedMotionEvent.getDeviceId();
        if (!v.b.L()) {
            v.U();
        }
        eqmm eqmmVar = (eqmm) v.b;
        eqmmVar.b |= 1;
        eqmmVar.c = deviceId;
        displayId = verifiedMotionEvent.getDisplayId();
        if (!v.b.L()) {
            v.U();
        }
        eqmm eqmmVar2 = (eqmm) v.b;
        eqmmVar2.b |= 2;
        eqmmVar2.d = displayId;
        source = verifiedMotionEvent.getSource();
        if (!v.b.L()) {
            v.U();
        }
        eqmm eqmmVar3 = (eqmm) v.b;
        eqmmVar3.b |= 4;
        eqmmVar3.e = source;
        eventTimeNanos = verifiedMotionEvent.getEventTimeNanos();
        long j = eventTimeNanos / 1000000;
        if (!v.b.L()) {
            v.U();
        }
        eqmm eqmmVar4 = (eqmm) v.b;
        eqmmVar4.b |= 512;
        eqmmVar4.l = j;
        actionMasked = verifiedMotionEvent.getActionMasked();
        if (!v.b.L()) {
            v.U();
        }
        eqmm eqmmVar5 = (eqmm) v.b;
        eqmmVar5.b |= 8;
        eqmmVar5.f = actionMasked;
        buttonState = verifiedMotionEvent.getButtonState();
        if (!v.b.L()) {
            v.U();
        }
        eqmm eqmmVar6 = (eqmm) v.b;
        eqmmVar6.b |= 16;
        eqmmVar6.g = buttonState;
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
        eqmm eqmmVar7 = (eqmm) v.b;
        eqmmVar7.b = 32 | eqmmVar7.b;
        eqmmVar7.h = i;
        metaState = verifiedMotionEvent.getMetaState();
        if (!v.b.L()) {
            v.U();
        }
        eqmm eqmmVar8 = (eqmm) v.b;
        eqmmVar8.b |= 64;
        eqmmVar8.i = metaState;
        rawX = verifiedMotionEvent.getRawX();
        if (!v.b.L()) {
            v.U();
        }
        eqmm eqmmVar9 = (eqmm) v.b;
        eqmmVar9.b |= 128;
        eqmmVar9.j = rawX;
        rawY = verifiedMotionEvent.getRawY();
        if (!v.b.L()) {
            v.U();
        }
        eqmm eqmmVar10 = (eqmm) v.b;
        eqmmVar10.b |= 256;
        eqmmVar10.k = rawY;
        eventTimeNanos2 = verifiedMotionEvent.getEventTimeNanos();
        downTimeNanos = verifiedMotionEvent.getDownTimeNanos();
        if (eventTimeNanos2 != downTimeNanos) {
            downTimeNanos2 = verifiedMotionEvent.getDownTimeNanos();
            long j2 = downTimeNanos2 / 1000000;
            if (!v.b.L()) {
                v.U();
            }
            eqmm eqmmVar11 = (eqmm) v.b;
            eqmmVar11.b |= 1024;
            eqmmVar11.m = j2;
        }
        return v;
    }

    private final boolean j(UUID uuid, byte[] bArr) {
        try {
            return uuid.equals(dbap.b(bArr));
        } catch (IllegalArgumentException | NullPointerException | GeneralSecurityException e) {
            d.c(this.a, "adidMatchPublicKey", e);
            return false;
        }
    }

    private final void k(fgrc fgrcVar, byte[] bArr, int i) {
        try {
            UUID fromString = UUID.fromString(this.c.f(i));
            if (fromString == null || j(fromString, bArr)) {
                return;
            }
            fgpr w = fgpr.w(d.e(fromString));
            if (!fgrcVar.b.L()) {
                fgrcVar.U();
            }
            eqmi eqmiVar = (eqmi) fgrcVar.b;
            eqmi eqmiVar2 = eqmi.a;
            eqmiVar.b |= 2;
            eqmiVar.f = w;
        } catch (IllegalArgumentException | NullPointerException e) {
            d.c(this.a, "adidMatchPublicKey", e);
        }
    }

    public final String b(String str, int i) {
        if (fmqe.a.lK().H()) {
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
        if ((Build.VERSION.SDK_INT >= fmqe.c() && fmqe.a.lK().J() && this.c.o(i)) || !s.b(str) || !fmqe.j()) {
            return null;
        }
        v vVar = new v(str2, this.a);
        try {
            eixb e = eizp.e("com/google/android/gms/ads/identifier/settings/SecureTokensBuilder", "getAttestationToken", 760, "getAttestationToken");
            try {
                synchronized (this.i) {
                    b bVar = this.c;
                    if (bVar.p() || fmqe.h()) {
                        u uVar = this.d;
                        byte[] e2 = uVar.e();
                        if (!c(e2)) {
                            fgrc v = eqmi.a.v();
                            long currentTimeMillis = System.currentTimeMillis();
                            if (!v.b.L()) {
                                v.U();
                            }
                            fgri fgriVar = v.b;
                            eqmi eqmiVar = (eqmi) fgriVar;
                            eqmiVar.b |= 4;
                            eqmiVar.g = currentTimeMillis;
                            if (!fgriVar.L()) {
                                v.U();
                            }
                            eqmi eqmiVar2 = (eqmi) v.b;
                            str.getClass();
                            eqmiVar2.b |= 32;
                            eqmiVar2.i = str;
                            abVar.a(v);
                            eqml b2 = fmqm.e() ? this.e.b() : uVar.b();
                            if (b2 != null) {
                                if (!v.b.L()) {
                                    v.U();
                                }
                                eqmi eqmiVar3 = (eqmi) v.b;
                                eqmiVar3.h = b2;
                                eqmiVar3.b |= 8;
                            } else {
                                fgpr w = fgpr.w(e2);
                                if (!v.b.L()) {
                                    v.U();
                                }
                                eqmi eqmiVar4 = (eqmi) v.b;
                                eqmiVar4.b |= 1;
                                eqmiVar4.e = w;
                            }
                            if (fmqe.h()) {
                                if (!fmqe.a.lK().y() || !bVar.f(i).equals(b.a)) {
                                    k(v, e2, i);
                                }
                            }
                            byte[] r = ((eqmi) v.Q()).r();
                            eixb e3 = eizp.e("com/google/android/gms/ads/identifier/settings/SecureTokensBuilder", "getAttestationToken", 808, "signByAdIdKey");
                            try {
                                fgpr w2 = fgpr.w(uVar.f(r));
                                e3.close();
                                fgrc v2 = eqml.a.v();
                                fgpr w3 = fgpr.w(r);
                                if (!v2.b.L()) {
                                    v2.U();
                                }
                                fgri fgriVar2 = v2.b;
                                eqml eqmlVar = (eqml) fgriVar2;
                                eqmlVar.b |= 1;
                                eqmlVar.c = w3;
                                if (!fgriVar2.L()) {
                                    v2.U();
                                }
                                eqml eqmlVar2 = (eqml) v2.b;
                                eqmlVar2.b |= 2;
                                eqmlVar2.d = w2;
                                byte[] r2 = ((eqml) v2.Q()).r();
                                e3 = eizp.e("com/google/android/gms/ads/identifier/settings/SecureTokensBuilder", "encryptIfPublicKeyExists", 827, "encryptIfPublicKeyExists");
                                try {
                                    eqpt a = this.f.a(str);
                                    if (a != null) {
                                        eixb e4 = eizp.e("com/google/android/gms/ads/identifier/settings/SecureTokensBuilder", "encryptIfPublicKeyExists", 837, "encrypt");
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
        if (!fmqe.j() || !fmqe.a.lK().M()) {
            throw new t(2, "deletion token not enabled");
        }
        v vVar = new v("GlobalDelete", this.a);
        try {
            eixb e = eizp.e("com/google/android/gms/ads/identifier/settings/SecureTokensBuilder", "getGlobalDeletionAttestationToken", 361, "GlobalDelete");
            try {
                synchronized (this.i) {
                    if (!this.c.p() && !fmqe.h()) {
                        throw new t(2, "no crypto hash ad id and migration not enabled");
                    }
                    try {
                        byte[] e2 = this.d.e();
                        if (c(e2)) {
                            throw new t(1, "public key is empty");
                        }
                        eqml b2 = fmqm.e() ? this.e.b() : this.d.b();
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
                            fgpr fgprVar = b2.c;
                            fgqp a = fgqp.a();
                            eqmh eqmhVar = eqmh.a;
                            fgpx k = fgprVar.k();
                            fgri x = eqmhVar.x();
                            try {
                                fgtq b3 = fgti.a.b(x);
                                b3.l(x, fgpy.p(k), a);
                                b3.g(x);
                                try {
                                    k.z(0);
                                    fgri.M(x);
                                    eqmh eqmhVar2 = (eqmh) x;
                                    if (fmqm.a.lK().j() && (eqmhVar2.c & 3) == 0) {
                                        throw new t(3, "Not real device.");
                                    }
                                    fgrc v = eqmi.a.v();
                                    long currentTimeMillis = System.currentTimeMillis();
                                    if (!v.b.L()) {
                                        v.U();
                                    }
                                    eqmi eqmiVar = (eqmi) v.b;
                                    eqmiVar.b |= 4;
                                    eqmiVar.g = currentTimeMillis;
                                    fgrc v2 = eqmo.a.v();
                                    if (!v2.b.L()) {
                                        v2.U();
                                    }
                                    eqmo eqmoVar = (eqmo) v2.b;
                                    eqmoVar.c = 1;
                                    eqmoVar.b |= 1;
                                    eqmo eqmoVar2 = (eqmo) v2.Q();
                                    if (!v.b.L()) {
                                        v.U();
                                    }
                                    fgri fgriVar = v.b;
                                    eqmi eqmiVar2 = (eqmi) fgriVar;
                                    eqmoVar2.getClass();
                                    eqmiVar2.d = eqmoVar2;
                                    eqmiVar2.c = 12;
                                    if (!fgriVar.L()) {
                                        v.U();
                                    }
                                    eqmi eqmiVar3 = (eqmi) v.b;
                                    eqmiVar3.h = b2;
                                    eqmiVar3.b |= 8;
                                    if (fmqe.h()) {
                                        k(v, e2, i);
                                    }
                                    byte[] r2 = ((eqmi) v.Q()).r();
                                    try {
                                        byte[] f = this.d.f(r2);
                                        fgrc v3 = eqml.a.v();
                                        fgpr w = fgpr.w(r2);
                                        if (!v3.b.L()) {
                                            v3.U();
                                        }
                                        eqml eqmlVar = (eqml) v3.b;
                                        eqmlVar.b = 1 | eqmlVar.b;
                                        eqmlVar.c = w;
                                        fgpr w2 = fgpr.w(f);
                                        if (!v3.b.L()) {
                                            v3.U();
                                        }
                                        eqml eqmlVar2 = (eqml) v3.b;
                                        eqmlVar2.b = 2 | eqmlVar2.b;
                                        eqmlVar2.d = w2;
                                        r = ((eqml) v3.Q()).r();
                                        vVar.d = "succeeded";
                                    } catch (IOException | GeneralSecurityException e3) {
                                        throw new t(1, "Failed to sign", e3);
                                    }
                                } catch (fgsd e4) {
                                    throw e4;
                                }
                            } catch (fgsd e5) {
                                if (e5.a) {
                                    throw new fgsd(e5);
                                }
                                throw e5;
                            } catch (fguf e6) {
                                throw e6.a();
                            } catch (IOException e7) {
                                if (e7.getCause() instanceof fgsd) {
                                    throw ((fgsd) e7.getCause());
                                }
                                throw new fgsd(e7);
                            } catch (RuntimeException e8) {
                                if (e8.getCause() instanceof fgsd) {
                                    throw ((fgsd) e8.getCause());
                                }
                                throw e8;
                            }
                        } catch (fgsd e9) {
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

    public final fgrc f(String str, int i) {
        fgrc v;
        ad adVar = this.j;
        eqme eqmeVar = (eqme) adVar.a(str);
        if (eqmeVar != null) {
            v = eqme.a.w(eqmeVar);
        } else if (TextUtils.isEmpty(str)) {
            v = eqme.a.v();
        } else {
            fgrc g = g(str);
            adVar.b(str, (eqme) g.Q());
            v = g;
        }
        if (this.c.o(i)) {
            if (!v.b.L()) {
                v.U();
            }
            eqme eqmeVar2 = (eqme) v.b;
            eqme eqmeVar3 = eqme.a;
            eqmeVar2.b |= 1;
            eqmeVar2.c = true;
        } else {
            if (!v.b.L()) {
                v.U();
            }
            eqme eqmeVar4 = (eqme) v.b;
            eqme eqmeVar5 = eqme.a;
            eqmeVar4.b &= -2;
            eqmeVar4.c = false;
        }
        if (fmqe.a.lK().F()) {
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
                eqme eqmeVar6 = (eqme) v.b;
                eqmeVar6.b |= 16;
                eqmeVar6.h = i2;
            }
        }
        return v;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0150  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.fgrc g(java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 439
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.identifier.settings.ac.g(java.lang.String):fgrc");
    }
}
