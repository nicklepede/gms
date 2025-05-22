package com.google.android.gms.appsearch.safeparcel;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.wcd;
import j$.util.Objects;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class PackageIdentifierParcel extends AbstractSafeParcelable implements Parcelable {
    public static final Parcelable.Creator CREATOR = new wcd();
    public final String a;
    public final byte[] b;

    public PackageIdentifierParcel(String str, byte[] bArr) {
        this.a = (String) Objects.requireNonNull(str);
        this.b = (byte[]) Objects.requireNonNull(bArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PackageIdentifierParcel)) {
            return false;
        }
        PackageIdentifierParcel packageIdentifierParcel = (PackageIdentifierParcel) obj;
        return this.a.equals(packageIdentifierParcel.a) && Arrays.equals(this.b, packageIdentifierParcel.b);
    }

    public final int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(Arrays.hashCode(this.b)));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, str, false);
        atzr.i(parcel, 2, this.b, false);
        atzr.c(parcel, a);
    }
}
