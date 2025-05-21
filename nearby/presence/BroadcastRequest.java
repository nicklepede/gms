package com.google.android.gms.nearby.presence;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.ckiw;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class BroadcastRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ckiw();
    public final PresenceIdentity a;
    public final PresenceAction[] b;
    public final boolean c;
    public final int[] d;
    public final DataElementCollection e;
    public final boolean f;
    public final int[] g;
    public final int h;
    public final WorkSource i;

    public BroadcastRequest(PresenceIdentity presenceIdentity, PresenceAction[] presenceActionArr, boolean z, int[] iArr, DataElementCollection dataElementCollection, boolean z2, int[] iArr2, int i, WorkSource workSource) {
        this.a = presenceIdentity;
        this.b = presenceActionArr;
        this.c = z;
        this.d = iArr;
        this.e = dataElementCollection;
        this.f = z2;
        this.g = iArr2;
        this.h = i;
        if (workSource == null) {
            this.i = new WorkSource();
        } else {
            this.i = workSource;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BroadcastRequest)) {
            return false;
        }
        BroadcastRequest broadcastRequest = (BroadcastRequest) obj;
        return arwb.b(this.a, broadcastRequest.a) && Arrays.equals(this.b, broadcastRequest.b) && arwb.b(Boolean.valueOf(this.c), Boolean.valueOf(broadcastRequest.c)) && Arrays.equals(this.d, broadcastRequest.d) && arwb.b(this.e, broadcastRequest.e) && arwb.b(Boolean.valueOf(this.f), Boolean.valueOf(broadcastRequest.f)) && Arrays.equals(this.g, broadcastRequest.g) && arwb.b(Integer.valueOf(this.h), Integer.valueOf(broadcastRequest.h)) && arwb.b(this.i, broadcastRequest.i);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Boolean.valueOf(this.c), this.d, this.e, Boolean.valueOf(this.f), this.g, Integer.valueOf(this.h), this.i});
    }

    public final String toString() {
        WorkSource workSource = this.i;
        int[] iArr = this.g;
        DataElementCollection dataElementCollection = this.e;
        int[] iArr2 = this.d;
        PresenceAction[] presenceActionArr = this.b;
        return "BroadcastRequest{selectedIdentity=" + String.valueOf(this.a) + ", actions=" + Arrays.toString(presenceActionArr) + ", includeDeviceType=" + this.c + ", broadcastMediums=" + Arrays.toString(iArr2) + ", dataElements=" + String.valueOf(dataElementCollection) + ", requestRanging=" + this.f + ", connectibleMediums=" + Arrays.toString(iArr) + ", broadcastFormat=" + this.h + ", workSource=" + workSource.toString() + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        PresenceIdentity presenceIdentity = this.a;
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, presenceIdentity, i, false);
        arxc.J(parcel, 2, this.b, i);
        arxc.e(parcel, 3, this.c);
        arxc.p(parcel, 4, this.d, false);
        arxc.t(parcel, 5, this.e, i, false);
        arxc.e(parcel, 6, this.f);
        arxc.p(parcel, 7, this.g, false);
        arxc.o(parcel, 8, this.h);
        arxc.t(parcel, 9, this.i, i, false);
        arxc.c(parcel, a);
    }
}
