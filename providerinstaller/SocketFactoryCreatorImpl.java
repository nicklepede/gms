package com.google.android.gms.providerinstaller;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.org.conscrypt.ClientSessionContext;
import com.google.android.gms.org.conscrypt.FileClientSessionCache;
import com.google.android.gms.org.conscrypt.OpenSSLContextImpl;
import com.google.android.gms.org.conscrypt.SSLClientSessionCache;
import defpackage.asal;
import defpackage.azht;
import defpackage.eike;
import java.io.File;
import java.io.IOException;
import java.security.KeyManagementException;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class SocketFactoryCreatorImpl extends asal {
    private static SSLClientSessionCache a(Context context, String str) {
        File dir = context.getDir(str, 0);
        try {
            return FileClientSessionCache.usingDirectory(dir);
        } catch (IOException e) {
            Log.w("SSLCertSocketFactory", "Unable to create SSL session cache in ".concat(String.valueOf(String.valueOf(dir))), e);
            return null;
        }
    }

    private static SSLSocketFactory c(KeyManager[] keyManagerArr, TrustManager[] trustManagerArr, SSLClientSessionCache sSLClientSessionCache) {
        try {
            OpenSSLContextImpl preferred = OpenSSLContextImpl.getPreferred();
            preferred.engineInit(keyManagerArr, trustManagerArr, null);
            if (sSLClientSessionCache != null) {
                ((ClientSessionContext) preferred.engineGetClientSessionContext()).setPersistentCache(sSLClientSessionCache);
            }
            return preferred.engineGetSocketFactory();
        } catch (KeyManagementException e) {
            Log.e("SSLCertSocketFactory", "Failed to deal with KeyManager", e);
            return (SSLSocketFactory) SSLSocketFactory.getDefault();
        }
    }

    @Override // defpackage.asam
    public azht newSocketFactory(azht azhtVar, azht azhtVar2, azht azhtVar3, boolean z) {
        SSLClientSessionCache sSLClientSessionCache;
        if (z) {
            Context context = (Context) ObjectWrapper.a(azhtVar);
            eike.e(context);
            sSLClientSessionCache = a(context, "sslcache");
        } else {
            sSLClientSessionCache = null;
        }
        return new ObjectWrapper(c((KeyManager[]) ObjectWrapper.a(azhtVar2), (TrustManager[]) ObjectWrapper.a(azhtVar3), sSLClientSessionCache));
    }

    @Override // defpackage.asam
    public azht newSocketFactoryWithCacheDir(azht azhtVar, azht azhtVar2, azht azhtVar3, String str) {
        Context context = (Context) ObjectWrapper.a(azhtVar);
        eike.e(context);
        return new ObjectWrapper(c((KeyManager[]) ObjectWrapper.a(azhtVar2), (TrustManager[]) ObjectWrapper.a(azhtVar3), a(context, str)));
    }
}
