package com.google.android.gms.ads.identifier.settings;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.chimera.modules.ads.AppContextProvider;
import defpackage.eqcy;
import defpackage.fmqe;
import defpackage.fmqm;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
final class p {
    public static final AtomicInteger a = new AtomicInteger();

    public static boolean a() {
        Context a2 = AppContextProvider.a();
        if (fmqm.a.lK().g()) {
            d.d(a2, "fetchDeviceIntegrityToken", "");
        }
        o a3 = o.a(a2);
        u a4 = u.a(a2);
        try {
            byte[] e = a4.e();
            long millis = TimeUnit.SECONDS.toMillis(fmqe.a.lK().i());
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
                byte[] bArr2 = (byte[]) ((eqcy) nVar.a(a2, e, bArr)).v(millis, TimeUnit.MILLISECONDS);
                int i = a.get();
                boolean d = fmqm.e() ? a3.d(bArr2) : a4.d(bArr2);
                if (i > 0) {
                    d.b(a2, defpackage.a.j(i, "deviceIntegrityTokenFetch #"), defpackage.a.aa(d, "Store result "));
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
            if (!fmqe.l()) {
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
