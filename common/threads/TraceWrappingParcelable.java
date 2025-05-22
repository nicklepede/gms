package com.google.android.gms.common.threads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.auqb;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public final class TraceWrappingParcelable implements Parcelable {
    public static final Parcelable.Creator CREATOR = new auqb();
    public final Bundle a;
    public Object b;
    public Bundle c;

    public TraceWrappingParcelable() {
        Bundle bundle = new Bundle();
        this.a = bundle;
        bundle.putParcelable("gctthpwp", this);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
    }
}
