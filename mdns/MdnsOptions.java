package com.google.android.gms.mdns;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.aqwx;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cdbf;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class MdnsOptions extends AbstractSafeParcelable implements aqwx {
    public static final Parcelable.Creator CREATOR = new cdbf();
    public final String a;
    public final String b;

    public MdnsOptions(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MdnsOptions)) {
            return false;
        }
        MdnsOptions mdnsOptions = (MdnsOptions) obj;
        return arwb.b(this.a, mdnsOptions.a) && arwb.b(this.b, mdnsOptions.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = arxc.a(parcel);
        arxc.v(parcel, 2, str, false);
        arxc.v(parcel, 3, this.b, false);
        arxc.c(parcel, a);
    }
}
