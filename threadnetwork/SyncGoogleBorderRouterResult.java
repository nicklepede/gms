package com.google.android.gms.threadnetwork;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.dffy;
import defpackage.ejtk;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public final class SyncGoogleBorderRouterResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dffy();
    public final String a;
    private final byte[] b;

    public SyncGoogleBorderRouterResult(String str, byte[] bArr) {
        this.a = str;
        this.b = (byte[]) bArr.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SyncGoogleBorderRouterResult)) {
            return false;
        }
        SyncGoogleBorderRouterResult syncGoogleBorderRouterResult = (SyncGoogleBorderRouterResult) obj;
        return this.a.equals(syncGoogleBorderRouterResult.a) && Arrays.equals(this.b, syncGoogleBorderRouterResult.b);
    }

    public final int hashCode() {
        return Arrays.deepHashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        return String.format(Locale.US, "{NetworkName: %s, ExtendedPanId: %s}", this.a, ejtk.f.n(this.b));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, str, false);
        arxc.i(parcel, 2, (byte[]) this.b.clone(), false);
        arxc.c(parcel, a);
    }
}
