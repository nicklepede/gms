package com.google.android.gms.common.threads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.asmh;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class TraceWrappingParcelable implements Parcelable {
    public static final Parcelable.Creator CREATOR = new asmh();
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
