package com.google.android.gms.ads.identifier.settings;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.chimera.modules.ads.AppContextProvider;
import defpackage.enpf;
import defpackage.fjzz;
import defpackage.fkah;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
final class p {
    public static final AtomicInteger a = new AtomicInteger();

    public static boolean a() {
        Context a2 = AppContextProvider.a();
        if (fkah.a.a().g()) {
            d.d(a2, "fetchDeviceIntegrityToken", "");
        }
        o a3 = o.a(a2);
        u a4 = u.a(a2);
        try {
            byte[] e = a4.e();
            long millis = TimeUnit.SECONDS.toMillis(fjzz.a.a().i());
            n nVar = new n();
            byte[] bArr = null;
            try {
                UUID fromString = UUID.fromString(b.c(a2).f(Binder.getCallingUid()));
                if (fromString != null) {
                    bArr = d.e(fromString);
                }
            } catch (IllegalArgumentException | NullPointerException e2) {
                d.c(a2, "getPreExistingAdid", e2);
            }
            try {
                byte[] bArr2 = (byte[]) ((enpf) nVar.a(a2, e, bArr)).v(millis, TimeUnit.MILLISECONDS);
                int i = a.get();
                boolean d = fkah.e() ? a3.d(bArr2) : a4.d(bArr2);
                if (i > 0) {
                    d.b(a2, defpackage.a.j(i, "deviceIntegrityTokenFetch #"), defpackage.a.Z(d, "Store result "));
                }
                return d;
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return false;
            } catch (ExecutionException e3) {
                d.c(a2, "deviceIntegrityTokenFetch #" + a.get(), e3.getCause());
                return false;
            } catch (TimeoutException unused2) {
                d.b(a2, "deviceIntegrityTokenFetch #" + a.get(), "Time out");
                return false;
            }
        } catch (IOException e4) {
            e = e4;
            d.c(a2, "publicKeyError #" + a.get(), e);
            return false;
        } catch (RuntimeException e5) {
            if (!fjzz.l()) {
                throw e5;
            }
            d.c(a2, "publicKeyError #" + a.get(), e5);
            return false;
        } catch (GeneralSecurityException e6) {
            e = e6;
            d.c(a2, "publicKeyError #" + a.get(), e);
            return false;
        }
    }
}
