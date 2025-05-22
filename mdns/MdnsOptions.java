package com.google.android.gms.mdns;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.aszm;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cfkf;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class MdnsOptions extends AbstractSafeParcelable implements aszm {
    public static final Parcelable.Creator CREATOR = new cfkf();
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
        return atyq.b(this.a, mdnsOptions.a) && atyq.b(this.b, mdnsOptions.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = atzr.a(parcel);
        atzr.v(parcel, 2, str, false);
        atzr.v(parcel, 3, this.b, false);
        atzr.c(parcel, a);
    }
}
