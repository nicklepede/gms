package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cvnz;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class TransitDisplayCardIntentArgs extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cvnz();
    public String a;
    public String b;
    public boolean c;
    public String d;
    public ProtoSafeParcelable e;

    private TransitDisplayCardIntentArgs() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TransitDisplayCardIntentArgs) {
            TransitDisplayCardIntentArgs transitDisplayCardIntentArgs = (TransitDisplayCardIntentArgs) obj;
            if (atyq.b(this.a, transitDisplayCardIntentArgs.a) && atyq.b(this.b, transitDisplayCardIntentArgs.b) && atyq.b(Boolean.valueOf(this.c), Boolean.valueOf(transitDisplayCardIntentArgs.c)) && atyq.b(this.d, transitDisplayCardIntentArgs.d) && atyq.b(this.e, transitDisplayCardIntentArgs.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Boolean.valueOf(this.c), this.d, this.e});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, this.a, false);
        atzr.v(parcel, 2, this.b, false);
        atzr.e(parcel, 3, this.c);
        atzr.v(parcel, 4, this.d, false);
        atzr.t(parcel, 5, this.e, i, false);
        atzr.c(parcel, a);
    }

    public TransitDisplayCardIntentArgs(String str, String str2, boolean z, String str3, ProtoSafeParcelable protoSafeParcelable) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = str3;
        this.e = protoSafeParcelable;
    }
}
