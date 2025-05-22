package com.google.android.gms.auth.folsom;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.adbp;
import defpackage.atzr;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class SecurityDomainMember extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new adbp();
    public final int a;
    public final byte[] b;

    public SecurityDomainMember(int i, byte[] bArr) {
        this.a = i;
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SecurityDomainMember) {
            SecurityDomainMember securityDomainMember = (SecurityDomainMember) obj;
            if (this.a == securityDomainMember.a && Arrays.equals(this.b, securityDomainMember.b)) {
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
        int i2 = this.a;
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, i2);
        atzr.i(parcel, 2, this.b, false);
        atzr.c(parcel, a);
    }
}
