package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.ctdb;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class MdocIntentArgs extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ctdb();
    public String a;
    public int b;

    private MdocIntentArgs() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MdocIntentArgs) {
            MdocIntentArgs mdocIntentArgs = (MdocIntentArgs) obj;
            if (arwb.b(this.a, mdocIntentArgs.a) && arwb.b(Integer.valueOf(this.b), Integer.valueOf(mdocIntentArgs.b))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, this.a, false);
        arxc.o(parcel, 2, this.b);
        arxc.c(parcel, a);
    }

    public MdocIntentArgs(String str, int i) {
        this.a = str;
        this.b = i;
    }
}
