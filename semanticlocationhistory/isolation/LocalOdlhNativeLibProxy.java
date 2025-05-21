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
import defpackage.arwm;
import defpackage.asej;
import defpackage.asot;
import defpackage.asow;
import defpackage.aspx;
import defpackage.bqoe;
import defpackage.dach;
import defpackage.dacj;
import defpackage.daza;
import defpackage.dazb;
import defpackage.ejhf;
import defpackage.fmyi;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class LocalOdlhNativeLibProxy {
    private static final asot a = asot.b("LocalOdlhNativeLibProxy", asej.SEMANTIC_LOCATION_HISTORY);
    private dacj b;
    private final ServiceConnection c;

    private LocalOdlhNativeLibProxy(dacj dacjVar, ServiceConnection serviceConnection) {
        this.b = dacjVar;
        this.c = serviceConnection;
    }

    public static LocalOdlhNativeLibProxy connect() {
        String str;
        ParcelFileDescriptor open;
        Pair c = dazb.a().c(RemoteOdlhNativeLibImpl.class.getName());
        if (c == null) {
            return null;
        }
        bqoe bqoeVar = new bqoe((IBinder) c.first);
        IInterface queryLocalInterface = bqoeVar.queryLocalInterface("com.google.android.gms.semanticlocationhistory.IOdlhNativeLib");
        dacj dachVar = queryLocalInterface instanceof dacj ? (dacj) queryLocalInterface : new dach(bqoeVar);
        Context a2 = AppContextProvider.a();
        if (fmyi.c()) {
            str = daza.a(a2);
            if (str == null) {
                ((ejhf) a.h()).x("Failed to load WASM lib, falling back to default implementation.");
            } else {
                ((ejhf) a.h()).B("Loaded WASM lib from %s", str);
            }
        } else {
            if (fmyi.d()) {
                daza.a(a2);
            }
            str = null;
        }
        if (str == null) {
            int i = aspx.a;
            str = asow.a(a2, "odlh_jni");
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
            if (dachVar.a(str, open, ((double) random.nextFloat()) < fmyi.a.a().a() ? random.nextInt(2) + 1 : 0)) {
                LocalOdlhNativeLibProxy localOdlhNativeLibProxy = new LocalOdlhNativeLibProxy(dachVar, (ServiceConnection) c.second);
                if (open != null) {
                    open.close();
                }
                return localOdlhNativeLibProxy;
            }
            Log.e("LocalOdlhNativeLibProxy", "failed to load remote native odlh lib");
            dazb.a().b((ServiceConnection) c.second);
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
        dacj dacjVar = this.b;
        arwm.s(dacjVar);
        return dacjVar.aggregate(bArr, bArr2, bArr3, i);
    }

    public byte[] jCalculatePulp(byte[] bArr, boolean z, boolean z2) {
        dacj dacjVar = this.b;
        arwm.s(dacjVar);
        return dacjVar.calculatePulp(bArr, z, z2);
    }

    public void jDisconnect() {
        dazb.a().b(this.c);
        this.b = null;
    }

    public byte[] jGetClusterSnappedTimeline(byte[][] bArr) {
        ArrayList arrayList = new ArrayList(Arrays.asList(bArr));
        dacj dacjVar = this.b;
        arwm.s(dacjVar);
        return dacjVar.b(arrayList);
    }

    public byte[] jPopulateGeoJournalSummaryUpgrades(byte[] bArr, byte[] bArr2, String str) {
        dacj dacjVar = this.b;
        arwm.s(dacjVar);
        return dacjVar.populateGeoJournalSummaryUpgrades(bArr, bArr2, str);
    }
}
