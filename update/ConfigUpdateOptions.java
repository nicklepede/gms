package com.google.android.gms.update;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwa;
import defpackage.arxc;
import defpackage.dhco;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class ConfigUpdateOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dhco();
    public final boolean a;

    public ConfigUpdateOptions(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ConfigUpdateOptions) && this.a == ((ConfigUpdateOptions) obj).a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a)});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arwa.b("userInitiated", Boolean.valueOf(this.a), arrayList);
        return arwa.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        boolean z = this.a;
        int a = arxc.a(parcel);
        arxc.e(parcel, 1, z);
        arxc.c(parcel, a);
    }
}
