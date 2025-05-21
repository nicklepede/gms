package com.google.android.gms.auth.folsom;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abbp;
import defpackage.arxc;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class SecurityDomainMember extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new abbp();
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
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, i2);
        arxc.i(parcel, 2, this.b, false);
        arxc.c(parcel, a);
    }
}
