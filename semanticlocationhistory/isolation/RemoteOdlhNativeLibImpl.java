package com.google.android.gms.semanticlocationhistory.isolation;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import defpackage.auud;
import defpackage.dcmq;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class RemoteOdlhNativeLibImpl extends dcmq {
    public boolean a = false;

    private native byte[] nativeGetClusterSnappedTimeline(byte[][] bArr);

    private native boolean nativeLoad(String str);

    @Override // defpackage.dcmr
    public final boolean a(String str, ParcelFileDescriptor parcelFileDescriptor, int i) {
        try {
            System.loadLibrary("odlh_stub_jni");
            if (parcelFileDescriptor != null) {
                str = "/proc/self/fd/" + parcelFileDescriptor.getFd();
            }
            if (i != 0 && auud.j()) {
                if (i == 1) {
                    throw new RuntimeException("test crash java");
                }
                this.a = nativeLoad(null);
            }
            boolean nativeLoad = nativeLoad(str);
            this.a = nativeLoad;
            return nativeLoad;
        } catch (UnsatisfiedLinkError e) {
            Log.e("RemoteOdlhNativeLibImpl", "failed to load odlh_stub_jni", e);
            return false;
        }
    }

    @Override // defpackage.dcmr
    public native byte[] aggregate(byte[] bArr, byte[] bArr2, byte[] bArr3, int i);

    @Override // defpackage.dcmr
    public final byte[] b(List list) {
        return nativeGetClusterSnappedTimeline((byte[][]) list.toArray(new byte[list.size()][]));
    }

    @Override // defpackage.dcmr
    public native byte[] calculatePulp(byte[] bArr, boolean z, boolean z2);

    public native void nativeUnload();

    @Override // defpackage.dcmr
    public native byte[] populateGeoJournalSummaryUpgrades(byte[] bArr, byte[] bArr2, String str);
}
