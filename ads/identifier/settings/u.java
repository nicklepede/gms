package com.google.android.gms.ads.identifier.settings;

import android.content.Context;
import android.content.SharedPreferences;
import defpackage.dbap;
import defpackage.eqmh;
import defpackage.eqml;
import defpackage.eqqn;
import defpackage.erbn;
import defpackage.erop;
import defpackage.fgpr;
import defpackage.fgpx;
import defpackage.fgpy;
import defpackage.fgqp;
import defpackage.fgri;
import defpackage.fgsd;
import defpackage.fgti;
import defpackage.fgtq;
import defpackage.fguf;
import defpackage.fmqm;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class u {
    private static u b;
    private final Context c;
    private erbn d = null;
    eqqn a = null;
    private byte[] e = null;

    private u(Context context) {
        this.c = context;
    }

    public static synchronized u a(Context context) {
        u uVar;
        synchronized (u.class) {
            if (b == null) {
                b = new u(context);
            }
            uVar = b;
        }
        return uVar;
    }

    private final SharedPreferences g() {
        return this.c.getSharedPreferences("event_attestation_settings", 0);
    }

    private final synchronized erbn h() {
        erbn erbnVar = this.d;
        if (erbnVar != null) {
            return erbnVar;
        }
        this.a = null;
        this.e = null;
        try {
            Context context = this.c;
            erbn a = dbap.a(context, "event_attestation_settings", fmqm.a.lK().b());
            this.d = a;
            d.d(context, "disableKeyStore", Boolean.toString(a != null));
            erbn erbnVar2 = this.d;
            if (erbnVar2 != null) {
                return erbnVar2;
            }
            throw new GeneralSecurityException("Ad ID keyset manager is null.");
        } catch (IOException e) {
            e = e;
            d.c(this.c, "getOrCreateKeyManagerError", e);
            throw e;
        } catch (RuntimeException e2) {
            if (!fmqm.c()) {
                throw e2;
            }
            d.c(this.c, "getOrCreateKeyManagerError", e2);
            throw new GeneralSecurityException(e2);
        } catch (GeneralSecurityException e3) {
            e = e3;
            d.c(this.c, "getOrCreateKeyManagerError", e);
            throw e;
        }
    }

    public final synchronized eqml b() {
        String string = g().getString("event_attestation_integrity_token", null);
        if (string == null) {
            return null;
        }
        try {
            byte[] bytes = string.getBytes(StandardCharsets.ISO_8859_1);
            fgri y = fgri.y(eqml.a, bytes, 0, bytes.length, fgqp.a());
            fgri.M(y);
            return (eqml) y;
        } catch (fgsd e) {
            d.c(this.c, "deviceIntegrityTokenError", e);
            return null;
        }
    }

    public final synchronized void c() {
        g().edit().clear().commit();
        this.d = null;
        this.a = null;
        this.e = null;
    }

    public final synchronized boolean d(byte[] bArr) {
        if (bArr == null) {
            d.b(this.c, "deviceIntegrityTokenError", "null token");
            return false;
        }
        int length = bArr.length;
        if (length == 0) {
            d.b(this.c, "deviceIntegrityTokenError", "zero-length token");
            return false;
        }
        try {
            fgri y = fgri.y(eqml.a, bArr, 0, length, fgqp.a());
            fgri.M(y);
            fgpr fgprVar = ((eqml) y).c;
            fgqp a = fgqp.a();
            eqmh eqmhVar = eqmh.a;
            fgpx k = fgprVar.k();
            fgri x = eqmhVar.x();
            try {
                fgtq b2 = fgti.a.b(x);
                b2.l(x, fgpy.p(k), a);
                b2.g(x);
                try {
                    k.z(0);
                    fgri.M(x);
                    eqmh eqmhVar2 = (eqmh) x;
                    try {
                        byte[] e = e();
                        if (eqmhVar2 != null && e != null && Arrays.equals(eqmhVar2.b.M(), e)) {
                            if (!g().edit().putString("event_attestation_integrity_token", new String(bArr, StandardCharsets.ISO_8859_1)).commit()) {
                                d.b(this.c, "deviceIntegrityTokenError", "Shared Pref write failed.");
                            }
                            return true;
                        }
                        d.b(this.c, "deviceIntegrityTokenError", "public key mismatch");
                        return false;
                    } catch (IOException | GeneralSecurityException e2) {
                        d.c(this.c, "publicKeyError", e2);
                        return false;
                    }
                } catch (fgsd e3) {
                    throw e3;
                }
            } catch (fgsd e4) {
                if (e4.a) {
                    throw new fgsd(e4);
                }
                throw e4;
            } catch (fguf e5) {
                throw e5.a();
            } catch (IOException e6) {
                if (e6.getCause() instanceof fgsd) {
                    throw ((fgsd) e6.getCause());
                }
                throw new fgsd(e6);
            } catch (RuntimeException e7) {
                if (e7.getCause() instanceof fgsd) {
                    throw ((fgsd) e7.getCause());
                }
                throw e7;
            }
        } catch (fgsd e8) {
            d.c(this.c, "deviceIntegriyTokenDecodeError", e8);
            return false;
        }
    }

    public final synchronized byte[] e() {
        byte[] bArr = this.e;
        if (bArr != null) {
            return bArr;
        }
        byte[] c = dbap.c(h());
        this.e = c;
        if (c == null) {
            d.b(this.c, "publicKeyError", "Not found.");
            this.e = new byte[0];
        }
        return this.e;
    }

    public final synchronized byte[] f(byte[] bArr) {
        if (this.a == null) {
            this.a = (eqqn) h().a().l(erop.a(), eqqn.class);
        }
        return this.a.a(bArr);
    }
}
