package com.google.android.gms.semanticlocationhistory.isolation;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.chimera.modules.semanticlocationhistory.AppContextProvider;
import defpackage.atzb;
import defpackage.auid;
import defpackage.ausn;
import defpackage.ausq;
import defpackage.autr;
import defpackage.bsvu;
import defpackage.dcmp;
import defpackage.dcmr;
import defpackage.ddji;
import defpackage.ddjj;
import defpackage.eluo;
import defpackage.fpqh;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class LocalOdlhNativeLibProxy {
    private static final ausn a = ausn.b("LocalOdlhNativeLibProxy", auid.SEMANTIC_LOCATION_HISTORY);
    private dcmr b;
    private final ServiceConnection c;

    private LocalOdlhNativeLibProxy(dcmr dcmrVar, ServiceConnection serviceConnection) {
        this.b = dcmrVar;
        this.c = serviceConnection;
    }

    public static LocalOdlhNativeLibProxy connect() {
        String str;
        ParcelFileDescriptor open;
        Pair c = ddjj.a().c(RemoteOdlhNativeLibImpl.class.getName());
        if (c == null) {
            return null;
        }
        bsvu bsvuVar = new bsvu((IBinder) c.first);
        IInterface queryLocalInterface = bsvuVar.queryLocalInterface("com.google.android.gms.semanticlocationhistory.IOdlhNativeLib");
        dcmr dcmpVar = queryLocalInterface instanceof dcmr ? (dcmr) queryLocalInterface : new dcmp(bsvuVar);
        Context a2 = AppContextProvider.a();
        if (fpqh.c()) {
            str = ddji.a(a2);
            if (str == null) {
                ((eluo) a.h()).x("Failed to load WASM lib, falling back to default implementation.");
            } else {
                ((eluo) a.h()).B("Loaded WASM lib from %s", str);
            }
        } else {
            if (fpqh.d()) {
                ddji.a(a2);
            }
            str = null;
        }
        if (str == null) {
            int i = autr.a;
            str = ausq.a(a2, "odlh_jni");
            if (str == null) {
                return null;
            }
        }
        if (str.contains(".apk!/lib/")) {
            open = null;
        } else {
            try {
                open = ParcelFileDescriptor.open(new File(str), 268435456);
            } catch (RemoteException e) {
                Log.e("LocalOdlhNativeLibProxy", "failed to call load() on remote service", e);
                return null;
            } catch (IOException e2) {
                Log.e("LocalOdlhNativeLibProxy", "failed to open native library", e2);
                return null;
            }
        }
        try {
            Random random = new Random();
            if (dcmpVar.a(str, open, ((double) random.nextFloat()) < fpqh.a.lK().a() ? random.nextInt(2) + 1 : 0)) {
                LocalOdlhNativeLibProxy localOdlhNativeLibProxy = new LocalOdlhNativeLibProxy(dcmpVar, (ServiceConnection) c.second);
                if (open != null) {
                    open.close();
                }
                return localOdlhNativeLibProxy;
            }
            Log.e("LocalOdlhNativeLibProxy", "failed to load remote native odlh lib");
            ddjj.a().b((ServiceConnection) c.second);
            if (open != null) {
                open.close();
            }
            return null;
        } catch (Throwable th) {
            if (open != null) {
                try {
                    open.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public byte[] jAggregate(byte[] bArr, byte[] bArr2, byte[] bArr3, int i) {
        dcmr dcmrVar = this.b;
        atzb.s(dcmrVar);
        return dcmrVar.aggregate(bArr, bArr2, bArr3, i);
    }

    public byte[] jCalculatePulp(byte[] bArr, boolean z, boolean z2) {
        dcmr dcmrVar = this.b;
        atzb.s(dcmrVar);
        return dcmrVar.calculatePulp(bArr, z, z2);
    }

    public void jDisconnect() {
        ddjj.a().b(this.c);
        this.b = null;
    }

    public byte[] jGetClusterSnappedTimeline(byte[][] bArr) {
        ArrayList arrayList = new ArrayList(Arrays.asList(bArr));
        dcmr dcmrVar = this.b;
        atzb.s(dcmrVar);
        return dcmrVar.b(arrayList);
    }

    public byte[] jPopulateGeoJournalSummaryUpgrades(byte[] bArr, byte[] bArr2, String str) {
        dcmr dcmrVar = this.b;
        atzb.s(dcmrVar);
        return dcmrVar.populateGeoJournalSummaryUpgrades(bArr, bArr2, str);
    }
}
