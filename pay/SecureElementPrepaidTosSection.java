package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.ctef;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class SecureElementPrepaidTosSection extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ctef();
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
            if (arwb.b(this.a, secureElementPrepaidTosSection.a) && arwb.b(this.b, secureElementPrepaidTosSection.b) && arwb.b(Integer.valueOf(this.c), Integer.valueOf(secureElementPrepaidTosSection.c)) && arwb.b(this.d, secureElementPrepaidTosSection.d)) {
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
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, this.a, false);
        arxc.v(parcel, 2, this.b, false);
        arxc.o(parcel, 3, this.c);
        arxc.v(parcel, 4, this.d, false);
        arxc.c(parcel, a);
    }

    public SecureElementPrepaidTosSection(String str, String str2, int i, String str3) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
    }
}
