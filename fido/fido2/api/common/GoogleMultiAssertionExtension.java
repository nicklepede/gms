package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.bdwv;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class GoogleMultiAssertionExtension extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bdwv();
    public final boolean a;

    public GoogleMultiAssertionExtension(boolean z) {
        Boolean.valueOf(z).getClass();
        this.a = z;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof GoogleMultiAssertionExtension) && this.a == ((GoogleMultiAssertionExtension) obj).a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        boolean z = this.a;
        int a = atzr.a(parcel);
        atzr.e(parcel, 1, z);
        atzr.c(parcel, a);
    }
}
