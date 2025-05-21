package com.google.android.gms.nearby.internal.connection;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cjcj;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class OnEndpointIdRotatedParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cjcj();
    public String a;
    public String b;

    public OnEndpointIdRotatedParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnEndpointIdRotatedParams) {
            OnEndpointIdRotatedParams onEndpointIdRotatedParams = (OnEndpointIdRotatedParams) obj;
            if (arwb.b(this.a, onEndpointIdRotatedParams.a) && arwb.b(this.b, onEndpointIdRotatedParams.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, this.a, false);
        arxc.v(parcel, 2, this.b, false);
        arxc.c(parcel, a);
    }

    public OnEndpointIdRotatedParams(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
