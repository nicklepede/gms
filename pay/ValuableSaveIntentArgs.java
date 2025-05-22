package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cvof;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class ValuableSaveIntentArgs extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cvof();
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
            if (atyq.b(this.a, valuableSaveIntentArgs.a) && atyq.b(this.b, valuableSaveIntentArgs.b) && atyq.b(this.c, valuableSaveIntentArgs.c) && atyq.b(this.d, valuableSaveIntentArgs.d) && atyq.b(Boolean.valueOf(this.e), Boolean.valueOf(valuableSaveIntentArgs.e)) && atyq.b(Integer.valueOf(this.f), Integer.valueOf(valuableSaveIntentArgs.f))) {
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
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, this.a, false);
        atzr.e(parcel, 2, this.e);
        atzr.o(parcel, 3, this.f);
        atzr.v(parcel, 4, this.b, false);
        atzr.v(parcel, 5, this.c, false);
        atzr.v(parcel, 6, this.d, false);
        atzr.c(parcel, a);
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
