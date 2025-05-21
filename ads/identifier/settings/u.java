package com.google.android.gms.ads.identifier.settings;

import android.content.Context;
import android.content.SharedPreferences;
import defpackage.cyqr;
import defpackage.enyo;
import defpackage.enys;
import defpackage.eocu;
import defpackage.eonr;
import defpackage.epat;
import defpackage.feay;
import defpackage.febe;
import defpackage.febf;
import defpackage.febw;
import defpackage.fecp;
import defpackage.fedk;
import defpackage.feep;
import defpackage.feex;
import defpackage.fefm;
import defpackage.fkah;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class u {
    private static u b;
    private final Context c;
    private eonr d = null;
    eocu a = null;
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

    private final synchronized eonr h() {
        eonr eonrVar = this.d;
        if (eonrVar != null) {
            return eonrVar;
        }
        this.a = null;
        this.e = null;
        try {
            Context context = this.c;
            eonr a = cyqr.a(context, "event_attestation_settings", fkah.a.a().b());
            this.d = a;
            d.d(context, "disableKeyStore", Boolean.toString(a != null));
            eonr eonrVar2 = this.d;
            if (eonrVar2 != null) {
                return eonrVar2;
            }
            throw new GeneralSecurityException("Ad ID keyset manager is null.");
        } catch (IOException e) {
            e = e;
            d.c(this.c, "getOrCreateKeyManagerError", e);
            throw e;
        } catch (RuntimeException e2) {
            if (!fkah.c()) {
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

    public final synchronized enys b() {
        String string = g().getString("event_attestation_integrity_token", null);
        if (string == null) {
            return null;
        }
        try {
            byte[] bytes = string.getBytes(StandardCharsets.ISO_8859_1);
            fecp y = fecp.y(enys.a, bytes, 0, bytes.length, febw.a());
            fecp.M(y);
            return (enys) y;
        } catch (fedk e) {
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
            fecp y = fecp.y(enys.a, bArr, 0, length, febw.a());
            fecp.M(y);
            feay feayVar = ((enys) y).c;
            febw a = febw.a();
            enyo enyoVar = enyo.a;
            febe k = feayVar.k();
            fecp x = enyoVar.x();
            try {
                feex b2 = feep.a.b(x);
                b2.l(x, febf.p(k), a);
                b2.g(x);
                try {
                    k.z(0);
                    fecp.M(x);
                    enyo enyoVar2 = (enyo) x;
                    try {
                        byte[] e = e();
                        if (enyoVar2 != null && e != null && Arrays.equals(enyoVar2.b.M(), e)) {
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
                } catch (fedk e3) {
                    throw e3;
                }
            } catch (fedk e4) {
                if (e4.a) {
                    throw new fedk(e4);
                }
                throw e4;
            } catch (fefm e5) {
                throw e5.a();
            } catch (IOException e6) {
                if (e6.getCause() instanceof fedk) {
                    throw ((fedk) e6.getCause());
                }
                throw new fedk(e6);
            } catch (RuntimeException e7) {
                if (e7.getCause() instanceof fedk) {
                    throw ((fedk) e7.getCause());
                }
                throw e7;
            }
        } catch (fedk e8) {
            d.c(this.c, "deviceIntegriyTokenDecodeError", e8);
            return false;
        }
    }

    public final synchronized byte[] e() {
        byte[] bArr = this.e;
        if (bArr != null) {
            return bArr;
        }
        byte[] c = cyqr.c(h());
        this.e = c;
        if (c == null) {
            d.b(this.c, "publicKeyError", "Not found.");
            this.e = new byte[0];
        }
        return this.e;
    }

    public final synchronized byte[] f(byte[] bArr) {
        if (this.a == null) {
            this.a = (eocu) h().a().l(epat.a(), eocu.class);
        }
        return this.a.a(bArr);
    }
}
