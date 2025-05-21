package com.google.android.gms.org.conscrypt;

import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.Security;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public abstract class HpkeContext {
    protected final HpkeSpi spi;

    protected HpkeContext(HpkeSpi hpkeSpi) {
        this.spi = hpkeSpi;
    }

    private static Provider findFirstProvider(String str) {
        for (Provider provider : Security.getProviders()) {
            Provider.Service service = provider.getService("ConscryptHpke", str);
            if (service != null) {
                return service.getProvider();
            }
        }
        throw new NoSuchAlgorithmException("No Provider found for: ".concat(String.valueOf(str)));
    }

    protected static HpkeSpi findSpi(String str) {
        if (str != null) {
            return findSpi(str, findFirstProvider(str));
        }
        throw new NoSuchAlgorithmException("null algorithm");
    }

    public byte[] export(int i, byte[] bArr) {
        return this.spi.engineExport(i, bArr);
    }

    public HpkeSpi getSpi() {
        return this.spi;
    }

    protected static HpkeSpi findSpi(String str, String str2) {
        if (str2 != null && !str2.isEmpty()) {
            Provider provider = Security.getProvider(str2);
            if (provider != null) {
                return findSpi(str, provider);
            }
            throw new NoSuchProviderException("Unknown Provider: ".concat(str2));
        }
        throw new IllegalArgumentException("Invalid provider name");
    }

    protected static HpkeSpi findSpi(String str, Provider provider) {
        HpkeSpi newInstance;
        if (provider != null) {
            Provider.Service service = provider.getService("ConscryptHpke", str);
            if (service != null) {
                Object newInstance2 = service.newInstance(null);
                if (newInstance2 instanceof HpkeSpi) {
                    newInstance = (HpkeSpi) newInstance2;
                } else {
                    newInstance = DuckTypedHpkeSpi.newInstance(newInstance2);
                }
                if (newInstance != null) {
                    return newInstance;
                }
                throw new IllegalStateException(String.format("Provider %s is providing incorrect instances", provider.getName()));
            }
            throw new NoSuchAlgorithmException("Unknown algorithm");
        }
        throw new IllegalArgumentException("null Provider");
    }
}
