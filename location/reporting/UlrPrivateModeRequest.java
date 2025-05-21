package com.google.android.gms.location.reporting;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.calh;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class UlrPrivateModeRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new calh();
    public final String a;
    public final boolean b;

    public UlrPrivateModeRequest(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final String toString() {
        return "UlrPrivateModeRequest{Tag='" + this.a + ", privateMode=" + this.b + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, str, false);
        arxc.e(parcel, 2, this.b);
        arxc.c(parcel, a);
    }
}
