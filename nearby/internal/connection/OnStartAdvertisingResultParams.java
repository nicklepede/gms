package com.google.android.gms.nearby.internal.connection;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cjcq;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class OnStartAdvertisingResultParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cjcq();
    public int a;
    public String b;

    public OnStartAdvertisingResultParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnStartAdvertisingResultParams) {
            OnStartAdvertisingResultParams onStartAdvertisingResultParams = (OnStartAdvertisingResultParams) obj;
            if (arwb.b(Integer.valueOf(this.a), Integer.valueOf(onStartAdvertisingResultParams.a)) && arwb.b(this.b, onStartAdvertisingResultParams.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, this.a);
        arxc.v(parcel, 2, this.b, false);
        arxc.c(parcel, a);
    }

    public OnStartAdvertisingResultParams(int i, String str) {
        this.a = i;
        this.b = str;
    }
}
