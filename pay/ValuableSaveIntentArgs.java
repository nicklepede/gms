package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.ctez;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class ValuableSaveIntentArgs extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ctez();
    public String a;
    public String b;
    public String c;
    public String d;
    public boolean e;
    public int f;

    private ValuableSaveIntentArgs() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ValuableSaveIntentArgs) {
            ValuableSaveIntentArgs valuableSaveIntentArgs = (ValuableSaveIntentArgs) obj;
            if (arwb.b(this.a, valuableSaveIntentArgs.a) && arwb.b(this.b, valuableSaveIntentArgs.b) && arwb.b(this.c, valuableSaveIntentArgs.c) && arwb.b(this.d, valuableSaveIntentArgs.d) && arwb.b(Boolean.valueOf(this.e), Boolean.valueOf(valuableSaveIntentArgs.e)) && arwb.b(Integer.valueOf(this.f), Integer.valueOf(valuableSaveIntentArgs.f))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, Boolean.valueOf(this.e), Integer.valueOf(this.f)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, this.a, false);
        arxc.e(parcel, 2, this.e);
        arxc.o(parcel, 3, this.f);
        arxc.v(parcel, 4, this.b, false);
        arxc.v(parcel, 5, this.c, false);
        arxc.v(parcel, 6, this.d, false);
        arxc.c(parcel, a);
    }

    public ValuableSaveIntentArgs(String str, String str2, String str3, String str4, boolean z, int i) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
        this.f = i;
    }
}
