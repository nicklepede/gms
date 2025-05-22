package com.google.android.gms.ads.identifier.settings;

import android.content.Context;
import android.content.SharedPreferences;
import defpackage.eqmh;
import defpackage.eqml;
import defpackage.fgpr;
import defpackage.fgpx;
import defpackage.fgpy;
import defpackage.fgqp;
import defpackage.fgri;
import defpackage.fgsd;
import defpackage.fgti;
import defpackage.fgtq;
import defpackage.fguf;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class o {
    private static o a;
    private final u b;
    private final Context c;

    private o(Context context) {
        this.c = context;
        this.b = u.a(context);
    }

    public static synchronized o a(Context context) {
        o oVar;
        synchronized (o.class) {
            if (a == null) {
                a = new o(context);
            }
            oVar = a;
        }
        return oVar;
    }

    private final SharedPreferences e() {
        return this.c.getSharedPreferences("device_integrity_token", 0);
    }

    public final synchronized eqml b() {
        String string = e().getString("event_attestation_integrity_token", null);
        if (string == null) {
            return null;
        }
        try {
            byte[] bytes = string.getBytes(StandardCharsets.ISO_8859_1);
            fgri y = fgri.y(eqml.a, bytes, 0, bytes.length, fgqp.a());
            fgri.M(y);
            eqml eqmlVar = (eqml) y;
            fgpr fgprVar = eqmlVar.c;
            fgqp a2 = fgqp.a();
            eqmh eqmhVar = eqmh.a;
            fgpx k = fgprVar.k();
            fgri x = eqmhVar.x();
            try {
                fgtq b = fgti.a.b(x);
                b.l(x, fgpy.p(k), a2);
                b.g(x);
                try {
                    k.z(0);
                    fgri.M(x);
                    eqmh eqmhVar2 = (eqmh) x;
                    try {
                        byte[] e = this.b.e();
                        if (eqmhVar2 != null && e != null && Arrays.equals(eqmhVar2.b.M(), e)) {
                            return eqmlVar;
                        }
                        d.b(this.c, "getDeviceIntegrityTokenError", "public key mismatch");
                        c();
                        return null;
                    } catch (IOException | GeneralSecurityException e2) {
                        d.c(this.c, "publicKeyError", e2);
                        return null;
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
            d.c(this.c, "deviceIntegrityTokenDecodeError", e8);
            return null;
        }
    }

    public final synchronized void c() {
        e().edit().clear().commit();
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
            fgqp a2 = fgqp.a();
            eqmh eqmhVar = eqmh.a;
            fgpx k = fgprVar.k();
            fgri x = eqmhVar.x();
            try {
                fgtq b = fgti.a.b(x);
                b.l(x, fgpy.p(k), a2);
                b.g(x);
                try {
                    k.z(0);
                    fgri.M(x);
                    eqmh eqmhVar2 = (eqmh) x;
                    try {
                        byte[] e = this.b.e();
                        if (eqmhVar2 != null && e != null && Arrays.equals(eqmhVar2.b.M(), e)) {
                            if (!e().edit().putString("event_attestation_integrity_token", new String(bArr, StandardCharsets.ISO_8859_1)).commit()) {
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
}
