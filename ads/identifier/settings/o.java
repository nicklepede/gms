package com.google.android.gms.ads.identifier.settings;

import android.content.Context;
import android.content.SharedPreferences;
import defpackage.enyo;
import defpackage.enys;
import defpackage.feay;
import defpackage.febe;
import defpackage.febf;
import defpackage.febw;
import defpackage.fecp;
import defpackage.fedk;
import defpackage.feep;
import defpackage.feex;
import defpackage.fefm;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
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

    public final synchronized enys b() {
        String string = e().getString("event_attestation_integrity_token", null);
        if (string == null) {
            return null;
        }
        try {
            byte[] bytes = string.getBytes(StandardCharsets.ISO_8859_1);
            fecp y = fecp.y(enys.a, bytes, 0, bytes.length, febw.a());
            fecp.M(y);
            enys enysVar = (enys) y;
            feay feayVar = enysVar.c;
            febw a2 = febw.a();
            enyo enyoVar = enyo.a;
            febe k = feayVar.k();
            fecp x = enyoVar.x();
            try {
                feex b = feep.a.b(x);
                b.l(x, febf.p(k), a2);
                b.g(x);
                try {
                    k.z(0);
                    fecp.M(x);
                    enyo enyoVar2 = (enyo) x;
                    try {
                        byte[] e = this.b.e();
                        if (enyoVar2 != null && e != null && Arrays.equals(enyoVar2.b.M(), e)) {
                            return enysVar;
                        }
                        d.b(this.c, "getDeviceIntegrityTokenError", "public key mismatch");
                        c();
                        return null;
                    } catch (IOException | GeneralSecurityException e2) {
                        d.c(this.c, "publicKeyError", e2);
                        return null;
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
            fecp y = fecp.y(enys.a, bArr, 0, length, febw.a());
            fecp.M(y);
            feay feayVar = ((enys) y).c;
            febw a2 = febw.a();
            enyo enyoVar = enyo.a;
            febe k = feayVar.k();
            fecp x = enyoVar.x();
            try {
                feex b = feep.a.b(x);
                b.l(x, febf.p(k), a2);
                b.g(x);
                try {
                    k.z(0);
                    fecp.M(x);
                    enyo enyoVar2 = (enyo) x;
                    try {
                        byte[] e = this.b.e();
                        if (enyoVar2 != null && e != null && Arrays.equals(enyoVar2.b.M(), e)) {
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
}
