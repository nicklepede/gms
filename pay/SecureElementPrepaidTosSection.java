package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cvnk;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class SecureElementPrepaidTosSection extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cvnk();
    public String a;
    public String b;
    public int c;
    public String d;

    private SecureElementPrepaidTosSection() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SecureElementPrepaidTosSection) {
            SecureElementPrepaidTosSection secureElementPrepaidTosSection = (SecureElementPrepaidTosSection) obj;
            if (atyq.b(this.a, secureElementPrepaidTosSection.a) && atyq.b(this.b, secureElementPrepaidTosSection.b) && atyq.b(Integer.valueOf(this.c), Integer.valueOf(secureElementPrepaidTosSection.c)) && atyq.b(this.d, secureElementPrepaidTosSection.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Integer.valueOf(this.c), this.d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, this.a, false);
        atzr.v(parcel, 2, this.b, false);
        atzr.o(parcel, 3, this.c);
        atzr.v(parcel, 4, this.d, false);
        atzr.c(parcel, a);
    }

    public SecureElementPrepaidTosSection(String str, String str2, int i, String str3) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
    }
}
