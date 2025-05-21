package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.ctey;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class ValuableDetailIntentArgs extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ctey();
    public String a;
    public String b;
    public String c;

    private ValuableDetailIntentArgs() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ValuableDetailIntentArgs) {
            ValuableDetailIntentArgs valuableDetailIntentArgs = (ValuableDetailIntentArgs) obj;
            if (arwb.b(this.a, valuableDetailIntentArgs.a) && arwb.b(this.b, valuableDetailIntentArgs.b) && arwb.b(this.c, valuableDetailIntentArgs.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, this.a, false);
        arxc.v(parcel, 2, this.b, false);
        arxc.v(parcel, 3, this.c, false);
        arxc.c(parcel, a);
    }

    public ValuableDetailIntentArgs(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }
}
