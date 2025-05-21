package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cteu;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class TransitDisplayCardIntentArgs extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cteu();
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
            if (arwb.b(this.a, transitDisplayCardIntentArgs.a) && arwb.b(this.b, transitDisplayCardIntentArgs.b) && arwb.b(Boolean.valueOf(this.c), Boolean.valueOf(transitDisplayCardIntentArgs.c)) && arwb.b(this.d, transitDisplayCardIntentArgs.d) && arwb.b(this.e, transitDisplayCardIntentArgs.e)) {
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
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, this.a, false);
        arxc.v(parcel, 2, this.b, false);
        arxc.e(parcel, 3, this.c);
        arxc.v(parcel, 4, this.d, false);
        arxc.t(parcel, 5, this.e, i, false);
        arxc.c(parcel, a);
    }

    public TransitDisplayCardIntentArgs(String str, String str2, boolean z, String str3, ProtoSafeParcelable protoSafeParcelable) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = str3;
        this.e = protoSafeParcelable;
    }
}
